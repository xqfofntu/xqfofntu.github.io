package com.xqf.service;

//import com.github.pagehelper.PageInfo;

import com.xqf.entity.Cart;

import java.util.List;


/**
 * @Classname CartService
 * @Date 2021/12/6
 * @Author xqf
 */

public interface CartService {

    List<Cart> findAll(Integer page, Integer rows);

}
