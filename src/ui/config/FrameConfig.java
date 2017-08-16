package ui.config;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import ui.JFrameMain;
import ui.WaitFrame;
import util.FrameUtil;

/**
 * 
 * 读取用户配置
 * 
 * */
public class FrameConfig extends JFrame {

	/**
	 * 
	 * 主面板
	 * 
	 * */
	private JFrameMain jFrameMain;

	public FrameConfig(WaitFrame wFrame,JFrameMain jFrameMain) {
        try {
            // thread to sleep for 1000 milliseconds
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
		wFrame.setVisible(false);
		this.jFrameMain = jFrameMain;
		setTitle("java gui start");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置布局管理器为边界布局
		this.setLayout(new BorderLayout(5, 5));
		// 添加主面板
		this.add(new JLabel("西"), BorderLayout.WEST);
		this.add(new JLabel("东"), BorderLayout.EAST);
		this.add(new JLabel("南"), BorderLayout.SOUTH);
		this.add(new JLabel("北"), BorderLayout.NORTH);
		this.add(new JLabel("大吉大利，今晚吃鸡!"), BorderLayout.CENTER);
		this.setResizable(false);
		this.setSize(380, 370);
		// 居中对齐
		FrameUtil.setFrameCenter(this);
		setVisible(true);
	}

}
