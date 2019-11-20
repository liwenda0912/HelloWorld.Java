package Result;

import DefaultVale.DefautVale;

import java.io.*;

public class UserDaoImpl implements UserDao {

    @Override
    public UserInfo findUserInfoByName(String username) {
        UserInfo userInfo = new UserInfo();
        try {
            if (username == null || username.length() == 0) {
                throw new Exception();
            }
            String filename = DefautVale.filepath + username + DefautVale.filetype;
            File file = new File(filename);
            if (!file.exists()) {
                throw new Exception();
            }
            BufferedReader in = new BufferedReader(new FileReader(file));
            String findName = in.readLine();
            String findPassword = in.readLine();
            userInfo.setPassword(findPassword);
            userInfo.setUsername(findName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInfo;
    }

    @Override
    public boolean saveUser(UserInfo userinfo) {
        boolean result = false;
        try {
            if (userinfo.getUsername() == null || userinfo.getUsername().length() == 0) {
                throw new Exception();
            }
            String filename = DefautVale.filepath + userinfo.getUsername() + DefautVale.filetype;
            String content = userinfo.getUsername() + "\n" + userinfo.getPassword();
            File file = new File(filename);
            if (file.exists()) {
                throw new Exception();
            }
            file.createNewFile();
            BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
            out.write(content);
            out.close();
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
      return  result;
    }
}




