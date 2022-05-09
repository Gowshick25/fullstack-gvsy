package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mvc")
public class WelcomeController {
	
	@RequestMapping(value = "/great",method = RequestMethod.GET)
	@ResponseBody
	public String getMessage()
	{
		return "<marquee bgcolor=\"Green\" behavior=alternate direction=left loop=\"\"> <h1> welcome to mvc <h1> </marquee>";
	}

}
