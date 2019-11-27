package Utills;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utills {
    public  int logincheck(String username, String userpassword) {
        int result = 3;
        String filname = "./wen/" + username +".txt";
        File file = new File(filname);
        if(file.exists()){
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file ));
                    String name = bufferedReader.readLine();
                    String password = bufferedReader.readLine();
                    bufferedReader.close();
                if (!name.equals(username)) {
                    result = 0;
                }
                if (!password.equals(userpassword)) {
                    result = 2;
                }
                if (name.equals(username) && password.equals(userpassword) ) {
                    result = 1;

                }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
           return result;
        }

    }



