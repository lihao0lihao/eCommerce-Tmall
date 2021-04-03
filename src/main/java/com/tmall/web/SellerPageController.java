package com.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SellerPageController {
    @GetMapping(value="/seller")
    public String admin(){
        return "redirect:seller_category_list";
    }
    @GetMapping(value="/seller_category_list")
    public String listCategory(){
        return "seller/listCategory";
    }
}