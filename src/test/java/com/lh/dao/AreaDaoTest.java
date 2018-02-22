package com.lh.dao;

import com.lh.pojo.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by CHLaih on 2018/2/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    @Ignore
    public void queryArea() throws Exception {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2,areaList.size());
    }

    @Test
    @Ignore
    public void queryAreaById() throws Exception {
        Area area = areaDao.queryAreaById(1);
        assertEquals("东苑",area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() throws Exception {
        Area area = new Area();
        area.setAreaName("南苑");
        area.setPriority(1);
        int num = areaDao.insertArea(area);
        assertEquals(1,num);
}

    @Test
    @Ignore
    public void updateArea() throws Exception {
        Area area = new Area();
        area.setAreaName("西苑");
      //  Date date = new Date();		//获取日期对象
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateString = formatter.format(date);
//        ParsePosition pos = new ParsePosition(0);
//        Date currentTime_2 = formatter.parse(dateString, pos);
     //   area.setLastEditTime(new Date());
        area.setAreaId(2);
        int num = areaDao.updateArea(area);
        assertEquals(1,num);
    }

    @Test

    public void deleteArea() throws Exception {
        int num = areaDao.deleteArea(3);
        assertEquals(1,num);
    }

}