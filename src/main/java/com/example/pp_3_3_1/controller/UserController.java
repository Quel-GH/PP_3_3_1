package com.example.pp_3_3_1.controller;

import com.example.pp_3_3_1.model.UserEntity;
import com.example.pp_3_3_1.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    UserService DB;

    public UserController(UserService DB) {
        this.DB = DB;
    }

    @GetMapping(value = "/")
    public String mainPage(Model model){
        model.addAttribute("userList", DB.getAllUsers());

        return "main";
    }

    @GetMapping(value = "/add")
    public String add(Model model){
        model.addAttribute("UserEntity", new UserEntity());
        return "add";
    }

    @PostMapping(value = "/add")
    public String add(@RequestParam("name") String name, @RequestParam String lastName) {
        DB.addUser(new UserEntity(name, lastName));
        return "redirect:/";
    }

    @GetMapping(value = "/delete")
    public String delete(){
        return "delete";
    }

    @PostMapping(value = "/delete")
    public String delete(@RequestParam("Id") Long Id) {
        DB.deleteUser(Id);
        return "redirect:/";
    }

    @GetMapping(value = "/update")
    public String update(){

        return "update";
    }

    @PostMapping(value = "/update")
    public String update(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam String lastName) {
        DB.updateUser(id, name, lastName);
        return "redirect:/";
    }

}
