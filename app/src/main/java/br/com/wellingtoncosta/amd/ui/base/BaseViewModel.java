package br.com.wellingtoncosta.amd.ui.base;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import br.com.wellingtoncosta.amd.data.remote.response.Response;

/**
 * @author Wellington Costa on 23/12/2017.
 */
public abstract class BaseViewModel<T> extends ViewModel {

    protected final MutableLiveData<Response<T>> response = new MutableLiveData<>();

    protected final MutableLiveData<Boolean> loadingStatus = new MutableLiveData<>();

    public abstract void loadData();

    public MutableLiveData<Response<T>> getResponse() {
        return response;
    }

    public MutableLiveData<Boolean> getLoadingStatus() {
        return loadingStatus;
    }
}
