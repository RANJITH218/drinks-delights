package com.sprint1.ui;

import java.util.Scanner;

import com.sprint1.service.ProductDetailsServiceImpl;

//import com.capg.sprint1.service.RawMaterialOrderServiceImpl;

public class Main {
static Scanner in=new Scanner(System.in);
public static void main(String[] args) {
	ProductDetailsServiceImpl ProductDetailsImplObj = new ProductDetailsServiceImpl();//3
System.out.println("Enter  Id");//1
String id=in.nextLine();
//System.out.println("Enter Delivery Status");//2
//String deliveryStatus=in.nextLine();
ProductDetailsImplObj.displayOrder(id);//20
}
}





