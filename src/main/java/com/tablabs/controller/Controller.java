package com.tablabs.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@PostMapping("/submit")
	public void submitEntry(@RequestParam int serialNumber, @RequestParam String letterNumber, @RequestParam Date date,
			@RequestParam String from, @RequestParam String to) {
	}

	@PutMapping("/update")
	public void updateEntry(@RequestParam int serialNumber, @RequestParam String letterNumber, @RequestParam Date date,
			@RequestParam String from, @RequestParam String to) {

	}
}
