package com.stock.stockday.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stock.apicommon.entity.DaPanChangeEntity;
import com.stock.stockday.entity.StockDay399;
import com.stock.stockday.entity.StockDayDaPan;
import com.stock.stockday.entity.StockDayZong;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DaPanListUtil {
    public static List<DaPanChangeEntity> getDaPanList(List<StockDayZong> stockDayZongList, List<StockDayDaPan> stockDayDaPanList){
        List<DaPanChangeEntity> daPanChangeEntityList = new ArrayList<>();
        for (StockDayDaPan stockDayDaPan : stockDayDaPanList) {
            if (stockDayZongList.get(20).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(21).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(22).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(23).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(24).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(25).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(26).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(27).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(28).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(29).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(30).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(31).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(32).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(33).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(34).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(35).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(36).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(37).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(38).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
            if (stockDayZongList.get(39).getDate().compareTo(stockDayDaPan.getDate()) == 0) {
                DaPanChangeEntity daPanChangeEntity = new DaPanChangeEntity();
                BeanUtils.copyProperties(stockDayDaPan, daPanChangeEntity);
                daPanChangeEntityList.add(daPanChangeEntity);
            }
        }
        Collections.sort(daPanChangeEntityList, new Comparator<DaPanChangeEntity>() {
            @Override
            public int compare(DaPanChangeEntity o1, DaPanChangeEntity o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        return daPanChangeEntityList;
    }
}
