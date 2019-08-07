package v;

/**
 * ${function}
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/7 12 : 49
 */
public interface I_MainActivity {
    // P 和 V 通信
    String getUserName();
    String getUserPassword();
    //V 和 P 通信
    void setUserName(String name);
    void setUserPassword(String password);
}
