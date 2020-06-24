package ythu.everything.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/xhr")
@CrossOrigin
public class ServiceController {
    @ResponseBody
    @GetMapping("/get")
    public String get() {
        return "Hello Vue";
    }

    @ResponseBody
    @PostMapping("/post")
    public String post(HttpServletResponse response) {
        return "Hello Vue";
    }
}