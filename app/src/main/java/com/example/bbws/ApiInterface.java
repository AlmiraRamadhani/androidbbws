package com.example.bbws;

import retrofit2.Call;
import retrofit2.http.*;

public class ApiInterface {
    @GET("remote_monitor")
    Call<getMonitoring> getPembelian();

    @FormUrlEncoded
    @POST("remote_monitor")
    Call<PostPutDelMonitoring> postPembelian(@Field("id") int id,
                                            @Field("rain") int rain,
                                            @Field("hour") int hour,
                                            @Field("solar") int solar,
                                            @Field("wind") int wind,
                                            @Field("temp") int temp,
                                            @Field("rh") int rh,
                                            @Field("wl") int wl,
                                            @Field("flow") int flow,
                                            @Field("date") int date);
    @FormUrlEncoded
    @PUT("remote_monitor")
    Call<PostPutDelMonitoring>
    putPembelian(@Field("id") int id, @Field("rain") String rain,
                 @Field("hour") int hour, @Field("solar") int solar,
                 @Field("wind") int wind, @Field("temp") int temp,
                 @Field("rh") int rh, @Field("wl") int wl,
                 @Field("flow") int flow, @Field("date") int date);
    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "remote_monitor", hasBody = true)
    Call<PostPutDelMonitoring> deletemonitoring(@Field("id") String id);
}
