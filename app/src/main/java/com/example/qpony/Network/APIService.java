package com.example.qpony.Network;




import com.example.qpony.Model.Currencies;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;


/**
 * Created by ad on 2018-01-16.
 */

public interface APIService {

    @GET
    Observable<Currencies> IgetCurrencies(@Url String url);
}

