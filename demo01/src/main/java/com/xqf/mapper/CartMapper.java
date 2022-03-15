package com.xqf.mapper;

import com.xqf.entity.Cart;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Classname CartMapper
 * @Date 2021/12/6
 * @Author xqf
 */

public interface CartMapper {

//    @Select("select * from cart")
    List<Cart> selectAll();
}
