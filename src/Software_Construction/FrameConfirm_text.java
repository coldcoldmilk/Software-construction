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
				Framemain_text F = new Framemain_text();
				f.Return_Name_operation(f.Retuen_Name1(), "Add");//ͳһ��������ʽ
				f.Return_Name_type(f.Retuen_Name2(), "exercise");
				csvIO csvio = new csvIO();//�������list����������
				F.lstFile = (ArrayList<String[]>) csvio.Reader_Book(f.Retuen_Name3()).clone();//list��ֱ������
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
				Framemain_text F = new Framemain_text();
				f.Return_Name_operation(f.Retuen_Name1(), "Subtraction");//ͳһ��������ʽ
				f.Return_Name_type(f.Retuen_Name2(), "exercise");
				csvIO csvio = new csvIO();//�������list����������
				F.lstFile = (ArrayList<String[]>) csvio.Reader_Book(f.Retuen_Name3()).clone();//list��ֱ������
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
				Framemain_text F = new Framemain_text();
				f.Return_Name_operation(f.Retuen_Name1(), "Rondom");//ͳһ��������ʽ
				f.Return_Name_type(f.Retuen_Name2(), "exercise");
				csvIO csvio = new csvIO();//�������list����������
				F.lstFile = (ArrayList<String[]>) csvio.Reader_Book(f.Retuen_Name3()).clone();//list��ֱ������
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
    

}
