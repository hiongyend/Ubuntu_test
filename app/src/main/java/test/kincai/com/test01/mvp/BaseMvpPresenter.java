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

    private V getMvpView() {
        if (mMvpView != null)
            return mMvpView.get();
        return null;
    }

    public boolean isDestroyed() {
        return getMvpView() == null;
    }
}
