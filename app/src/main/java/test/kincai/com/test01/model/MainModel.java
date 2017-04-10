package test.kincai.com.test01.model;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;

import test.kincai.com.test01.mvp.IBaseLoadListener;
import test.kincai.com.test01.presenter.MainPresenter;

/**
 * author KINCAI
 * .
 * desc TODO
 * .
 * time 17-4-10-上午9:34
 */

public class MainModel implements MainPresenter.IMainModel {
    @Override
    public void loadData(final IBaseLoadListener listener) {
        new AsyncTask<Void,Void,Void>() {

            @Override
            protected Void doInBackground(Void... params) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                listener.onSuccess("success");
            }
        }.execute();
    }
}
