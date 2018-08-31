package com.moreunderstanding.pageobject;

public class Test 
{
	public static void main(String[] args) {
		
		Car c=new Car();
		c.carModel="AUDI";
		
		c.rno=new Registration_Number();
		c.rno.reg_no="AP123456";
		System.out.println(c.rno.reg_no);	
	}

}
