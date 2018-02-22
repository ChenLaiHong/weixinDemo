package com.lh.service;

import com.lh.pojo.Area;

import java.util.List;

/**
 * Created by CHLaih on 2018/2/22.
 */
public interface AreaService {
    List<Area> queryArea();
    Area getAreaById(int areaId);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int areaId);
}
