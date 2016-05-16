package com.swingl;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class L2 extends JFrame implements ActionListener
{
	//创建JPanel对象
	private JPanel jp=new JPanel();
	//创建标签数组
	private JCheckBox[] jcbArray={new JCheckBox("上网聊天/交友"),new JCheckBox("体育/户外/健身"),
			new JCheckBox("汽车/购物"),new JCheckBox("旅游/度假"),new JCheckBox("时尚服饰/化妆")};
	//������ѡ��ť����
	private JRadioButton[] jrbArray={new JRadioButton("5~15岁"),new JRadioButton("16~25岁"),
			new JRadioButton("26~35岁"),new JRadioButton("36~45岁"),new JRadioButton("46~55岁")};
	//������ť����
	private JButton[] jbArray={new JButton("提交"),new JButton("清空")};
	//������ǩ����
	private JLabel[] jlArray={new JLabel("年龄段："),new JLabel("兴趣爱好："),new JLabel("调查结果为：")};
	//�����ı���
	private JTextField jtf=new JTextField();
	//������ť��
	private ButtonGroup bg=new ButtonGroup();
	public L2()
	{
		//����JPanel���ֹ�����
		jp.setLayout(null);
		//�Ը����ؼ���������
		for(int i=0;i<5;i++)
		{
			//���õ�ѡ��ť�븴ѡ��Ĵ�С��λ��
			jrbArray[i].setBounds(40+i*100,40,80,30);
			jcbArray[i].setBounds(40+i*120,100,120,30);
			//����ѡ��ť�븴ѡ����ӽ�JPanel��
			jp.add(jrbArray[i]);
			jp.add(jcbArray[i]);
			//Ϊ��ѡ��ť�븴ѡ��ע�ᶯ���¼�������
			jrbArray[i].addActionListener(this);
			jcbArray[i].addActionListener(this);
			//����ѡ��ť��ӽ�ť����
			bg.add(jrbArray[i]);
			if(i>1) continue;
			//���ñ�ǩ����ͨ��ť�Ĵ�Сλ�� 
			jlArray[i].setBounds(20,20+i*50,80,30);
			jbArray[i].setBounds(400+i*120,200,80,26);
			//����ǩ����ͨ��ť��ӽ�JPanel��
			jp.add(jlArray[i]);
			jp.add(jbArray[i]);
			//Ϊ��ͨ��ťע�ᶯ���¼�������
			jbArray[i].addActionListener(this);
		}
		//���õ������ǩ�Ĵ�Сλ�ã���������ӵ�JPanel��
		jlArray[2].setBounds(20,150,120,30);
		jp.add(jlArray[2]);
		//���õ�������ı����Сλ�ã����������JPanel��
		jtf.setBounds(120,150,500,26);
		jp.add(jtf);
		//������ʾ�������ı���Ϊ���ɱ༭״̬
		jtf.setEditable(false);
		//��JPanel��ӽ�����
		this.add(jp);
		//���ô���ı��⣬��С��λ���Լ��ɼ��Ե�
		this.setTitle("个人信息调查");
		this.setBounds(100,100,700,280);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jbArray[1])
		{
			//��հ�ťִ�еĶ���
			bg.clearSelection();
			for(int i=0;i<jbArray.length;i++)
			jcbArray[i].setSelected(false);
			jtf.setText("");
		}
		else
		{
			//����������ʱ�ַ�
			StringBuffer temp1=new StringBuffer("你是一个");
			StringBuffer temp2=new StringBuffer();
			for(int i=0;i<5;i++)
			{
				//��ȡ����ε�ѡ��ֵ
				if(jrbArray[i].isSelected())
				{
					temp1.append(jrbArray[i].getText());
				}
				//��ȡ����ѡ��ֵ
				if(jcbArray[i].isSelected())
				{
					temp2.append(jcbArray[i].getText()+",");
				}
			}
			//��ӡ���
			if(temp2.length()==0)
			{
				//���û��ѡȡ����
				jtf.setText("兴趣爱好不能为空！！！");
			}
			else
			{
				//ѡȡ�˰���
				temp1.append("的人，你比较喜欢");
				temp1.append(temp2.substring(0,temp2.length()-1));
				jtf.setText(temp1.append("。").toString());
			}
		}
	}
	public static void main(String[] args) {
		//�����������
		new L2();
	}

}
