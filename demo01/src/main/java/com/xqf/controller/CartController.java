package com.xqf.controller;

//import com.github.pagehelper.PageInfo;

import com.xqf.entity.Cart;
import com.xqf.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * @Classname CartController
 * @Date 2021/12/6
 * @Author xqf
 */

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/findAllCart")
    public String findAllCart(@RequestParam(defaultValue = "1") Integer page,
                              @RequestParam(defaultValue = "3") Integer rows,
                              Model model) {

//        PageInfo<Cart> info = cartService.findAll(page,rows);
        List<Cart> info = cartService.findAll(page, rows);

        model.addAttribute("info", info);

        return "show";
    }



    /*
     * redis的5种数据类型使用
     * */

    @GetMapping("/string")
    public String stringTest() {
        redisTemplate.opsForValue().set("str", "Hello World");
        String str = (String) redisTemplate.opsForValue().get("str");
        return str;
    }

    @GetMapping("/list")
    public List<String> listTest() {
        ListOperations<String, String> listOperations = redisTemplate.opsForList();
        listOperations.leftPush("list", "Hello");
        listOperations.leftPush("list", "World");
        listOperations.leftPush("list", "Java");
        List<String> list = listOperations.range("list", 0, 2);
        return list;
    }

    @GetMapping("/set")
    public Set<String> setTest() {
        SetOperations<String, String> setOperations = redisTemplate.opsForSet();
        setOperations.add("set", "Hello");
        setOperations.add("set", "World");
        setOperations.add("set", "World");
        Set<String> set = setOperations.members("set");
        return set;
    }

    @GetMapping("/zset")
    public Set<String> zsetTest() {
        ZSetOperations<String, String> zSetOperations = redisTemplate.opsForZSet();
        zSetOperations.add("zset", "Hello", 1);
        zSetOperations.add("zset", "World", 2);
        zSetOperations.add("zset", "World", 3);
        Set<String> set = zSetOperations.range("zset", 0, 2);
        return set;
    }

    @GetMapping("/hash")
    public void hashTest() {
        HashOperations<String, String, String> hashOperations = redisTemplate.opsForHash();
        hashOperations.put("key", "hashkey", "hello");
        System.out.println(hashOperations.get("key", "hashkey"));
    }

}

































