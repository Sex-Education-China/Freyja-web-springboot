package org.sexedu.spring.msic;

import cn.hutool.http.HttpUtil;

public class Tools {
    public static String getHTML(String url) {
        long start = System.currentTimeMillis();
        String str = HttpUtil.createGet(url)
                .cookie("PHPSESSID=jmjifou28acrclhuil9oj0d5j6; kt_ips=205.198.104.201%2C46.20.109.22")
                .header("Host", "jable.tv")
                .setHttpProxy("127.0.0.1", 7890)
                .execute().body();
        return str;
    }
}
