package com.wghcwc.retrofitrxjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


import com.wghcwc.mygsonconvert.MyGsonConvertFactory;
import com.wghcwc.mygsonconvert.ServiceErrorException;
import com.wghcwc.rtrofitadapter.RxJava2CallAdapterFactory;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    static {
  /*     OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HeaderIntercept())
                .build();
        retrofit = new Retrofit.Builder()
//                .baseUrl(ConnectionIp.CONNECT_API)
                .addConverterFactory(MyGsonConvertFactory.create())
                .client(okHttpClient)
                .baseUrl("https://app.51uniu.com/")
                .addCallAdapterFactory(RxJavaNetAdapterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
*/

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HeaderIntercept())
                .build();
        retrofit = new Retrofit.Builder()
//                .baseUrl(ConnectionIp.CONNECT_API)
                .baseUrl("https://app.51uniu.com/")
                .addConverterFactory(MyGsonConvertFactory.create(jsonObject -> {
                    int code = Integer.parseInt(jsonObject.get("code").toString());
                    if (code == 200) {
                        return null;
                    }
                    String msg = jsonObject.get("message").toString();
                    return new ServiceErrorException(code, msg);
                }))
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

    }


    private static Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  Map<String, String> map = new HashMap<>();
        map.put("system", "\"{\"uid\":\"297975\",\"platform\":\"4\",\"version\":\"1.1.0\",\"model\":\"OnePlus\"}");
        map.put("sign", getSign("297975"));*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                retrofit.create(ServiceApi.class).getHomeRec()
                        .observeOn(Schedulers.io())
                        .subscribe(new Observer<HomeRec>() {
                            @Override
                            public void onSubscribe(Disposable d) {
                                Log.d("ss", "onSubscribe: ");
                            }

                            @Override
                            public void onNext(HomeRec responseBody) {
                                String name = Thread.currentThread().getName();

                                Log.d("ss", "onNext: " + responseBody.toString() + Thread.currentThread().getName());


                            }

                            @Override
                            public void onError(Throwable e) {
                                String name = Thread.currentThread().getName();
                                Log.d("ss", "onNext: " + e.toString()+name);


                            }

                            @Override
                            public void onComplete() {

                            }
                        });
            }
        }).start();

      /*  retrofit.create(ServiceApi.class).getHomeRec()
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d("ss", "onSubscribe: ");

                    }

                    @Override
                    public void onNext(ResponseBody responseBody) {
                        Log.d("ss", "onSubscribe: ");

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("ss", "onSubscribe: ");

                    }

                    @Override
                    public void onComplete() {

                    }
                });
*/

    }
}
