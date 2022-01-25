package nl.thesari.noviSB;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @Value("${message.default}")
    private String defaultMessage;

    @GetMapping("/")
    public String sayHello(@RequestParam(required = false) String name, @RequestParam(required = false) String lastName) {
        if (name == null) {
            return defaultMessage;
        }
        return "Hello  " + name + " " + lastName;
    }

//    @GetMapping("/lastName")
//    public String tellLastName(@RequestParam(required = false) String lastName) {
//        if (lastName == null) {
//            return defaultMessage;
//        }
//        return "Hallo" + lastName;
//    }
}


