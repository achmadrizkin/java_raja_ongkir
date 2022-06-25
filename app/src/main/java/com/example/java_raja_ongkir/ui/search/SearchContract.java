package com.example.java_raja_ongkir.ui.search;

import android.widget.EditText;

import com.example.java_raja_ongkir.model.city.DataCity;
import com.example.java_raja_ongkir.model.city.ResponseCity;
import com.jakewharton.rxbinding3.widget.TextViewTextChangeEvent;

import java.util.List;

import io.reactivex.observers.DisposableObserver;

public class SearchContract {
    interface View {
        void onLoadingSearch(boolean loading);
        void onResultSearch(ResponseCity responseCity);
        void onErrorSearch();

        void onResultInstantSearch(List<DataCity> data);
        void showMessage(String msg);
    }

    interface Presenter {
        void getCity();
        void instantSearch(EditText editText, List<DataCity> data);
        void searchCity(List<DataCity> data, String keyword);
        DisposableObserver<TextViewTextChangeEvent> observer(List<DataCity> data);
    }
}
