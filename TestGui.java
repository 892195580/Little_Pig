package testGUI;

import java.util.Vector;

import javax.swing.*;
//import java.awt.event.*;
public class TestGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//框架设置
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("时间使用记录日志");
		f.setSize(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//面板设置
		JPanel p = new JPanel();
		f.add(p);
		setComponent(p);
        f.setVisible(true);
	}
	
	public static void setComponent (JPanel p) {				
		//按钮，标志，文本框设置
		p.setLayout(null);
		//JLable
		JLabel userLabel = new JLabel("使用时间段：");
		userLabel.setBounds(10,20,80,25);
		p.add(userLabel);
		//JComboBox
		Integer[] hours = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
//		Vector<Integer> hours = new Vector<Integer>();
        JComboBox<Integer> startTime = new JComboBox<> (hours);
//        startTime.addItem(1);
//        startTime.addItem(2);
//        startTime.addItem(3);
//        startTime.addItem(4);
//        startTime.addItem(5);
		//JButton
        JButton setButton = new JButton("记录");
        setButton.setBounds(300, 20, 80, 25);
        p.add(setButton);
        JButton viewPie = new JButton("显示饼图");
        viewPie.setBounds(50, 220, 150, 25);
        p.add(viewPie);
        JButton viewBar = new JButton("显示柱图");
        viewBar.setBounds(250, 220, 150, 25);
        p.add(viewBar);
	}
}



 
