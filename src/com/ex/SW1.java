package com.ex;
import java.awt.event.*;
import javax.swing.*;
//�������̳���JFrame
@SuppressWarnings("serial")
public class SW1 extends JFrame implements ActionListener{
	//����JPanel����
	private JPanel jp=new JPanel();
	//������ǩ����
	private JLabel[] jlArray={new JLabel("�û���"),new JLabel("����"),new JLabel("")};
	//������ť����
	private JButton[] jbArray={new JButton("��¼"),new JButton("���")};
	//�����ı����Լ������
	private JTextField jtxtName=new JTextField();
	private JPasswordField jtxtPassword=new JPasswordField();
	public SW1(){
	//����JPanel���ֹ�����
		jp.setLayout(null);
		//�Ա�ǩ�밴ť�ؼ�ѭ�����д���
		for(int i=0;i<2;i++)
		{
			//���ñ�ǩ�밴ť ��Сλ��
			jlArray[i].setBounds(30, 20+i*50, 80, 26);
			jbArray[i].setBounds(50+i*110, 130, 80, 26);
			//����ǩ�밴ť��ӵ�JPanel������
			jp.add(jlArray[i]);
			jp.add(jbArray[i]);
			//Ϊ��ťע�ᶯ���¼�������
			jbArray[i].addActionListener(this);
		}
		//�����ı���Ĵ�С��λ��
		jtxtName.setBounds(80, 20, 180, 30);
		//���ı�����ӽ�JPanel����
		jp.add(jtxtName);
		//Ϊ�ı���ע�ᶯ���¼�������
		jtxtName.addActionListener(this);
		//���������Ĵ�С��λ��
		jtxtPassword.setBounds(80, 70, 180, 30);
		//���������ӽ�JPanel����
		jp.add(jtxtPassword);
		//���������Ļ����ַ�
		jtxtPassword.setEchoChar('*');
		//Ϊ�����ע�ᶯ���¼�������
		jtxtPassword.addActionListener(this);
		//����������ʾ��¼״̬�ı�ǩ��С��λ�ã���������ӽ�JPanel����
		jlArray[2].setBounds(10, 180, 300, 30);
		jp.add(jlArray[2]);
		//��JPanel������ӽ�����
		this.add(jp);
		//���ô��ڵı����С��λ���Լ��ɼ���
		this.setTitle("��¼");
		this.setResizable(false);
		this.setBounds(100,100,300,250);
		this.setVisible(true);
}
	//ʵ��ActionListener�ӿ��еķ���
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jtxtName)
		{//�¼�ԴΪ�ı���
			//�л����뽹�㵽�����
			jtxtPassword.requestFocus();
		}
		else if(e.getSource()==jbArray[1])
		{//�¼�ԴΪ��հ�ť
			//���������Ϣ
			jlArray[2].setText("");
			jtxtName.setText("");
			jtxtPassword.setText("");
			//�����뽹�����õ��ı���
			jtxtName.requestFocus();
		}
		else
		{//�¼�ԴΪ��¼��ť
			//�ж��û����������Ƿ�ƥ����ȷ
			if(jtxtName.getText().equals("wyf")&&String.valueOf(jtxtPassword.getPassword()).equals("jc"))
			{
				jlArray[2].setText("��ϲ�㣬��¼�ɹ�������");
			}
			else
			{
				jlArray[2].setText("�Բ��𣬷Ƿ��û��������룡����");
			}
		}
	}
	public static void main(String[] args) {
		//�����������
		new SW1();
	}

}
