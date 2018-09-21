package com.classifiedproject.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.classifiedproject.beans.Advertisement;
import com.classifiedproject.beans.Contact;
@Controller
public class AdController {
 @Autowired
 private BCryptPasswordEncoder bcrypt;
	@RequestMapping("/viewAd")
	public Model viewAd(Model m)
	{
		Contact contact1 =new Contact("Saurabh", "xyz@gmail.com", "9410451959");
		Contact contact2 =new Contact("Anuj", "ABC@gmail.com", "XXXXXXXXX");
		Advertisement ad;
		//Advertisement ad2 = new Advertisement(2, "Second Ad", contact2);
		List<Advertisement> adList = new ArrayList<>();
		Contact contact = new Contact();
		for(int i=1;i<=200;i++)
		{				
			if(i%2==0)
			{
				contact = contact2;
			}
			else
			{
				contact= contact1;
			}
			ad = new Advertisement(i, "Advertisement Number "+i, contact);
			adList.add(ad);
			
		}
		
	m.addAttribute(adList);  
		
		
		
		return m;
	}
	@RequestMapping("/profile")
	public String showProfile(Model model,Principal p) {
		//+String pass=request.get
		//System.out.println("Password Matcher "+request.getParameter("password"));
		model.addAttribute("username", p.getName());
		
		return "profile";
	}
	@RequestMapping("/admin")
	public String showAdmin() {
		return "admin";
	}
}
