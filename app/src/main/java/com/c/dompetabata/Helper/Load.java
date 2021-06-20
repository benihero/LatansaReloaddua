package com.c.dompetabata.Helper;

import android.content.Context;
import android.widget.Toast;

import com.c.dompetabata.Api.Api;
import com.c.dompetabata.Fragment.HomeFragment;
import com.c.dompetabata.Model.Micon;
import com.c.dompetabata.Model.ModelKabupaten;
import com.c.dompetabata.sharePreference.Preference;

import java.util.ArrayList;
import java.util.zip.CheckedOutputStream;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Load {

   static ArrayList<Micon>micons = new ArrayList<>();

    HomeFragment homeFragment;
    public static void loadiconPulsa(Context context) {

        Api api = RetroClient.getApiServices();
        Call<ResponMenu> call = api.getAllProduct("Bearer " + Preference.getToken(context));
        call.enqueue(new Callback<ResponMenu>() {
            @Override
            public void onResponse(Call<ResponMenu> call, Response<ResponMenu> response) {
                String code = response.body().getCode();


                if (code.equals("200")) {

//                    HomeFragment homeFragment = new HomeFragment((ArrayList<Micon>) response.body().getData());
//                    homeFragment


                }
            }

            @Override
            public void onFailure(Call<ResponMenu> call, Throwable t) {

            }
        });



    }

    public static ArrayList<Micon> getMicons() {
        return micons;
    }

    public static void setMicons(ArrayList<Micon> micons) {
        Load.micons = micons;
    }
}
