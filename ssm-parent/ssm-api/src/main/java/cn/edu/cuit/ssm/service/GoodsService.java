package cn.edu.cuit.ssm.service;


import com.github.pagehelper.PageInfo;

import cn.edu.cuit.ssm.entity.Goods;

public interface GoodsService {

	PageInfo<Goods> findAll(int pageNum,int pageSize);

	void delete(int id);

	void insert(String name, Double price, int num, String img, int type);

	PageInfo<Goods> findAllbytype(int pageNum, int pageSize, int type);

	int update(int id, String name, double price, int num);

	PageInfo<Goods> findbyname(int pageNum, int pageSize, String str);



}
