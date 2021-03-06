package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;
import java.util.Map;

/****
 *author:Lenovo 20:08
 *description:深圳黑马
 *version:1.0

 ****/
public interface BrandService {

    public List<TbBrand> findAll();

    public PageResult findPage(int pageNum,int pageSize);

    public void add(TbBrand tbBrand);

    public void delete(Long [] ids);

    public PageResult findPage(TbBrand tbBrand,int pageNum,int pageSize);

    public void update(TbBrand tbBrand);

    public TbBrand findOne(Long id);

    public List<Map> selectOptionList();

}

