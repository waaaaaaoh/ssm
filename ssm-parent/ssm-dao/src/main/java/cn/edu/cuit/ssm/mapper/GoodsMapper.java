package cn.edu.cuit.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.edu.cuit.ssm.entity.Goods;

public interface GoodsMapper {
	@Select("select goods_id as id,goods_name as name,goods_price as price,goods_num as num,goods_img as img ,goods_type as type from goods")
	List<Goods> findAll();
   
	
	@Delete("delete  from goods where goods_id=#{id}")
	void delete(int id);
   
    
    @Insert("insert into goods(goods_id,goods_name,goods_price,goods_num,goods_img,goods_type) values(default,#{name},#{price},#{num},#{img},#{type})")
	void insert(@Param("name")String name,@Param("price")Double price,@Param("num")int num,@Param("img") String img,@Param("type")int type);
    
    
    @Select("select goods_id as id,goods_name as name,goods_price as price,goods_num as num,goods_img as img ,goods_type as type from goods where goods_type=#{type}")
	List<Goods> findAllbytype(@Param("type")int type);
    
    
    @Update("update goods set goods_name=#{name},goods_price=#{price},goods_num=#{num}  where goods_id=#{id}")
   	public  int  update(@Param("id") int  id,@Param("name") String name ,@Param("price") double price,@Param("num") int num);

    @Select("select * from goods where goods_name like'%${str}%'")
	List<Goods> findbyname(@Param("str")String str);
	
    


}
