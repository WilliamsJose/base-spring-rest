package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.HelloEntity;
import com.example.demo.service.HelloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {
  @Autowired
  private HelloService service;

  @GetMapping("/spring")
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok(service.helloSpring());
  }

  @GetMapping("/all")
  public ResponseEntity<List<HelloEntity>> getAll() {
    return ResponseEntity.ok(service.getAll());
  }

}
