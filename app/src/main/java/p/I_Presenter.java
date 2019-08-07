package p;

import bean.User_Bean_Info;

/**
 * P 接口
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/7 12 : 50
 */
public interface I_Presenter {

    void saveLoginInfo(User_Bean_Info info);
    void getLoginInfo();

}
