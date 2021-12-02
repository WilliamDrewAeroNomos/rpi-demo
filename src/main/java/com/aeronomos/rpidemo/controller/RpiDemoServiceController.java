/**
 * 
 */
package com.aeronomos.rpidemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/lifecycle")
public class RpiDemoServiceController {

	/**
	 * Logger instance.
	 */
	private static final Logger LOG = LoggerFactory
			.getLogger(RpiDemoServiceController.class.getName());

	/**
	 * 
	
	 */
	@GetMapping("/shutdown")
	public void shutdown() {

		LOG.info("Container called me in preStop");

	}

}
