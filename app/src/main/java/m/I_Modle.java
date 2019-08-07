package m;

import bean.User_Bean_Info;

/**
 * M 接口
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/7 12 : 52
 */
public interface I_Modle {

    void saveLogin(int key, User_Bean_Info info);
    User_Bean_Info getLogin(int key);
}
