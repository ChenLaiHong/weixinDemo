package com.lh.dao;

import com.lh.pojo.Area;

import java.util.List;

/**
 * Created by CHLaih on 2018/2/22.
 */
public interface AreaDao {
    List<Area> queryArea();
    Area queryAreaById(int areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);

}
