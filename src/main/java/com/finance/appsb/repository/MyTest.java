package com.finance.appsb.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyTest {
	

	
	 @GetMapping(path="/mytest")
	  public String getResp() {
		  System.out.println("My test path called");
		  return "My How are you ";
	  }


}
