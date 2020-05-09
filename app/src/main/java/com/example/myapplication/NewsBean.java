package com.example.myapplication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NewsBean implements Serializable {
    public String path;
    public int image;
    public String title;
    public String passtime;

    public NewsBean(int image, String title, String passtime) {
        this.image = image;
        this.title = title;
        this.passtime = passtime;
    }


    public static List<NewsBean> getTestData() {
        List<NewsBean> list = new ArrayList<>();
        list.add(new NewsBean(R.drawable.image1, "相信自己,你努力的样子真的很美", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image2, "极致简约,梦幻小屋", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image3, "超级卖梦人", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image4, "夏季新搭配", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image5, "绝美风格搭配", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image6, "微微一笑 很倾城", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image7, "听风.赏雨", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image8, "迪丽热巴.迪力木拉提", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image9, "爱美.人间有之", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image10, "洋洋洋.气质篇", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image11, "生活的态度", "2019 02 03"));

        list.add(new NewsBean(R.drawable.image1, "相信自己,你努力的样子真的很美", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image2, "极致简约,梦幻小屋", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image3, "超级卖梦人", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image4, "夏季新搭配", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image5, "绝美风格搭配", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image6, "微微一笑 很倾城", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image7, "听风.赏雨", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image8, "迪丽热巴.迪力木拉提", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image9, "爱美.人间有之", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image10, "洋洋洋.气质篇", "2019 02 03"));
        list.add(new NewsBean(R.drawable.image11, "生活的态度", "2019 02 03"));
        return list;
    }
}
