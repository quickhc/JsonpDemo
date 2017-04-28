package jp.com.mvvmdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private String title = "";

    Document doc = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        HashMap<String, String> maps = new HashMap<>();
//        maps.put("cityname","郑州");
//
//        XutilsHttp.getInstance().get("http://v.juhe.cn/weather/index", maps, new XCallBack() {
//
//            @Override
//            public boolean onResponse(String result) {
//
//                return super.onResponse(result);
//            }
//
//            @Override
//            public void onFail(String s) {
//
//            }
//        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    doc = Jsoup.connect("http://m.xiaoxiaoshuwu.com/wapbook-478040-44258494/")
                            .get();
//                    doc = Jsoup.connect("http://www.baidu.com").get();
                } catch (IOException e) {
                    Log.e("123456", e.toString());
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String html = doc.html();
                        Document docm = Jsoup.parse(html);
                        Elements div = docm.select("#chapterContent");
//                        pb_next
                        Elements div2 = docm.select("a[href]#pb_next");

                        String href = div2.attr("href");

                        Log.i("123456",  href);
                    }
                });
            }
        }).start();
    }

}
