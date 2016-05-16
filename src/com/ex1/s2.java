package com.ex1;

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1, 3 , 5, 6, 7, 8, 9, 23, 34, 45, 46, 67};
		int index=-1,left=0,mid=-1,right;
		right=a.length;
		int num=46;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(a[mid]==num)
			{
				index=mid;
				break;
			}
			else if(a[mid]<num)
			//{
				left=mid+1;
			//}
			else if(a[mid]>num)
			//{
				right=mid-1;
			//}
			if(index==-1)
				System.out.println("数字：" +num +"不在数组中！");
			else
				System.out.println("数字：" +num +"在数组中的位置是：" +index);
		}
	}

}
