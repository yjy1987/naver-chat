package com.spring.mvc.sample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.common.web.controller.BaseController;
import com.spring.mvc.sample.service.SampleService;

@RestController("sampleController")
public class SampleController extends BaseController{
	
	@Autowired
	private SampleService sampleService;

	@RequestMapping("/sample")
	public ModelAndView sample(@RequestParam HashMap<String, Object> map) throws Exception {
		
		List<Map<String, Object>> list = sampleService.selectBoardList(map);
		map.put("list",list); 
		return new ModelAndView("sample",map);
	} 
}