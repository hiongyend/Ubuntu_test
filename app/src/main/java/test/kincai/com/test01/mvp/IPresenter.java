package test.kincai.com.test01.mvp;

/**
 * author KINCAI
 * .
 * desc TODO
 * .
 * time 17-4-9-下午3:30
 */

public interface IPresenter<V extends IBaseMvpView> {
    /**
     * presenter和对应的view绑定
     *
     * @param mvpView 目标view
     */
    void attachView(V mvpView);

    /**
     * presenter与view解绑
     */
    void detachView();

}

