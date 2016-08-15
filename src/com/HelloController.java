package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController{
	
	@Autowired
	private Emp e;
 
   @RequestMapping(value="print",method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      System.out.println("-----------@value use "+e.getValInjectCheck());
      System.out.println(e.getContact().getAddress());
      System.out.println(e.getContact().getAddress2());
      return "hello";
   }

}
