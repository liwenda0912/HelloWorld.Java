package main;

import Result.User;
import Result.UserDaoImpl;
import Result.UserInfo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm extends JFrame {
    private JPanel panelRegsister;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton backButton;
    private JButton regsisterButton;

    public JButton getregsisterButton() {
        return regsisterButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public RegisterForm() {
        UserInfo userInfo = new UserInfo();
        setTitle("Regsister Form");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelRegsister = new JPanel();
        panelRegsister.setLayout(null);

        userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panelRegsister.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panelRegsister.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panelRegsister.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panelRegsister.add(passwordText);

        regsisterButton = new JButton("regsister");
        regsisterButton.setBounds(10, 80, 80, 25);
        panelRegsister.add(regsisterButton);

        backButton = new JButton("back");
        backButton.setBounds(100, 80, 80, 25);
        panelRegsister.add(backButton);
        add(panelRegsister);

        JButton helpButtion = new JButton("help");
        helpButtion.setBounds(200, 80, 80, 25);
        panelRegsister.add(helpButtion);
        regsisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserDaoImpl userDao = new UserDaoImpl();
                UserInfo userInfo = User();
                userDao.saveUser(userInfo);
                 dispose();
            }
        });
    }
    public UserInfo User() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(userText.getText());
        userInfo.setPassword(String.valueOf(passwordText.getText()));
        return  userInfo;
    }
        public void setFrameLoginVisible(Boolean visible){
            setVisible(visible);
        }

}