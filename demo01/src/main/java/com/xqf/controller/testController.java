package com.xqf.controller;

import com.xqf.entity.Cart;
import com.xqf.mapper.CartMapper;
import com.xqf.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Classname testController
 * @Date 2022/2/16
 * @Author xqf
 */

@Controller
public class testController {

    @Autowired
    private CartService cartService;

    @RequestMapping("/test")
    public String test(Model model){
        List<Cart> info = cartService.findAll(1, 2);

        model.addAttribute("info", info);

        return "show";
//        return "helloworld";
    }
}
