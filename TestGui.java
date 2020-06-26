package testGUI;


import javax.swing.*;
import java.awt.event.*;
public class TestGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//框架设置
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("时间使用记录日志");
		f.setSize(700, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//面板设置
		JPanel p = new JPanel();
		f.add(p);
		setComponent(p);
        f.setVisible(true);
        Integer a = null,b = null;
        if(a>b) {
        	System.out.println("abc");
        }
	}
	
	public static void setComponent (JPanel p) {				
		//按钮，标志，文本框设置
		p.setLayout(null);
		//JLable
		JLabel userLabel = new JLabel("使用时间段：");
		JLabel state = new JLabel();
		setTimeLabel(p,userLabel);
		setStateLabel(p,state);
		//JComboBox
		Integer[] hours = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		JComboBox<Integer> startTime = new JComboBox<> (hours);
		JComboBox<Integer> endTime = new JComboBox<> (hours);
		setStartTimeComboBox(p,startTime);
		setEndTimeComboBox(p,endTime);
        //JButton
	    JButton record = new JButton("记录");
	    JButton viewPie = new JButton("显示饼图");
	    JButton viewBar = new JButton("显示柱图");
		setRecordButton(p,record);
		setViewPieButton(p,viewPie);
		setViewBarButton(p,viewBar);
		//ActionListener
		RecordTime(record,state,startTime, endTime);
	}
	public static void setTimeLabel(JPanel p,JLabel userLabel) {
		userLabel.setBounds(10,20,80,25);
		p.add(userLabel);
	}
	public static void setStateLabel(JPanel p,JLabel state) {
		state.setBounds(400,20,200,25);
		state.setText("请选择时间");
		p.add(state);
	}
	public static void setStartTimeComboBox(JPanel p,JComboBox<Integer> startTime) {
        startTime.setSelectedIndex(23);//默认24点
        startTime.setBounds(100, 20, 80, 25);
        p.add(startTime);
	}
	public static void setEndTimeComboBox(JPanel p,JComboBox<Integer> endTime) {
        endTime.setSelectedIndex(23);//默认24点
        endTime.setBounds(200, 20, 80, 25);
        p.add(endTime);
	}
	public static void setRecordButton(JPanel p,JButton record) {
        record.setBounds(300, 20, 80, 25);
        p.add(record);
	}
	public static void setViewPieButton(JPanel p,JButton viewPie) {
        viewPie.setBounds(50, 220, 150, 25);
        p.add(viewPie);
	}
	public static void setViewBarButton(JPanel p,JButton viewBar) {        
        viewBar.setBounds(250, 220, 150, 25);
        p.add(viewBar);
	}
	public static void RecordTime(JButton record,JLabel state,JComboBox<Integer> startTime,JComboBox<Integer> endTime) {
		//record.addActionListener(l);
//		ActionListener listener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//            }
//        };
		record.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // 获取到的事件源就是按钮本身
	                // JButton btn = (JButton) e.getSource();
	            	Integer st = (Integer) startTime.getSelectedItem();
	            	Integer et = (Integer) endTime.getSelectedItem();
	                if(st<et){
	                	state.setText("开始时间<结束时间");
	                }
	                else{
	                	state.setText("开始时间》=结束时间");
	                }
	            }
	        });
	}
}



 
