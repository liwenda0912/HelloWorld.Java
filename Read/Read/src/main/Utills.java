package main;

import DefaultVale.DefautVale;
import Result.UserInfo;

import java.io.*;

public class Utills {
    public  int logincheck(UserInfo userInfo) {
        int result = 3;
        String filname = DefautVale.filepath + userInfo.getUsername() +DefautVale.filetype;
        File file = new File(filname);
        if(file.exists()){
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file ));
                String name = bufferedReader.readLine();
                String password = bufferedReader.readLine();
                bufferedReader.close();
                if (!name.equals(userInfo.getUsername())) {
                    result = 0;
                }
                if (!password.equals(userInfo.getPassword())) {
                    result = 2;
                }
                if (name.equals(userInfo.getUsername()) && password.equals(userInfo.getPassword()) ) {
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
