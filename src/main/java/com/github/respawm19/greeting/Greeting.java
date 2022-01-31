package com.github.respawm19.greeting;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Greeting {
   @Id
   @Getter
   @Setter
   private long id;

   @NotNull
   @Getter
   @Setter
   private String name;
}
