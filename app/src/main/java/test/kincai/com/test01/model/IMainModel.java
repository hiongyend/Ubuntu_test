package test.kincai.com.test01.model;

import test.kincai.com.test01.mvp.IBaseLoadListener;

/**
 * author KINCAI
 * .
 * desc TODO
 * .
 * time 17-4-10-下午2:17
 */

public interface IMainModel {
    void loadData(IBaseLoadListener listener);
}
