package com.lst.goods.service;

import com.github.pagehelper.PageInfo;
import com.lst.goods.entity.Goods;

public interface GoodsService {
   int create(Goods goods);
   int deleteById(Integer id);
   int deleteByBatch(Integer[] ids);
   int update(Goods goods);
   Goods findById(Integer id);
   PageInfo<Goods> list(int pageNum,int pageSize);
}
