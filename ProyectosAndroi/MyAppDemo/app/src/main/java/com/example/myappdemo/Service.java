package com.example.myappdemo;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Service {

    @GET("wsPaises.php")
    Call<ResponseBody> getPaises();
}
