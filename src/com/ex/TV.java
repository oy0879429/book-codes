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
		return oldStr+"\n���ǵ��ӻ���Ʒ���ǣ�"+name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString());
		TV tv=new TV("�������");
		System.out.println(tv.toString());
	}

}

