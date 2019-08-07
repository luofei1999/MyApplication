package p;

import bean.User_Bean_Info;
import m.I_Modle;
import m.Modle;
import v.I_MainActivity;
import v.MainActivity;

/**
 * P 实体类
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/7 12 : 50
 */
public class Presenter implements I_Presenter {
    // V 的引用
    private I_MainActivity i_mainActivity;
    // M 的引用
    private I_Modle i_modle;

    /**
     * 获取 V 的引用 并 实例化 M，一定要是实现了 V 接口的类
     * @param i_mainActivity
     */
    public Presenter(MainActivity mainActivity) {
        this.i_mainActivity = mainActivity;
        i_modle = new Modle();
    }

    /**
     * 保存用户登录信息
     * @param info 用户登录信息实体类 Bean
     */
    @Override
    public void saveLoginInfo(User_Bean_Info info) {
        if (info != null)
            i_modle.saveLogin(1, info);
    }

    /**
     * 获取之前保存的用户信息
     */
    @Override
    public void getLoginInfo() {
        //从容器（数据库 ）中获取 用户信息，对应 M 中的 SparseArray<User_Bean_Info>
        User_Bean_Info info = i_modle.getLogin(1);
        //通过接口编程与 V 进行交互，设置 用户名 和 密码
        i_mainActivity.setUserName(info.getUserName());
        i_mainActivity.setUserPassword(info.getUserPassword());
    }
}
