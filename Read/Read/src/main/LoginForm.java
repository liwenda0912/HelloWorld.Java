package main;

import Result.UserInfo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame  {

    private JPanel panelLogin;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JButton regsisterButton;

    public JButton getRegisterButton() {
        return regsisterButton;
    }

    public LoginForm(){
        UserInfo userinfo = new UserInfo();
        setTitle("Login Form");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelLogin = new JPanel();
        panelLogin.setLayout(null);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(10,20,80,25);
        panelLogin.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panelLogin.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panelLogin.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panelLogin.add(passwordText);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panelLogin.add(loginButton);

        regsisterButton = new JButton("register");
        regsisterButton.setBounds(100, 80, 80, 25);
        panelLogin.add(regsisterButton);

        JButton helpButtion = new JButton("help");
        helpButtion.setBounds(200, 80, 80, 25);
        panelLogin.add(helpButtion);

        add(panelLogin);
        class li implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                Utills utills =new Utills();
                userinfo.setUsername(userText.getText());
                userinfo.setPassword ( String.valueOf(passwordText.getPassword()));
                int result = utills.logincheck(userinfo);
                if(result == 1) {
                    WeChat weChatForm = new WeChat();
                    weChatForm.setFrameWeChatVisible(true);
                    dispose();
                }
                else {
                    LoginForm loginForm = new LoginForm();
                    RegisterForm registerForm = new RegisterForm();
                    registerForm.setFrameLoginVisible(true);
                    loginForm.setFrameLoginVisible(false);
                    dispose();
                }
            }

        }
        loginButton.addActionListener(new li());

    }


    public void setFrameLoginVisible(Boolean visible){
        setVisible(visible);
        }
        }