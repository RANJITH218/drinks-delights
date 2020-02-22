package com.sprint1.dao;

	import java.util.*;

import com.sprint1.method.ProductDetails;

	public class ProductDetailsDaoImpl implements ProductDetailsDao {//6
	public String displayOrder(String OrderId) {
	Map<String,ProductDetails> raws =new HashMap<String, ProductDetails>();//7

	ProductDetails order=new ProductDetails ("1","Thumsup",102.4,"123",new Date(), new Date(2020, 0, 15),121.0,146.0,"245");//8
	ProductDetails  order1=new ProductDetails ("2","Sprite",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"459");//9
	ProductDetails order11=new ProductDetails ("3","coca-cola",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"434");//10
	ProductDetails  order12=new ProductDetails ("4","Merinda",101.4,"128",new Date(), new Date(2020, 11, 20),120.0,140.0,"414");//11
	ProductDetails  order13=new ProductDetails ("5","Fizz",101.4,"128",new Date(), new Date(2020, 10, 20),120.0,140.0,"404");//12

	raws.put(order.getOrderId(), order);//12
	raws.put(order1.getOrderId(), order1);//13
	raws.put(order11.getOrderId(), order11);//14
	raws.put(order12.getOrderId(), order12);//15
	raws.put(order13.getOrderId(), order13);//16
	//return null;
	for(String ord:raws.keySet())//17
	{
	//System.out.println(raws.toString());
	if(raws.get(ord).getOrderId().equalsIgnoreCase(OrderId)){
	System.out.println(raws.get(ord));//18
	}
	}
	return null;//19
	}
	}
