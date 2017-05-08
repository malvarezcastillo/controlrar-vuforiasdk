package com.vuforia.samples.Books.model;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;


@SuppressWarnings("SameParameterValue")
public interface APIEndPointInterface {

    @Headers({"DeviceUuid: 12345678", "Operator: R"})
    @GET("/controlr/api/mobile/1/hubs/sensors")
    Call<ArrayList<Sensor>> getSensors(@Header("token") String token,
                                       @Query("hubId") String hubId);

    @Headers({"DeviceUuid: 12345678", "Operator: R"})
    @GET("/controlr/api/mobile/1/hubs/sensors/measures/data")
    Call<ArrayList<MeasureDataList>> getSensorMeasures(@Header("token") String token,
                                                       @Query("hubId") String hubId,
                                                       @Query("measureName") String measureName,
                                                       @Query("sensorId") String sensorId,
                                                       @Query("from") String from,
                                                       @Query("to") String to);

    @Headers({"DeviceUuid: 1234567", "Operator: R"})
    @GET("/controlr/api/mobile/1/hubs/sensors/measures/data")
    Call<ArrayList<MeasureDataList>> getSensorMeasures(@Header("token") String token,
                                                       @Query("hubId") String hubId,
                                                       @Query("measureName") String measureName,
                                                       @Query("sensorId") String sensorId,
                                                       @Query("from") String from,
                                                       @Query("to") String to,
                                                       @Query("granularity") String granularity);
}

