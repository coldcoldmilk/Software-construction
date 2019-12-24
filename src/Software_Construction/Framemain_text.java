package Software_Construction;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.*;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Framemain_text {
    
    private JFrame jFrame = new JFrame("");
    private Container c = jFrame.getContentPane();
    private JButton creat = new JButton("批量产生习题");
    private JButton save = new JButton("保存当前答案");
    private JButton check = new JButton("批改当前习题");
    private JButton scanf = new JButton("导入习题");
    private JButton close = new JButton("关闭");
    
    
    public void Framemain() {
        //设置窗体的位置及大小
        jFrame.setBounds(325, 40, 1100, 800);
        //设置一层相当于桌布的东西
        c.setLayout(new GridLayout(11,5,10,10));//布局管理器
        //设置按下右上角X号后关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //初始化--往窗体里放其他控件
        init();
        //设置窗体可见
        jFrame.setVisible(true);
    }
    public void init() {
    //	creat.setBounds(10, 10);//按钮太少不足以为列
    	for (int i=1;i<=50;i++) {
    		JPanel fieldPanel = new JPanel();
    		fieldPanel.setLayout(null);
    		JLabel title = new JLabel(""+i);
    		title.setBounds(0, 10, 20, 20);
    		/////////////////////////////习题显示部分//////////////////////////////
    		JLabel equation = new JLabel("算式"+i);//对题号设置新的字体，写按钮，写刷新
    		equation.setBounds(25, 10, 50, 20);//算式
    		JTextField answer  = new JTextField();
    		answer.setBounds(90, 10, 20, 20);//答案
    		JLabel RorF = new JLabel("√");
    		RorF.setBounds(120, 10, 20, 20);//对错
    		JLabel right_answer = new JLabel("50");
    		right_answer.setBounds(150, 10, 20, 20);//正确答案
    		fieldPanel.add(title);
    		fieldPanel.add(equation);
    		fieldPanel.add(answer);
    		fieldPanel.add(RorF);
    		fieldPanel.add(right_answer);
    		c.add(fieldPanel);
    		/////////////////////////////上方按钮部分////////////////////////////////
    		creat.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
    			
    		});
        	c.add(creat);
        	c.add(save);
        	c.add(check);
        	c.add(scanf);
        	c.add(close);
    	}
//    	for (int i=1;i<=50;i++) {//插入面板 面板内置；
//    		c.add(new JLabel("习题"+i));
//    	}
    }
    //测试
    public static void main(String[] args) {
      //  new Framemain();
    	Framemain_text f = new Framemain_text();
    	f.Framemain();
    }
}