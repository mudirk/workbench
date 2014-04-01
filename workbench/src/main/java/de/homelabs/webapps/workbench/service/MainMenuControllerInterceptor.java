package de.homelabs.webapps.workbench.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Service
public class MainMenuControllerInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	WorkbenchPluginManager workbenchPluginManager;
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		//get model from Request
		Map<String, Object> model = modelAndView.getModel();
		
		//add the mainmenu
		model.put("mainMenuItems", workbenchPluginManager.getMainMenu().getItems());
		
		//super
		super.postHandle(request, response, handler, modelAndView);
	}
	
	
}
