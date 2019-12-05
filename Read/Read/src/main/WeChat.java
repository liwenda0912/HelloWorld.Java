package main;

import javax.swing.*;

public class WeChat extends JFrame {
    private JPanel panelMain;

    public WeChat(){
        setTitle("WeChat Form");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelMain = new JPanel();
        panelMain .setLayout(null);

    }
    public  void setFrameWeChatVisible(Boolean visible){
        setVisible(visible);
    }
}