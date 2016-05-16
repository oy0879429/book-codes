package com.ex1;

public class s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String List[][]={{"pen","钢笔"},{"pencil","铅笔" },
				{"pencil case","铅笔盒"},{"rule","尺子" },
				{"book","书" },{"bookmark","书签"}};
		String strE="pencil";
		String strC="";
		@SuppressWarnings("unused")
		int flag=0;
		for(int i=0;i<List.length;i++)
		{
			if(List[i][0].compareTo(strE)==0)
			{
				strC=List[i][1];
				System.out.println("查找到中文字义为：" +strC);
				flag=1;
				break;
			}
		}
	}

}
