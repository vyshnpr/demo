package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Welcome {


public String getMethodName(@RequestParam String param) {
    return new String();
}
@GetMapping("/welcome")
  public String welcome()
  {
    return "Welcome to Spring Boot";
  }

}
