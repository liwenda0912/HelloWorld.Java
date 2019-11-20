package Result;

public interface UserDao {
    public UserInfo findUserInfoByName(String username);

    public boolean saveUser(UserInfo userinfo);


}
