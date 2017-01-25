package com.teamtreehouse.giftlib.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teamtreehouse.giftlib.model.Gif;


import com.teamtreehouse.giftlib.data.GifRepository;


@Controller
public class GiftController {
	
	@Autowired
	private GifRepository gifRepository;
	

	@RequestMapping("/")
	public String listGifs(ModelMap modelMap) {
		List<Gif> gifList=gifRepository.getList();
		modelMap.put("gifs", gifList);
		return "home";
	}
	
	@RequestMapping("/gif/{name}")
	 public String gifDetails(@PathVariable String name,ModelMap modelMap){
		Gif gif=gifRepository.findByName(name);
		modelMap.put("gif",gif);
		return "gif-details";
	}
}
