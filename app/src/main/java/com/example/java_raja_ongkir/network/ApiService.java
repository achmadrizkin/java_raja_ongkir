package com.example.java_raja_ongkir.network;

import com.example.java_raja_ongkir.model.city.ResponseCity;
import com.example.java_raja_ongkir.model.cost.ResponseCost;

import io.reactivex.Single;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("city")
    Single<ResponseCity> getCity();

    @FormUrlEncoded
    @POST("cost")
    Single<ResponseCost> postCost(
            @Field("origin") String origin,
            @Field("destination") String destination,
            @Field("weight") int weight,
            @Field("courier") String courier
    );
}
