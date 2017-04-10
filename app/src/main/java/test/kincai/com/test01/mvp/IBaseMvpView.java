package test.kincai.com.test01.mvp;

/**
 * author KINCAI
 * .
 * desc TODO
 * .
 * time 17-12-8-下午3:35
 */
public interface IBaseMvpView {
    void mvpShowLoading(String msg);

    void mvpShowError(int errorCode, String msg, String tag);

    void mvpDismissLoading();

    void mvpSuccess(Object object, String tag);
}
