package com.teamtreehouse.giftlib.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teamtreehouse.giftlib.model.Gif;


@Controller
public class GiftController {

	@RequestMapping("/")
	public String listGifs(){
		return "home";
	}
	
	@RequestMapping("/gif")
	 public String gifDetails(ModelMap modelMap){
		Gif gif=new Gif("compiler-bot", LocalDate.of(2015,2,13),"Karin",true);
		modelMap.put("gif",gif);
		return "gif-details";
	}
}
