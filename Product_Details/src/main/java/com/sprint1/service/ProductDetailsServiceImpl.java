package com.sprint1.service;

//public class ProductDetailsServiceImpl {
	import com.sprint1.dao.ProductDetailsDaoImpl;
	//import com.capg.sprint1.service.RawMaterialOrderService;
	public class ProductDetailsServiceImpl implements ProductDetailsService {//4

	public String displayOrder(String OrderId) {
		ProductDetailsDaoImpl rawMaterialOrderDaoImplObj=new ProductDetailsDaoImpl();//5

	return rawMaterialOrderDaoImplObj.displayOrder(OrderId) ;//19
	}

	}

