package com.ex1;

public class s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int List[]={83,33,54,25,5,35,26,74,98,102};
		int i,j,x;
		for(i=List.length-1;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(List[i]<List[j])
				{
					x=List[i];
					List[i]=List[j];
					List[j]=x;
				}
			}
		}
		System.out.print("The sorted List is:");
		for(i=0;i<List.length;i++)
		{
			System.out.print(" "+List[i]);
		}
	}
}
