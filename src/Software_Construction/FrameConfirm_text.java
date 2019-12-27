package Software_Construction;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FrameConfirm_text {
/////////////////////////批量产生习题文件///////////////////////////////////
	public static int sign = 0;
/**
* Creat_JButton()方法。输入套题名称，设置一级姓名。
* 输入：无
* 输出：无
* 
* */ 
    public void Creat_JButton() {
    	JFrame jFrame = new JFrame("批量产生习题文件");
    	Container c = jFrame.getContentPane();
        //设置窗体的位置及大小
        jFrame.setBounds(600, 200, 300, 200);
        //设置一层相当于桌布的东西
        c.setLayout(new GridLayout(4,1,10,10));//布局管理器
        //设置按下右上角X号后关闭
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //初始化--往窗体里放其他控件
        //////////////////////////////////////////////////////////////
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        JLabel text1 = new JLabel("请输入套题名称");
        text1.setFont(new Font("微软雅黑",Font.BOLD, 20));
        titlePanel.add(text1);
        c.add(titlePanel);
        JTextField name = new JTextField();
        c.add(name);
        JPanel titlePanel2 = new JPanel();
        titlePanel2.setLayout(new FlowLayout());
        JButton okbtn = new JButton("确定");
        okbtn.addActionListener(new ActionListener() {//按下确定

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CsvIO_Method f = new CsvIO_Method();
				f.Set_Name(name.getText());
				f.Creat_CSV_Book(name.getText());//生成三套题
				Creat_JButton2();
			//	jFrame.dispose();
				jFrame.setVisible(false);
			}
        	
        });
        titlePanel2.add(okbtn);
        c.add(titlePanel2);
        //////////////////////////////////////////////////////////////
        //设置窗体可见
        jFrame.setVisible(true);
    }
    
/////////////////////////批量产生习题文件2///////////////////////////////////
/**
* Creat_JButton2方法。选择生成的三套不同的习题文件（加法、减法、混合），选择其中一种。确定二级姓名
* 输入：无
* 输出：无
* 
* */    
    public void Creat_JButton2() {
    	JFrame jFrame = new JFrame("批量产生习题文件");
    	Container c = jFrame.getContentPane();
        //设置窗体的位置及大小
        jFrame.setBounds(600, 200, 300, 200);
        //设置一层相当于桌布的东西
        c.setLayout(new GridLayout(3,1,10,10));//布局管理器
        //设置按下右上角X号后关闭
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //初始化--往窗体里放其他控件
        //////////////////////////////////////////////////////////////
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        JLabel text1 = new JLabel("请选择一种套题");
        text1.setFont(new Font("微软雅黑",Font.BOLD, 20));
        titlePanel.add(text1);
        c.add(titlePanel);
        
        JButton jbutton1 = new JButton("加法");
        jbutton1.addActionListener(new ActionListener() {//按下确定

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CsvIO_Method f = new CsvIO_Method();
				Framemain_text F = new Framemain_text();
				f.Return_Name_operation(f.Retuen_Name1(), "Add");//统一的姓名格式
				f.Return_Name_type(f.Retuen_Name2(), "exercise");
				csvIO csvio = new csvIO();//将导入的list传入主界面
				F.lstFile = (ArrayList<String[]>) csvio.Reader_Book(f.Retuen_Name3()).clone();//list能直接相等嘛？
			//	System.out.println(F.lstFile.get(0)[1]);
				System.out.println("已完成加法套题的读取");//设置一个循环让程序不停下来
				
				sign=1;
				System.out.println("*"+sign);
				jFrame.setVisible(false);
				
			}
	      	
	     });
        JButton jbutton2 = new JButton("减法");
        jbutton2.addActionListener(new ActionListener() {//按下确定

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CsvIO_Method f = new CsvIO_Method();
				Framemain_text F = new Framemain_text();
				f.Return_Name_operation(f.Retuen_Name1(), "Subtraction");//统一的姓名格式
				f.Return_Name_type(f.Retuen_Name2(), "exercise");
				csvIO csvio = new csvIO();//将导入的list传入主界面
				F.lstFile = (ArrayList<String[]>) csvio.Reader_Book(f.Retuen_Name3()).clone();//list能直接相等嘛？
				System.out.println("已完成减法套题的读取");
				sign=1;
				jFrame.setVisible(false);
				jFrame.dispose();
			}
	      	
	     });
        JButton jbutton3 = new JButton("混合加减法");
        jbutton3.addActionListener(new ActionListener() {//按下确定

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CsvIO_Method f = new CsvIO_Method();
				Framemain_text F = new Framemain_text();
				f.Return_Name_operation(f.Retuen_Name1(), "Rondom");//统一的姓名格式
				f.Return_Name_type(f.Retuen_Name2(), "exercise");
				csvIO csvio = new csvIO();//将导入的list传入主界面
				F.lstFile = (ArrayList<String[]>) csvio.Reader_Book(f.Retuen_Name3()).clone();//list能直接相等嘛？
				System.out.println("已完成减法套题的读取");
				sign=1;
				jFrame.setVisible(false);
				jFrame.dispose();
			}
	      	
	     });

        JPanel titlePanel2 = new JPanel();
        titlePanel2.setLayout(new FlowLayout());
  
//        okbtn.addActionListener(new ActionListener() {//按下确定
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				CsvIO_Method f = new CsvIO_Method();
//				f.Set_Name(name.getText());
//				jFrame.setVisible(false);
//			}
//        	
//        });
        titlePanel2.add(jbutton1);
        titlePanel2.add(jbutton2);
        titlePanel2.add(jbutton3);
        c.add(titlePanel2);
        //////////////////////////////////////////////////////////////
        //设置窗体可见
        jFrame.setVisible(true);
    }
    

}
