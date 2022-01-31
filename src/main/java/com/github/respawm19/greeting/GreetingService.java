package com.github.respawm19.greeting;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GreetingService {
   private GreetingRepository greetingRepository;

   public Greeting get(long id) {
      return greetingRepository.findById((int) id);
   }

   public Greeting create(long id, String name) {
      var greeting = new Greeting();

      greeting.setId((int) id);
      greeting.setName(name);

      return greetingRepository.save(greeting);
   }
}
