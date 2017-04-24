package cn.manfi.project.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Rx管理类
 * <p>
 *     管理RxJava声明周期处理
 * </p>
 * Created by Manfi on 2017/4/17.
 */

public class RxManager {

    // 管理订阅者
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public void add(Disposable disposable) {
        compositeDisposable.add(disposable);
    }

    public void clear() {
        compositeDisposable.clear();
    }
}
