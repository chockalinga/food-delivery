package com.altimetrik.ee.demo.service;

import org.springframework.stereotype.Service;

import com.altimetrik.ee.demo.bean.PairedComponentDetailsBean;

@Service
public interface ComponentDetailsService {

	boolean createComponentDetails(final String applicationName);

	PairedComponentDetailsBean findAll(final String applicationName);

}
