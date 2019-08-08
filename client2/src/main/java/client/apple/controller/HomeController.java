package client.apple.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String hello(HttpRequest request) {
        String url = request.getURI().toString();
        System.out.println(url);
        return "index";
    }
}
