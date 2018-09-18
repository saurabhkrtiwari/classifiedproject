package com.classifiedproject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.classifiedproject.beans.Advertisement;
import com.classifiedproject.beans.Contact;
@Controller
public class AdController {
 
	@RequestMapping("/viewAd")
	public String viewAd(Model m)
	{
		Contact contact =new Contact("Saurabh", "xyz@gmail.com", "9410451959");
		Advertisement ad1 = new Advertisement(1, "First Ad", contact);
		Advertisement ad2 = new Advertisement(2, "Second Ad", contact);
		List<Advertisement> adList = new ArrayList<>();
		adList.add(ad1);
		adList.add(ad2);
	m.addAttribute("adlist",adList);  
		
		
		
		return "viewAd";
	}
}
