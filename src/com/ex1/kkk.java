package com.ex1;

public class kkk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int layer = 7;
		//�����ж��ٲ�
		for(int i=1;i<=layer;i++)
		{
			//�ҳ��ո����
			for(int k=1;k<=layer-i;k++)
			{
				System.out.print(" ");
			}
			//��ӡ*��
			//�ı�*�Ź���
			for(int j=1;j<=(i-1)*2+1;j++)
			{
				System.out.print("*");
			}
			//���һ������
			System.out.println();
		}
	}

}
