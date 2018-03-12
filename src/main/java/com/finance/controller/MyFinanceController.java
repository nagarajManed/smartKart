package com.finance.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.finance.dao.EmployeeDao;
import com.finance.model.Employee;
import com.finance.model.User;

@Controller
public class MyFinanceController {
	
	@RequestMapping(value="/")
	public ModelAndView userlogin(User user) {
		return new ModelAndView("userlogin");
	}
	
	
	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	public ModelAndView userLogin(User user) {
		ModelAndView model = new ModelAndView("home");
			System.out.println("userlogin============"+user.getEmail());
			System.out.println("userlogin============"+user.getPassword());
			return model;
	}
	
	
	
	
	
	
	
	
	
//
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public ModelAndView create1(User user) {
//		ModelAndView model = new ModelAndView("home");
//		// user bean will be automatically binded to view . refer @ModelAttribute
//		
//			System.out.println("=123==========="+user.getName());
//			System.out.println("=123==========="+user.getEmail());
////			users.setName(user.getName());
////			users.setEmail(user.getEmail());
////			users.setGender(user.getGender());
////			users.setLanguage(user.getLanguage());
////			users.setCountry(user.getCountry());
////			users.setPassword(user.getPassword());
//			
//			
//			
//			Resource r=new ClassPathResource("applicationContext.xml");
//			BeanFactory factory=new XmlBeanFactory(r);
//			
//			EmployeeDao dao=(EmployeeDao)factory.getBean("d");
//			
//			Employee e=new Employee();
//			e.setId(345);
//			e.setName("kumar");
//			e.setSalary(70000);
//			
//			//dao.saveEmployee(e);
//			dao.saveEmployee(e);
//			
//			
//		
//		return model;
//	}
//	
//	
//
//	/*@RequestMapping(value="/register")
//	public ModelAndView viewData(User user) {
//
//		ModelAndView model = new ModelAndView("register");
//		return model;
//	}*/
//	
//	
////	@RequestMapping(value="/")
////	 public String index() {
////	  return "index";
////	 }
////	
////	@RequestMapping(value = "/login", method = RequestMethod.POST)
////	public ModelAndView create(Login user) {
////		ModelAndView model = new ModelAndView("view");
////		// user bean will be automatically binded to view . refer @ModelAttribute
////		System.out.println("========="+user.getUserName());
////		
////		return model;
////	}
//	
////	@RequestMapping(value = "/home", method = RequestMethod.GET)
////	public String index(ModelMap model) {
////		model.addAttribute("message", "Hello Spring WEB MVC!");
////		return "/home";
////	}
////	
////	
////	@RequestMapping("/notifications")
////    public String someOtherPage(HttpServletRequest request, HttpServletResponse response) {
////        return "notifications";
////    }

}
