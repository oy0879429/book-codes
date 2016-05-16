package com.swingl;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
//该类继承自JFrame
public class L1 extends JFrame implements ItemListener
{
	//创建JPanel对象
	private JPanel jp=new JPanel();
	//创建按钮数组
	private JRadioButton[] jrbArray={new JRadioButton("选项1",true),new JRadioButton("选项2"),new JRadioButton("选项3")};
	//创建按钮组
	private ButtonGroup bg=new ButtonGroup();
	public L1()
	{
		//设置JPanel布局管理器
		jp.setLayout(null);
		//对单选按钮进行逐个处理设置
		for(int i=0;i<3;i++)
		{
			//设置单选按钮的大小和位置
			jrbArray[i].setBounds(20+i*150, 20, 100, 26);
			//将单选按钮添加到JPanel中
			jp.add(jrbArray[i]);
			//将单选按钮添加到按钮组中
			bg.add(jrbArray[i]);
			//为单选按钮注册ItemEvent事件监听器
			jrbArray[i].addItemListener(this);
		}
		//将容器JPanel添加到窗体
		this.add(jp);
		//设置窗体的标题大小与位置以及可见性
		this.setTitle("ItemEvent事件示例");
		this.setResizable(false);
		this.setBounds(100,100,450,100);
		this.setVisible(true);
	}
	//实现Itemlistener接口中的事件处理方法
	public void itemStateChanged(ItemEvent e)
	{
		//循环单选按钮组，判断哪个单选按钮触发了ItemEven事件
		for(int i=0;i<3;i++)
		{
			if(e.getSource()==jrbArray[i]&&jrbArray[i].isSelected())
			{
				System.out.println("单选按钮组"+(i+1)+"触发了ItemEvent事件");
			}
		}
	}
	public static void main(String[] args) {
		//创建窗体对象
		new L1();
	}

}
