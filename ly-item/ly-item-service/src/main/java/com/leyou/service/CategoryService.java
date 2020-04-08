package com.leyou.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @Description
 * @Author DC
 * @Date 2020-04-08
 */
public interface CategoryService {
    public List<Category> queryListByParent(Long pid);
}
