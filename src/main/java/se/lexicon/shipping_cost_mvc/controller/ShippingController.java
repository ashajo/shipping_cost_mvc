package se.lexicon.shipping_cost_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shipping")
public class ShippingController {

@GetMapping("/boxForm")
public String showBoxForm(){
    return "addBoxForm";
}
}
