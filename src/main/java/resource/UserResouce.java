package resource;

import entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {

    @GetMapping
   public ResponseEntity<User> findAll() {
       User u = new User(1L, "Maria Brown", "maria@gmail.com", "12345", "9999999");
       return ResponseEntity.ok().body(u);
   }
}
