package com.pilotstorefront.controllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class SigninController implements Controller{

  	
 
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
      String userName = request.getParameter("user");
      String password = request.getParameter("password");
       userName.collect();
      String result = "";
      if (userName != null)
      {
      	// TODO call SigninService checkUserExistance
      //compile time error
      userName.collect();
      
        
        //TODO if it is there return true.
        result = "Hello, " + userName + "!";
      }
	// TODO return to home page
	// add  Objects or data to the MOdelView Objects.
      ModelAndView view = new ModelAndView("user_home");
      view.addObject("greeting", result);
      return view;
   }
	
	
	// TODO write logoout method
	// add request Mapping valuue.
}
