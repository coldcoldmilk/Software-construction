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
    private JButton creat = new JButton("��������ϰ��");
    private JButton save = new JButton("���浱ǰ��");
    private JButton check = new JButton("���ĵ�ǰϰ��");
    private JButton scanf = new JButton("����ϰ��");
    private JButton close = new JButton("�ر�");
    
    
    public void Framemain() {
        //���ô����λ�ü���С
        jFrame.setBounds(325, 40, 1100, 800);
        //����һ���൱�������Ķ���
        c.setLayout(new GridLayout(11,5,10,10));//���ֹ�����
        //���ð������Ͻ�X�ź�ر�
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //��ʼ��--��������������ؼ�
        init();
        //���ô���ɼ�
        jFrame.setVisible(true);
    }
    public void init() {
    //	creat.setBounds(10, 10);//��ť̫�ٲ�����Ϊ��
    	for (int i=1;i<=50;i++) {
    		JPanel fieldPanel = new JPanel();
    		fieldPanel.setLayout(null);
    		JLabel title = new JLabel(""+i);
    		title.setBounds(0, 10, 20, 20);
    		/////////////////////////////ϰ����ʾ����//////////////////////////////
    		JLabel equation = new JLabel("��ʽ"+i);//����������µ����壬д��ť��дˢ��
    		equation.setBounds(25, 10, 50, 20);//��ʽ
    		JTextField answer  = new JTextField();
    		answer.setBounds(90, 10, 20, 20);//��
    		JLabel RorF = new JLabel("��");
    		RorF.setBounds(120, 10, 20, 20);//�Դ�
    		JLabel right_answer = new JLabel("50");
    		right_answer.setBounds(150, 10, 20, 20);//��ȷ��
    		fieldPanel.add(title);
    		fieldPanel.add(equation);
    		fieldPanel.add(answer);
    		fieldPanel.add(RorF);
    		fieldPanel.add(right_answer);
    		c.add(fieldPanel);
    		/////////////////////////////�Ϸ���ť����////////////////////////////////
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
//    	for (int i=1;i<=50;i++) {//������� ������ã�
//    		c.add(new JLabel("ϰ��"+i));
//    	}
    }
    //����
    public static void main(String[] args) {
      //  new Framemain();
    	Framemain_text f = new Framemain_text();
    	f.Framemain();
    }
}