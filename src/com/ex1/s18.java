package com.ex1;
import java.util.regex.*;

public class s18 {
	
	public static void main(String[] args) {
		// ����������ʽ�뱻ƥ����ַ���
		String patternStr="(0?[1-9]|1[0-2]):([0-5]\\d)([a|p]m)";
		String matcherStr="���ڵ�ʱ��Ϊ10:51pm�������Ӫҵʱ��Ϊ��ÿ��8:00am��5��:3pm!!!";
		//����pattern�����matcher����
		Pattern p=Pattern.compile(patternStr);
		Matcher m=p.matcher(matcherStr);
		//����Ŀ���ַ���������
		StringBuffer sb=new StringBuffer();
		//���������
		int count=0;
		//��ӡ��ʼ�ַ���
		System.out.println("��ʼ�ַ���Ϊ��");
		System.out.println(matcherStr);
		//��ʼƥ����
		while(m.find())
		{
			//������ʱ�ַ���������
			StringBuffer temp=new StringBuffer();
			if(m.group(3).equals("am"))
			{
				//ʱ��Ϊam��������滻����
				//�����µ�ʱ���ʽ
				temp.append(m.group(1));
				temp.append(":");
				temp.append(m.group(2));
			}
			else
			{
				//ʱ��Ϊpm��������滻����
				//��ȡ�ǰ���ת��
				int time=Integer.parseInt(m.group(1));
				time=time+12;
				//�����µ�ʱ���ʽ
				temp.append(time+":"+m.group(2));
			}
			//�����滻�����������Ŀ���ַ���������
			m.appendReplacement(sb, temp.toString());
			//��ӡÿ���滻���
			System.out.println("["+(++count)+"]��"+m.group(0)+"�滻Ϊ"+temp.toString());
		}
		//�����һ���滻��ʣ����ַ�����Ӽ�Ŀ���ַ���������
		m.appendTail(sb);
		//��ӡ���Ľ��
		System.out.println("���Ľ��Ϊ��");
		System.out.println(sb.toString());
	}

}
