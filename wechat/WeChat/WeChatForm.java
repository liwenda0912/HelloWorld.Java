import javax.swing.*;

public class WeChatForm extends JFrame {
    private JPanel panelMain;

    public WeChatForm(){
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

