package web.school.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class JaneiroSchoolController {
    
    @GetMapping("/webhook/studentAdded/{name}")
    public @ResponseBody String studentAdded(@PathVariable String name) {
        System.out.println("Student name" + name);
        return " Webhook received successfully!";
    }
}
