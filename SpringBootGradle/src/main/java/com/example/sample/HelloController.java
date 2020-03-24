package com.example.sample;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public void helloText(HttpServletResponse response) throws IOException {
		response.getWriter().print("hello world");
	}

}
