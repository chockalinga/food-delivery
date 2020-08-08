package com.altimetrik.ee.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.ee.demo.bean.PairedComponentDetailsBean;
import com.altimetrik.ee.demo.service.ComponentDetailsService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/service")
public class ServiceController {

	protected static Logger logger = LoggerFactory.getLogger(ServiceController.class.getName());

	@Value("${spring.application.name}")
	private String applicationName;

	@Autowired
	private ComponentDetailsService componentDetailsService;

	@GetMapping(value = "/")
	@ApiOperation(value = "Get service name and identifier", notes = "Get service details and its corresponding values for all paired services", response = PairedComponentDetailsBean.class)
	public PairedComponentDetailsBean findAll() {
		return componentDetailsService.findAll(this.applicationName);
	}

}
