package com.owler.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by kumaran on 1/5/17.
 */
@Controller
public class GreetingController {

    @RequestMapping("/sayHello")
    public String greetMe(@RequestParam(value="name", required=false, defaultValue="Owly") String name, Model model) throws InterruptedException {
        model.addAttribute("message","Hey Little, "+name+",Ready to hoot ?");
        System.out.println("Request received");
        doAnIO();
        System.out.println("Request processed");
        return "greetingOwl";
    }

    private void doAnIO() throws InterruptedException {
        Thread.sleep(1000);
    }
}
