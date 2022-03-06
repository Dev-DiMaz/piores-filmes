package com.dmazui.pioresfilmes.controllers;

import java.time.LocalDateTime;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthController {

	@GetMapping
	public String startPageApi() throws Exception {

		JSONObject jObj = new JSONObject();
		jObj.put("api", "Api-Piores-Filmes");
		jObj.put("status", "On");
		jObj.put("time", LocalDateTime.now());
		jObj.put("by", "DMazui");

		return jObj.toString();
	}
}
