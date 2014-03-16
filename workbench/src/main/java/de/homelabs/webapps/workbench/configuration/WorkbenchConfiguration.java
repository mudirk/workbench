package de.homelabs.webapps.workbench.configuration;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/**
 * TODO: 
 * Insert Handler
 * 
 * http://stackoverflow.com/questions/16706806/spring-handlerinterceptor-mapping-with-annotations
 * http://karthikg.wordpress.com/2009/10/12/athandlerinterceptor-for-spring-mvc/
 * http://viralpatel.net/blogs/spring-mvc-interceptor-example/
 * 
 * @author D.Mueller
 *
 */
@Configuration
@ComponentScan(basePackages= {"*"})
@EnableWebMvc
public class WorkbenchConfiguration extends WebMvcConfigurerAdapter {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/META-INF/resources/webjars/").setCachePeriod(31556926);
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/de/homelabs/webapps/workbench/css/").setCachePeriod(31556926);
        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/de/homelabs/webapps/workbench/img/").setCachePeriod(31556926);
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/de/homelabs/webapps/workbench/js/").setCachePeriod(31556926);
    }
	
//	/**
//	 * View Handling
//	 * @return
//	 */
//	@Bean
//    public InternalResourceViewResolver getInternalResourceViewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/pages/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
	/**
	 * configure FreeMarker as ViewResolver
	 * 
	 * @return FreeMarkerViewResolver
	 */
	@Bean
	public FreeMarkerViewResolver initFreeMarkerViewResolver(){
		FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
		viewResolver.setCache(true);
		viewResolver.setPrefix("");
		viewResolver.setSuffix(".ftl");
		viewResolver.setContentType("text/html;charset=UTF-8");
		
		return viewResolver;
	}
	
	/**
	 * FreeMarker needs a FreeMarkerConfigurer to tell FreeMarker where to 
	 * look for .ftl templates
	 * 
	 * @return FreeMarkerConfigurer
	 * @throws TemplateException 
	 * @throws IOException 
	 */
	@Bean
	public FreeMarkerConfigurer initFreeMarkerConfigurer() throws IOException, TemplateException{
		
		FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
		configurer.setTemplateLoaderPath("classpath:/de/homelabs/webapps/workbench/templates");
		freemarker.template.Configuration config = configurer.createConfiguration();
		config.setDefaultEncoding("UTF-8");
		config.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
//		freemarker.template.Configuration config = new freemarker.template.Configuration();
//		config.setClassForTemplateLoading(getClass(), "/../templates");
//		config.setDefaultEncoding("UTF-8");
//		config.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
//		
        try {
			freemarker.log.Logger.selectLoggerLibrary(freemarker.log.Logger.LIBRARY_SLF4J);
			logger.debug("switched Freemarker logging to slf4j");
		} catch (ClassNotFoundException e) {
			logger.error("Failed to switch Freemarker loggin: ", e);
			
		}
//        
//        
//        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
//        freemarker.template.Configuration conf = configurer.getConfiguration();
        return configurer;
	}
}
