package com.stock.apicommon.utils.patterning;

import com.stock.apicommon.Constants;
import com.stock.apicommon.entity.PingDingEntity;
import com.stock.apicommon.vo.PingQiVo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * 平顶
 */
public class AbreastUtil {

    public static PingQiVo getPingDing(List<PingDingEntity> pingDingEntityList) {
        if (pingDingEntityList == null || pingDingEntityList.size() == 0) {
            return null;
        }
        List<PingDingEntity> pingDingEntityList2 = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList3 = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList4 = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList5 = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList6 = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList7 = new ArrayList<>();
        List<PingDingEntity> pingDingEntityList10 = new ArrayList<>();
        PingQiVo pingQiVo=new PingQiVo();
        for (int i = 0; i < pingDingEntityList.size(); i++) {
            if (i < 2) {
                pingDingEntityList2.add(pingDingEntityList.get(i));
            }
            if (i < 3) {
                pingDingEntityList3.add(pingDingEntityList.get(i));
            }
            if (i < 4) {
                pingDingEntityList4.add(pingDingEntityList.get(i));
            }
            if (i < 5) {
                pingDingEntityList5.add(pingDingEntityList.get(i));
            }
            if (i < 6) {
                pingDingEntityList6.add(pingDingEntityList.get(i));
            }
            if (i < 7) {
                pingDingEntityList7.add(pingDingEntityList.get(i));
            }
            pingDingEntityList10.add(pingDingEntityList.get(i));


        }
        //双平
        int count2ding = 0;
        int count2di=0;
        for (int i = 0; i < pingDingEntityList2.size(); i++) {
            BigDecimal ping = (pingDingEntityList2.get(0).getTopside().subtract(pingDingEntityList2.get(i).getTopside())).divide(pingDingEntityList2.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal di = (pingDingEntityList2.get(0).getFoot().subtract(pingDingEntityList2.get(i).getFoot())).divide(pingDingEntityList2.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if ((ping.compareTo(new BigDecimal(0.5)) < 0 && ping.compareTo(new BigDecimal(-0.5)) > 0)) {
                count2ding++;
            }
            if ((di.compareTo(new BigDecimal(0.5)) < 0 && di.compareTo(new BigDecimal(-0.5)) > 0)) {
                count2di++;
            }
        }

        //三平
        int count3ding = 0;
        int count3di=0;
        for (int i = 0; i < pingDingEntityList3.size(); i++) {
            BigDecimal ping = (pingDingEntityList3.get(0).getTopside().subtract(pingDingEntityList3.get(i).getTopside())).divide(pingDingEntityList3.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal di = (pingDingEntityList3.get(0).getFoot().subtract(pingDingEntityList3.get(i).getFoot())).divide(pingDingEntityList3.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if ((ping.compareTo(new BigDecimal(0.5)) < 0 && ping.compareTo(new BigDecimal(-0.5)) > 0)) {
                count3ding++;
            }
            if ((di.compareTo(new BigDecimal(0.5)) < 0 && di.compareTo(new BigDecimal(-0.5)) > 0)) {
                count3di++;
            }
        }

        //四平
        int count4ding = 0;
        int count4di=0;
        for (int i = 0; i < pingDingEntityList4.size(); i++) {
            BigDecimal ping = (pingDingEntityList4.get(0).getTopside().subtract(pingDingEntityList4.get(i).getTopside())).divide(pingDingEntityList4.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal di = (pingDingEntityList4.get(0).getFoot().subtract(pingDingEntityList4.get(i).getFoot())).divide(pingDingEntityList4.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if ((ping.compareTo(new BigDecimal(0.8)) < 0 && ping.compareTo(new BigDecimal(-0.8)) > 0)) {
                count4ding++;
            }
            if ((di.compareTo(new BigDecimal(0.8)) < 0 && di.compareTo(new BigDecimal(-0.8)) > 0)) {
                count4di++;
            }
        }

        //五平顶
        int count5ding = 0;
        int count5di=0;
        for (int i = 0; i < pingDingEntityList5.size(); i++) {
            BigDecimal ping = (pingDingEntityList5.get(0).getTopside().subtract(pingDingEntityList5.get(i).getTopside())).divide(pingDingEntityList5.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal di = (pingDingEntityList5.get(0).getFoot().subtract(pingDingEntityList5.get(i).getFoot())).divide(pingDingEntityList5.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if ((ping.compareTo(new BigDecimal(1)) < 0 && ping.compareTo(new BigDecimal(-1)) > 0)) {
                count5ding++;
            }
            if ((di.compareTo(new BigDecimal(1)) < 0 && di.compareTo(new BigDecimal(-1)) > 0)) {
                count5di++;
            }
        }
        //6平
        int count6ding = 0;
        int count6di=0;
        for (int i = 0; i < pingDingEntityList6.size(); i++) {
            BigDecimal ping = (pingDingEntityList6.get(0).getTopside().subtract(pingDingEntityList6.get(i).getTopside())).divide(pingDingEntityList6.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal di = (pingDingEntityList6.get(0).getFoot().subtract(pingDingEntityList6.get(i).getFoot())).divide(pingDingEntityList6.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if ((ping.compareTo(new BigDecimal(1.2)) < 0 && ping.compareTo(new BigDecimal(-1.2)) > 0)) {
                count6ding++;
            }
            if ((di.compareTo(new BigDecimal(1.2)) < 0 && di.compareTo(new BigDecimal(-1.2)) > 0)) {
                count6di++;
            }
        }
        //7平
        int count7ding = 0;
        int count7di=0;
        for (int i = 0; i < pingDingEntityList7.size(); i++) {
            BigDecimal ping = (pingDingEntityList7.get(0).getTopside().subtract(pingDingEntityList7.get(i).getTopside())).divide(pingDingEntityList7.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal di = (pingDingEntityList7.get(0).getFoot().subtract(pingDingEntityList7.get(i).getFoot())).divide(pingDingEntityList7.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if ((ping.compareTo(new BigDecimal(1.2)) < 0 && ping.compareTo(new BigDecimal(-1.2)) > 0)) {
                count7ding++;
            }
            if ((di.compareTo(new BigDecimal(1.2)) < 0 && di.compareTo(new BigDecimal(-1.2)) > 0)) {
                count7di++;
            }
        }
        //10平
        int count10ding = 0;
        int count10di=0;
        for (int i = 0; i < pingDingEntityList10.size(); i++) {
            BigDecimal ping = (pingDingEntityList10.get(0).getTopside().subtract(pingDingEntityList10.get(i).getTopside())).divide(pingDingEntityList10.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            BigDecimal di = (pingDingEntityList10.get(0).getFoot().subtract(pingDingEntityList10.get(i).getFoot())).divide(pingDingEntityList10.get(i).getClosingPrice(), 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
            if ((ping.compareTo(new BigDecimal(1.2)) < 0 && ping.compareTo(new BigDecimal(-1.2)) > 0)) {
                count10ding++;
            }
            if ((di.compareTo(new BigDecimal(1.2)) < 0 && di.compareTo(new BigDecimal(-1.2)) > 0)) {
                count10di++;
            }
        }
        if (count2ding == 2||count3ding==2) {
            pingQiVo.setPingDing2(Constants.DINGPING2);
        }
        if (count2di == 2||count3di == 2) {
            pingQiVo.setPingDi2(Constants.DIPING2);
        }
        if (count3ding == 3||count4ding==3||count5ding==4) {
            pingQiVo.setPingDing3(Constants.DINGPING3);
        }
        if (count3di == 3||count4di == 3||count5ding==4) {
            pingQiVo.setPingDi3(Constants.DIPING3);
        }
        if (count4ding == 4||count5ding==4||count6ding==4) {
            pingQiVo.setPingDing4(Constants.DINGPING4);
        }
        if (count4di == 4||count5di == 4||count6di == 4) {
            pingQiVo.setPingDi4(Constants.DIPING4);
        }
        if (count5ding == 5||count6ding>=5||count7ding>=5||count10ding>=7) {
            pingQiVo.setPingDing5(Constants.DINGPING5);
        }
        if (count5di == 5||count6di == 5||count7di >= 6||count10di >= 7) {
            pingQiVo.setPingDi5(Constants.DIPING5);
        }

        return pingQiVo;
    }

}
