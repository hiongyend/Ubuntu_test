package test.kincai.com.test01.mvp;

/**
 * author KINCAI
 * .
 * desc TODO
 * .
 * time 17-12-8-下午3:35
 */
public interface IBaseLoadListener {

    void onError(int errorCode, String msg);
    void onSuccess(Object obj);

    class SimpleLoadListener implements IBaseLoadListener {

        @Override
        public void onError(int errorCode, String msg) {
        }

        @Override
        public void onSuccess(Object obj) {
        }
    }
}
