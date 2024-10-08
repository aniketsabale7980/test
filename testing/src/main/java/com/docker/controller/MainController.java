package com.docker.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

  @GetMapping
  public String stringReturn() {
    return "Working Properly!";
  }

  @GetMapping("/get-object")
  public Map objectReturn() {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Name");
    map.put(2, "Standard");
    map.put(3, "Height");
    map.put(4, "Weight");
    return map;
  }


}
