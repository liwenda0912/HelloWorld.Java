import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login exmaple");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
        JFrame frame1 = new JFrame("regsister exmaple");
        frame1.setSize(350, 200);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        frame1.add(panel1);
        regsisterComponents(panel1);
        frame1.setVisible(true);

    }



  private static void placeComponents(JPanel panel) {
      final String COMMAND_LOGIN = "LOGIN";
      panel.setLayout(null);
      JLabel userLable = new JLabel("User:");
      userLable.setBounds(10, 20, 50, 25);
      panel.add(userLable);

      JTextField userTEXT = new JTextField(20);
      userTEXT.setBounds(100, 20, 165, 25);
      panel.add(userTEXT);

      JLabel passwordLable = new JLabel("Password:");
      passwordLable.setBounds(10, 50, 80, 25);
      panel.add(passwordLable);

      JPasswordField passwordTEXT = new JPasswordField(20);
      passwordTEXT.setBounds(100, 50, 165, 25);
      panel.add(passwordTEXT);

      JButton loginButton = new JButton("login");
      loginButton.setBounds(10, 80, 80, 25);
      panel.add(loginButton);

      JButton regsisterButtion = new JButton("regsiste");
      regsisterButtion.setBounds(100, 80, 80, 25);
      panel.add(regsisterButtion);

      JButton helpButtion = new JButton("help");
      helpButtion.setBounds(200, 80, 80, 25);
      panel.add(helpButtion);
      ActionListener actionListener = new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              String command = e.getActionCommand();
              if (COMMAND_LOGIN.equals(command)) {
                  System.out.println("ok按钮被点击");
                  JOptionPane.showMessageDialog(null, "标题【出错啦】", "年龄请输入数字", JOptionPane.ERROR_MESSAGE);
              } else {
                  System.out.println("Cannal 按钮被点击");
              }
          }
      };
      loginButton.addActionListener(actionListener);
  }

    private static void regsisterComponents(JPanel panel1) {
        panel1.setLayout(null);
        JLabel usernameLable = new JLabel("Username:");
        usernameLable.setBounds(10, 20, 100, 25);
        panel1.add(usernameLable);

        JTextField usernameTEXT = new JTextField(20);
        usernameTEXT.setBounds(100, 20, 165, 25);
        panel1.add(usernameTEXT);

        JLabel passwordLable = new JLabel("Password:");
        passwordLable.setBounds(10, 50, 80, 25);
        panel1.add(passwordLable);

        JPasswordField passwordTEXT = new JPasswordField(20);
        passwordTEXT.setBounds(100, 50, 165, 25);
        panel1.add(passwordTEXT);

        JLabel numLable = new JLabel("num:");
        numLable.setBounds(10, 80, 100, 25);
        panel1.add(numLable);

        JPasswordField numTEXT = new JPasswordField(20);
        numTEXT.setBounds(100,80,165, 25);
        panel1.add(numTEXT);

        JButton regsisterButtion = new JButton("regsiste");
        regsisterButtion.setBounds(100, 120, 80, 25);
        panel1.add(regsisterButtion);

        JButton helpButtion = new JButton("help");
        helpButtion.setBounds(200, 120, 80, 25);
        panel1.add(helpButtion);
    }
}
