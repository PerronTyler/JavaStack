package com.tyler.hellohuman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}

	@RequestMapping("/")
	public String getName(@RequestParam(value="name", required = false) String name) {
		if(name == null) {
			name = "human";
		}
		return "Hello " + name;
	}

}