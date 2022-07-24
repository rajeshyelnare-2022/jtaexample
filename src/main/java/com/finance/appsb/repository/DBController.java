package com.finance.appsb.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.finance.appsb.TestMyCode;

@RestController
public class DBController {
	@Autowired
	AccountRepository accountRepository;
	
	 @GetMapping(path="/allaccounts")
	  public String getAllUsers() {
		System.out.println(" all path called");
		try {
		TestMyCode.runProc();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	    List<Account> allaccounts=accountRepository.findAll();
	    String x = "";
	    for(Account account: allaccounts)
	     x=x+" "+account.getId()+" " +account.getName()+" "+account.getBalance();      
	    return x;
	  }
	
	 @GetMapping("/test")
	  public String getResp() {
		  System.out.println(" test path called");
		  return "How are you ";
	  }
}
