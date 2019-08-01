package com.example.androiddrinkshop.Retrofit;

import com.example.androiddrinkshop.Model.CheckUserRespone;
import com.example.androiddrinkshop.Model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IDrinkShopAPI {
    @FormUrlEncoded
    @POST("checkuser.php")
    Call<CheckUserRespone> checkUserExists(@Field("phone") String phone);

    @FormUrlEncoded
    @POST("register.php")
    Call<User> registerNewUser( @Field("phone") String phone,
                                @Field("name") String name,
                                       @Field("birthday") String birthday,
                                       @Field("address") String address
    );
}
