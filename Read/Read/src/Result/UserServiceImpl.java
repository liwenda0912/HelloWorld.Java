package Result;

public  class UserServiceImpl implements UserService {


    @Override
    public Result login(UserInfo userLogin) {
        UserDaoImpl userDao = new UserDaoImpl();
        UserInfo userInfo = userDao.findUserInfoByName(userLogin.getUsername());
        Result result = new Result(402,"incorrect pwd");
        if(userInfo.getUsername().equals(userLogin.getUsername()) &&
                userInfo.getPassword().equals(userLogin.getPassword())){
            result.setResultcode(201);
            result.setResultmessage("welcome " + userInfo.getUsername());
        }
        return result;
    }

    @Override
    public Result register(UserInfo userInfo) {
        UserDaoImpl userDao = new UserDaoImpl();
        boolean register = userDao.saveUser(userInfo);
        Result result = new Result(404,"can not save");
            if(register){
            result.setResultcode(200);
            result.setResultmessage("saved");
        }
        return result;
    }
}
