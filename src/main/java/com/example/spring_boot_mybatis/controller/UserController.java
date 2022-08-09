package com.example.spring_boot_mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.spring_boot_mybatis.dto.UserSearchRequest;
import com.example.spring_boot_mybatis.entity.User;
import com.example.spring_boot_mybatis.service.UserService;

@Controller
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/user/search")
  public String displaySearch(Model model) {
    model.addAttribute("userSearchRequest", new UserSearchRequest());
    return "user/search";
  }

  @RequestMapping(value = "/user/id_search", method = RequestMethod.POST)
  // @PostMapping("/user/id_search")
  public String search(@ModelAttribute UserSearchRequest userSearchRequest, Model model) {
    User user = userService.search(userSearchRequest);
    model.addAttribute("userinfo", user);
    return "user/search";
  }

  @GetMapping("/user/test")
  public String string() {
    return "user/test";
  }
  


  
}
