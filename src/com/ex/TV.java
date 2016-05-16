package com.ex;
import java.util.Date;
public class TV {
	String name;
	public TV() {		
	}
	public TV(String s){
		name=s;
	}
	public String toString(){
		String oldStr=super.toString();
		return oldStr+"\n这是电视机，品牌是："+name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString());
		TV tv=new TV("长虹电视");
		System.out.println(tv.toString());
	}

}

