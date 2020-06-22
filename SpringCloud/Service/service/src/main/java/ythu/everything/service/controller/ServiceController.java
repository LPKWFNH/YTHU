package ythu.everything.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/xhr")
@CrossOrigin
public class ServiceController {
    @ResponseBody
    @GetMapping("/get")
    public String get() {
        return "Hello";
    }
}