package test.kincai.com.test01.mvp;

import java.lang.ref.WeakReference;


/**
 * author KINCAI
 * .
 * desc TODO
 * .
 * time 17-12-8-下午3:35
 */
public class BaseMvpPresenter<V extends IBaseMvpView> implements IPresenter<V> {
    private String TAG = this.getClass().getSimpleName();
    private WeakReference<V> mMvpView;

    @Override
    public void attachView(V mvpView) {
        this.mMvpView = new WeakReference<>(mvpView);
    }

    @Override
    public void detachView() {
        if (mMvpView != null) {
            mMvpView.clear();
            mMvpView = null;
        }
    }

//    public boolean isAttachView(){
//        return mMvpView != null;
//    }

    public WeakReference<V> getMvpView() {
        return mMvpView;
    }

//    public void checkViewAttach() {
//        if(!isAttachView()){
//            throw new NullPointerException("view null");
//        }
//    }
}
