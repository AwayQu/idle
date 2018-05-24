package com.away1994.idlerest.loushi;

import com.away1994.idlerest.config.BaseConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Comparator;


@RestController
public class LouShiController {

    public class LouShiInfo {
        public String id;
        public String title;

        public LouShiInfo(String id, String title) {
            this.id = id;
            this.title = title;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public class LouShiDetail {
        public String id;
        public String title;
        public String detail;

        public LouShiDetail(String id, String title, String detail) {
            this.id = id;
            this.title = title;
            this.detail = detail;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }
    }

    class MyComparator2 implements Comparator<LouShiDetail>{
        @Override
        public int compare(LouShiDetail o1, LouShiDetail o2) {
            return o2.id.compareTo(o1.id);
        }
    }



    @Autowired
    private BaseConfiguration configuration;



    @RequestMapping(value = "/loushi/list", method = RequestMethod.GET)
    public ArrayList list(@RequestParam(value="detailID", defaultValue="1") String detailID,
                           HttpServletResponse response, HttpServletRequest request) {

        ArrayList arrayList = new ArrayList<>();
        arrayList.add(new LouShiDetail("1", "华夏四季", "开盘时间111111"));
        arrayList.add(new LouShiDetail("2", "华夏四季", "开盘时间111111"));
        arrayList.add(new LouShiDetail("3", "华夏四季", "开盘时间111111"));
        arrayList.add(new LouShiDetail("4", "华夏四季", "开盘时间111111"));
        arrayList.add(new LouShiDetail("5", "华夏四季", "开盘时间111111"));
        arrayList.add(new LouShiDetail("6", "华夏四季", "开盘时间111111"));


        return arrayList;
    }

    @RequestMapping(value = "/loushi/detail", method = RequestMethod.GET)
    public LouShiDetail detail(@RequestParam(value="id", defaultValue="1") String detailID,
                            HttpServletResponse response, HttpServletRequest request) {

        ArrayList<LouShiDetail> arrayList = new ArrayList<>();
        arrayList.add(new LouShiDetail("1", "华夏四季", "开盘时间111111"));
        arrayList.add(new LouShiDetail("2", "华夏四季", "开盘时间111111"));
        arrayList.add(new LouShiDetail("3", "华夏四季", "开盘时间111111"));
        arrayList.add(new LouShiDetail("4", "华夏四季", "开盘时间111111"));
        arrayList.add(new LouShiDetail("5", "华夏四季", "开盘时间111111"));
        arrayList.add(new LouShiDetail("6", "华夏四季", "开盘时间111111"));

        Integer id = Integer.valueOf(detailID) - 1;

        return arrayList.get(id);
    }




}
