package com.example.m_core_1.controllers;


import com.example.m_core_1.dto.UserDTO;
import com.example.m_core_1.mappers.UserMapper;
import com.example.m_core_1.model.User;
import com.example.m_core_1.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserMapper UserMapper;

    public UserController(UserMapper userMapper) {
        UserMapper = userMapper;
        userService = null;
    }

    @GetMapping("/users/{id}")
    public UserDTO sayHello(@PathVariable Long id) {
        assert userService != null;
        User user = userService.getUser(id);
        return UserMapper.toDTO(user);
    }}
/*@Component
//class Application {

  //  public static void main(String[] args) {
   //     SpringApplication springApplication = new SpringApplication(Application.class);
    //    System.out.println("Spring Core Version:- " + SpringVersion.getVersion());

   // }
//}

//@SpringBootApplication
//class App {
 //  public static void main(String[] args) {
  //     SpringApplication.run(App.class, args);
 */