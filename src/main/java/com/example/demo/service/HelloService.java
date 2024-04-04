package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.HelloEntity;
import com.example.demo.repository.HelloRepository;

@Service
public class HelloService {
  @Autowired
  private HelloRepository repository;

  public String helloSpring() {
    return "Hello Spring";
  }

  public List<HelloEntity> getAll() {
    return repository.findAll();
  }
}
