package com.lh.service.impl;

import com.lh.dao.AreaDao;
import com.lh.pojo.Area;
import com.lh.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by CHLaih on 2018/2/22.
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> queryArea() {
        return areaDao.queryArea();
    }

    @Override
    public Area getAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public boolean addArea(Area area) {
        if(area.getAreaName() != null && !"".equals(area.getAreaName())){
            try{
                int result = areaDao.insertArea(area);
                if(result > 0){
                    return true;
                }else {
                    throw new RuntimeException("插入信息错误！");
                }
            }catch (Exception e){
                throw new RuntimeException("插入信息错误:"+e.getMessage());
            }
        }else {
            throw new RuntimeException("插入信息不能为空！");
        }
    }

    @Override
    public boolean modifyArea(Area area) {
        if(area.getAreaId() != null && area.getAreaId()>0){
            try{
                int result = areaDao.updateArea(area);
                if(result > 0){
                    return true;
                }else {
                    throw new RuntimeException("更新信息错误！");
                }
            }catch (Exception e){
                throw new RuntimeException("更新信息错误:"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不能为空！");
        }
    }

    @Override
    public boolean deleteArea(int areaId) {
        if(areaId>0){
            try{
                int result = areaDao.deleteArea(areaId);
                if(result > 0){
                    return true;
                }else {
                    throw new RuntimeException("删除信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("删除信息失败:"+e.toString());
            }
        }else {
            throw new RuntimeException("信息id不能为空！");
        }
    }
}
