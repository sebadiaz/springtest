package org.olo.rest;

import org.olo.newton.NewtonFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Service {
	
	@Autowired
	 NewtonFactory fact;
	    

	    @RequestMapping("/greeting")
	    public String greeting() {
	        return fact.toString();
	    }
	    
	    @RequestMapping("/hello/{player}")
	    public String message(@PathVariable("player") String player) {//REST Endpoint.
	 
	        return "Hello " + player;
	    }

}
