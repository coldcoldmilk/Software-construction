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
/////////////////////////��������ϰ���ļ�///////////////////////////////////
	public static int sign = 0;
/**
* Creat_JButton()�����������������ƣ�����һ��������
* ���룺��
* �������
* 
* */ 
    public void Creat_JButton() {
    	JFrame jFrame = new JFrame("��������ϰ���ļ�");
    	Container c = jFrame.getContentPane();
        //���ô����λ�ü���С
        jFrame.setBounds(600, 200, 300, 200);
        //����һ���൱�������Ķ���
        c.setLayout(new GridLayout(4,1,10,10));//���ֹ�����
        //���ð������Ͻ�X�ź�ر�
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //��ʼ��--��������������ؼ�
        //////////////////////////////////////////////////////////////
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        JLabel text1 = new JLabel("��������������");
        text1.setFont(new Font("΢���ź�",Font.BOLD, 20));
        titlePanel.add(text1);
        c.add(titlePanel);
        JTextField name = new JTextField();
        c.add(name);
        JPanel titlePanel2 = new JPanel();
        titlePanel2.setLayout(new FlowLayout());
        JButton okbtn = new JButton("ȷ��");
        okbtn.addActionListener(new ActionListener() {//����ȷ��

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CsvIO_Method f = new CsvIO_Method();
				f.Set_Name(name.getText());
				f.Creat_CSV_Book(name.getText());//����������
				Creat_JButton2();
			//	jFrame.dispose();
				jFrame.setVisible(false);
			}
        	
        });
        titlePanel2.add(okbtn);
        c.add(titlePanel2);
        //////////////////////////////////////////////////////////////
        //���ô���ɼ�
        jFrame.setVisible(true);
    }
    
/////////////////////////��������ϰ���ļ�2///////////////////////////////////
/**
* Creat_JButton2������ѡ�����ɵ����ײ�ͬ��ϰ���ļ����ӷ�����������ϣ���ѡ������һ�֡�ȷ����������
* ���룺��
* �������
* 
* */    
    public void Creat_JButton2() {
    	JFrame jFrame = new JFrame("��������ϰ���ļ�");
    	Container c = jFrame.getContentPane();
        //���ô����λ�ü���С
        jFrame.setBounds(600, 200, 300, 200);
        //����һ���൱�������Ķ���
        c.setLayout(new GridLayout(3,1,10,10));//���ֹ�����
        //���ð������Ͻ�X�ź�ر�
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //��ʼ��--��������������ؼ�
        //////////////////////////////////////////////////////////////
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        JLabel text1 = new JLabel("��ѡ��һ������");
        text1.setFont(new Font("΢���ź�",Font.BOLD, 20));
        titlePanel.add(text1);
        c.add(titlePanel);
        
        JButton jbutton1 = new JButton("�ӷ�");
        jbutton1.addActionListener(new ActionListener() {//����ȷ��

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CsvIO_Method f = new CsvIO_Method();
				f.Return_Name_operation(f.Retuen_Name1(), "Add");//ͳһ��������ʽ
				f.Return_Name_type(f.Retuen_Name2(), "exercise");
				csvIO csvio = new csvIO();//�������list����������
			//	System.out.println(F.lstFile.get(0)[1]);
				System.out.println("����ɼӷ�����Ķ�ȡ");//����һ��ѭ���ó���ͣ����
				
				sign=1;
				System.out.println("*"+sign);
				jFrame.setVisible(false);
				
			}
	      	
	     });
        JButton jbutton2 = new JButton("����");
        jbutton2.addActionListener(new ActionListener() {//����ȷ��

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CsvIO_Method f = new CsvIO_Method();
				f.Return_Name_operation(f.Retuen_Name1(), "Subtraction");//ͳһ��������ʽ
				f.Return_Name_type(f.Retuen_Name2(), "exercise");
				csvIO csvio = new csvIO();//�������list����������
				System.out.println("����ɼ�������Ķ�ȡ");
				sign=1;
				jFrame.setVisible(false);
				jFrame.dispose();
			}
	      	
	     });
        JButton jbutton3 = new JButton("��ϼӼ���");
        jbutton3.addActionListener(new ActionListener() {//����ȷ��

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CsvIO_Method f = new CsvIO_Method();
				f.Return_Name_operation(f.Retuen_Name1(), "Rondom");//ͳһ��������ʽ
				f.Return_Name_type(f.Retuen_Name2(), "exercise");
				csvIO csvio = new csvIO();//�������list����������
				System.out.println("����ɼ�������Ķ�ȡ");
				sign=1;
				jFrame.setVisible(false);
				jFrame.dispose();
			}
	      	
	     });

        JPanel titlePanel2 = new JPanel();
        titlePanel2.setLayout(new FlowLayout());
  
//        okbtn.addActionListener(new ActionListener() {//����ȷ��
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
        //���ô���ɼ�
        jFrame.setVisible(true);
    }
    
/////////////////////////���浱ǰϰ���ļ�����ϰ���ļ�///////////////////////////////////
/**
* Save_JButton()���������浱ǰϰ��Ĵ𰸽����Ӧ���ļ�
* ���룺��
* �������
* 
* */ 
public void Save_JButton() {
		JFrame jFrame = new JFrame("���浱ǰ��");
		Container c = jFrame.getContentPane();
		//���ô����λ�ü���С
		jFrame.setBounds(600, 200, 300, 200);
		//����һ���൱�������Ķ���
		c.setLayout(new GridLayout(4,1,10,10));//���ֹ�����
		//���ð������Ͻ�X�ź�ر�
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//��ʼ��--��������������ؼ�
		//////////////////////////////////////////////////////////////
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout());
		JLabel text1 = new JLabel("�ѱ��浱ǰ����"+CsvIO_Method.Name3+".csv");
		text1.setFont(new Font("΢���ź�",Font.BOLD, 11));
		titlePanel.add(text1);
		c.add(titlePanel);
		JPanel titlePanel2 = new JPanel();
		titlePanel2.setLayout(new FlowLayout());
		JButton okbtn = new JButton("ȷ��");
		okbtn.addActionListener(new ActionListener() {//����ȷ��
		
		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			csvIO f = new csvIO();
			f.Creat_CSV_practice(Framemain_final.lstFile);
			f.Creat_CSV_check(Framemain_final.lstFile);
			jFrame.setVisible(false);
			System.out.println("�������ϰ�ļ��ı���");
			FrameConfirm_text.sign=1;
		}
		
		});
		titlePanel2.add(okbtn);
		c.add(titlePanel2);
		//////////////////////////////////////////////////////////////
		//���ô���ɼ�
		jFrame.setVisible(true);
	}
/////////////////////////���浱ǰϰ���ļ����������ļ�///////////////////////////////////
/**
* check_JButton()���������ĵ�ǰϰ��Ĵ�
* ���룺��
* �������
* 
* */ 
public void check_JButton() {
		JFrame jFrame = new JFrame("���ĵ�ǰ��");
		Container c = jFrame.getContentPane();
		//���ô����λ�ü���С
		jFrame.setBounds(600, 200, 300, 200);
		//����һ���൱�������Ķ���
		c.setLayout(new GridLayout(4,1,10,10));//���ֹ�����
		//���ð������Ͻ�X�ź�ر�
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//��ʼ��--��������������ؼ�
		//////////////////////////////////////////////////////////////
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout());
		JLabel text1 = new JLabel("�����ļ���"+CsvIO_Method.Name3+".csv");
		text1.setFont(new Font("΢���ź�",Font.BOLD, 11));
		titlePanel.add(text1);
		c.add(titlePanel);
		JPanel titlePanel2 = new JPanel();
		titlePanel2.setLayout(new FlowLayout());
		JButton okbtn = new JButton("ȷ��");
		okbtn.addActionListener(new ActionListener() {//����ȷ��
		
		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		csvIO f = new csvIO();
		f.Creat_CSV_check(Framemain_final.lstFile);
		f.Creat_CSV_practice(Framemain_final.lstFile);
		jFrame.setVisible(false);
		System.out.println("�������ϰ�ļ��ı���");
		FrameConfirm_text.sign=1;
		}
		
		});
		titlePanel2.add(okbtn);
		c.add(titlePanel2);
		//////////////////////////////////////////////////////////////
		//���ô���ɼ�
		jFrame.setVisible(true);
	}
/////////////////////////�����ļ�///////////////////////////////////
/**
* scanf_JButton()�����������������ƣ���ȡ������
* ���룺��
* �������
* 
* */ 
public void scanf_JButton() {
		JFrame jFrame = new JFrame("�����ļ�");
		Container c = jFrame.getContentPane();
		//���ô����λ�ü���С
		jFrame.setBounds(600, 200, 300, 600);
		//����һ���൱�������Ķ���
		c.setLayout(new GridLayout(4,1,10,10));//���ֹ�����
		//���ð������Ͻ�X�ź�ر�
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//��ʼ��--��������������ؼ�
		//////////////////////////////////////////////////////////////
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout());
		JLabel text1 = new JLabel("��������������");
		text1.setFont(new Font("΢���ź�",Font.BOLD, 20));
		titlePanel.add(text1);
		c.add(titlePanel);
		/////////////////////////////////////////////////////////////////
//		JPanel titlePanel3 = new JPanel();
//		titlePanel3.setBorder(new EmptyBorder(5,5,5,5));
//		titlePanel3.setLayout(new BorderLayout(0,0));
//		//JScrollPane scrollPane = new JScrollPane();
//	//	titlePanel3.add(scrollPane,BorderLayout.CENTER);
//		String[] columnNames = {"�ļ�����"};
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
		JButton okbtn = new JButton("ȷ��");
		okbtn.addActionListener(new ActionListener() {//����ȷ��
		
		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			csvIO f2 = new csvIO();
			CsvIO_Method f3 = new CsvIO_Method();//������������
		//	Framemain_final.lstFile=f.Reader_Book(name.getText());�����ļ����⣬�����list �� �������list �޷�����
			Framemain_final.lstFile = f2.Reader_Book(name.getText());
			f3.Set_Name3(name.getText());
			System.out.println("������ļ��ĵ���");
		//	jFrame.dispose();
		jFrame.setVisible(false);
		}
		
		});
		titlePanel2.add(okbtn);
		c.add(titlePanel2);
		//////////////////////////////////////////////////////////////
		//���ô���ɼ�
		jFrame.setVisible(true);
	}
/////////////////////////�ر�������///////////////////////////////////
/**
* close_JButton()�������ر������ڽ�����
* ���룺��
* �������
* 
* */ 
public void close_JButton() {
		JFrame jFrame = new JFrame("");
		Container c = jFrame.getContentPane();
		//���ô����λ�ü���С
		jFrame.setBounds(600, 200, 300, 200);
		//����һ���൱�������Ķ���
		c.setLayout(new GridLayout(4,1,10,10));//���ֹ�����
		//���ð������Ͻ�X�ź�ر�
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//��ʼ��--��������������ؼ�
		//////////////////////////////////////////////////////////////
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout());
		JLabel text1 = new JLabel("�ú�ѧϰ���������ϣ�");
		text1.setFont(new Font("΢���ź�",Font.BOLD, 13));
		titlePanel.add(text1);
		c.add(titlePanel);
		JPanel titlePanel2 = new JPanel();
		titlePanel2.setLayout(new FlowLayout());
		JButton okbtn = new JButton("ȷ��");
		okbtn.addActionListener(new ActionListener() {//����ȷ��
		
		@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		jFrame.setVisible(false);
		}
		
		});
		titlePanel2.add(okbtn);
		c.add(titlePanel2);
		//////////////////////////////////////////////////////////////
		//���ô���ɼ�
		jFrame.setVisible(true);
	}
}
