package test.kincai.com.test01.presenter;

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

    private IMainModel iMainModel = new MainModel();
    private IBaseMvpView iBaseMvpView;

    public MainPresenter(IBaseMvpView iBaseMvpView) {
        this.iBaseMvpView = iBaseMvpView;
    }

    public void loadData() {
        iMainModel.loadData(new IBaseLoadListener() {
            @Override
            public void onError(int errorCode, String msg) {
                iBaseMvpView.mvpShowError(-1,"load data error","loadData");
            }

            @Override
            public void onSuccess(Object obj) {
                iBaseMvpView.mvpSuccess("success","loadData");
            }
        });
    }

    public interface IMainModel {
        void loadData(IBaseLoadListener listener);
    }
}
