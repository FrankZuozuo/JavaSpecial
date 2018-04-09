package utils.reptile;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import utils.print.Print;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Created by 谭健 on 2018/4/9 0009. 星期一. 11:23.
 * © All Rights Reserved.
 * <p>
 * URL 爬取
 */
public class WebReptile {


    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.aliyun.com/");
        URLConnection conn = url.openConnection();
        // 设置连接网络超时时间
        conn.setConnectTimeout(1000 * 10);
        // 读取指定网络地址中的文件
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;

        // 这个也不能断掉链接
        String regex = "(https?://(w{3}\\.)?)?\\w+\\.\\w+(\\.[a-zA-Z]+)*(:\\d{1,5})?(/\\w*)*(\\??(.+=.*)?(&.+=.*)?)?";

        // 比较水的正则
        String regex1 = "[http]{4}\\\\:\\\\/\\\\/([a-zA-Z]|[0-9])*(\\\\.([a-zA-Z]|[0-9])*)*(\\\\/([a-zA-Z]|[0-9])*)*\\\\s?";
        String regex2 = "(http://.*)\\\\s+";
        String regex3 = "(?isu)(http\\://[a-zA-Z0-9\\.\\?/&\\=\\:]+)";
        Pattern p = Pattern.compile(regex);
        //       line = bufferedReader.readLine();
        StringBuilder html = new StringBuilder(8000);

        // 读取网站的html源代码
        while ((line = bufferedReader.readLine()) != null) html.append(line);
//        while ((line = bufr.readLine()) != null) {
//            Matcher m = p.matcher(line);
//            while (m.find()) {
//                System.out.println(m.group());
//            }
//        }


        // 存储找到的链接
        List<String> list = Lists.newArrayListWithExpectedSize(900);

        // 格式化HTML，有些网站心机比较深，做了压缩，需要先格式化，不然会漏掉99%的链接
        Document document = Jsoup.parseBodyFragment(html.toString());
        String[] htmlLines = document.toString().split("\n");
        // 一行一行的找
        for (String htmlLine : htmlLines) {
            Matcher m = p.matcher(htmlLine);
            while (m.find()) {
                String group = m.group();
                // Print.echo(m.group());
                // 有些是这个行里面有链接，可能在中间，或者其它什么地方，我没做处理
                if (group.contains("http") || group.contains("https")) {
                    // 做个截断，链接不在第一分段的不要了，比较少
                    String uri = group.split("\"")[0];
                    if (uri.contains("http") || uri.contains("https"))
                        list.add(uri);
//                    if (group.split("\"")[0].equalsIgnoreCase("buy.aliyun.com/buy/package.html")) {
//                        Print.echo(group);
//                    }
                }
            }
        }
//        document.body().html();
//
//        Print.echo(document.toString());
//        Print.echo(html);


        Print.echo(list.size());
        // 去重
        Set<String> set = Sets.newHashSet(list);
        Print.echo(set.size());

        set.forEach(Print::echo);
    }


}
