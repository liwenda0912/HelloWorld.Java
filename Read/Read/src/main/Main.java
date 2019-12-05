package main;

import Result.Result;
import Result.UserInfo;
import Result.UserServiceImpl;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose = 5;
        do {
            UserServiceImpl userService = new UserServiceImpl();
            System.out.println("\nPlease choose the options below:");
            System.out.println("1.login  2.register  3.forget password  4.exit");
            Scanner scanner = new Scanner(System.in);
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    final  RegisterForm registerForm = new RegisterForm();
                    final LoginForm loginForm = new LoginForm();
                    loginForm.setFrameLoginVisible(true);
                    loginForm.getRegisterButton().addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            registerForm.setFrameLoginVisible(true);
                            loginForm.setFrameLoginVisible(false);
                        }
                    });
                    registerForm.getBackButton().addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            loginForm.setFrameLoginVisible(true);
                            registerForm.setFrameLoginVisible(false);
                        }
                    });
                    break;
                case 2:
                    UserInfo userRegister = new UserInfo();
                    System.out.println("Please enter user name:");
                    userRegister.setUsername(scanner.next());
                    System.out.println("Please enter user password:");
                    userRegister.setPassword(scanner.next());
                    Result resultRegister = userService.register(userRegister);
                    System.out.println(resultRegister.getResultmessage());
                    break;
                case 3:
                    System.out.println("Please enter user name:");
                    break;
                case 4:
                    choose = 6;
                    break;
                default:
                    System.out.println("incorrect!");
            }
        } while (choose < 6);
    }
}