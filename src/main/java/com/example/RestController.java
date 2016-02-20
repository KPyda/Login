package com.example;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kuba on 20.02.16.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
	@RequestMapping(value = "/")
	public String fun() {
		return "Gratulacje wlasnie dowiedziales sie jaki bedzie login i haslo do zapisow na zajecia. FLAGA(PREMIUM_ACCOUNT) jest dla Ciebie :) udanych zapisow ;>";
	}
}
