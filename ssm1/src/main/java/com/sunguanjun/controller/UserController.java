package com.sunguanjun.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunguanjun.pojo.User;
import com.sunguanjun.pojo.UserHobby;
import com.sunguanjun.pojo.UserHobby2;
import com.sunguanjun.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
  @Resource
  private UserService userService;
  
  @RequestMapping("/showUser")
  public String toIndex(HttpServletRequest request,Model model){
    int userId = Integer.parseInt(request.getParameter("id"));
    User user = this.userService.getUserById(userId);
    model.addAttribute("user", user);
    return "showUser";
  }
  
  @RequestMapping("/showUserHobby")
  public String toIndex1(HttpServletRequest request,Model model){
    int userId = Integer.parseInt(request.getParameter("id"));
    List<UserHobby> userHobby = this.userService.selectUserHobby(userId);
    model.addAttribute("userHobby", userHobby.get(1));
    return "showUserHobby";
  }
  
  @RequestMapping("/showUserHobby2")
  public String toIndex2(HttpServletRequest request,Model model){
    int userId = Integer.parseInt(request.getParameter("id"));
    UserHobby2 obj = this.userService.selectUserHobby2(userId);
    model.addAttribute("userHobby", obj);
    return "showUserHobby2";
  }
}