package com.github.respawm19.greeting;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( path = "/greetings")
public class GreetingController {
   private GreetingService greetingService;

   @RequestMapping(method = RequestMethod.GET)
   public Greeting show(long id) {
      return greetingService.get(id);
   }

   @RequestMapping(method = RequestMethod.POST)
   @GetMapping(path = "/create")
   public Greeting create(@RequestParam long id, @RequestParam String name) {
      return greetingService.create(id, name);
 }
}