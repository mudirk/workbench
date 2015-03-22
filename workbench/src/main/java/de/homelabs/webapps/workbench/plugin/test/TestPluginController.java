package de.homelabs.webapps.workbench.plugin.test;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.homelabs.webapps.workbench.domain.WorkbenchConstants;

@Controller
public class TestPluginController {

	@ModelAttribute("shoppingBasket")
	public ShoppingBasket getShoppingBasket(){
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		shoppingBasket.setItems(new HashMap<String, Integer>());
		return shoppingBasket;
	}
	
	@RequestMapping({ "/testplugin.html" })
	protected String mainHandler(HttpServletRequest request,
			HttpServletResponse response, Model model) {

		model.addAttribute("title", "Workbench");
		model.addAttribute("moduleTitle", "TestPlugin");
		model.addAttribute("contentTemplate", "/de/homelabs/webapps/workbench/templates/testplugin.ftl");
				
		return WorkbenchConstants.TEMPLATE_PATH + "main";
	}
	
	@RequestMapping(value = { "/testplugin.html"}, method=RequestMethod.POST)
	protected String postHandler(@ModelAttribute("shoppingBasket") ShoppingBasket shoppingBasket, BindingResult result, ModelMap model){
		String message = "Daten wurden gespeichert";
		
		if (result.hasErrors()){
			message = "Bitte geben Sie eine gueltige Ganzzahl ein!";
		}
		model.addAttribute("title", "Workbench");
		model.addAttribute("moduleTitle", "TestPlugin");
		model.addAttribute("contentTemplate", "/de/homelabs/webapps/workbench/templates/testplugin.ftl");
		model.addAttribute("message", message);
		return WorkbenchConstants.TEMPLATE_PATH + "main";
	}
}
