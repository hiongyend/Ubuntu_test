package test.kincai.com.test01.ui.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import test.kincai.com.test01.R;
import test.kincai.com.test01.databinding.ActivityMainBinding;
import test.kincai.com.test01.mvp.IBaseMvpView;
import test.kincai.com.test01.presenter.MainPresenter;

/**
 * author KINCAI
 * .
 * desc 主界面
 * .
 * time 17-4-10-上午9:23
 */
public class MainActivity extends AppCompatActivity implements IBaseMvpView {

    private MainPresenter mMainPresenter;
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }

    private void initData() {
		mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setName(getString(R.string.app_name));
        mBinding.setEventListener(new EventListener());
        mMainPresenter = new MainPresenter(this);
        mMainPresenter.attachView(this);
    }

    public class EventListener {
        public void load(View view) {
            mMainPresenter.loadData();
        }
    }

    @Override
    public void mvpShowLoading(String msg) {
        Toast.makeText(this,"mvpShowLoading",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mvpShowError(int errorCode, String msg, String tag) {
        Toast.makeText(this,"mvpShowError",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mvpDismissLoading() {
        Toast.makeText(this,"mvpDismissLoading",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mvpSuccess(Object object, String tag) {
        Toast.makeText(this,"mvpSuccess",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mMainPresenter != null)
            mMainPresenter.detachView();
    }
}
