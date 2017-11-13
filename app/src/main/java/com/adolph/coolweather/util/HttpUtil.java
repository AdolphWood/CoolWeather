package com.adolph.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Allen on 2017/11/13.
 *
 */

public class HttpUtil {

    // 传入一个请求地址，并注册一个回调处理服务器响应；
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
