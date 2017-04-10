package test.kincai.com.test01.mvp;

/**
 * author KINCAI
 * .
 * desc TODO
 * .
 * time 17-12-8-下午3:35
 */
public interface BaseSimpleMvpView extends IBaseMvpView {
    
    @Override
    public void mvpShowError(int errorCode, String msg, String tag);


    @Override
    public void mvpSuccess(Object object, String tag);
}
