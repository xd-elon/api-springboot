package br.com.alan.todolist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class MyController {

  public String primeiraMensagem() {
    return "ok";
  }

}
