package org.sexedu.spring.msic;

import cn.hutool.http.HttpUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tools {
    public static String getHTML(String url) {
        long start = System.currentTimeMillis();
        String str = HttpUtil.createGet(url)
                .cookie("PHPSESSID=jmjifou28acrclhuil9oj0d5j6; kt_ips=205.198.104.201%2C46.20.109.22")
                .header("Host", "jable.tv")
                .setHttpProxy("127.0.0.1",7890)
                .execute().body();
        return str;
    }
    public static String getURL(String regex, String data) {
        //sb存放正则匹配的结果
        StringBuffer sb = new StringBuffer();
        //编译正则字符串
        Pattern p = Pattern.compile(regex);
        //利用正则去匹配
        Matcher matcher = p.matcher(data);
        //如果找到了我们正则里要的东西
        while (matcher.find()) {
            //保存到sb中，"\r\n"表示找到一个放一行，就是换行
            sb.append(matcher.group() + "\r\n");
        }
        return sb.toString();
    }
}
