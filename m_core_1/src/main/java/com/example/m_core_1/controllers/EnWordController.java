package com.example.m_core_1.controllers;


import com.example.m_core_1.dto.EnWordDTO;

import com.example.m_core_1.model.EnWord;
import com.example.m_core_1.services.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnWordController {
    private final EnWordService EnWordService;
   private final EnWordMapper enWordMapper;

    @GetMapping("/en-words/{id}")
    public EnWordDTO sayHello(@PathVariable Long id) {
        EnWord enWord = EnWordService.getEnWord(id);
       return enWordMapper.toDTO(enWord);
   }
}
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