package com.leyou.service;

import com.leyou.item.pojo.Brand;
import com.leyou.item.pojo.PageResult;

import java.util.List;

/**
 * @Description
 * @Author DC
 * @Date 2020-04-08
 */
public interface BrandService {
    public PageResult<Brand> queryBrandByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key);

    public void saveBrand(Brand brand, List<Long> cids);
}
