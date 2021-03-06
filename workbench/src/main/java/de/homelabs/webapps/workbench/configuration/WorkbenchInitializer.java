package de.homelabs.webapps.workbench.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WorkbenchInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext)
			throws ServletException {

		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(WorkbenchConfiguration.class);

		ctx.setServletContext(servletContext);
		
		//Plugins have to start in this package
		ctx.scan("de.homelabs.webapps.workbench");
		Dynamic servlet = servletContext.addServlet("workbench",
				new DispatcherServlet(ctx));
		
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		
	}

}