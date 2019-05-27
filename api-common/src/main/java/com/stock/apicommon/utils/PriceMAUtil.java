package com.stock.apicommon.utils;

import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.DangRiEntity;
import com.stock.apicommon.entity.PriceEntity;
import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.vo.PriceAndMaRelationVo;
import com.stock.apicommon.vo.PriceScienceVo;
import com.stock.apicommon.vo.PriceVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class PriceMAUtil {

    public static PriceVo getPriceMA(List<PriceEntity> priceEntityList) {
        if (priceEntityList.size() != 60 || priceEntityList == null) {
            return null;
        }
        List<PriceEntity> priceEntityList5 = new ArrayList<>();
        List<PriceEntity> priceEntityList10 = new ArrayList<>();
        List<PriceEntity> priceEntityList20 = new ArrayList<>();
        List<PriceEntity> priceEntityList30 = new ArrayList<>();
        List<PriceEntity> priceEntityList60 = new ArrayList<>();
        BigDecimal price5 = new BigDecimal(0);
        BigDecimal price10 = new BigDecimal(0);
        BigDecimal price20 = new BigDecimal(0);
        BigDecimal price30 = new BigDecimal(0);
        BigDecimal price60 = new BigDecimal(0);
        PriceVo priceVo = new PriceVo();
        for (int i = 0; i < priceEntityList.size(); i++) {
            priceEntityList5.add(priceEntityList.get(i));
            priceEntityList10.add(priceEntityList.get(i));
            priceEntityList20.add(priceEntityList.get(i));
            priceEntityList30.add(priceEntityList.get(i));
            priceEntityList60.add(priceEntityList.get(i));
            if (priceEntityList5.size() == 5) {
                BigDecimal sum5 = new BigDecimal(0);
                for (PriceEntity priceEntity : priceEntityList5) {
                    sum5 = sum5.add(priceEntity.getClosingPrice());
                }
                price5 = sum5.divide(new BigDecimal(5), 2, RoundingMode.HALF_UP);
            }
            if (priceEntityList10.size() == 10) {
                BigDecimal sum10 = new BigDecimal(0);
                for (PriceEntity priceEntity : priceEntityList10) {
                    sum10 = sum10.add(priceEntity.getClosingPrice());
                }
                price10 = sum10.divide(new BigDecimal(10), 2, RoundingMode.HALF_UP);
            }
            if (priceEntityList20.size() == 20) {
                BigDecimal sum20 = new BigDecimal(0);
                for (PriceEntity priceEntity : priceEntityList20) {
                    sum20 = sum20.add(priceEntity.getClosingPrice());
                }
                price20 = sum20.divide(new BigDecimal(20), 2, RoundingMode.HALF_UP);
            }
            if (priceEntityList30.size() == 30) {
                BigDecimal sum30 = new BigDecimal(0);
                for (PriceEntity priceEntity : priceEntityList30) {
                    sum30 = sum30.add(priceEntity.getClosingPrice());
                }
                price30 = sum30.divide(new BigDecimal(30), 2, RoundingMode.HALF_UP);
            }
            if (priceEntityList60.size() == 60) {
                BigDecimal sum60 = new BigDecimal(0);
                for (PriceEntity priceEntity : priceEntityList60) {
                    sum60 = sum60.add(priceEntity.getClosingPrice());
                }
                price60 = sum60.divide(new BigDecimal(60), 2, RoundingMode.HALF_UP);
            }
        }
        priceVo.setPriceMa5(price5);
        priceVo.setPriceMa10(price10);
        priceVo.setPriceMa20(price20);
        priceVo.setPriceMa30(price30);
        priceVo.setPriceMa60(price60);
        return priceVo;
    }

    public static PriceScienceVo getPriceScience(List<ScienceEntity> scienceEntityList) {
        if (scienceEntityList.get(1).getPriceMa5() == null) {
            return null;
        }
        PriceScienceVo priceScienceVo = new PriceScienceVo();
        StringBuffer str = new StringBuffer();
        if (scienceEntityList.get(0).getPriceMa5() != null && scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5()) > 0) {
            str.append(Constants.PRICEXIANGSHANG5);
            str.append(",");
        }
        if (scienceEntityList.get(0).getPriceMa5() != null && scienceEntityList.get(0).getPriceMa5().compareTo(scienceEntityList.get(1).getPriceMa5()) <= 0) {
            str.append(Constants.PRICEXIANGXIA5);
            str.append(",");
        }
        if (scienceEntityList.get(0).getPriceMa10() != null && scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10()) > 0) {
            str.append(Constants.PRICEXIANGSHANG10);
            str.append(",");
        }
        if (scienceEntityList.get(0).getPriceMa10() != null && scienceEntityList.get(0).getPriceMa10().compareTo(scienceEntityList.get(1).getPriceMa10()) <= 0) {
            str.append(Constants.PRICEXIANGXIA10);
            str.append(",");
        }
        if (scienceEntityList.get(0).getPriceMa20() != null && scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) > 0) {
            str.append(Constants.PRICEXIANGSHANG20);
            str.append(",");
        }
        if (scienceEntityList.get(0).getPriceMa20() != null && scienceEntityList.get(0).getPriceMa20().compareTo(scienceEntityList.get(1).getPriceMa20()) <= 0) {
            str.append(Constants.PRICEXIANGXIA20);
            str.append(",");
        }
        if (scienceEntityList.get(0).getPriceMa30() != null && scienceEntityList.get(0).getPriceMa30().compareTo(scienceEntityList.get(1).getPriceMa30()) > 0) {
            str.append(Constants.PRICEXIANGSHANG30);
            str.append(",");
        }
        if (scienceEntityList.get(0).getPriceMa30() != null && scienceEntityList.get(0).getPriceMa30().compareTo(scienceEntityList.get(1).getPriceMa30()) <= 0) {
            str.append(Constants.PRICEXIANGXIA30);
            str.append(",");
        }
        if (scienceEntityList.get(0).getPriceMa60() != null && scienceEntityList.get(0).getPriceMa60().compareTo(scienceEntityList.get(1).getPriceMa60()) > 0) {
            str.append(Constants.PRICEXIANGSHANG60);
        }
        if (scienceEntityList.get(0).getPriceMa60() != null && scienceEntityList.get(0).getPriceMa60().compareTo(scienceEntityList.get(1).getPriceMa60()) <= 0) {
            str.append(Constants.PRICEXIANGXIA60);
        }
        priceScienceVo.setJunxian(str.toString());
        return priceScienceVo;
    }

    public static PriceAndMaRelationVo getPriceAndMaRelation(DangRiEntity dangRiEntity, ScienceEntity scienceEntity){
        if (dangRiEntity.getLclosePrice()==null||scienceEntity.getPriceMa5()==null){
            return null;
        }
        StringBuffer openBuffer=new StringBuffer();
        StringBuffer closeBuffer=new StringBuffer();
        if (dangRiEntity.getOpeningPrice().compareTo(scienceEntity.getPriceMa5())>=0){
            openBuffer.append(Constants.KAIPANGAO5TIANXIAN);
            openBuffer.append(",");
        }
        if (dangRiEntity.getOpeningPrice().compareTo(scienceEntity.getPriceMa5())<0){
            openBuffer.append(Constants.KAIPANDI5TIANXIAN);
            openBuffer.append(",");
        }
        if (dangRiEntity.getOpeningPrice().compareTo(scienceEntity.getPriceMa10())>=0){
            openBuffer.append(Constants.KAIPANGAO10TIANXIAN);
            openBuffer.append(",");
        }
        if (dangRiEntity.getOpeningPrice().compareTo(scienceEntity.getPriceMa10())<0){
            openBuffer.append(Constants.KAIPANDI10TIANXIAN);
            openBuffer.append(",");
        }
        if (dangRiEntity.getOpeningPrice().compareTo(scienceEntity.getPriceMa20())>=0){
            openBuffer.append(Constants.KAIPANGAO20TIANXIAN);
            openBuffer.append(",");
        }
        if (dangRiEntity.getOpeningPrice().compareTo(scienceEntity.getPriceMa20())<0){
            openBuffer.append(Constants.KAIPANDI20TIANXIAN);
            openBuffer.append(",");
        }
        if (dangRiEntity.getOpeningPrice().compareTo(scienceEntity.getPriceMa30())>=0){
            openBuffer.append(Constants.KAIPANGAO30TIANXIAN);
            openBuffer.append(",");
        }
        if (dangRiEntity.getOpeningPrice().compareTo(scienceEntity.getPriceMa30())<0){
            openBuffer.append(Constants.KAIPANDI30TIANXIAN);
            openBuffer.append(",");
        }
        if (dangRiEntity.getOpeningPrice().compareTo(scienceEntity.getPriceMa60())>=0){
            openBuffer.append(Constants.KAIPANGAO60TIANXIAN);
        }
        if (dangRiEntity.getOpeningPrice().compareTo(scienceEntity.getPriceMa60())<0){
            openBuffer.append(Constants.KAIPANDI60TIANXIAN);
        }
        if (dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa5())>=0){
            closeBuffer.append(Constants.SHOUPANGAO5TIANXIAN);
            closeBuffer.append(",");
        }
        if (dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa5())<0){
            closeBuffer.append(Constants.SHOUPANDI5TIANXIAN);
            closeBuffer.append(",");
        }
        if (dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa10())>=0){
            closeBuffer.append(Constants.SHOUPANGAO10TIANXIAN);
            closeBuffer.append(",");
        }
        if (dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa10())<0){
            closeBuffer.append(Constants.SHOUPANDI10TIANXIAN);
            closeBuffer.append(",");
        }
        if (dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa20())>=0){
            closeBuffer.append(Constants.SHOUPANGAO20TIANXIAN);
            closeBuffer.append(",");
        }
        if (dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa20())<0){
            closeBuffer.append(Constants.SHOUPANDI20TIANXIAN);
            closeBuffer.append(",");
        }
        if (dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa30())>=0){
            closeBuffer.append(Constants.SHOUPANGAO30TIANXIAN);
            closeBuffer.append(",");
        }
        if (dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa30())<0){
            closeBuffer.append(Constants.SHOUPANDI30TIANXIAN);
            closeBuffer.append(",");
        }
        if (dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa60())>=0){
            closeBuffer.append(Constants.SHOUPANGAO60TIANXIAN);
        }
        if (dangRiEntity.getClosingPrice().compareTo(scienceEntity.getPriceMa60())<0){
            closeBuffer.append(Constants.SHOUPANDI60TIANXIAN);
        }
        PriceAndMaRelationVo priceAndMaRelationVo=new PriceAndMaRelationVo();
        priceAndMaRelationVo.setPriceAndMaRelation(openBuffer.toString()+"&&"+closeBuffer.toString());
        return priceAndMaRelationVo;
    }
}
