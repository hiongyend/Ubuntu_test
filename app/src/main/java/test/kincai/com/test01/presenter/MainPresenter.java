package test.kincai.com.test01.presenter;

import android.util.Log;

import test.kincai.com.test01.model.IMainModel;
import test.kincai.com.test01.model.MainModel;
import test.kincai.com.test01.mvp.BaseMvpPresenter;
import test.kincai.com.test01.mvp.IBaseLoadListener;
import test.kincai.com.test01.mvp.IBaseMvpView;

/**
 * author KINCAI
 * .
 * desc TODO
 * .
 * time 17-4-10-上午9:23
 */

public class MainPresenter extends BaseMvpPresenter<IBaseMvpView> {

    private IMainModel iMainModel;
    private IBaseMvpView iBaseMvpView;

    public MainPresenter(IBaseMvpView iBaseMvpView) {
        this.iMainModel = new MainModel();
        this.iBaseMvpView = iBaseMvpView;
    }

    public void loadData() {
        iBaseMvpView.mvpShowLoading("loading");
        iMainModel.loadData(new IBaseLoadListener() {
            @Override
            public void onError(int errorCode, String msg) {
                if (isDestroyed()) return;

                Log.e("MainPresenter", "onError");
                iBaseMvpView.mvpShowError(-1, "load data error", "loadData");
                iBaseMvpView.mvpDismissLoading();
            }

            @Override
            public void onSuccess(Object obj) {
                if (isDestroyed()) return;

                Log.e("MainPresenter", "onSuccess");
                iBaseMvpView.mvpSuccess("success", "loadData");
                iBaseMvpView.mvpDismissLoading();
            }
        });
    }

}
