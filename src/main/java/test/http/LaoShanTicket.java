package test.http;

import okhttp3.*;

import java.io.IOException;

public class LaoShanTicket {
    public void getTicket(String[] args) {
//        Host: city.qingdaonews.com
//        Connection: keep-alive
//        Pragma: no-cache
//        Cache-Control: no-cache
//        User-Agent: Mozilla/5.0 (Linux; Android 9; MIX 2S Build/PKQ1.180729.001; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/77.0.3865.120 MQQBrowser/6.2 TBS/045224 Mobile Safari/537.36 NewsApp/qdnews/6.10.0
//        Accept: image/webp,image/tpg,image/*,*/*;q=0.8
//        X-Requested-With: com.qdnews.qd
//        Referer: http://city.qingdaonews.com/qingdao/laoshanmenp/index
//        Accept-Encoding: gzip, deflate
//        Accept-Language: zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7
//        Cookie: appnews_deviceInfo=YTo1OntzOjEyOiJtYWNoaW5lX2NvZGUiO3M6MTY6Ijg0YjM1ODViYjAwZjI5YTUiO3M6NzoidXNlcl9pZCI7czo4OiIxMjk5NTEzMCI7czo5OiJ0X3VzZXJfaWQiO3M6ODoiMTI5OTUxMzAiO3M6OToidXNlcl90eXBlIjtpOjI7czo5OiJ0eXBlX3Rlc3QiO3M6MzoiYXBpIjt9; PHPSESSID=tv4sg2qe8evn2dsp4mf06orf25; NSC_djuz=ffffffff09022c7145525d5f4f58455e445a4a423660; Hm_lvt_099a2f2a4f2c2f042dbd360b42309fc4=1593009474,1593009487; Hm_lpvt_099a2f2a4f2c2f042dbd360b42309fc4=1593009487

 //       ActivityId	1
 //       ActivityName	巨峰游览区
 //       idnumber	370285199412254111
 //       name	于松华
 //       tel	18506488314
 //       current_url	http://city.qingdaonews.com/qingdao/laoshanmenp/index

        final String url = "http://city.qingdaonews.com/qingdao/laoshanmenp/getticket";
        OkHttpClient client = new OkHttpClient();
        FormBody formBody = new FormBody.Builder().add("ActivityId", "1")
                .add("ActivityName", "巨峰游览区")
                .add("idnumber", "370285199412254111")
                .add("name", "于松华")
                .add("tel", "18506488314")
                .add("current_url", "http://city.qingdaonews.com/qingdao/laoshanmenp/index")
                .build();
        Request request = new Request.Builder().url(url)
                .post(formBody)
                .addHeader("Host", "city.qingdaonews.com")
                .addHeader("Connection", "keep-alive").addHeader("Pragma", "no-cache")
                .addHeader("Cache-Control", "no-cache")
                .addHeader("User-Agent", "Mozilla/5.0 (Linux; Android 9; MIX 2S Build/PKQ1.180729.001; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/77.0.3865.120 MQQBrowser/6.2 TBS/045224 Mobile Safari/537.36 NewsApp/qdnews/6.10.0")
                .addHeader("Accept", "image/webp,image/tpg,image/*,*/*;q=0.8")
                .addHeader("X-Requested-With", "com.qdnews.qd")
                .addHeader("Referer", "http://city.qingdaonews.com/qingdao/laoshanmenp/index")
                .addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7")
                .addHeader("Cookie", "appnews_deviceInfo=YTo1OntzOjEyOiJtYWNoaW5lX2NvZGUiO3M6MTY6Ijg0YjM1ODViYjAwZjI5YTUiO3M6NzoidXNlcl9pZCI7czo4OiIxMjk5NTEzMCI7czo5OiJ0X3VzZXJfaWQiO3M6ODoiMTI5OTUxMzAiO3M6OToidXNlcl90eXBlIjtpOjI7czo5OiJ0eXBlX3Rlc3QiO3M6MzoiYXBpIjt9; PHPSESSID=tv4sg2qe8evn2dsp4mf06orf25; NSC_djuz=ffffffff09022c7145525d5f4f58455e445a4a423660; Hm_lvt_099a2f2a4f2c2f042dbd360b42309fc4=1593009474,1593009487; Hm_lpvt_099a2f2a4f2c2f042dbd360b42309fc4=1593009487")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.code() >= 200 && response.code() < 300) {
                    System.out.println(response.body().string());
                }
            }
        });



    }


}
