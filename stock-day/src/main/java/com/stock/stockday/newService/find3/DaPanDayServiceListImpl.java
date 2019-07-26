package com.stock.stockday.newService.find3;


import com.stock.apicommon.entity.ScienceEntity;
import com.stock.apicommon.vo.YanPanVo;
import com.stock.stockday.entity.StockDayAll;
import com.stock.stockday.entity.StockDayScience;
import com.stock.stockday.entity.StockDayYanPan1;
import com.stock.stockday.service.find2.StockDayYanPan1Service;
import com.stock.stockday.util.DateUtil;
import com.stock.stockday.util.FindUtil10;
import com.stock.stockday.util.FindUtil13;
import com.stock.stockday.util.FindUtil14;
import com.stock.stockday.util.FindUtil15;
import com.stock.stockday.util.FindUtil16;
import com.stock.stockday.util.FindUtil18;
import com.stock.stockday.util.FindUtil19;
import com.stock.stockday.util.FindUtil20;
import com.stock.stockday.util.FindUtil21;
import com.stock.stockday.util.FindUtil22;
import com.stock.stockday.util.FindUtil23;
import com.stock.stockday.util.FindUtil24;
import com.stock.stockday.util.FindUtil25;
import com.stock.stockday.util.FindUtil27;
import com.stock.stockday.util.FindUtil28;
import com.stock.stockday.util.FindUtil29;
import com.stock.stockday.util.FindUtil3;
import com.stock.stockday.util.FindUtil32;
import com.stock.stockday.util.FindUtil35;
import com.stock.stockday.util.FindUtil38;
import com.stock.stockday.util.FindUtil39;
import com.stock.stockday.util.FindUtil4;
import com.stock.stockday.util.FindUtil40;
import com.stock.stockday.util.FindUtil41;
import com.stock.stockday.util.FindUtil42;
import com.stock.stockday.util.FindUtil44;
import com.stock.stockday.util.FindUtil45;
import com.stock.stockday.util.FindUtil46;
import com.stock.stockday.util.FindUtil47;
import com.stock.stockday.util.FindUtil49;
import com.stock.stockday.util.FindUtil5;
import com.stock.stockday.util.FindUtil50;
import com.stock.stockday.util.FindUtil51;
import com.stock.stockday.util.FindUtil53;
import com.stock.stockday.util.FindUtil54;
import com.stock.stockday.util.FindUtil55;
import com.stock.stockday.util.FindUtil56;
import com.stock.stockday.util.FindUtil57;
import com.stock.stockday.util.FindUtil59;
import com.stock.stockday.util.FindUtil6;
import com.stock.stockday.util.FindUtil60;
import com.stock.stockday.util.FindUtil61;
import com.stock.stockday.util.FindUtil62;
import com.stock.stockday.util.FindUtil63;
import com.stock.stockday.util.FindUtil65;
import com.stock.stockday.util.FindUtil66;
import com.stock.stockday.util.FindUtil67;
import com.stock.stockday.util.FindUtil68;
import com.stock.stockday.util.FindUtil69;
import com.stock.stockday.util.FindUtil7;
import com.stock.stockday.util.FindUtil71;
import com.stock.stockday.util.FindUtil72;
import com.stock.stockday.util.FindUtil73;
import com.stock.stockday.util.FindUtil74;
import com.stock.stockday.util.FindUtil76;
import com.stock.stockday.util.FindUtil78;
import com.stock.stockday.util.FindUtil80;
import com.stock.stockday.util.FindUtil87;
import com.stock.stockday.util.FindUtil88;
import com.stock.stockday.util.FindUtil90;
import com.stock.stockday.util.FindUtil91;
import com.stock.stockday.util.FindUtil92;
import com.stock.stockday.util.FindUtil93;
import com.stock.stockday.util.FindUtil94;
import com.stock.stockday.util.FindUtil96;
import com.stock.stockday.util.FindUtil97;
import com.stock.stockday.utils.FindUtil106;
import com.stock.stockday.utils.FindUtil107;
import com.stock.stockday.utils.FindUtil108;
import com.stock.stockday.utils.FindUtil109;
import com.stock.stockday.utils.FindUtil110;
import com.stock.stockday.vo.StockDayVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DaPanDayServiceListImpl {
    @Autowired
    private StockDayYanPan1Service stockDayYanPan1Service;

    public List<StockDayVo> dayDaPanFunction(List<StockDayAll> stockDayAllListDaPan, List<StockDayScience> stockDayScienceListDaPan, List<StockDayVo> stockDayVoList) throws IOException {
        if (stockDayAllListDaPan == null || stockDayAllListDaPan.size() == 0) {
            return stockDayVoList;
        }
        StockDayVo stockDayVo = new StockDayVo();
        //排序
        Collections.sort(stockDayAllListDaPan, new Comparator<StockDayAll>() {
            @Override
            public int compare(StockDayAll o1, StockDayAll o2) {
                long i = o2.getDate().getTime() - o1.getDate().getTime();
                if (i > 0) {
                    return 1;
                } else if (i < 0) {
                    return -1;
                }
                return 0;
            }
        });
        List<StockDayAll> stockDayAllListDaPan1 = new ArrayList<>();
        for (StockDayAll stockDayAll : stockDayAllListDaPan) {
            if (stockDayAll.getOpeningPrice().compareTo(new BigDecimal(0)) != 0 && stockDayAll.getOpeningPrice() != null && stockDayAll.getLclosePrice() != null && stockDayAll.getLclosePrice().compareTo(new BigDecimal(0)) != 0 && stockDayAll.getChangePoints() != null) {
                stockDayAllListDaPan1.add(stockDayAll);
            }
            if (stockDayAllListDaPan1.size() == 50) {
                stockDayVo.setCode(stockDayAllListDaPan1.get(0).getCodeEx() + stockDayAllListDaPan1.get(0).getCodeId());
                stockDayVo.setDate(DateUtil.get2String(stockDayAllListDaPan1.get(0).getDate()));
                List<ScienceEntity> scienceEntityListDaPan = new ArrayList<>();
                //排序
                Collections.sort(stockDayAllListDaPan1, new Comparator<StockDayAll>() {
                    @Override
                    public int compare(StockDayAll o1, StockDayAll o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                for (StockDayScience stockDayScience : stockDayScienceListDaPan) {
                    if (stockDayAllListDaPan1.get(0).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(1).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(2).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(3).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(4).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(5).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(6).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(7).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(8).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(9).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(10).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                    if (stockDayAllListDaPan1.get(11).getDate().compareTo(stockDayScience.getDate()) == 0) {
                        ScienceEntity scienceEntity = new ScienceEntity();
                        BeanUtils.copyProperties(stockDayScience, scienceEntity);
                        scienceEntityListDaPan.add(scienceEntity);
                    }
                }
                Collections.sort(scienceEntityListDaPan, new Comparator<ScienceEntity>() {
                    @Override
                    public int compare(ScienceEntity o1, ScienceEntity o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                Collections.sort(stockDayAllListDaPan1, new Comparator<StockDayAll>() {
                    @Override
                    public int compare(StockDayAll o1, StockDayAll o2) {
                        long i = o2.getDate().getTime() - o1.getDate().getTime();
                        if (i > 0) {
                            return 1;
                        } else if (i < 0) {
                            return -1;
                        }
                        return 0;
                    }
                });
                boolean flag3220 = FindUtil106.duoTuXiangShangDapan2(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3221 = FindUtil106.shengVDapan2(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3222 = FindUtil106.reset20Dapan2(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3223 = FindUtil106.jieQiDapan3(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3224 = FindUtil106.jishujieqiDapan3(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3225 = FindUtil106.jishujieqiDapan4(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3226 = FindUtil106.jieQiDapan4(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3227 = FindUtil106.duoTuXiangShangDapan3(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3228 = FindUtil106.shengVDapan3(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3229 = FindUtil106.reset20Dapan3(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3230 = FindUtil106.jieQiDapan5(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3231 = FindUtil106.jishujieqiDapan5(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3232 = FindUtil106.jishujieqiDapan6(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3233 = FindUtil106.jishujieqiDapan7(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3234 = FindUtil106.duoTuXiangShangDapan4(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3235 = FindUtil106.shengVDapan4(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3236 = FindUtil106.reset20Dapan4(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3237 = FindUtil106.jieQiDapan6(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3238 = FindUtil106.jishujieqiDapan8(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3239 = FindUtil106.jishujieqiDapan9(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3240 = FindUtil106.jieQiDapan7(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3241 = FindUtil106.jieQiDapan8(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3242 = FindUtil106.jieQiDapan9(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3243 = FindUtil106.jieQiDapan10(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3244 = FindUtil106.jieQiDapan11(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3245 = FindUtil106.jieQiDapan12(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3246 = FindUtil106.jieQiDapan13(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3247 = FindUtil106.jieQiDapan14(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3248 = FindUtil106.jieQiDapan15(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3249 = FindUtil106.jieQiDapan16(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3250 = FindUtil106.jieQiDapan17(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3251 = FindUtil106.jieQiDapan18(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3252 = FindUtil106.jieQiDapan19(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3253 = FindUtil106.jieQiDapan20(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3254 = FindUtil106.jieQiDapan21(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3255 = FindUtil106.jieQiDapan22(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3256 = FindUtil106.jieQiDapan23(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3257 = FindUtil106.jieQiDapan24(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3258 = FindUtil106.jieQiDapan25(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3259 = FindUtil106.jieQiDapan26(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3260 = FindUtil106.jieQiDapan27(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3261 = FindUtil106.jieQiDapan28(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3262 = FindUtil106.jieQiDapan29(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3263 = FindUtil106.jieQiDapan30(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3264 = FindUtil106.jieQiDapan31(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3265 = FindUtil106.jieQiDapan32(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3266 = FindUtil106.jieQiDapan33(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3267 = FindUtil106.jieQiDapan34(stockDayAllListDaPan1, scienceEntityListDaPan);
                boolean flag3268 = FindUtil106.jieQiDapan35(scienceEntityListDaPan);
                boolean flag3269 = FindUtil106.jieQiDapan36(scienceEntityListDaPan);
                boolean flag3270 = FindUtil106.jieQiDapan37(scienceEntityListDaPan);
                boolean flag3271 = FindUtil106.jieQiDapan38(scienceEntityListDaPan);
                boolean flag3272 = FindUtil106.jieQiDapan39(scienceEntityListDaPan);
                boolean flag3273 = FindUtil106.jieQiDapan40(scienceEntityListDaPan);
                boolean flag3274 = FindUtil106.jieQiDapan41(scienceEntityListDaPan);
                boolean flag3275 = FindUtil106.jieQiDapan42(scienceEntityListDaPan);
                boolean flag3276 = FindUtil106.jieQiDapan43(scienceEntityListDaPan);
                boolean flag3277 = FindUtil106.jieQiDapan44(scienceEntityListDaPan);
                boolean flag3278 = FindUtil106.jieQiDapan45(scienceEntityListDaPan);
                boolean flag3279 = FindUtil106.jieQiDapan46(scienceEntityListDaPan);

                boolean flag3280 = FindUtil107.duoTuXiangShangDapan2(scienceEntityListDaPan);
                boolean flag3281 = FindUtil107.shengVDapan2(scienceEntityListDaPan);
                boolean flag3282 = FindUtil107.reset20Dapan2(scienceEntityListDaPan);
                boolean flag3283 = FindUtil107.jieQiDapan3(scienceEntityListDaPan);
                boolean flag3284 = FindUtil107.jishujieqiDapan3(scienceEntityListDaPan);
                boolean flag3285 = FindUtil107.jishujieqiDapan4(scienceEntityListDaPan);
                boolean flag3286 = FindUtil107.jieQiDapan4(scienceEntityListDaPan);
                boolean flag3287 = FindUtil107.duoTuXiangShangDapan3(scienceEntityListDaPan);
                boolean flag3288 = FindUtil107.shengVDapan3(scienceEntityListDaPan);
                boolean flag3289 = FindUtil107.reset20Dapan3(scienceEntityListDaPan);
                boolean flag3290 = FindUtil107.jieQiDapan5(scienceEntityListDaPan);
                boolean flag3291 = FindUtil107.jishujieqiDapan5(scienceEntityListDaPan);
                boolean flag3292 = FindUtil107.jishujieqiDapan6(scienceEntityListDaPan);
                boolean flag3293 = FindUtil107.jishujieqiDapan7(scienceEntityListDaPan);
                boolean flag3294 = FindUtil107.duoTuXiangShangDapan4(scienceEntityListDaPan);
                boolean flag3295 = FindUtil107.shengVDapan4(scienceEntityListDaPan);
                boolean flag3296 = FindUtil107.reset20Dapan4(scienceEntityListDaPan);
                boolean flag3297 = FindUtil107.jieQiDapan6(scienceEntityListDaPan);
                boolean flag3298 = FindUtil107.jishujieqiDapan8(scienceEntityListDaPan);
                boolean flag3299 = FindUtil107.jishujieqiDapan9(scienceEntityListDaPan);
                boolean flag3300 = FindUtil107.jieQiDapan7(scienceEntityListDaPan);
                boolean flag3301 = FindUtil107.jieQiDapan8(scienceEntityListDaPan);
                boolean flag3302 = FindUtil107.jieQiDapan9(scienceEntityListDaPan);
                boolean flag3303 = FindUtil107.jieQiDapan10(scienceEntityListDaPan);
                boolean flag3304 = FindUtil107.jieQiDapan11(scienceEntityListDaPan);
                boolean flag3305 = FindUtil107.jieQiDapan12(scienceEntityListDaPan);
                boolean flag3306 = FindUtil107.jieQiDapan13(scienceEntityListDaPan);
                boolean flag3307 = FindUtil107.jieQiDapan14(scienceEntityListDaPan);
                boolean flag3308 = FindUtil107.jieQiDapan15(scienceEntityListDaPan);
                boolean flag3309 = FindUtil107.jieQiDapan16(scienceEntityListDaPan);
                boolean flag3310 = FindUtil107.jieQiDapan17(scienceEntityListDaPan);
                boolean flag3311 = FindUtil107.jieQiDapan18(scienceEntityListDaPan);
                boolean flag3312 = FindUtil107.jieQiDapan19(scienceEntityListDaPan);
                boolean flag3313 = FindUtil107.jieQiDapan20(scienceEntityListDaPan);
                boolean flag3314 = FindUtil107.jieQiDapan21(scienceEntityListDaPan);
                boolean flag3315 = FindUtil107.jieQiDapan22(scienceEntityListDaPan);
                boolean flag3316 = FindUtil107.jieQiDapan23(scienceEntityListDaPan);
                boolean flag3317 = FindUtil107.jieQiDapan24(scienceEntityListDaPan);
                boolean flag3318 = FindUtil107.jieQiDapan25(scienceEntityListDaPan);
                boolean flag3319 = FindUtil107.jieQiDapan26(scienceEntityListDaPan);
                boolean flag3320 = FindUtil107.jieQiDapan27(scienceEntityListDaPan);
                boolean flag3321 = FindUtil107.jieQiDapan28(scienceEntityListDaPan);
                boolean flag3322 = FindUtil107.jieQiDapan29(scienceEntityListDaPan);
                boolean flag3323 = FindUtil107.jieQiDapan30(scienceEntityListDaPan);
                boolean flag3324 = FindUtil107.jieQiDapan31(scienceEntityListDaPan);
                boolean flag3325 = FindUtil107.jieQiDapan32(scienceEntityListDaPan);
                boolean flag3326 = FindUtil107.jieQiDapan33(scienceEntityListDaPan);
                boolean flag3327 = FindUtil107.jieQiDapan34(scienceEntityListDaPan);
                boolean flag3328 = FindUtil107.jieQiDapan35(scienceEntityListDaPan);
                boolean flag3329 = FindUtil107.jieQiDapan36(scienceEntityListDaPan);
                boolean flag3330 = FindUtil107.jieQiDapan37(scienceEntityListDaPan);
                boolean flag3331 = FindUtil107.jieQiDapan38(scienceEntityListDaPan);
                boolean flag3332 = FindUtil107.jieQiDapan39(scienceEntityListDaPan);
                boolean flag3333 = FindUtil107.jieQiDapan40(scienceEntityListDaPan);
                boolean flag3334 = FindUtil107.jieQiDapan41(scienceEntityListDaPan);
                boolean flag3335 = FindUtil107.jieQiDapan42(scienceEntityListDaPan);
                boolean flag3336 = FindUtil107.jieQiDapan43(scienceEntityListDaPan);
                boolean flag3337 = FindUtil107.jieQiDapan44(scienceEntityListDaPan);
                boolean flag3338 = FindUtil107.jieQiDapan45(scienceEntityListDaPan);
                boolean flag3339 = FindUtil107.jieQiDapan46(scienceEntityListDaPan);

                boolean flag3340 = FindUtil108.duoTuXiangShangDapan2(scienceEntityListDaPan);
                boolean flag3341 = FindUtil108.shengVDapan2(scienceEntityListDaPan);
                boolean flag3342 = FindUtil108.reset20Dapan2(scienceEntityListDaPan);
                boolean flag3343 = FindUtil108.jieQiDapan3(scienceEntityListDaPan);
                boolean flag3344 = FindUtil108.jishujieqiDapan3(scienceEntityListDaPan);
                boolean flag3345 = FindUtil108.jishujieqiDapan4(scienceEntityListDaPan);
                boolean flag3346 = FindUtil108.jieQiDapan4(scienceEntityListDaPan);
                boolean flag3347 = FindUtil108.duoTuXiangShangDapan3(scienceEntityListDaPan);
                boolean flag3348 = FindUtil108.shengVDapan3(scienceEntityListDaPan);
                boolean flag3349 = FindUtil108.reset20Dapan3(scienceEntityListDaPan);
                boolean flag3350 = FindUtil108.jieQiDapan5(scienceEntityListDaPan);
                boolean flag3351 = FindUtil108.jishujieqiDapan5(scienceEntityListDaPan);
                boolean flag3352 = FindUtil108.jishujieqiDapan6(scienceEntityListDaPan);
                boolean flag3353 = FindUtil108.jishujieqiDapan7(scienceEntityListDaPan);
                boolean flag3354 = FindUtil108.duoTuXiangShangDapan4(scienceEntityListDaPan);
                boolean flag3355 = FindUtil108.shengVDapan4(scienceEntityListDaPan);
                boolean flag3356 = FindUtil108.reset20Dapan4(scienceEntityListDaPan);
                boolean flag3357 = FindUtil108.jieQiDapan6(scienceEntityListDaPan);
                boolean flag3358 = FindUtil108.jishujieqiDapan8(scienceEntityListDaPan);
                boolean flag3359 = FindUtil108.jishujieqiDapan9(scienceEntityListDaPan);
                boolean flag3360 = FindUtil108.jieQiDapan7(scienceEntityListDaPan);
                boolean flag3361 = FindUtil108.jieQiDapan8(scienceEntityListDaPan);
                boolean flag3362 = FindUtil108.jieQiDapan9(scienceEntityListDaPan);
                boolean flag3363 = FindUtil108.jieQiDapan10(scienceEntityListDaPan);
                boolean flag3364 = FindUtil108.jieQiDapan11(scienceEntityListDaPan);
                boolean flag3365 = FindUtil108.jieQiDapan12(scienceEntityListDaPan);
                boolean flag3366 = FindUtil108.jieQiDapan13(scienceEntityListDaPan);
                boolean flag3367 = FindUtil108.jieQiDapan14(scienceEntityListDaPan);
                boolean flag3368 = FindUtil108.jieQiDapan15(scienceEntityListDaPan);
                boolean flag3369 = FindUtil108.jieQiDapan16(scienceEntityListDaPan);
                boolean flag3370 = FindUtil108.jieQiDapan17(scienceEntityListDaPan);
                boolean flag3371 = FindUtil108.jieQiDapan18(scienceEntityListDaPan);
                boolean flag3372 = FindUtil108.jieQiDapan19(scienceEntityListDaPan);
                boolean flag3373 = FindUtil108.jieQiDapan20(scienceEntityListDaPan);
                boolean flag3374 = FindUtil108.jieQiDapan21(scienceEntityListDaPan);
                boolean flag3375 = FindUtil108.jieQiDapan22(scienceEntityListDaPan);
                boolean flag3376 = FindUtil108.jieQiDapan23(scienceEntityListDaPan);
                boolean flag3377 = FindUtil108.jieQiDapan24(scienceEntityListDaPan);
                boolean flag3378 = FindUtil108.jieQiDapan25(scienceEntityListDaPan);
                boolean flag3379 = FindUtil108.jieQiDapan26(scienceEntityListDaPan);
                boolean flag3380 = FindUtil108.jieQiDapan27(scienceEntityListDaPan);
                boolean flag3381 = FindUtil108.jieQiDapan28(scienceEntityListDaPan);
                boolean flag3382 = FindUtil108.jieQiDapan29(scienceEntityListDaPan);
                boolean flag3383 = FindUtil108.jieQiDapan30(scienceEntityListDaPan);
                boolean flag3384 = FindUtil108.jieQiDapan31(scienceEntityListDaPan);
                boolean flag3385 = FindUtil108.jieQiDapan32(scienceEntityListDaPan);
                boolean flag3386 = FindUtil108.jieQiDapan33(scienceEntityListDaPan);
                boolean flag3387 = FindUtil108.jieQiDapan34(scienceEntityListDaPan);
                boolean flag3388 = FindUtil108.jieQiDapan35(scienceEntityListDaPan);
                boolean flag3389 = FindUtil108.jieQiDapan36(scienceEntityListDaPan);
                boolean flag3390 = FindUtil108.jieQiDapan37(scienceEntityListDaPan);
                boolean flag3391 = FindUtil108.jieQiDapan38(scienceEntityListDaPan);
                boolean flag3392 = FindUtil108.jieQiDapan39(scienceEntityListDaPan);
                boolean flag3393 = FindUtil108.jieQiDapan40(scienceEntityListDaPan);
                boolean flag3394 = FindUtil108.jieQiDapan41(scienceEntityListDaPan);
                boolean flag3395 = FindUtil108.jieQiDapan42(scienceEntityListDaPan);
                boolean flag3396 = FindUtil108.jieQiDapan43(scienceEntityListDaPan);
                boolean flag3397 = FindUtil108.jieQiDapan44(scienceEntityListDaPan);
                boolean flag3398 = FindUtil108.jieQiDapan45(scienceEntityListDaPan);
                boolean flag3399 = FindUtil108.jieQiDapan46(scienceEntityListDaPan);

                boolean flag3400 = FindUtil109.duoTuXiangShangDapan2(scienceEntityListDaPan);
                boolean flag3401 = FindUtil109.shengVDapan2(scienceEntityListDaPan);
                boolean flag3402 = FindUtil109.reset20Dapan2(scienceEntityListDaPan);
                boolean flag3403 = FindUtil109.jieQiDapan3(scienceEntityListDaPan);
                boolean flag3404 = FindUtil109.jishujieqiDapan3(scienceEntityListDaPan);
                boolean flag3405 = FindUtil109.jishujieqiDapan4(scienceEntityListDaPan);
                boolean flag3406 = FindUtil109.jieQiDapan4(scienceEntityListDaPan);
                boolean flag3407 = FindUtil109.duoTuXiangShangDapan3(scienceEntityListDaPan);
                boolean flag3408 = FindUtil109.shengVDapan3(scienceEntityListDaPan);
                boolean flag3409 = FindUtil109.reset20Dapan3(scienceEntityListDaPan);
                boolean flag3410 = FindUtil109.jieQiDapan5(scienceEntityListDaPan);
                boolean flag3411 = FindUtil109.jishujieqiDapan5(scienceEntityListDaPan);
                boolean flag3412 = FindUtil109.jishujieqiDapan6(scienceEntityListDaPan);
                boolean flag3413 = FindUtil109.jishujieqiDapan7(scienceEntityListDaPan);
                boolean flag3414 = FindUtil109.duoTuXiangShangDapan4(scienceEntityListDaPan);
                boolean flag3415 = FindUtil109.shengVDapan4(scienceEntityListDaPan);
                boolean flag3416 = FindUtil109.reset20Dapan4(scienceEntityListDaPan);
                boolean flag3417 = FindUtil109.jieQiDapan6(scienceEntityListDaPan);
                boolean flag3418 = FindUtil109.jishujieqiDapan8(scienceEntityListDaPan);
                boolean flag3419 = FindUtil109.jishujieqiDapan9(scienceEntityListDaPan);
                boolean flag3420 = FindUtil109.jieQiDapan7(scienceEntityListDaPan);
                boolean flag3421 = FindUtil109.jieQiDapan8(scienceEntityListDaPan);
                boolean flag3422 = FindUtil109.jieQiDapan9(scienceEntityListDaPan);
                boolean flag3423 = FindUtil109.jieQiDapan10(scienceEntityListDaPan);
                boolean flag3424 = FindUtil109.jieQiDapan11(scienceEntityListDaPan);
                boolean flag3425 = FindUtil109.jieQiDapan12(scienceEntityListDaPan);
                boolean flag3426 = FindUtil109.jieQiDapan13(scienceEntityListDaPan);
                boolean flag3427 = FindUtil109.jieQiDapan14(scienceEntityListDaPan);
                boolean flag3428 = FindUtil109.jieQiDapan15(scienceEntityListDaPan);
                boolean flag3429 = FindUtil109.jieQiDapan16(scienceEntityListDaPan);
                boolean flag3430 = FindUtil109.jieQiDapan17(scienceEntityListDaPan);
                boolean flag3431 = FindUtil109.jieQiDapan18(scienceEntityListDaPan);
                boolean flag3432 = FindUtil109.jieQiDapan19(scienceEntityListDaPan);
                boolean flag3433 = FindUtil109.jieQiDapan20(scienceEntityListDaPan);
                boolean flag3434 = FindUtil109.jieQiDapan21(scienceEntityListDaPan);
                boolean flag3435 = FindUtil109.jieQiDapan22(scienceEntityListDaPan);
                boolean flag3436 = FindUtil109.jieQiDapan23(scienceEntityListDaPan);
                boolean flag3437 = FindUtil109.jieQiDapan24(scienceEntityListDaPan);
                boolean flag3438 = FindUtil109.jieQiDapan25(scienceEntityListDaPan);
                boolean flag3439 = FindUtil109.jieQiDapan26(scienceEntityListDaPan);
                boolean flag3440 = FindUtil109.jieQiDapan27(scienceEntityListDaPan);
                boolean flag3441 = FindUtil109.jieQiDapan28(scienceEntityListDaPan);
                boolean flag3442 = FindUtil109.jieQiDapan29(scienceEntityListDaPan);
                boolean flag3443 = FindUtil109.jieQiDapan30(scienceEntityListDaPan);
                boolean flag3444 = FindUtil109.jieQiDapan31(scienceEntityListDaPan);
                boolean flag3445 = FindUtil109.jieQiDapan32(scienceEntityListDaPan);
                boolean flag3446 = FindUtil109.jieQiDapan33(scienceEntityListDaPan);
                boolean flag3447 = FindUtil109.jieQiDapan34(scienceEntityListDaPan);
                boolean flag3448 = FindUtil109.jieQiDapan35(scienceEntityListDaPan);
                boolean flag3449 = FindUtil109.jieQiDapan36(scienceEntityListDaPan);
                boolean flag3450 = FindUtil109.jieQiDapan37(scienceEntityListDaPan);
                boolean flag3451 = FindUtil109.jieQiDapan38(scienceEntityListDaPan);
                boolean flag3452 = FindUtil109.jieQiDapan39(scienceEntityListDaPan);
                boolean flag3453 = FindUtil109.jieQiDapan40(scienceEntityListDaPan);
                boolean flag3454 = FindUtil109.jieQiDapan41(scienceEntityListDaPan);
                boolean flag3455 = FindUtil109.jieQiDapan42(scienceEntityListDaPan);
                boolean flag3456 = FindUtil109.jieQiDapan43(scienceEntityListDaPan);
                boolean flag3457 = FindUtil109.jieQiDapan44(scienceEntityListDaPan);
                boolean flag3458 = FindUtil109.jieQiDapan45(scienceEntityListDaPan);
                boolean flag3459 = FindUtil109.jieQiDapan46(scienceEntityListDaPan);

                boolean flag3460 = FindUtil110.duoTuXiangShangDapan2(scienceEntityListDaPan);
                boolean flag3461 = FindUtil110.shengVDapan2(scienceEntityListDaPan);
                boolean flag3462 = FindUtil110.reset20Dapan2(scienceEntityListDaPan);
                boolean flag3463 = FindUtil110.jieQiDapan3(scienceEntityListDaPan);
                boolean flag3464 = FindUtil110.jishujieqiDapan3(scienceEntityListDaPan);
                boolean flag3465 = FindUtil110.jishujieqiDapan4(scienceEntityListDaPan);
                boolean flag3466 = FindUtil110.jieQiDapan4(scienceEntityListDaPan);
                boolean flag3467 = FindUtil110.duoTuXiangShangDapan3(scienceEntityListDaPan);
                boolean flag3468 = FindUtil110.shengVDapan3(scienceEntityListDaPan);
                boolean flag3469 = FindUtil110.reset20Dapan3(scienceEntityListDaPan);
                boolean flag3470 = FindUtil110.jieQiDapan5(scienceEntityListDaPan);
                boolean flag3471 = FindUtil110.jishujieqiDapan5(scienceEntityListDaPan);
                boolean flag3472 = FindUtil110.jishujieqiDapan6(scienceEntityListDaPan);
                boolean flag3473 = FindUtil110.jishujieqiDapan7(scienceEntityListDaPan);
                boolean flag3474 = FindUtil110.duoTuXiangShangDapan4(scienceEntityListDaPan);
                boolean flag3475 = FindUtil110.shengVDapan4(scienceEntityListDaPan);
                boolean flag3476 = FindUtil110.reset20Dapan4(scienceEntityListDaPan);
                boolean flag3477 = FindUtil110.jieQiDapan6(scienceEntityListDaPan);
                boolean flag3478 = FindUtil110.jishujieqiDapan8(scienceEntityListDaPan);
                boolean flag3479 = FindUtil110.jishujieqiDapan9(scienceEntityListDaPan);
                boolean flag3480 = FindUtil110.jieQiDapan7(scienceEntityListDaPan);
                boolean flag3481 = FindUtil110.jieQiDapan8(scienceEntityListDaPan);
                boolean flag3482 = FindUtil110.jieQiDapan9(scienceEntityListDaPan);
                boolean flag3483 = FindUtil110.jieQiDapan10(scienceEntityListDaPan);


                if (flag3220) {
                    updateYanPan("3220", stockDayVo,stockDayVoList);
                }
                if (flag3221) {
                    updateYanPan("3221", stockDayVo,stockDayVoList);
                }

                if (flag3222) {
                    updateYanPan("3222", stockDayVo,stockDayVoList);
                }
                if (flag3223) {
                    updateYanPan("3223", stockDayVo,stockDayVoList);
                }
                if (flag3224) {
                    updateYanPan("3224", stockDayVo,stockDayVoList);
                }
                if (flag3225) {
                    updateYanPan("3225", stockDayVo,stockDayVoList);
                }
                if (flag3226) {
                    updateYanPan("3226", stockDayVo,stockDayVoList);
                }
                if (flag3227) {
                    updateYanPan("3227", stockDayVo,stockDayVoList);
                }
                if (flag3228) {
                    updateYanPan("3228", stockDayVo,stockDayVoList);
                }
                if (flag3229) {
                    updateYanPan("3229", stockDayVo,stockDayVoList);
                }
                if (flag3230) {
                    updateYanPan("3230", stockDayVo,stockDayVoList);
                }
                if (flag3231) {
                    updateYanPan("3231", stockDayVo,stockDayVoList);
                }
                if (flag3232) {
                    updateYanPan("3232", stockDayVo,stockDayVoList);
                }
                if (flag3233) {
                    updateYanPan("3233", stockDayVo,stockDayVoList);
                }
                if (flag3234) {
                    updateYanPan("3234", stockDayVo,stockDayVoList);
                }

                if (flag3235) {
                    updateYanPan("3235", stockDayVo,stockDayVoList);
                }
                if (flag3236) {
                    updateYanPan("3236", stockDayVo,stockDayVoList);
                }
                if (flag3237) {
                    updateYanPan("3237", stockDayVo,stockDayVoList);
                }
                if (flag3238) {
                    updateYanPan("3238", stockDayVo,stockDayVoList);
                }
                if (flag3239) {
                    updateYanPan("3239", stockDayVo,stockDayVoList);
                }
                if (flag3240) {
                    updateYanPan("3240", stockDayVo,stockDayVoList);
                }
                if (flag3241) {
                    updateYanPan("3241", stockDayVo,stockDayVoList);
                }
                if (flag3242) {
                    updateYanPan("3242", stockDayVo,stockDayVoList);
                }
                if (flag3243) {
                    updateYanPan("3243", stockDayVo,stockDayVoList);
                }
                if (flag3244) {
                    updateYanPan("3244", stockDayVo,stockDayVoList);
                }
                if (flag3245) {
                    updateYanPan("3245", stockDayVo,stockDayVoList);
                }
                if (flag3246) {
                    updateYanPan("3246", stockDayVo,stockDayVoList);
                }
                if (flag3247) {
                    updateYanPan("3247", stockDayVo,stockDayVoList);
                }
                if (flag3248) {
                    updateYanPan("3248", stockDayVo,stockDayVoList);
                }
                if (flag3249) {
                    updateYanPan("3249", stockDayVo,stockDayVoList);
                }
                if (flag3250) {
                    updateYanPan("3250", stockDayVo,stockDayVoList);
                }
                if (flag3251) {
                    updateYanPan("3251", stockDayVo,stockDayVoList);
                }

                if (flag3252) {
                    updateYanPan("3252", stockDayVo,stockDayVoList);
                }
                if (flag3253) {
                    updateYanPan("3253", stockDayVo,stockDayVoList);
                }
                if (flag3254) {
                    updateYanPan("3254", stockDayVo,stockDayVoList);
                }
                if (flag3255) {
                    updateYanPan("3255", stockDayVo,stockDayVoList);
                }
                if (flag3256) {
                    updateYanPan("3256", stockDayVo,stockDayVoList);
                }
                if (flag3257) {
                    updateYanPan("3257", stockDayVo,stockDayVoList);
                }
                if (flag3258) {
                    updateYanPan("3258", stockDayVo,stockDayVoList);
                }
                if (flag3259) {
                    updateYanPan("3259", stockDayVo,stockDayVoList);
                }
                if (flag3260) {
                    updateYanPan("3260", stockDayVo,stockDayVoList);
                }
                if (flag3261) {
                    updateYanPan("3261", stockDayVo,stockDayVoList);
                }
                if (flag3262) {
                    updateYanPan("3262", stockDayVo,stockDayVoList);
                }
                if (flag3263) {
                    updateYanPan("3263", stockDayVo,stockDayVoList);
                }
                if (flag3264) {
                    updateYanPan("3264", stockDayVo,stockDayVoList);
                }

                if (flag3265) {
                    updateYanPan("3265", stockDayVo,stockDayVoList);
                }
                if (flag3266) {
                    updateYanPan("3266", stockDayVo,stockDayVoList);
                }
                if (flag3267) {
                    updateYanPan("3267", stockDayVo,stockDayVoList);
                }
                if (flag3268) {
                    updateYanPan("3268", stockDayVo,stockDayVoList);
                }
                if (flag3269) {
                    updateYanPan("3269", stockDayVo,stockDayVoList);
                }
                if (flag3270) {
                    updateYanPan("3270", stockDayVo,stockDayVoList);
                }
                if (flag3271) {
                    updateYanPan("3271", stockDayVo,stockDayVoList);
                }
                if (flag3272) {
                    updateYanPan("3272", stockDayVo,stockDayVoList);
                }
                if (flag3273) {
                    updateYanPan("3273", stockDayVo,stockDayVoList);
                }
                if (flag3274) {
                    updateYanPan("3274", stockDayVo,stockDayVoList);
                }
                if (flag3275) {
                    updateYanPan("3275", stockDayVo,stockDayVoList);
                }
                if (flag3276) {
                    updateYanPan("3276", stockDayVo,stockDayVoList);
                }
                if (flag3277) {
                    updateYanPan("3277", stockDayVo,stockDayVoList);
                }
                if (flag3278) {
                    updateYanPan("3278", stockDayVo,stockDayVoList);
                }
                if (flag3279) {
                    updateYanPan("3279", stockDayVo,stockDayVoList);
                }
                if (flag3280) {
                    updateYanPan("3280", stockDayVo,stockDayVoList);
                }
                if (flag3281) {
                    updateYanPan("3281", stockDayVo,stockDayVoList);
                }
                if (flag3282) {
                    updateYanPan("3282", stockDayVo,stockDayVoList);
                }
                if (flag3283) {
                    updateYanPan("3283", stockDayVo,stockDayVoList);
                }
                if (flag3284) {
                    updateYanPan("3284", stockDayVo,stockDayVoList);
                }
                if (flag3285) {
                    updateYanPan("3285", stockDayVo,stockDayVoList);
                }
                if (flag3286) {
                    updateYanPan("3286", stockDayVo,stockDayVoList);
                }
                if (flag3287) {
                    updateYanPan("3287", stockDayVo,stockDayVoList);
                }
                if (flag3288) {
                    updateYanPan("3288", stockDayVo,stockDayVoList);
                }
                if (flag3289) {
                    updateYanPan("3289", stockDayVo,stockDayVoList);
                }
                if (flag3290) {
                    updateYanPan("3290", stockDayVo,stockDayVoList);
                }
                if (flag3291) {
                    updateYanPan("3291", stockDayVo,stockDayVoList);
                }
                if (flag3292) {
                    updateYanPan("3292", stockDayVo,stockDayVoList);
                }
                if (flag3293) {
                    updateYanPan("3293", stockDayVo,stockDayVoList);
                }
                if (flag3294) {
                    updateYanPan("3294", stockDayVo,stockDayVoList);
                }
                if (flag3295) {
                    updateYanPan("3295", stockDayVo,stockDayVoList);
                }

                if (flag3296) {
                    updateYanPan("3296", stockDayVo,stockDayVoList);
                }
                if (flag3297) {
                    updateYanPan("3297", stockDayVo,stockDayVoList);
                }
                if (flag3298) {
                    updateYanPan("3298", stockDayVo,stockDayVoList);
                }
                if (flag3299) {
                    updateYanPan("3299", stockDayVo,stockDayVoList);
                }
                if (flag3300) {
                    updateYanPan("3300", stockDayVo,stockDayVoList);
                }
                if (flag3301) {
                    updateYanPan("3301", stockDayVo,stockDayVoList);
                }
                if (flag3302) {
                    updateYanPan("3302", stockDayVo,stockDayVoList);
                }
                if (flag3303) {
                    updateYanPan("3303", stockDayVo,stockDayVoList);
                }
                if (flag3304) {
                    updateYanPan("3304", stockDayVo,stockDayVoList);
                }
                if (flag3305) {
                    updateYanPan("3305", stockDayVo,stockDayVoList);
                }
                if (flag3306) {
                    updateYanPan("3306", stockDayVo,stockDayVoList);
                }
                if (flag3307) {
                    updateYanPan("3307", stockDayVo,stockDayVoList);
                }
                if (flag3308) {
                    updateYanPan("3308", stockDayVo,stockDayVoList);
                }

                if (flag3309) {
                    updateYanPan("3309", stockDayVo,stockDayVoList);
                }
                if (flag3310) {
                    updateYanPan("3310", stockDayVo,stockDayVoList);
                }
                if (flag3311) {
                    updateYanPan("3311", stockDayVo,stockDayVoList);
                }
                if (flag3312) {
                    updateYanPan("3312", stockDayVo,stockDayVoList);
                }
                if (flag3313) {
                    updateYanPan("3313", stockDayVo,stockDayVoList);
                }
                if (flag3314) {
                    updateYanPan("3314", stockDayVo,stockDayVoList);
                }
                if (flag3315) {
                    updateYanPan("3315", stockDayVo,stockDayVoList);
                }
                if (flag3316) {
                    updateYanPan("3316", stockDayVo,stockDayVoList);
                }
                if (flag3317) {
                    updateYanPan("3317", stockDayVo,stockDayVoList);
                }
                if (flag3318) {
                    updateYanPan("3318", stockDayVo,stockDayVoList);
                }
                if (flag3319) {
                    updateYanPan("3319", stockDayVo,stockDayVoList);
                }
                if (flag3320) {
                    updateYanPan("3320", stockDayVo,stockDayVoList);
                }
                if (flag3321) {
                    updateYanPan("3321", stockDayVo,stockDayVoList);
                }

                if (flag3322) {
                    updateYanPan("3322", stockDayVo,stockDayVoList);
                }
                if (flag3323) {
                    updateYanPan("3323", stockDayVo,stockDayVoList);
                }
                if (flag3324) {
                    updateYanPan("3324", stockDayVo,stockDayVoList);
                }
                if (flag3325) {
                    updateYanPan("3325", stockDayVo,stockDayVoList);
                }
                if (flag3326) {
                    updateYanPan("3326", stockDayVo,stockDayVoList);
                }
                if (flag3327) {
                    updateYanPan("3327", stockDayVo,stockDayVoList);
                }
                if (flag3328) {
                    updateYanPan("3328", stockDayVo,stockDayVoList);
                }
                if (flag3329) {
                    updateYanPan("3329", stockDayVo,stockDayVoList);
                }
                if (flag3330) {
                    updateYanPan("3330", stockDayVo,stockDayVoList);
                }
                if (flag3331) {
                    updateYanPan("3331", stockDayVo,stockDayVoList);
                }
                if (flag3332) {
                    updateYanPan("3332", stockDayVo,stockDayVoList);
                }
                if (flag3333) {
                    updateYanPan("3333", stockDayVo,stockDayVoList);
                }
                if (flag3334) {
                    updateYanPan("3334", stockDayVo,stockDayVoList);
                }

                if (flag3335) {
                    updateYanPan("3335", stockDayVo,stockDayVoList);
                }
                if (flag3336) {
                    updateYanPan("3336", stockDayVo,stockDayVoList);
                }
                if (flag3337) {
                    updateYanPan("3337", stockDayVo,stockDayVoList);
                }
                if (flag3338) {
                    updateYanPan("3338", stockDayVo,stockDayVoList);
                }
                if (flag3339) {
                    updateYanPan("3339", stockDayVo,stockDayVoList);
                }
                if (flag3340) {
                    updateYanPan("3340", stockDayVo,stockDayVoList);
                }
                if (flag3341) {
                    updateYanPan("3341", stockDayVo,stockDayVoList);
                }
                if (flag3342) {
                    updateYanPan("3342", stockDayVo,stockDayVoList);
                }
                if (flag3343) {
                    updateYanPan("3343", stockDayVo,stockDayVoList);
                }
                if (flag3344) {
                    updateYanPan("3344", stockDayVo,stockDayVoList);
                }
                if (flag3345) {
                    updateYanPan("3345", stockDayVo,stockDayVoList);
                }
                if (flag3346) {
                    updateYanPan("3346", stockDayVo,stockDayVoList);
                }
                if (flag3347) {
                    updateYanPan("3347", stockDayVo,stockDayVoList);
                }
                if (flag3348) {
                    updateYanPan("3348", stockDayVo,stockDayVoList);
                }
                if (flag3349) {
                    updateYanPan("3349", stockDayVo,stockDayVoList);
                }
                if (flag3350) {
                    updateYanPan("3350", stockDayVo,stockDayVoList);
                }
                if (flag3351) {
                    updateYanPan("3351", stockDayVo,stockDayVoList);
                }

                if (flag3352) {
                    updateYanPan("3352", stockDayVo,stockDayVoList);
                }
                if (flag3353) {
                    updateYanPan("3353", stockDayVo,stockDayVoList);
                }
                if (flag3354) {
                    updateYanPan("3354", stockDayVo,stockDayVoList);
                }
                if (flag3355) {
                    updateYanPan("3355", stockDayVo,stockDayVoList);
                }
                if (flag3356) {
                    updateYanPan("3356", stockDayVo,stockDayVoList);
                }
                if (flag3357) {
                    updateYanPan("3357", stockDayVo,stockDayVoList);
                }
                if (flag3358) {
                    updateYanPan("3358", stockDayVo,stockDayVoList);
                }
                if (flag3359) {
                    updateYanPan("3359", stockDayVo,stockDayVoList);
                }
                if (flag3360) {
                    updateYanPan("3360", stockDayVo,stockDayVoList);
                }
                if (flag3361) {
                    updateYanPan("3361", stockDayVo,stockDayVoList);
                }
                if (flag3362) {
                    updateYanPan("3362", stockDayVo,stockDayVoList);
                }
                if (flag3363) {
                    updateYanPan("3363", stockDayVo,stockDayVoList);
                }
                if (flag3364) {
                    updateYanPan("3364", stockDayVo,stockDayVoList);
                }

                if (flag3365) {
                    updateYanPan("3365", stockDayVo,stockDayVoList);
                }
                if (flag3366) {
                    updateYanPan("3366", stockDayVo,stockDayVoList);
                }
                if (flag3367) {
                    updateYanPan("3367", stockDayVo,stockDayVoList);
                }
                if (flag3368) {
                    updateYanPan("3368", stockDayVo,stockDayVoList);
                }
                if (flag3369) {
                    updateYanPan("3369", stockDayVo,stockDayVoList);
                }
                if (flag3370) {
                    updateYanPan("3370", stockDayVo,stockDayVoList);
                }
                if (flag3371) {
                    updateYanPan("3371", stockDayVo,stockDayVoList);
                }
                if (flag3372) {
                    updateYanPan("3372", stockDayVo,stockDayVoList);
                }
                if (flag3373) {
                    updateYanPan("3373", stockDayVo,stockDayVoList);
                }
                if (flag3374) {
                    updateYanPan("3374", stockDayVo,stockDayVoList);
                }
                if (flag3375) {
                    updateYanPan("3375", stockDayVo,stockDayVoList);
                }
                if (flag3376) {
                    updateYanPan("3376", stockDayVo,stockDayVoList);
                }
                if (flag3377) {
                    updateYanPan("3377", stockDayVo,stockDayVoList);
                }
                if (flag3378) {
                    updateYanPan("3378", stockDayVo,stockDayVoList);
                }
                if (flag3379) {
                    updateYanPan("3379", stockDayVo,stockDayVoList);
                }

                if (flag3380) {
                    updateYanPan("3380", stockDayVo,stockDayVoList);
                }
                if (flag3381) {
                    updateYanPan("3381", stockDayVo,stockDayVoList);
                }
                if (flag3382) {
                    updateYanPan("3382", stockDayVo,stockDayVoList);
                }
                if (flag3383) {
                    updateYanPan("3383", stockDayVo,stockDayVoList);
                }
                if (flag3384) {
                    updateYanPan("3384", stockDayVo,stockDayVoList);
                }
                if (flag3385) {
                    updateYanPan("3385", stockDayVo,stockDayVoList);
                }
                if (flag3386) {
                    updateYanPan("3386", stockDayVo,stockDayVoList);
                }
                if (flag3387) {
                    updateYanPan("3387", stockDayVo,stockDayVoList);
                }
                if (flag3388) {
                    updateYanPan("3388", stockDayVo,stockDayVoList);
                }
                if (flag3389) {
                    updateYanPan("3389", stockDayVo,stockDayVoList);
                }
                if (flag3390) {
                    updateYanPan("3390", stockDayVo,stockDayVoList);
                }
                if (flag3391) {
                    updateYanPan("3391", stockDayVo,stockDayVoList);
                }

                if (flag3392) {
                    updateYanPan("3392", stockDayVo,stockDayVoList);
                }
                if (flag3393) {
                    updateYanPan("3393", stockDayVo,stockDayVoList);
                }
                if (flag3394) {
                    updateYanPan("3394", stockDayVo,stockDayVoList);
                }
                if (flag3395) {
                    updateYanPan("3395", stockDayVo,stockDayVoList);
                }
                if (flag3396) {
                    updateYanPan("3396", stockDayVo,stockDayVoList);
                }
                if (flag3397) {
                    updateYanPan("3397", stockDayVo,stockDayVoList);
                }
                if (flag3398) {
                    updateYanPan("3398", stockDayVo,stockDayVoList);
                }
                if (flag3399) {
                    updateYanPan("3399", stockDayVo,stockDayVoList);
                }
                if (flag3400) {
                    updateYanPan("3400", stockDayVo,stockDayVoList);
                }
                if (flag3401) {
                    updateYanPan("3401", stockDayVo,stockDayVoList);
                }
                if (flag3402) {
                    updateYanPan("3402", stockDayVo,stockDayVoList);
                }
                if (flag3403) {
                    updateYanPan("3403", stockDayVo,stockDayVoList);
                }
                if (flag3404) {
                    updateYanPan("3404", stockDayVo,stockDayVoList);
                }

                if (flag3405) {
                    updateYanPan("3405", stockDayVo,stockDayVoList);
                }
                if (flag3406) {
                    updateYanPan("3406", stockDayVo,stockDayVoList);
                }
                if (flag3407) {
                    updateYanPan("3407", stockDayVo,stockDayVoList);
                }
                if (flag3408) {
                    updateYanPan("3408", stockDayVo,stockDayVoList);
                }
                if (flag3409) {
                    updateYanPan("3409", stockDayVo,stockDayVoList);
                }
                if (flag3410) {
                    updateYanPan("3410", stockDayVo,stockDayVoList);
                }
                if (flag3411) {
                    updateYanPan("3411", stockDayVo,stockDayVoList);
                }
                if (flag3412) {
                    updateYanPan("3412", stockDayVo,stockDayVoList);
                }
                if (flag3413) {
                    updateYanPan("3413", stockDayVo,stockDayVoList);
                }
                if (flag3414) {
                    updateYanPan("3414", stockDayVo,stockDayVoList);
                }
                if (flag3415) {
                    updateYanPan("3415", stockDayVo,stockDayVoList);
                }
                if (flag3416) {
                    updateYanPan("3416", stockDayVo,stockDayVoList);
                }
                if (flag3417) {
                    updateYanPan("3417", stockDayVo,stockDayVoList);
                }
                if (flag3418) {
                    updateYanPan("3418", stockDayVo,stockDayVoList);
                }
                if (flag3419) {
                    updateYanPan("3419", stockDayVo,stockDayVoList);
                }
                if (flag3420) {
                    updateYanPan("3420", stockDayVo,stockDayVoList);
                }
                if (flag3421) {
                    updateYanPan("3421", stockDayVo,stockDayVoList);
                }
                if (flag3422) {
                    updateYanPan("3422", stockDayVo,stockDayVoList);
                }
                if (flag3423) {
                    updateYanPan("3423", stockDayVo,stockDayVoList);
                }
                if (flag3424) {
                    updateYanPan("3424", stockDayVo,stockDayVoList);
                }
                if (flag3425) {
                    updateYanPan("3425", stockDayVo,stockDayVoList);
                }
                if (flag3426) {
                    updateYanPan("3426", stockDayVo,stockDayVoList);
                }
                if (flag3427) {
                    updateYanPan("3427", stockDayVo,stockDayVoList);
                }
                if (flag3428) {
                    updateYanPan("3428", stockDayVo,stockDayVoList);
                }
                if (flag3429) {
                    updateYanPan("3429", stockDayVo,stockDayVoList);
                }
                if (flag3430) {
                    updateYanPan("3430", stockDayVo,stockDayVoList);
                }
                if (flag3431) {
                    updateYanPan("3431", stockDayVo,stockDayVoList);
                }
                if (flag3432) {
                    updateYanPan("3432", stockDayVo,stockDayVoList);
                }
                if (flag3433) {
                    updateYanPan("3433", stockDayVo,stockDayVoList);
                }
                if (flag3434) {
                    updateYanPan("3434", stockDayVo,stockDayVoList);
                }
                if (flag3435) {
                    updateYanPan("3435", stockDayVo,stockDayVoList);
                }

                if (flag3436) {
                    updateYanPan("3436", stockDayVo,stockDayVoList);
                }
                if (flag3437) {
                    updateYanPan("3437", stockDayVo,stockDayVoList);
                }
                if (flag3438) {
                    updateYanPan("3438", stockDayVo,stockDayVoList);
                }
                if (flag3439) {
                    updateYanPan("3439", stockDayVo,stockDayVoList);
                }
                if (flag3440) {
                    updateYanPan("3440", stockDayVo,stockDayVoList);
                }
                if (flag3441) {
                    updateYanPan("3441", stockDayVo,stockDayVoList);
                }
                if (flag3442) {
                    updateYanPan("3442", stockDayVo,stockDayVoList);
                }
                if (flag3443) {
                    updateYanPan("3443", stockDayVo,stockDayVoList);
                }
                if (flag3444) {
                    updateYanPan("3444", stockDayVo,stockDayVoList);
                }
                if (flag3445) {
                    updateYanPan("3445", stockDayVo,stockDayVoList);
                }
                if (flag3446) {
                    updateYanPan("3446", stockDayVo,stockDayVoList);
                }
                if (flag3447) {
                    updateYanPan("3447", stockDayVo,stockDayVoList);
                }
                if (flag3448) {
                    updateYanPan("3448", stockDayVo,stockDayVoList);
                }

                if (flag3449) {
                    updateYanPan("3449", stockDayVo,stockDayVoList);
                }
                if (flag3450) {
                    updateYanPan("3450", stockDayVo,stockDayVoList);
                }
                if (flag3451) {
                    updateYanPan("3451", stockDayVo,stockDayVoList);
                }
                if (flag3452) {
                    updateYanPan("3452", stockDayVo,stockDayVoList);
                }
                if (flag3453) {
                    updateYanPan("3453", stockDayVo,stockDayVoList);
                }
                if (flag3454) {
                    updateYanPan("3454", stockDayVo,stockDayVoList);
                }
                if (flag3455) {
                    updateYanPan("3455", stockDayVo,stockDayVoList);
                }
                if (flag3456) {
                    updateYanPan("3456", stockDayVo,stockDayVoList);
                }
                if (flag3457) {
                    updateYanPan("3457", stockDayVo,stockDayVoList);
                }
                if (flag3458) {
                    updateYanPan("3458", stockDayVo,stockDayVoList);
                }
                if (flag3459) {
                    updateYanPan("3459", stockDayVo,stockDayVoList);
                }
                if (flag3460) {
                    updateYanPan("3460", stockDayVo,stockDayVoList);
                }
                if (flag3461) {
                    updateYanPan("3461", stockDayVo,stockDayVoList);
                }

                if (flag3462) {
                    updateYanPan("3462", stockDayVo,stockDayVoList);
                }
                if (flag3463) {
                    updateYanPan("3463", stockDayVo,stockDayVoList);
                }
                if (flag3464) {
                    updateYanPan("3464", stockDayVo,stockDayVoList);
                }
                if (flag3465) {
                    updateYanPan("3465", stockDayVo,stockDayVoList);
                }
                if (flag3466) {
                    updateYanPan("3466", stockDayVo,stockDayVoList);
                }
                if (flag3467) {
                    updateYanPan("3467", stockDayVo,stockDayVoList);
                }
                if (flag3468) {
                    updateYanPan("3468", stockDayVo,stockDayVoList);
                }
                if (flag3469) {
                    updateYanPan("3469", stockDayVo,stockDayVoList);
                }
                if (flag3470) {
                    updateYanPan("3470", stockDayVo,stockDayVoList);
                }
                if (flag3471) {
                    updateYanPan("3471", stockDayVo,stockDayVoList);
                }
                if (flag3472) {
                    updateYanPan("3472", stockDayVo,stockDayVoList);
                }
                if (flag3473) {
                    updateYanPan("3473", stockDayVo,stockDayVoList);
                }
                if (flag3474) {
                    updateYanPan("3474", stockDayVo,stockDayVoList);
                }

                if (flag3475) {
                    updateYanPan("3475", stockDayVo,stockDayVoList);
                }
                if (flag3476) {
                    updateYanPan("3476", stockDayVo,stockDayVoList);
                }
                if (flag3477) {
                    updateYanPan("3477", stockDayVo,stockDayVoList);
                }
                if (flag3478) {
                    updateYanPan("3478", stockDayVo,stockDayVoList);
                }
                if (flag3479) {
                    updateYanPan("3479", stockDayVo,stockDayVoList);
                }
                if (flag3480) {
                    updateYanPan("3480", stockDayVo,stockDayVoList);
                }
                if (flag3481) {
                    updateYanPan("3481", stockDayVo,stockDayVoList);
                }
                if (flag3482) {
                    updateYanPan("3482", stockDayVo,stockDayVoList);
                }
                if (flag3483) {
                    updateYanPan("3483", stockDayVo,stockDayVoList);
                }

                return stockDayVoList;
            }
        }
        return stockDayVoList;
    }

    private void updateYanPan(String id,StockDayVo stockDayVo,List<StockDayVo> stockDayVoList) {
        StockDayYanPan1 stockDayYanPan1 = stockDayYanPan1Service.getById(id);
        stockDayVo.setShangZhangMa1(stockDayYanPan1.getShangZhangMa1().toString());
        stockDayVo.setShangZhangRate1(stockDayYanPan1.getShangZhangRate1().toString());
        stockDayVo.setShangZhangMa2(stockDayYanPan1.getShangZhangMa2().toString());
        stockDayVo.setShangZhangRate2(stockDayYanPan1.getShangZhangRate2().toString());
        stockDayVo.setShangZhangMa3(stockDayYanPan1.getShangZhangMa3().toString());
        stockDayVo.setShangZhangRate3(stockDayYanPan1.getShangZhangRate3().toString());
        stockDayVo.setShangZhangMa5(stockDayYanPan1.getShangZhangMa5().toString());
        stockDayVo.setShangZhangRate5(stockDayYanPan1.getShangZhangRate5().toString());
        stockDayVo.setShangZhangMa8(stockDayYanPan1.getShangZhangMa8().toString());
        stockDayVo.setShangZhangRate8(stockDayYanPan1.getShangZhangRate8().toString());
        stockDayVo.setShangZhangMa13(stockDayYanPan1.getShangZhangMa13().toString());
        stockDayVo.setShangZhangRate13(stockDayYanPan1.getShangZhangRate13().toString());
        stockDayVo.setShangZhangMa20(stockDayYanPan1.getShangZhangMa20().toString());
        stockDayVo.setShangZhangRate20(stockDayYanPan1.getShangZhangRate20().toString());
        stockDayVoList.add(stockDayVo);
    }

}
