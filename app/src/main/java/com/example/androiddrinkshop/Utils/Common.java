package com.example.androiddrinkshop.Utils;

import com.example.androiddrinkshop.Retrofit.IDrinkShopAPI;
import com.example.androiddrinkshop.Retrofit.RetrofitClient;

import retrofit2.Retrofit;

public class Common {
    private static final String BASE_URL="http://localhost/drinkshop/";

    public static IDrinkShopAPI getAPI()
    {
        return RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
    }
}
