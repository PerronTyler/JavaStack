package com.tyler.daikichipathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@RequestMapping("/")
	public String index() {
		return "Welcome ";
	}
	@RequestMapping("/m/travel/{city}")
	public String showTravel( @PathVariable("city") String city) {
		return "Congrats! You will soon travel" + "to :" + city;
	}
	@RequestMapping("/m/lotto/{number}")
	public String showLotto( @PathVariable("number") Integer number) {
		if(number % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers.";
		} else {
			
			return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
		}
	}
}
