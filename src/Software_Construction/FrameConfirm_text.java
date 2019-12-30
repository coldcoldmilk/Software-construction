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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

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
				f.Return_Name_operation(f.Retuen_Name1(), "Add");//统一的姓名格式
				f.Return_Name_type(f.Retuen_Name2(), "exercise");
				csvIO csvio = new csvIO();//将导入的list传入主界面
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
				f.Return_Name_operation(f.Retuen_Name1(), "Subtraction");//统一的姓名格式
				f.Return_Name_type(f.Retuen_Name2(), "exercise");
				csvIO csvio = new csvIO();//将导入的list传入主界面
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
				f.Return_Name_operation(f.Retuen_Name1(), "Rondom");//统一的姓名格式
				f.Return_Name_type(f.Retuen_Name2(), "exercise");
				csvIO csvio = new csvIO();//将导入的list传入主界面
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
    
/////////////////////////保存当前习题文件生成习题文件///////////////////////////////////
/**
* Save_JButton()方法。保存当前习题的答案进入对应的文件
* 输入：无
* 输出：无
* 
* */ 
public void Save_JButton() {
		JFrame jFrame = new JFrame("保存当前答案");
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
		JLabel text1 = new JLabel("已保存当前答案在"+CsvIO_Method.Name3+".csv");
		text1.setFont(new Font("微软雅黑",Font.BOLD, 11));
		titlePanel.add(text1);
		c.add(titlePanel);
		JPanel titlePanel2 = new JPanel();
		titlePanel2.setLayout(new FlowLayout());
		JButton okbtn = new JButton("确定");
		okbtn.addActionListener(new ActionListener() {//按下确定
		
		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			csvIO f = new csvIO();
			f.Creat_CSV_practice(Framemain_final.lstFile);
			f.Creat_CSV_check(Framemain_final.lstFile);
			jFrame.setVisible(false);
			System.out.println("已完成练习文件的保存");
			FrameConfirm_text.sign=1;
		}
		
		});
		titlePanel2.add(okbtn);
		c.add(titlePanel2);
		//////////////////////////////////////////////////////////////
		//设置窗体可见
		jFrame.setVisible(true);
	}
/////////////////////////保存当前习题文件生成批改文件///////////////////////////////////
/**
* check_JButton()方法。批改当前习题的答案
* 输入：无
* 输出：无
* 
* */ 
public void check_JButton() {
		JFrame jFrame = new JFrame("批改当前答案");
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
		JLabel text1 = new JLabel("批改文件在"+CsvIO_Method.Name3+".csv");
		text1.setFont(new Font("微软雅黑",Font.BOLD, 11));
		titlePanel.add(text1);
		c.add(titlePanel);
		JPanel titlePanel2 = new JPanel();
		titlePanel2.setLayout(new FlowLayout());
		JButton okbtn = new JButton("确定");
		okbtn.addActionListener(new ActionListener() {//按下确定
		
		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		csvIO f = new csvIO();
		f.Creat_CSV_check(Framemain_final.lstFile);
		f.Creat_CSV_practice(Framemain_final.lstFile);
		jFrame.setVisible(false);
		System.out.println("已完成练习文件的保存");
		FrameConfirm_text.sign=1;
		}
		
		});
		titlePanel2.add(okbtn);
		c.add(titlePanel2);
		//////////////////////////////////////////////////////////////
		//设置窗体可见
		jFrame.setVisible(true);
	}
/////////////////////////导入文件///////////////////////////////////
/**
* scanf_JButton()方法。输入套题名称，读取此套题
* 输入：无
* 输出：无
* 
* */ 
public void scanf_JButton() {
		JFrame jFrame = new JFrame("导入文件");
		Container c = jFrame.getContentPane();
		//设置窗体的位置及大小
		jFrame.setBounds(600, 200, 300, 600);
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
		/////////////////////////////////////////////////////////////////
//		JPanel titlePanel3 = new JPanel();
//		titlePanel3.setBorder(new EmptyBorder(5,5,5,5));
//		titlePanel3.setLayout(new BorderLayout(0,0));
//		//JScrollPane scrollPane = new JScrollPane();
//	//	titlePanel3.add(scrollPane,BorderLayout.CENTER);
//		String[] columnNames = {"文件名称"};
//		//ArrayList<String> tableValues = Framemain_final.address;
//		 String [][] rowData = new String[Framemain_final.address.size()][];
//		 JTable table = new JTable (rowData,columnNames);
//		titlePanel3.add(table);
//		c.add(titlePanel3);
		////////////////////////////////////////////////////////////////
		JTextField name = new JTextField();
		c.add(name);
		JPanel titlePanel2 = new JPanel();
		titlePanel2.setLayout(new FlowLayout());
		JButton okbtn = new JButton("确定");
		okbtn.addActionListener(new ActionListener() {//按下确定
		
		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			csvIO f2 = new csvIO();
			CsvIO_Method f3 = new CsvIO_Method();//设置三级姓名
		//	Framemain_final.lstFile=f.Reader_Book(name.getText());传送文件问题，读入的list 和 主界面的list 无法连接
			Framemain_final.lstFile = f2.Reader_Book(name.getText());
			f3.Set_Name3(name.getText());
			System.out.println("已完成文件的导入");
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
/////////////////////////关闭主窗口///////////////////////////////////
/**
* close_JButton()方法。关闭主窗口结束咯
* 输入：无
* 输出：无
* 
* */ 
public void close_JButton() {
		JFrame jFrame = new JFrame("");
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
		JLabel text1 = new JLabel("好好学习！天天向上！");
		text1.setFont(new Font("微软雅黑",Font.BOLD, 13));
		titlePanel.add(text1);
		c.add(titlePanel);
		JPanel titlePanel2 = new JPanel();
		titlePanel2.setLayout(new FlowLayout());
		JButton okbtn = new JButton("确定");
		okbtn.addActionListener(new ActionListener() {//按下确定
		
		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jFrame.setVisible(false);
		}
		
		});
		titlePanel2.add(okbtn);
		c.add(titlePanel2);
		//////////////////////////////////////////////////////////////
		//设置窗体可见
		jFrame.setVisible(true);
	}
}
