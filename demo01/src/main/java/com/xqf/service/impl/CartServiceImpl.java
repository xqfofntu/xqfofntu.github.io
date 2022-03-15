package com.xqf.service.impl;

//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;

import com.xqf.entity.Cart;
import com.xqf.mapper.CartMapper;
import com.xqf.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname CartServiceImpl
 * @Date 2021/12/6
 * @Author xqf
 */

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<Cart> findAll(Integer page, Integer rows) {
//        PageHelper.startPage(page,rows);

        List<Cart> list = cartMapper.selectAll();

//        PageInfo<Cart> info = new PageInfo<>(list);
        List<Cart> info = list;

        return info;
    }
}
