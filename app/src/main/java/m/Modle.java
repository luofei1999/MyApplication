package m;

import android.util.Log;
import android.util.SparseArray;

import bean.User_Bean_Info;

/**
 * M 实体类
 *
 * @author Create by Yin Luo Fei
 * @version 0.1
 * @Time 2019/8/7 12 : 54
 */
public class Modle implements I_Modle {
    //保存信息的集合，相当于数据库
    private SparseArray<User_Bean_Info> saveList = new SparseArray<>();

    /**
     * 保存用户登录信息
     * @param key 保存对应的 KEY，相当于 数据库中的 主键
     * @param info 用户登录信息 Bean 类
     */
    @Override
    public void saveLogin(int key, User_Bean_Info info) {
        saveList.append(key, info);
    }

    /**
     * 获取保存的登录信息
     * @param key 之前保存登录信息的 KEY，现在用来获取该 KEY 对应的数据
     * @return 用户登录信息 实体类Bean
     */
    @Override
    public User_Bean_Info getLogin(int key) {

        //如果获取的信息存在，返回该key对应的实例，必须大于等于 0
        if (saveList.indexOfKey(key) >= 0) {
            return saveList.get(key);
        }

        return null;
    }
}
