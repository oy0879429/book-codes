package com.ex1;

public class s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String List[][]={{"pen","�ֱ�"},{"pencil","Ǧ��" },
				{"pencil case","Ǧ�ʺ�"},{"rule","����" },
				{"book","��" },{"bookmark","��ǩ"}};
		String strE="pencil";
		String strC="";
		@SuppressWarnings("unused")
		int flag=0;
		for(int i=0;i<List.length;i++)
		{
			if(List[i][0].compareTo(strE)==0)
			{
				strC=List[i][1];
				System.out.println("���ҵ���������Ϊ��" +strC);
				flag=1;
				break;
			}
		}
	}

}
