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

public class Framemain_final extends JFrame{
    
    private JFrame jFrame = new JFrame("小学生数学练习册");
    private Container c = jFrame.getContentPane();
    private JFrame jFrame1 = new JFrame("");
    private Container c1 = jFrame1.getContentPane();
    private static JButton creat = new JButton("批量产生习题");
    private static JButton save = new JButton("保存当前答案");
    private static JButton check = new JButton("批改当前习题");
    private static JButton scanf = new JButton("导入习题");
    private static JButton close = new JButton("关闭");
    public static ArrayList<String[]> lstFile = new ArrayList<String[]>();
    private static Thread t;
    private static Thread tmain;
    private static Thread t2;
    public static JPanel asd = new JPanel();
    public JTextField[] answer  = new JTextField[50];
    
    public void Framemain() {//主线程加载，点击按钮启动按钮1线程时，休眠其他所有线程，再点击按钮2 线程时，再休眠其他所有线程
        //设置窗体的位置及大小
        jFrame.setBounds(325, 40, 1100, 800);
        //设置一层相当于桌布的东西
        c.setLayout(new GridLayout(11,5,10,10));//布局管理器
        //设置按下右上角X号后关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //初始化--往窗体里放其他控件
        init();
        //设置窗体可见
     //   jFrame.setVisible(true);
    }
    public void init() {
    //	creat.setBounds(10, 10);//按钮太少不足以为列
    	for (int i=0;i<50;i++) {
			answer[i] = new JTextField();
    	}
		/////////////////////////////上方按钮部分////////////////////////////////
    	c.add(creat);
    	c.add(save);
    	c.add(check);
    	c.add(scanf);
    	c.add(close);
	//	JPanel fieldPanel = new JPanel();
    	for (int i=1;i<=50;i++) {//刷新时删除所有东西，然后重新放进去
    		JPanel fieldPanel = new JPanel();
    		fieldPanel.setLayout(null);
    		JLabel title = new JLabel(""+i);
    		title.setBounds(0, 10, 20, 20);
    		/////////////////////////////习题显示部分//////////////////////////////
    		JLabel equation = new JLabel("算式"+i);//对题号设置新的字体，写按钮，写刷新
    		equation.setBounds(25, 10, 50, 20);//算式
    		JTextField answer  = new JTextField();
    		answer.setBounds(90, 10, 25, 20);//答案
    		JLabel RorF = new JLabel(" ");
    		RorF.setBounds(120, 10, 20, 20);//对错
    		JLabel right_answer = new JLabel("正确答案");
    		right_answer.setFont(new Font("微软雅黑",Font.BOLD,10));
    		right_answer.setBounds(150, 10, 45, 20);//正确答案
    		fieldPanel.add(title);
    		fieldPanel.add(equation);
    		fieldPanel.add(answer);
    		fieldPanel.add(RorF);
    		fieldPanel.add(right_answer);
    		c.add(fieldPanel);
    	}
    //	c.remove(fieldPanel);
//    	for (int i=1;i<=50;i++) {//插入面板 面板内置；
//    		c.add(new JLabel("习题"+i));
//    	}
    	jFrame.setVisible(true);
    	jFrame.repaint();
		creat.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {//为啥构造不能remove面板
				// TODO Auto-generated method stub
			//	jFrame.setVisible(false);
				c.removeAll();
		    	c.add(creat);
		    	c.add(save);
		    	c.add(check);
		    	c.add(scanf);
		    	c.add(close);
				t = new Thread(new Runnable() {
					int i;
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
						FrameConfirm_text f = new FrameConfirm_text();
						csvIO f2 = new csvIO();
						jFrame.setVisible(false);
				//		jFrame.dispose(); 	
						try {
							t2.join();
							FrameConfirm_text.sign=0;
							lstFile = f2.Reader_Book(CsvIO_Method.Name3);
							System.out.println("成功跳出线程t2");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				 //       jFrame1.setBounds(325, 40, 1100, 800);
				        //设置一层相当于桌布的东西
				//        c1.setLayout(new GridLayout(11,5,10,10));//布局管理器
				        //设置按下右上角X号后关闭
				  //      jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        //初始化--往窗体里放其他控件
						JPanel asd = new JPanel();//删掉所有面板
						c.remove(asd);//刷新问题
				    	jFrame.repaint();
						System.out.println(asd.getName()+"已全部删除");
//						System.out.println("2");
//						c.add(creat);
//				    	c.add(save);
//				    	c.add(check);//主框一个线程，每按一个按键启动另一个线程？
//				    	c.add(scanf);//解决方案，设置50个面板 
//				    	c.add(close);//使用多线程解决界面刷新问题
//				    	System.out.println("3");//第一次点的时候没运行第二次才允许， 没关闭只是隐藏,list出了问题
						

				    	for (i=0;i<50;i++) {//刷新时删除所有东西，然后重新放进去
				    		JPanel fieldPanel2 = new JPanel();
				    	//	System.out.println("**"+i);
				    		fieldPanel2.setLayout(null);
				    		JLabel title2 = new JLabel(""+(i+1));
				    		title2.setBounds(0, 10, 20, 20);
				    //		System.out.println(lstFile.get(i)[1]);
				    		/////////////////////////////习题显示部分//////////////////////////////
				    		JLabel equation2 = new JLabel(lstFile.get(i)[1]);//对题号设置新的字体，写按钮，写刷新
				    		equation2.setBounds(25, 10, 55, 20);//算式
				    		
				    		answer[i].setBounds(90, 10, 25, 20);//答案
				    		JLabel RorF2 = new JLabel(" ");
				    		RorF2.setBounds(120, 10, 20, 20);//对错
				    		JLabel right_answer2 = new JLabel(" ");
				    		right_answer2.setBounds(150, 10, 25, 20);//正确答案
				    		fieldPanel2.add(title2);
				    		fieldPanel2.add(equation2);
				    		fieldPanel2.add(answer[i]);
				    		fieldPanel2.add(RorF2);
				    		fieldPanel2.add(right_answer2);
				    		c.add(fieldPanel2);	    		
				    	}
			    	//	jFrame.dispose(); 	
				    //	jFrame.setVisible(true);
				    	while (true) {
				    		if(i==50) {
				    			jFrame.setVisible(true);
				    			jFrame.repaint();
				    			break;
				    		}
				    	}
				    //	jFrame1.setVisible(true);
					}
					
				});
				t.start();
				t2 = new Thread(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						FrameConfirm_text f = new FrameConfirm_text();
						f.Creat_JButton();
						while(true) {
							
							if(FrameConfirm_text.sign==1) {
								//f.sign=0;
								//System.out.println("yes**"+FrameConfirm_text.sign);
								break;
							}
							else//如果不强制要求输出，则不会执行，为什么呢草
								System.out.println("no**"+FrameConfirm_text.sign);
						}
					}
				});
				t2.start();
			
			}
			
		});
    	save.addActionListener(new ActionListener() {

			
			
			@Override
			public void actionPerformed(ActionEvent e) {//为啥构造不能remove面板
				// TODO Auto-generated method stub
			//	jFrame.setVisible(false);
				t = new Thread(new Runnable() {
					int i;
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
						FrameConfirm_text f = new FrameConfirm_text();
						jFrame.setVisible(false);
				//		jFrame.dispose(); 	
				 //       jFrame1.setBounds(325, 40, 1100, 800);
				        //设置一层相当于桌布的东西
				//        c1.setLayout(new GridLayout(11,5,10,10));//布局管理器
				        //设置按下右上角X号后关闭
				  //      jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        //初始化--往窗体里放其他控件
//						System.out.println("2");
//						c.add(creat);
//				    	c.add(save);
//				    	c.add(check);//主框一个线程，每按一个按键启动另一个线程？
//				    	c.add(scanf);//解决方案，设置50个面板 
//				    	c.add(close);//使用多线程解决界面刷新问题
//				    	System.out.println("3");//第一次点的时候没运行第二次才允许， 没关闭只是隐藏,list出了问题
				    	for (i=0;i<50;i++) {//刷新时删除所有东西，然后重新放进去
				    	//	String [] date = new String[];
				    		String[] data = lstFile.get(i);
				    		data[2]=answer[i].getText();
				    		lstFile.set(i, data);
				    	}
			    	//	jFrame.dispose(); 	
				    //	jFrame.setVisible(true);
						try {
							t2.join();
							FrameConfirm_text.sign=0;
							System.out.println("成功跳出线程t2");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				    	while (true) {
				    		if(i==50) {
				    			jFrame.setVisible(true);
				    			jFrame.repaint();
				    			break;
				    		}
				    	}
				    //	jFrame1.setVisible(true);
					}
					
				});
				t.start();
				t2 = new Thread(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						jFrame.setVisible(false);
						FrameConfirm_text f = new FrameConfirm_text();
						f.Save_JButton();
						while(true) {
							
							if(FrameConfirm_text.sign==1) {
								//f.sign=0;
								//System.out.println("yes**"+FrameConfirm_text.sign);
								break;
							}
							else//如果不强制要求输出，则不会执行，为什么呢草
								System.out.println("no**"+FrameConfirm_text.sign);
						}
					}
				});
				t2.start();
			
			}


			
		});
		check.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {//为啥构造不能remove面板
				// TODO Auto-generated method stub
			//	jFrame.setVisible(false);
				c.removeAll();
		    	c.add(creat);
		    	c.add(save);
		    	c.add(check);
		    	c.add(scanf);
		    	c.add(close);
				t = new Thread(new Runnable() {
					int i;
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
						FrameConfirm_text f = new FrameConfirm_text();
						csvIO f2 = new csvIO();
						jFrame.setVisible(false);
				//		jFrame.dispose(); 	
						try {
							t2.join();
							FrameConfirm_text.sign=0;
							lstFile = f2.Reader_Book(CsvIO_Method.Name3);
							System.out.println("成功跳出线程t2");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				 //       jFrame1.setBounds(325, 40, 1100, 800);
				        //设置一层相当于桌布的东西
				//        c1.setLayout(new GridLayout(11,5,10,10));//布局管理器
				        //设置按下右上角X号后关闭
				  //      jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        //初始化--往窗体里放其他控件
				    	for (i=0;i<50;i++) {//刷新时删除所有东西，然后重新放进去
				    	//	String [] date = new String[];
				    		String[] data = lstFile.get(i);
				    		data[2]=answer[i].getText();
				    		if(data[2].equals(data[4])) {
				    			data[3]="√";
				    		}
				    		else {
				    			data[3]="×";
				    		}
				    		lstFile.set(i, data);
				    	}
						JPanel asd = new JPanel();//删掉所有面板
						c.remove(asd);//刷新问题
				    	jFrame.repaint();
						System.out.println(asd.getName()+"已全部删除");
//						System.out.println("2");
//						c.add(creat);
//				    	c.add(save);
//				    	c.add(check);//主框一个线程，每按一个按键启动另一个线程？
//				    	c.add(scanf);//解决方案，设置50个面板 
//				    	c.add(close);//使用多线程解决界面刷新问题
//				    	System.out.println("3");//第一次点的时候没运行第二次才允许， 没关闭只是隐藏,list出了问题
						

				    	for (i=0;i<50;i++) {//刷新时删除所有东西，然后重新放进去
				    		JPanel fieldPanel2 = new JPanel();
				    	//	System.out.println("**"+i);
				    		fieldPanel2.setLayout(null);
				    		JLabel title2 = new JLabel(""+(i+1));
				    		title2.setBounds(0, 10, 20, 20);
				    //		System.out.println(lstFile.get(i)[1]);
				    		/////////////////////////////习题显示部分//////////////////////////////
				    		JLabel equation2 = new JLabel(lstFile.get(i)[1]);//对题号设置新的字体，写按钮，写刷新
				    		equation2.setBounds(25, 10, 55, 20);//算式
				    		
				    		answer[i].setBounds(90, 10, 25, 20);//答案
				    		JLabel RorF2 = new JLabel(lstFile.get(i)[3]);//对错无法正常显示
				    		RorF2.setBounds(120, 10, 30, 20);//对错
				    		JLabel right_answer2 = new JLabel(lstFile.get(i)[4]);
				    		right_answer2.setBounds(150, 10, 25, 20);//正确答案
				    		fieldPanel2.add(title2);
				    		fieldPanel2.add(equation2);
				    		fieldPanel2.add(answer[i]);
				    		fieldPanel2.add(RorF2);
				    		fieldPanel2.add(right_answer2);
				    		c.add(fieldPanel2);	    		
				    	}
			    	//	jFrame.dispose(); 	
				    //	jFrame.setVisible(true);
				    	while (true) {
				    		if(i==50) {
				    			jFrame.setVisible(true);
				    			jFrame.repaint();
				    			break;
				    		}
				    	}
				    //	jFrame1.setVisible(true);
					}
					
				});
				t.start();
				t2 = new Thread(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						FrameConfirm_text f = new FrameConfirm_text();
						f.check_JButton();
						while(true) {
							
							if(FrameConfirm_text.sign==1) {
								//f.sign=0;
								//System.out.println("yes**"+FrameConfirm_text.sign);
								break;
							}
							else//如果不强制要求输出，则不会执行，为什么呢草
								System.out.println("no**"+FrameConfirm_text.sign);
						}
					}
				});
				t2.start();
			
			}
			
		});
		scanf.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {//为啥构造不能remove面板
				// TODO Auto-generated method stub
			//	jFrame.setVisible(false);
				c.removeAll();
		    	c.add(creat);
		    	c.add(save);
		    	c.add(check);
		    	c.add(scanf);
		    	c.add(close);
				t = new Thread(new Runnable() {
					int i;
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
						FrameConfirm_text f = new FrameConfirm_text();
						csvIO f2 = new csvIO();
						jFrame.setVisible(false);
				//		jFrame.dispose(); 	
						try {
							t2.join();
							FrameConfirm_text.sign=0;
							System.out.println("成功跳出线程t2");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				 //       jFrame1.setBounds(325, 40, 1100, 800);
				        //设置一层相当于桌布的东西
				//        c1.setLayout(new GridLayout(11,5,10,10));//布局管理器
				        //设置按下右上角X号后关闭
				  //      jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        //初始化--往窗体里放其他控件
						JPanel asd = new JPanel();//删掉所有面板
						c.remove(asd);//刷新问题
				    	jFrame.repaint();
						System.out.println(asd.getName()+"已全部删除");
//						System.out.println("2");
//						c.add(creat);
//				    	c.add(save);
//				    	c.add(check);//主框一个线程，每按一个按键启动另一个线程？
//				    	c.add(scanf);//解决方案，设置50个面板 
//				    	c.add(close);//使用多线程解决界面刷新问题
//				    	System.out.println("3");//第一次点的时候没运行第二次才允许， 没关闭只是隐藏,list出了问题
						

				    	for (i=0;i<50;i++) {//刷新时删除所有东西，然后重新放进去
				    		JPanel fieldPanel2 = new JPanel();
				    	//	System.out.println("**"+i);
				    		fieldPanel2.setLayout(null);
				    		JLabel title2 = new JLabel(""+(i+1));
				    		title2.setBounds(0, 10, 20, 20);
				    //		System.out.println(lstFile.get(i)[1]);
				    		/////////////////////////////习题显示部分//////////////////////////////
				    		JLabel equation2 = new JLabel(lstFile.get(i)[1]);//对题号设置新的字体，写按钮，写刷新
				    		equation2.setBounds(25, 10, 55, 20);//算式
				    		
				    		answer[i].setBounds(90, 10, 25, 20);//答案
				    		answer[i].setText(lstFile.get(i)[2]);
				    		JLabel RorF2 = new JLabel(lstFile.get(i)[3]);
				    		RorF2.setBounds(120, 10, 20, 20);//对错
				    		JLabel right_answer2 = new JLabel(lstFile.get(i)[4]);
				    		right_answer2.setBounds(150, 10, 25, 20);//正确答案
				    		fieldPanel2.add(title2);
				    		fieldPanel2.add(equation2);
				    		fieldPanel2.add(answer[i]);
				    		fieldPanel2.add(RorF2);
				    		fieldPanel2.add(right_answer2);
				    		c.add(fieldPanel2);	    		
				    	}
			    	//	jFrame.dispose(); 	
				    //	jFrame.setVisible(true);
				    	while (true) {
				    		if(i==50) {
				    			jFrame.setVisible(true);
				    			jFrame.repaint();
				    			break;
				    		}
				    	}
				    //	jFrame1.setVisible(true);
					}
					
				});
				t.start();
				t2 = new Thread(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						FrameConfirm_text f = new FrameConfirm_text();
						f.scanf_JButton();
					//	lstFile = f2.Reader_Book(CsvIO_Method.Name3);
						while(true) {
							
							if(FrameConfirm_text.sign==1) {
								//f.sign=0;
								//System.out.println("yes**"+FrameConfirm_text.sign);
								break;
							}
							else//如果不强制要求输出，则不会执行，为什么呢草
								System.out.println("no**"+FrameConfirm_text.sign);
						}
					}
				});
				t2.start();
			
			}
			
		});
		close.addActionListener(new ActionListener()  {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FrameConfirm_text f = new FrameConfirm_text();
				f.close_JButton();
				System.exit(0);

			}
			
		});
    }
    //测试
    public static void main(String[] args) {
      //  new Framemain();
    	Framemain_final f = new Framemain_final();
    	f.Framemain();
    }
}