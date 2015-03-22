package de.homelabs.webapps.workbench.configuration;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/**
 * TODO: Insert Handler
 * 
 * http://stackoverflow.com/questions/16706806/spring-handlerinterceptor-mapping
 * -with-annotations
 * http://karthikg.wordpress.com/2009/10/12/athandlerinterceptor-for-spring-mvc/
 * http://viralpatel.net/blogs/spring-mvc-interceptor-example/
 * 
 * @author D.Mueller
 * 
 */
@Configuration
@ComponentScan(basePackages = {"de.homelabs"})
@EnableWebMvc
public class WorkbenchConfiguration extends WebMvcConfigurerAdapter {
	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	HandlerInterceptorAdapter mainMenuControllerInterceptor;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/assets/**")
				.addResourceLocations("classpath:/META-INF/resources/webjars/")
				.setCachePeriod(31556926);
		registry.addResourceHandler("/css/**")
				.addResourceLocations(
						"classpath:/de/homelabs/webapps/workbench/css/")
				.setCachePeriod(31556926);
		registry.addResourceHandler("/img/**")
				.addResourceLocations(
						"classpath:/de/homelabs/webapps/workbench/img/")
				.setCachePeriod(31556926);
		registry.addResourceHandler("/js/**")
				.addResourceLocations(
						"classpath:/de/homelabs/webapps/workbench/js/")
				.setCachePeriod(31556926);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(mainMenuControllerInterceptor);
		super.addInterceptors(registry);
	}

	/**
	 * configure FreeMarker as ViewResolver
	 * 
	 * @return FreeMarkerViewResolver
	 */
	@Bean
	public FreeMarkerViewResolver initFreeMarkerViewResolver() {
		FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
		viewResolver.setCache(true);
		viewResolver.setPrefix("");
		viewResolver.setSuffix(".ftl");
		viewResolver.setContentType("text/html;charset=UTF-8");
		viewResolver.setRequestContextAttribute("requestContext");

		return viewResolver;
	}

	/**
	 * FreeMarker needs a FreeMarkerConfigurer to tell FreeMarker where to look
	 * for .ftl templates
	 * 
	 * @return FreeMarkerConfigurer
	 * @throws TemplateException
	 * @throws IOException
	 */
	@Bean
	public FreeMarkerConfigurer initFreeMarkerConfigurer() throws IOException,
			TemplateException {

		FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
		configurer.setTemplateLoaderPath("classpath:/");
		freemarker.template.Configuration config = configurer
				.createConfiguration();
		config.setDefaultEncoding("UTF-8");
		config.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
		configurer.setPreferFileSystemAccess(false);

		try {
			freemarker.log.Logger
					.selectLoggerLibrary(freemarker.log.Logger.LIBRARY_SLF4J);
			logger.debug("switched Freemarker logging to slf4j");
		} catch (ClassNotFoundException e) {
			logger.error("Failed to switch Freemarker loggin: ", e);

		}

		return configurer;
	}

	@Bean
	public static PropertyPlaceholderConfigurer properties() {
		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
		Resource[] resources = new ClassPathResource[] { new ClassPathResource(
				"workbench.properties") };
		ppc.setLocations(resources);
		ppc.setIgnoreUnresolvablePlaceholders(true);
		return ppc;
	}
}
