package com.xqf.entity;

import java.io.Serializable;

/**
 * @Classname Cart
 * @Date 2021/12/2
 * @Author xqf
 */

//Serializable序列化
public class Cart implements Serializable {

    private int cartId;

    private int userId;

    private int mealId;

    private int count;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
