package main;

import javax.swing.JFrame;
import javax.swing.UIManager;

import ui.JFrameMain;
import ui.WaitFrame;
import ui.config.FrameConfig;

public class Main {

	static {
		// 设置样式
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e1) {
			
		}
	}

	public static void main(String[] args) {
		// 建立等待界面
		WaitFrame wFrame = new WaitFrame();
		// 建立主窗口
		JFrameMain frame = new JFrameMain();
		// 建立配置窗口
		new FrameConfig(wFrame,frame);
	}
}
