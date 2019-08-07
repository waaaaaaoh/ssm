package cn.edu.cuit.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.edu.cuit.ssm.entity.Goods;
import cn.edu.cuit.ssm.mapper.GoodsMapper;
import cn.edu.cuit.ssm.service.GoodsService;
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	@Autowired
   private  GoodsMapper goodsMapper;
	@Override
	public PageInfo<Goods> findAll(int pageNum,int pageSize) {
		//告诉从哪里开始
		PageHelper.startPage(pageNum, pageSize);
		List<Goods> ls=goodsMapper.findAll();
		//封装为
		PageInfo<Goods> pageInfo=new PageInfo<>(ls);
		return pageInfo;
	}
	
	
	@Override
	public void delete(int id) {
		goodsMapper.delete(id);
		
	}
	
	
	@Override
	public void insert(String name, Double price, int num, String img, int type) {
		goodsMapper.insert(name,price,num,img,type);
		
	}


	@Override
	public PageInfo<Goods> findAllbytype(int pageNum, int pageSize, int type) {
				//告诉从哪里开始
				PageHelper.startPage(pageNum, pageSize);
				List<Goods> ls=goodsMapper.findAllbytype(type);
				//封装为
				PageInfo<Goods> pageInfo=new PageInfo<>(ls);
				return pageInfo;
	}
	
	@Override
	public int  update(int id,String name,double price,int num) {
		return goodsMapper.update(id,name,price,num);
	}


	@Override
	public PageInfo<Goods> findbyname(int pageNum, int pageSize, String str) {
		//告诉从哪里开始
		PageHelper.startPage(pageNum, pageSize);
		List<Goods> ls=goodsMapper.findbyname(str);
		//封装为
		System.out.println("1"+ls);
		PageInfo<Goods> pageInfo=new PageInfo<>(ls);
		return pageInfo;
	}




}
