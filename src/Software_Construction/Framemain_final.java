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
    
    private JFrame jFrame = new JFrame("Сѧ����ѧ��ϰ��");
    private Container c = jFrame.getContentPane();
    private static JButton creat = new JButton("��������ϰ��");
    private static JButton save = new JButton("���浱ǰ��");
    private static JButton check = new JButton("���ĵ�ǰϰ��");
    private static JButton scanf = new JButton("����ϰ��");
    private static JButton close = new JButton("�ر�");
    public static ArrayList<String[]> lstFile = new ArrayList<String[]>();
    public static ArrayList<String[]> address = new ArrayList<String[]>();
    private static Thread t;
    private static Thread t2;
    public static JPanel asd = new JPanel();
    public JTextField[] answer  = new JTextField[50];
    
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
    	for (int i=0;i<50;i++) {
			answer[i] = new JTextField();
    	}
		/////////////////////////////�Ϸ���ť����////////////////////////////////
    	c.add(creat);
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
    		JLabel equation = new JLabel("��ʽ"+i+"=");//����������µ����壬д��ť��дˢ��
    		equation.setBounds(25, 10, 60, 20);//��ʽ
    		JTextField answer  = new JTextField();
    		answer.setBounds(85, 10, 25, 20);//��
    		JLabel RorF = new JLabel("��");
    		RorF.setBounds(115, 10, 10, 20);//�Դ�
    		JLabel right_answer = new JLabel("��ȷ��100");
    		right_answer.setFont(new Font("΢���ź�",Font.BOLD,10));
    		right_answer.setBounds(130, 10, 75, 20);//��ȷ��
    		fieldPanel.add(title);
    		fieldPanel.add(equation);
    		fieldPanel.add(answer);
    		fieldPanel.add(RorF);
    		fieldPanel.add(right_answer);
    		c.add(fieldPanel);
    	}
    	jFrame.setVisible(true);
    	jFrame.repaint();
		creat.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {//Ϊɶ���첻��remove���
				// TODO Auto-generated method stub
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
						try {
							t2.join();
							FrameConfirm_text.sign=0;
							lstFile = f2.Reader_Book(CsvIO_Method.Name3);
							System.out.println("�ɹ������߳�t2");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						JPanel asd = new JPanel();//ɾ���������
						c.remove(asd);//ˢ������
				    	jFrame.repaint();
						System.out.println(asd.getName()+"��ȫ��ɾ��");

				    	for (i=0;i<50;i++) {//ˢ��ʱɾ�����ж�����Ȼ�����·Ž�ȥ
				    		JPanel fieldPanel2 = new JPanel();
				    		fieldPanel2.setLayout(null);
				    		JLabel title2 = new JLabel(""+(i+1));
				    		title2.setBounds(0, 10, 20, 20);
				    		/////////////////////////////ϰ����ʾ����//////////////////////////////
				    		JLabel equation2 = new JLabel(lstFile.get(i)[1]+"=");//����������µ����壬д��ť��дˢ��
				    		equation2.setBounds(25, 10, 60, 20);//��ʽ
				    		
				    		answer[i].setBounds(85, 10, 25, 20);//��
				    		JLabel RorF2 = new JLabel(" ");
				    		RorF2.setBounds(115, 10, 15, 20);//�Դ�
				    		JLabel right_answer2 = new JLabel(" ");
				    		right_answer2.setBounds(130, 10, 75, 20);//��ȷ��
				    		fieldPanel2.add(title2);
				    		fieldPanel2.add(equation2);
				    		fieldPanel2.add(answer[i]);
				    		fieldPanel2.add(RorF2);
				    		fieldPanel2.add(right_answer2);
				    		c.add(fieldPanel2);	    		
				    	}
				    	while (true) {
				    		if(i==50) {
				    			jFrame.setVisible(true);
				    			jFrame.repaint();
				    			break;
				    		}
				    	}
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
    	save.addActionListener(new ActionListener() {

			
			
			@Override
			public void actionPerformed(ActionEvent e) {//Ϊɶ���첻��remove���
				// TODO Auto-generated method stub
			//	jFrame.setVisible(false);
				t = new Thread(new Runnable() {
					int i;
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
						FrameConfirm_text f = new FrameConfirm_text();
						jFrame.setVisible(false);
				    	for (i=0;i<50;i++) {//ˢ��ʱɾ�����ж�����Ȼ�����·Ž�ȥ
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
							System.out.println("�ɹ������߳�t2");
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
							else//�����ǿ��Ҫ��������򲻻�ִ�У�Ϊʲô�ز�
								System.out.println("no**"+FrameConfirm_text.sign);
						}
					}
				});
				t2.start();
			
			}


			
		});
		check.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {//Ϊɶ���첻��remove���
				// TODO Auto-generated method stub
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
				    	for (i=0;i<50;i++) {//ˢ��ʱɾ�����ж�����Ȼ�����·Ž�ȥ
				    	//	String [] date = new String[];
				    		String[] data = lstFile.get(i);
				    		data[2]=answer[i].getText();
				    		if(data[2].equals(data[4])) {
				    			data[3]="��";
				    		}
				    		else if(data[2].equals("")){
				    			data[3]="0";
				    		}
				    		else {
				    			data[3]="��";
				    		}
				    		lstFile.set(i, data);
				    	}
						JPanel asd = new JPanel();//ɾ���������
						c.remove(asd);//ˢ������
				    	jFrame.repaint();
						System.out.println(asd.getName()+"��ȫ��ɾ��");
				    	for (i=0;i<50;i++) {//ˢ��ʱɾ�����ж�����Ȼ�����·Ž�ȥ
				    		JPanel fieldPanel2 = new JPanel();
				    	//	System.out.println("**"+i);
				    		fieldPanel2.setLayout(null);
				    		JLabel title2 = new JLabel(""+(i+1));
				    		title2.setBounds(0, 10, 20, 20);
				    //		System.out.println(lstFile.get(i)[1]);
				    		/////////////////////////////ϰ����ʾ����//////////////////////////////
				    		JLabel equation2 = new JLabel(lstFile.get(i)[1]+"=");//����������µ����壬д��ť��дˢ��
				    		equation2.setBounds(25, 10, 60, 20);//��ʽ
				    		
				    		answer[i].setBounds(85, 10, 25, 20);//��
				    		JLabel RorF2 = new JLabel(lstFile.get(i)[3]);//�Դ��޷�������ʾ
				    		RorF2.setBounds(115, 10, 15, 20);//�Դ�
				    		JLabel right_answer2 = new JLabel(" ");
				    		if(lstFile.get(i)[3].equals("��")) {
				    			right_answer2.setText("��ȷ��"+lstFile.get(i)[4]);
				    		}
				    		else if((lstFile.get(i)[3].equals("��"))){
				    			right_answer2.setText("��ȷ��"+lstFile.get(i)[4]);
				    		}
				    		else {
				    			RorF2.setText("");
				    		}
				    		right_answer2.setBounds(130, 10, 75, 20);//��ȷ��
				    		fieldPanel2.add(title2);
				    		fieldPanel2.add(equation2);
				    		fieldPanel2.add(answer[i]);
				    		fieldPanel2.add(RorF2);
				    		fieldPanel2.add(right_answer2);
				    		c.add(fieldPanel2);	    		
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
						FrameConfirm_text f = new FrameConfirm_text();
						f.check_JButton();
						while(true) {
							
							if(FrameConfirm_text.sign==1) {
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
		scanf.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {//Ϊɶ���첻��remove���
				// TODO Auto-generated method stub
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
							System.out.println("�ɹ������߳�t2");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						JPanel asd = new JPanel();//ɾ���������
						c.remove(asd);//ˢ������
				    	jFrame.repaint();
						System.out.println(asd.getName()+"��ȫ��ɾ��");
				    	for (i=0;i<50;i++) {//ˢ��ʱɾ�����ж�����Ȼ�����·Ž�ȥ
				    		JPanel fieldPanel2 = new JPanel();
				    		fieldPanel2.setLayout(null);
				    		JLabel title2 = new JLabel(""+(i+1));
				    		title2.setBounds(0, 10, 20, 20);
				    		/////////////////////////////ϰ����ʾ����//////////////////////////////
				    		JLabel equation2 = new JLabel(lstFile.get(i)[1]);//����������µ����壬д��ť��дˢ��
				    		equation2.setBounds(25, 10, 60, 20);//��ʽ
				    		
				    		answer[i].setBounds(85, 10, 25, 20);//��
				    		answer[i].setText(lstFile.get(i)[2]);
				    		JLabel RorF2 = new JLabel(lstFile.get(i)[3]);
				    		RorF2.setBounds(115, 10, 15, 20);//�Դ�
			    			JLabel right_answer2 = new JLabel();
				    		if(lstFile.get(i)[3].equals("��")) {
				    			right_answer2.setText("��ȷ��"+lstFile.get(i)[4]);
				    		}
				    		else if((lstFile.get(i)[3].equals("��"))){
				    			right_answer2.setText("��ȷ��"+lstFile.get(i)[4]);
				    		}
				    		else {
				    			RorF2.setText("");
				    		}
				    		right_answer2.setBounds(130, 10, 75, 20);//��ȷ��
				    		fieldPanel2.add(title2);
				    		fieldPanel2.add(equation2);
				    		fieldPanel2.add(answer[i]);
				    		fieldPanel2.add(RorF2);
				    		fieldPanel2.add(right_answer2);
				    		c.add(fieldPanel2);	    		
				    	}

				    	while (true) {
				    		if(i==50) {
				    			jFrame.setVisible(true);
				    			jFrame.repaint();
				    			break;
				    		}
				    	}
					}
					
				});
				t.start();
				t2 = new Thread(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						FrameConfirm_text f = new FrameConfirm_text();
						f.scanf_JButton();

						while(true) {
							
							if(FrameConfirm_text.sign==1) {
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
    //����
    public static void main(String[] args) {
      //  new Framemain();
    	Framemain_final f = new Framemain_final();
    	f.Framemain();
    }
}