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
    
    private JFrame jFrame = new JFrame("");
    private Container c = jFrame.getContentPane();
    private JFrame jFrame1 = new JFrame("");
    private Container c1 = jFrame1.getContentPane();
    private static JButton creat = new JButton("��������ϰ��");
    private static JButton save = new JButton("���浱ǰ��");
    private static JButton check = new JButton("���ĵ�ǰϰ��");
    private static JButton scanf = new JButton("����ϰ��");
    private static JButton close = new JButton("�ر�");
    public static ArrayList<String[]> lstFile = new ArrayList<String[]>();
    private static Thread t;
    private static Thread tmain;
    private static Thread t2;
    public static JPanel asd = new JPanel();
    
    public void Framemain() {//���̼߳��أ������ť������ť1�߳�ʱ���������������̣߳��ٵ����ť2 �߳�ʱ�����������������߳�
        //���ô����λ�ü���С
        jFrame.setBounds(325, 40, 1100, 800);
        //����һ���൱�������Ķ���
        c.setLayout(new GridLayout(11,5,10,10));//���ֹ�����
        //���ð������Ͻ�X�ź�ر�
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //��ʼ��--��������������ؼ�
        init();
        //���ô���ɼ�
     //   jFrame.setVisible(true);
    }
    public void init() {
    //	creat.setBounds(10, 10);//��ť̫�ٲ�����Ϊ��
		/////////////////////////////�Ϸ���ť����////////////////////////////////
    	c.add(creat);
    	save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//�����ȡ����ϵ�answer��text�ı���
				
			}


			
		});
    	c.add(save);
    	c.add(check);
    	c.add(scanf);
    	c.add(close);
	//	JPanel fieldPanel = new JPanel();
    	for (int i=1;i<=50;i++) {//ˢ��ʱɾ�����ж�����Ȼ�����·Ž�ȥ
    		JPanel fieldPanel = new JPanel();
    		fieldPanel.setLayout(null);
    		JLabel title = new JLabel(""+i);
    		title.setBounds(0, 10, 20, 20);
    		/////////////////////////////ϰ����ʾ����//////////////////////////////
    		JLabel equation = new JLabel("��ʽ"+i);//����������µ����壬д��ť��дˢ��
    		equation.setBounds(25, 10, 50, 20);//��ʽ
    		JTextField answer  = new JTextField();
    		answer.setBounds(90, 10, 20, 20);//��
    		JLabel RorF = new JLabel(" ");
    		RorF.setBounds(120, 10, 20, 20);//�Դ�
    		JLabel right_answer = new JLabel("");
    		right_answer.setBounds(150, 10, 20, 20);//��ȷ��
    		fieldPanel.add(title);
    		fieldPanel.add(equation);
    		fieldPanel.add(answer);
    		fieldPanel.add(RorF);
    		fieldPanel.add(right_answer);
    		c.add(fieldPanel);
    	}
    //	c.remove(fieldPanel);
//    	for (int i=1;i<=50;i++) {//������� ������ã�
//    		c.add(new JLabel("ϰ��"+i));
//    	}
    	jFrame.setVisible(true);
    	jFrame.repaint();
		creat.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {//Ϊɶ���첻��remove���
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
							System.out.println("�ɹ������߳�t2");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				 //       jFrame1.setBounds(325, 40, 1100, 800);
				        //����һ���൱�������Ķ���
				//        c1.setLayout(new GridLayout(11,5,10,10));//���ֹ�����
				        //���ð������Ͻ�X�ź�ر�
				  //      jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        //��ʼ��--��������������ؼ�
						JPanel asd = new JPanel();//ɾ���������
						c.remove(asd);//ˢ������
				    	jFrame.repaint();
						System.out.println(asd.getName()+"��ȫ��ɾ��");
//						System.out.println("2");
//						c.add(creat);
//				    	c.add(save);
//				    	c.add(check);//����һ���̣߳�ÿ��һ������������һ���̣߳�
//				    	c.add(scanf);//�������������50����� 
//				    	c.add(close);//ʹ�ö��߳̽������ˢ������
//				    	System.out.println("3");//��һ�ε��ʱ��û���еڶ��β����� û�ر�ֻ������,list��������
				    	for (i=0;i<50;i++) {//ˢ��ʱɾ�����ж�����Ȼ�����·Ž�ȥ
				    		JPanel fieldPanel2 = new JPanel();
				    	//	System.out.println("**"+i);
				    		fieldPanel2.setLayout(null);
				    		JLabel title2 = new JLabel(""+i);
				    		title2.setBounds(0, 10, 20, 20);
				    //		System.out.println(lstFile.get(i)[1]);
				    		/////////////////////////////ϰ����ʾ����//////////////////////////////
				    		JLabel equation2 = new JLabel(lstFile.get(i)[1]);//����������µ����壬д��ť��дˢ��
				    		equation2.setBounds(25, 10, 55, 20);//��ʽ
				    		JTextField answer2  = new JTextField();
				    		answer2.setBounds(90, 10, 20, 20);//��
				    		JLabel RorF2 = new JLabel(" ");
				    		RorF2.setBounds(120, 10, 20, 20);//�Դ�
				    		JLabel right_answer2 = new JLabel(" ");
				    		right_answer2.setBounds(150, 10, 20, 20);//��ȷ��
				    		fieldPanel2.add(title2);
				    		fieldPanel2.add(equation2);
				    		fieldPanel2.add(answer2);
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
							else//�����ǿ��Ҫ��������򲻻�ִ�У�Ϊʲô�ز�
								System.out.println("no**"+FrameConfirm_text.sign);
						}
					}
				});
				t2.start();
			
			}
			
		});
    }
    //����
    public static void main(String[] args) {
      //  new Framemain();
    	Framemain_final f = new Framemain_final();
    	f.Framemain();
    }
}