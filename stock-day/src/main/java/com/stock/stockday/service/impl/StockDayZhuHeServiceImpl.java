//package com.stock.stockday.service.impl;
//
//import com.stock.stockday.entity.StockCode;
//import com.stock.stockday.entity.StockDay0000;
//import com.stock.stockday.entity.StockDay399;
//import com.stock.stockday.service.StockCodeService;
//import com.stock.stockday.service.StockDay0000Service;
//import com.stock.stockday.service.StockDay399Service;
//import com.stock.stockday.service.StockDayZhuHeService;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0000Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0001Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0002Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0003Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0004Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0005Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0006Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0007Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0008Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0009Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan001Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0020Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0021Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0022Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0023Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0024Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0025Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0026Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0027Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan0028Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan3000Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan3001Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan3002Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan3003Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan3004Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan3005Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6000Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6001Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6002Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6003Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6004Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6005Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6006Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6007Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6008Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6009Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6010Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6011Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6012Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6013Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6014Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6015Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6016Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6017Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6018Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan6019Function;
//import com.stock.stockday.service.saveBenPan.DaySaveFileBenPan603Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0000Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0001Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0002Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0003Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0004Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0005Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0006Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0007Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0008Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0009Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing001Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0020Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0021Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0022Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0023Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0024Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0025Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0026Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0027Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing0028Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing3000Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing3001Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing3002Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing3003Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing3004Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing3005Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6000Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6001Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6002Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6003Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6004Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6005Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6006Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6007Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6008Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6009Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6010Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6011Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6012Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6013Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6014Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6015Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6016Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6017Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6018Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing6019Function;
//import com.stock.stockday.service.saveFileChunTuXing.DaySaveFileChunTuXing603Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0000Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0001Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0002Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0003Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0004Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0005Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0006Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0007Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0008Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0009Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan001Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0020Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0021Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0022Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0023Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0024Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0025Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0026Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0027Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan0028Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan3000Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan3001Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan3002Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan3003Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan3004Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan3005Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6000Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6001Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6002Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6003Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6004Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6005Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6006Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6007Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6008Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6009Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6010Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6011Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6012Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6013Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6014Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6015Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6016Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6017Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6018Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan6019Function;
//import com.stock.stockday.service.saveFileDaPan.DaySavaFileDaPan603Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0000Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0001Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0002Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0003Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0004Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0005Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0006Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0007Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0008Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0009Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu001Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0020Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0021Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0022Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0023Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0024Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0025Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0026Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0027Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu0028Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu3000Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu3001Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu3002Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu3003Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu3004Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu3005Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6000Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6001Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6002Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6003Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6004Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6005Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6006Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6007Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6008Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6009Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6010Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6011Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6012Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6013Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6014Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6015Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6016Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6017Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6018Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu6019Function;
//import com.stock.stockday.service.svaeFileChunJiShu.DaySaveFileChunJiShu603Function;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.util.List;
//
//@Service
//public class StockDayZhuHeServiceImpl implements StockDayZhuHeService {
//    @Autowired
//    private StockCodeService stockCodeService;
//    @Autowired
//    private StockDay0000Service stockDay0000Service;
//    @Autowired
//    private StockDay399Service stockDay399Service;
//    @Autowired
//    private DaySaveFileBenPan0000Function daySaveFileBenPan0000Function;
//    @Autowired
//    private DaySaveFileBenPan0001Function daySaveFileBenPan0001Function;
//    @Autowired
//    private DaySaveFileBenPan0002Function daySaveFileBenPan0002Function;
//    @Autowired
//    private DaySaveFileBenPan0003Function daySaveFileBenPan0003Function;
//    @Autowired
//    private DaySaveFileBenPan0004Function daySaveFileBenPan0004Function;
//    @Autowired
//    private DaySaveFileBenPan0005Function daySaveFileBenPan0005Function;
//    @Autowired
//    private DaySaveFileBenPan0006Function daySaveFileBenPan0006Function;
//    @Autowired
//    private DaySaveFileBenPan0007Function daySaveFileBenPan0007Function;
//    @Autowired
//    private DaySaveFileBenPan0008Function daySaveFileBenPan0008Function;
//    @Autowired
//    private DaySaveFileBenPan0009Function daySaveFileBenPan0009Function;
//    @Autowired
//    private DaySaveFileBenPan0020Function daySaveFileBenPan0020Function;
//    @Autowired
//    private DaySaveFileBenPan0021Function daySaveFileBenPan0021Function;
//    @Autowired
//    private DaySaveFileBenPan0022Function daySaveFileBenPan0022Function;
//    @Autowired
//    private DaySaveFileBenPan0023Function daySaveFileBenPan0023Function;
//    @Autowired
//    private DaySaveFileBenPan0024Function daySaveFileBenPan0024Function;
//    @Autowired
//    private DaySaveFileBenPan0025Function daySaveFileBenPan0025Function;
//    @Autowired
//    private DaySaveFileBenPan0026Function daySaveFileBenPan0026Function;
//    @Autowired
//    private DaySaveFileBenPan0027Function daySaveFileBenPan0027Function;
//    @Autowired
//    private DaySaveFileBenPan0028Function daySaveFileBenPan0028Function;
//    @Autowired
//    private DaySaveFileBenPan3000Function daySaveFileBenPan3000Function;
//    @Autowired
//    private DaySaveFileBenPan3001Function daySaveFileBenPan3001Function;
//    @Autowired
//    private DaySaveFileBenPan3002Function daySaveFileBenPan3002Function;
//    @Autowired
//    private DaySaveFileBenPan3003Function daySaveFileBenPan3003Function;
//    @Autowired
//    private DaySaveFileBenPan3004Function daySaveFileBenPan3004Function;
//    @Autowired
//    private DaySaveFileBenPan3005Function daySaveFileBenPan3005Function;
//    @Autowired
//    private DaySaveFileBenPan6000Function daySaveFileBenPan6000Function;
//    @Autowired
//    private DaySaveFileBenPan6001Function daySaveFileBenPan6001Function;
//    @Autowired
//    private DaySaveFileBenPan6002Function daySaveFileBenPan6002Function;
//    @Autowired
//    private DaySaveFileBenPan6003Function daySaveFileBenPan6003Function;
//    @Autowired
//    private DaySaveFileBenPan6004Function daySaveFileBenPan6004Function;
//    @Autowired
//    private DaySaveFileBenPan6005Function daySaveFileBenPan6005Function;
//    @Autowired
//    private DaySaveFileBenPan6006Function daySaveFileBenPan6006Function;
//    @Autowired
//    private DaySaveFileBenPan6007Function daySaveFileBenPan6007Function;
//    @Autowired
//    private DaySaveFileBenPan6008Function daySaveFileBenPan6008Function;
//    @Autowired
//    private DaySaveFileBenPan6009Function daySaveFileBenPan6009Function;
//    @Autowired
//    private DaySaveFileBenPan6010Function daySaveFileBenPan6010Function;
//    @Autowired
//    private DaySaveFileBenPan6011Function daySaveFileBenPan6011Function;
//    @Autowired
//    private DaySaveFileBenPan6012Function daySaveFileBenPan6012Function;
//    @Autowired
//    private DaySaveFileBenPan6013Function daySaveFileBenPan6013Function;
//    @Autowired
//    private DaySaveFileBenPan6014Function daySaveFileBenPan6014Function;
//    @Autowired
//    private DaySaveFileBenPan6015Function daySaveFileBenPan6015Function;
//    @Autowired
//    private DaySaveFileBenPan6016Function daySaveFileBenPan6016Function;
//    @Autowired
//    private DaySaveFileBenPan6017Function daySaveFileBenPan6017Function;
//    @Autowired
//    private DaySaveFileBenPan6018Function daySaveFileBenPan6018Function;
//    @Autowired
//    private DaySaveFileBenPan6019Function daySaveFileBenPan6019Function;
//    @Autowired
//    private DaySaveFileBenPan603Function daySaveFileBenPan603Function;
//    @Autowired
//    private DaySaveFileBenPan001Function daySaveFileBenPan001Function;
//    @Autowired
//    private DaySavaFileDaPan0000Function daySaveFileDaPan0000Function;
//    @Autowired
//    private DaySavaFileDaPan0001Function daySaveFileDaPan0001Function;
//    @Autowired
//    private DaySavaFileDaPan0002Function daySaveFileDaPan0002Function;
//    @Autowired
//    private DaySavaFileDaPan0003Function daySaveFileDaPan0003Function;
//    @Autowired
//    private DaySavaFileDaPan0004Function daySaveFileDaPan0004Function;
//    @Autowired
//    private DaySavaFileDaPan0005Function daySaveFileDaPan0005Function;
//    @Autowired
//    private DaySavaFileDaPan0006Function daySaveFileDaPan0006Function;
//    @Autowired
//    private DaySavaFileDaPan0007Function daySaveFileDaPan0007Function;
//    @Autowired
//    private DaySavaFileDaPan0008Function daySaveFileDaPan0008Function;
//    @Autowired
//    private DaySavaFileDaPan0009Function daySaveFileDaPan0009Function;
//    @Autowired
//    private DaySavaFileDaPan0020Function daySaveFileDaPan0020Function;
//    @Autowired
//    private DaySavaFileDaPan0021Function daySaveFileDaPan0021Function;
//    @Autowired
//    private DaySavaFileDaPan0022Function daySaveFileDaPan0022Function;
//    @Autowired
//    private DaySavaFileDaPan0023Function daySaveFileDaPan0023Function;
//    @Autowired
//    private DaySavaFileDaPan0024Function daySaveFileDaPan0024Function;
//    @Autowired
//    private DaySavaFileDaPan0025Function daySaveFileDaPan0025Function;
//    @Autowired
//    private DaySavaFileDaPan0026Function daySaveFileDaPan0026Function;
//    @Autowired
//    private DaySavaFileDaPan0027Function daySaveFileDaPan0027Function;
//    @Autowired
//    private DaySavaFileDaPan0028Function daySaveFileDaPan0028Function;
//    @Autowired
//    private DaySavaFileDaPan3000Function daySaveFileDaPan3000Function;
//    @Autowired
//    private DaySavaFileDaPan3001Function daySaveFileDaPan3001Function;
//    @Autowired
//    private DaySavaFileDaPan3002Function daySaveFileDaPan3002Function;
//    @Autowired
//    private DaySavaFileDaPan3003Function daySaveFileDaPan3003Function;
//    @Autowired
//    private DaySavaFileDaPan3004Function daySaveFileDaPan3004Function;
//    @Autowired
//    private DaySavaFileDaPan3005Function daySaveFileDaPan3005Function;
//    @Autowired
//    private DaySavaFileDaPan6000Function daySaveFileDaPan6000Function;
//    @Autowired
//    private DaySavaFileDaPan6001Function daySaveFileDaPan6001Function;
//    @Autowired
//    private DaySavaFileDaPan6002Function daySaveFileDaPan6002Function;
//    @Autowired
//    private DaySavaFileDaPan6003Function daySaveFileDaPan6003Function;
//    @Autowired
//    private DaySavaFileDaPan6004Function daySaveFileDaPan6004Function;
//    @Autowired
//    private DaySavaFileDaPan6005Function daySaveFileDaPan6005Function;
//    @Autowired
//    private DaySavaFileDaPan6006Function daySaveFileDaPan6006Function;
//    @Autowired
//    private DaySavaFileDaPan6007Function daySaveFileDaPan6007Function;
//    @Autowired
//    private DaySavaFileDaPan6008Function daySaveFileDaPan6008Function;
//    @Autowired
//    private DaySavaFileDaPan6009Function daySaveFileDaPan6009Function;
//    @Autowired
//    private DaySavaFileDaPan6010Function daySaveFileDaPan6010Function;
//    @Autowired
//    private DaySavaFileDaPan6011Function daySaveFileDaPan6011Function;
//    @Autowired
//    private DaySavaFileDaPan6012Function daySaveFileDaPan6012Function;
//    @Autowired
//    private DaySavaFileDaPan6013Function daySaveFileDaPan6013Function;
//    @Autowired
//    private DaySavaFileDaPan6014Function daySaveFileDaPan6014Function;
//    @Autowired
//    private DaySavaFileDaPan6015Function daySaveFileDaPan6015Function;
//    @Autowired
//    private DaySavaFileDaPan6016Function daySaveFileDaPan6016Function;
//    @Autowired
//    private DaySavaFileDaPan6017Function daySaveFileDaPan6017Function;
//    @Autowired
//    private DaySavaFileDaPan6018Function daySaveFileDaPan6018Function;
//    @Autowired
//    private DaySavaFileDaPan6019Function daySaveFileDaPan6019Function;
//    @Autowired
//    private DaySavaFileDaPan001Function daySaveFileDaPan001Function;
//    @Autowired
//    private DaySavaFileDaPan603Function daySaveFileDaPan603Function;
//    @Autowired
//    private DaySaveFileChunJiShu0000Function daySaveFileChunJiShu0000Function;
//    @Autowired
//    private DaySaveFileChunJiShu0001Function daySaveFileChunJiShu0001Function;
//    @Autowired
//    private DaySaveFileChunJiShu0002Function daySaveFileChunJiShu0002Function;
//    @Autowired
//    private DaySaveFileChunJiShu0003Function daySaveFileChunJiShu0003Function;
//    @Autowired
//    private DaySaveFileChunJiShu0004Function daySaveFileChunJiShu0004Function;
//    @Autowired
//    private DaySaveFileChunJiShu0005Function daySaveFileChunJiShu0005Function;
//    @Autowired
//    private DaySaveFileChunJiShu0006Function daySaveFileChunJiShu0006Function;
//    @Autowired
//    private DaySaveFileChunJiShu0007Function daySaveFileChunJiShu0007Function;
//    @Autowired
//    private DaySaveFileChunJiShu0008Function daySaveFileChunJiShu0008Function;
//    @Autowired
//    private DaySaveFileChunJiShu0009Function daySaveFileChunJiShu0009Function;
//    @Autowired
//    private DaySaveFileChunJiShu0020Function daySaveFileChunJiShu0020Function;
//    @Autowired
//    private DaySaveFileChunJiShu0021Function daySaveFileChunJiShu0021Function;
//    @Autowired
//    private DaySaveFileChunJiShu0022Function daySaveFileChunJiShu0022Function;
//    @Autowired
//    private DaySaveFileChunJiShu0023Function daySaveFileChunJiShu0023Function;
//    @Autowired
//    private DaySaveFileChunJiShu0024Function daySaveFileChunJiShu0024Function;
//    @Autowired
//    private DaySaveFileChunJiShu0025Function daySaveFileChunJiShu0025Function;
//    @Autowired
//    private DaySaveFileChunJiShu0026Function daySaveFileChunJiShu0026Function;
//    @Autowired
//    private DaySaveFileChunJiShu0027Function daySaveFileChunJiShu0027Function;
//    @Autowired
//    private DaySaveFileChunJiShu0028Function daySaveFileChunJiShu0028Function;
//    @Autowired
//    private DaySaveFileChunJiShu3000Function daySaveFileChunJiShu3000Function;
//    @Autowired
//    private DaySaveFileChunJiShu3001Function daySaveFileChunJiShu3001Function;
//    @Autowired
//    private DaySaveFileChunJiShu3002Function daySaveFileChunJiShu3002Function;
//    @Autowired
//    private DaySaveFileChunJiShu3003Function daySaveFileChunJiShu3003Function;
//    @Autowired
//    private DaySaveFileChunJiShu3004Function daySaveFileChunJiShu3004Function;
//    @Autowired
//    private DaySaveFileChunJiShu3005Function daySaveFileChunJiShu3005Function;
//    @Autowired
//    private DaySaveFileChunJiShu6000Function daySaveFileChunJiShu6000Function;
//    @Autowired
//    private DaySaveFileChunJiShu6001Function daySaveFileChunJiShu6001Function;
//    @Autowired
//    private DaySaveFileChunJiShu6002Function daySaveFileChunJiShu6002Function;
//    @Autowired
//    private DaySaveFileChunJiShu6003Function daySaveFileChunJiShu6003Function;
//    @Autowired
//    private DaySaveFileChunJiShu6004Function daySaveFileChunJiShu6004Function;
//    @Autowired
//    private DaySaveFileChunJiShu6005Function daySaveFileChunJiShu6005Function;
//    @Autowired
//    private DaySaveFileChunJiShu6006Function daySaveFileChunJiShu6006Function;
//    @Autowired
//    private DaySaveFileChunJiShu6007Function daySaveFileChunJiShu6007Function;
//    @Autowired
//    private DaySaveFileChunJiShu6008Function daySaveFileChunJiShu6008Function;
//    @Autowired
//    private DaySaveFileChunJiShu6009Function daySaveFileChunJiShu6009Function;
//    @Autowired
//    private DaySaveFileChunJiShu6010Function daySaveFileChunJiShu6010Function;
//    @Autowired
//    private DaySaveFileChunJiShu6011Function daySaveFileChunJiShu6011Function;
//    @Autowired
//    private DaySaveFileChunJiShu6012Function daySaveFileChunJiShu6012Function;
//    @Autowired
//    private DaySaveFileChunJiShu6013Function daySaveFileChunJiShu6013Function;
//    @Autowired
//    private DaySaveFileChunJiShu6014Function daySaveFileChunJiShu6014Function;
//    @Autowired
//    private DaySaveFileChunJiShu6015Function daySaveFileChunJiShu6015Function;
//    @Autowired
//    private DaySaveFileChunJiShu6016Function daySaveFileChunJiShu6016Function;
//    @Autowired
//    private DaySaveFileChunJiShu6017Function daySaveFileChunJiShu6017Function;
//    @Autowired
//    private DaySaveFileChunJiShu6018Function daySaveFileChunJiShu6018Function;
//    @Autowired
//    private DaySaveFileChunJiShu6019Function daySaveFileChunJiShu6019Function;
//    @Autowired
//    private DaySaveFileChunJiShu603Function daySaveFileChunJiShu603Function;
//    @Autowired
//    private DaySaveFileChunJiShu001Function daySaveFileChunJiShu001Function;
//    @Autowired
//    private DaySaveFileChunTuXing0000Function daySaveFileChunTuXing0000Function;
//    @Autowired
//    private DaySaveFileChunTuXing0001Function daySaveFileChunTuXing0001Function;
//    @Autowired
//    private DaySaveFileChunTuXing0002Function daySaveFileChunTuXing0002Function;
//    @Autowired
//    private DaySaveFileChunTuXing0003Function daySaveFileChunTuXing0003Function;
//    @Autowired
//    private DaySaveFileChunTuXing0004Function daySaveFileChunTuXing0004Function;
//    @Autowired
//    private DaySaveFileChunTuXing0005Function daySaveFileChunTuXing0005Function;
//    @Autowired
//    private DaySaveFileChunTuXing0006Function daySaveFileChunTuXing0006Function;
//    @Autowired
//    private DaySaveFileChunTuXing0007Function daySaveFileChunTuXing0007Function;
//    @Autowired
//    private DaySaveFileChunTuXing0008Function daySaveFileChunTuXing0008Function;
//    @Autowired
//    private DaySaveFileChunTuXing0009Function daySaveFileChunTuXing0009Function;
//    @Autowired
//    private DaySaveFileChunTuXing0020Function daySaveFileChunTuXing0020Function;
//    @Autowired
//    private DaySaveFileChunTuXing0021Function daySaveFileChunTuXing0021Function;
//    @Autowired
//    private DaySaveFileChunTuXing0022Function daySaveFileChunTuXing0022Function;
//    @Autowired
//    private DaySaveFileChunTuXing0023Function daySaveFileChunTuXing0023Function;
//    @Autowired
//    private DaySaveFileChunTuXing0024Function daySaveFileChunTuXing0024Function;
//    @Autowired
//    private DaySaveFileChunTuXing0025Function daySaveFileChunTuXing0025Function;
//    @Autowired
//    private DaySaveFileChunTuXing0026Function daySaveFileChunTuXing0026Function;
//    @Autowired
//    private DaySaveFileChunTuXing0027Function daySaveFileChunTuXing0027Function;
//    @Autowired
//    private DaySaveFileChunTuXing0028Function daySaveFileChunTuXing0028Function;
//    @Autowired
//    private DaySaveFileChunTuXing3000Function daySaveFileChunTuXing3000Function;
//    @Autowired
//    private DaySaveFileChunTuXing3001Function daySaveFileChunTuXing3001Function;
//    @Autowired
//    private DaySaveFileChunTuXing3002Function daySaveFileChunTuXing3002Function;
//    @Autowired
//    private DaySaveFileChunTuXing3003Function daySaveFileChunTuXing3003Function;
//    @Autowired
//    private DaySaveFileChunTuXing3004Function daySaveFileChunTuXing3004Function;
//    @Autowired
//    private DaySaveFileChunTuXing3005Function daySaveFileChunTuXing3005Function;
//    @Autowired
//    private DaySaveFileChunTuXing6000Function daySaveFileChunTuXing6000Function;
//    @Autowired
//    private DaySaveFileChunTuXing6001Function daySaveFileChunTuXing6001Function;
//    @Autowired
//    private DaySaveFileChunTuXing6002Function daySaveFileChunTuXing6002Function;
//    @Autowired
//    private DaySaveFileChunTuXing6003Function daySaveFileChunTuXing6003Function;
//    @Autowired
//    private DaySaveFileChunTuXing6004Function daySaveFileChunTuXing6004Function;
//    @Autowired
//    private DaySaveFileChunTuXing6005Function daySaveFileChunTuXing6005Function;
//    @Autowired
//    private DaySaveFileChunTuXing6006Function daySaveFileChunTuXing6006Function;
//    @Autowired
//    private DaySaveFileChunTuXing6007Function daySaveFileChunTuXing6007Function;
//    @Autowired
//    private DaySaveFileChunTuXing6008Function daySaveFileChunTuXing6008Function;
//    @Autowired
//    private DaySaveFileChunTuXing6009Function daySaveFileChunTuXing6009Function;
//    @Autowired
//    private DaySaveFileChunTuXing6010Function daySaveFileChunTuXing6010Function;
//    @Autowired
//    private DaySaveFileChunTuXing6011Function daySaveFileChunTuXing6011Function;
//    @Autowired
//    private DaySaveFileChunTuXing6012Function daySaveFileChunTuXing6012Function;
//    @Autowired
//    private DaySaveFileChunTuXing6013Function daySaveFileChunTuXing6013Function;
//    @Autowired
//    private DaySaveFileChunTuXing6014Function daySaveFileChunTuXing6014Function;
//    @Autowired
//    private DaySaveFileChunTuXing6015Function daySaveFileChunTuXing6015Function;
//    @Autowired
//    private DaySaveFileChunTuXing6016Function daySaveFileChunTuXing6016Function;
//    @Autowired
//    private DaySaveFileChunTuXing6017Function daySaveFileChunTuXing6017Function;
//    @Autowired
//    private DaySaveFileChunTuXing6018Function daySaveFileChunTuXing6018Function;
//    @Autowired
//    private DaySaveFileChunTuXing6019Function daySaveFileChunTuXing6019Function;
//    @Autowired
//    private DaySaveFileChunTuXing603Function daySaveFileChunTuXing603Function;
//    @Autowired
//    private DaySaveFileChunTuXing001Function daySaveFileChunTuXing001Function;
//
//
//
//    @Override
//    public boolean getZhuHeBenpan() throws IOException {
//        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
//        if (stockCodeList == null || stockCodeList.isEmpty()) {
//            return false;
//        }
//
//        for (StockCode stockCode : stockCodeList) {
//            boolean fage;
//            switch (stockCode.getId().substring(0, 4)) {
////                case "0000":
////                    if (stockCode.getId().equals("000001")&&stockCode.getEx().equals("SH")) {
////                        continue;
////                    }else {
////                        daySaveFileBenPan0000Function.dayZhuHeBenpanFunction(stockCode);
////                    }
////                    continue;
////                case "0001":
////                    daySaveFileBenPan0001Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0002":
////                    daySaveFileBenPan0002Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0003":
////                    daySaveFileBenPan0003Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0004":
////                    daySaveFileBenPan0004Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0005":
////                    daySaveFileBenPan0005Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0006":
////                    daySaveFileBenPan0006Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0007":
////                    daySaveFileBenPan0007Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0008":
////                    daySaveFileBenPan0008Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0009":
////                    daySaveFileBenPan0009Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0020":
////                    daySaveFileBenPan0020Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0021":
////                    daySaveFileBenPan0021Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0022":
////                    daySaveFileBenPan0022Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0023":
////                    daySaveFileBenPan0023Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0024":
////                    daySaveFileBenPan0024Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0025":
////                    daySaveFileBenPan0025Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0026":
////                    daySaveFileBenPan0026Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0027":
////                    daySaveFileBenPan0027Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "0028":
////                    daySaveFileBenPan0028Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "3000":
////                    daySaveFileBenPan3000Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "3001":
////                    daySaveFileBenPan3001Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "3002":
////                    daySaveFileBenPan3002Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "3003":
////                    daySaveFileBenPan3003Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "3004":
////                    daySaveFileBenPan3004Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "3005":
////                    daySaveFileBenPan3005Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "6000":
////                    daySaveFileBenPan6000Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "6001":
////                    daySaveFileBenPan6001Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "6002":
////                    daySaveFileBenPan6002Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "6003":
////                    daySaveFileBenPan6003Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "6004":
////                    daySaveFileBenPan6004Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "6005":
////                    daySaveFileBenPan6005Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "6006":
////                    daySaveFileBenPan6006Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
////                case "6007":
////                    daySaveFileBenPan6007Function.dayZhuHeBenpanFunction(stockCode);
////                    continue;
//                case "6008":
//                    daySaveFileBenPan6008Function.dayZhuHeBenpanFunction(stockCode);
//                    continue;
//                case "6009":
//                    daySaveFileBenPan6009Function.dayZhuHeBenpanFunction(stockCode);
//                    continue;
//                case "6010":
//                    daySaveFileBenPan6010Function.dayZhuHeBenpanFunction(stockCode);
//                    continue;
//                case "6011":
//                    daySaveFileBenPan6011Function.dayZhuHeBenpanFunction(stockCode);
//                    continue;
//                case "6012":
//                    daySaveFileBenPan6012Function.dayZhuHeBenpanFunction(stockCode);
//                    continue;
//                case "6013":
//                    daySaveFileBenPan6013Function.dayZhuHeBenpanFunction(stockCode);
//                    continue;
//                case "6014":
//                    daySaveFileBenPan6014Function.dayZhuHeBenpanFunction(stockCode);
//                    continue;
//                case "6015":
//                    daySaveFileBenPan6015Function.dayZhuHeBenpanFunction(stockCode);
//                    continue;
//                case "6016":
//                    daySaveFileBenPan6016Function.dayZhuHeBenpanFunction(stockCode);
//                    continue;
//                case "6017":
//                    daySaveFileBenPan6017Function.dayZhuHeBenpanFunction(stockCode);
//                    continue;
//                case "6018":
//                    daySaveFileBenPan6018Function.dayZhuHeBenpanFunction(stockCode);
//                    continue;
//                case "6019":
//                    daySaveFileBenPan6019Function.dayZhuHeBenpanFunction(stockCode);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
////                        case "001":
////                            daySaveFileBenPan001Function.dayZhuHeBenpanFunction(stockCode);
////                            continue;
//                        case "603":
//                            daySaveFileBenPan603Function.dayZhuHeBenpanFunction(stockCode);
//                            continue;
//                        default:
//                            continue;
//                    }
//            }
//        }
//        return false;
//    }
//
//    public boolean getZhuHeDapan() throws IOException {
//        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
//        if (stockCodeList == null || stockCodeList.isEmpty()) {
//            return false;
//        }
//        //获取上证
//        List<StockDay0000> stockDay000001List = stockDay0000Service.selectByCodeAndEx("000001", "SH");
//        //获取sz
//        List<StockDay399> stockDay399001List = stockDay399Service.selectByCodeAndEx("399001", "SZ");
//        //获取中小
//        List<StockDay399> stockDay399005List = stockDay399Service.selectByCodeAndEx("399005", "SZ");
//        //获取创业
//        List<StockDay399> stockDay399006List = stockDay399Service.selectByCodeAndEx("399006", "SZ");
//
//        for (StockCode stockCode : stockCodeList) {
//            boolean fage;
//            switch (stockCode.getId().substring(0, 4)) {
//                case "0000":
//                    if (stockCode.getId().equals("000001")&&stockCode.getEx().equals("SH")) {
//                        continue;
//                    }else {
//                        daySaveFileDaPan0000Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    }
//                    continue;
//                case "0001":
//                    daySaveFileDaPan0001Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0002":
//                    daySaveFileDaPan0002Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0003":
//                    daySaveFileDaPan0003Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0004":
//                    daySaveFileDaPan0004Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0005":
//                    daySaveFileDaPan0005Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0006":
//                    daySaveFileDaPan0006Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0007":
//                    daySaveFileDaPan0007Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0008":
//                    daySaveFileDaPan0008Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0009":
//                    daySaveFileDaPan0009Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0020":
//                    daySaveFileDaPan0020Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0021":
//                    daySaveFileDaPan0021Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0022":
//                    daySaveFileDaPan0022Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0023":
//                    daySaveFileDaPan0023Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0024":
//                    daySaveFileDaPan0024Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0025":
//                    daySaveFileDaPan0025Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0026":
//                    daySaveFileDaPan0026Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0027":
//                    daySaveFileDaPan0027Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0028":
//                    daySaveFileDaPan0028Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "3000":
//                    daySaveFileDaPan3000Function.daySavaFileFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3001":
//                    daySaveFileDaPan3001Function.daySavaFileFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3002":
//                    daySaveFileDaPan3002Function.daySavaFileFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3003":
//                    daySaveFileDaPan3003Function.daySavaFileFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3004":
//                    daySaveFileDaPan3004Function.daySavaFileFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3005":
//                    daySaveFileDaPan3005Function.daySavaFileFunction(stockCode, stockDay399006List);
//                    continue;
//                case "6000":
//                    daySaveFileDaPan6000Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6001":
//                    daySaveFileDaPan6001Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6002":
//                    daySaveFileDaPan6002Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6003":
//                    daySaveFileDaPan6003Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6004":
//                    daySaveFileDaPan6004Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6005":
//                    daySaveFileDaPan6005Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6006":
//                    daySaveFileDaPan6006Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6007":
//                    daySaveFileDaPan6007Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6008":
//                    daySaveFileDaPan6008Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6009":
//                    daySaveFileDaPan6009Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6010":
//                    daySaveFileDaPan6010Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6011":
//                    daySaveFileDaPan6011Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6012":
//                    daySaveFileDaPan6012Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6013":
//                    daySaveFileDaPan6013Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6014":
//                    daySaveFileDaPan6014Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6015":
//                    daySaveFileDaPan6015Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6016":
//                    daySaveFileDaPan6016Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6017":
//                    daySaveFileDaPan6017Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6018":
//                    daySaveFileDaPan6018Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6019":
//                    daySaveFileDaPan6019Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            daySaveFileDaPan001Function.daySavaFileFunction(stockCode, stockDay399001List);
//                            continue;
//                        case "603":
//                            daySaveFileDaPan603Function.daySavaFileFunction(stockCode, stockDay000001List);
//                            continue;
//                        default:
//                            continue;
//                    }
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public boolean getChunJiShu() throws IOException {
//        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
//        if (stockCodeList == null || stockCodeList.isEmpty()) {
//            return false;
//        }
//        for (StockCode stockCode : stockCodeList) {
//            boolean fage;
//            switch (stockCode.getId().substring(0, 4)) {
//                case "0000":
//                    if (stockCode.getId().equals("000001")&&stockCode.getEx().equals("SH")) {
//                        continue;
//                    }else {
//                        daySaveFileChunJiShu0000Function.dayZhuHeChunJishuFunction(stockCode);
//                    }
//                    continue;
//                case "0001":
//                    daySaveFileChunJiShu0001Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0002":
//                    daySaveFileChunJiShu0002Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0003":
//                    daySaveFileChunJiShu0003Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0004":
//                    daySaveFileChunJiShu0004Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0005":
//                    daySaveFileChunJiShu0005Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0006":
//                    daySaveFileChunJiShu0006Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0007":
//                    daySaveFileChunJiShu0007Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0008":
//                    daySaveFileChunJiShu0008Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0009":
//                    daySaveFileChunJiShu0009Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0020":
//                    daySaveFileChunJiShu0020Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0021":
//                    daySaveFileChunJiShu0021Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0022":
//                    daySaveFileChunJiShu0022Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0023":
//                    daySaveFileChunJiShu0023Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0024":
//                    daySaveFileChunJiShu0024Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0025":
//                    daySaveFileChunJiShu0025Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0026":
//                    daySaveFileChunJiShu0026Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0027":
//                    daySaveFileChunJiShu0027Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "0028":
//                    daySaveFileChunJiShu0028Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "3000":
//                    daySaveFileChunJiShu3000Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "3001":
//                    daySaveFileChunJiShu3001Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "3002":
//                    daySaveFileChunJiShu3002Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "3003":
//                    daySaveFileChunJiShu3003Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "3004":
//                    daySaveFileChunJiShu3004Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "3005":
//                    daySaveFileChunJiShu3005Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6000":
//                    daySaveFileChunJiShu6000Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6001":
//                    daySaveFileChunJiShu6001Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6002":
//                    daySaveFileChunJiShu6002Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6003":
//                    daySaveFileChunJiShu6003Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6004":
//                    daySaveFileChunJiShu6004Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6005":
//                    daySaveFileChunJiShu6005Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6006":
//                    daySaveFileChunJiShu6006Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6007":
//                    daySaveFileChunJiShu6007Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6008":
//                    daySaveFileChunJiShu6008Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6009":
//                    daySaveFileChunJiShu6009Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6010":
//                    daySaveFileChunJiShu6010Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6011":
//                    daySaveFileChunJiShu6011Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6012":
//                    daySaveFileChunJiShu6012Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6013":
//                    daySaveFileChunJiShu6013Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6014":
//                    daySaveFileChunJiShu6014Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6015":
//                    daySaveFileChunJiShu6015Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6016":
//                    daySaveFileChunJiShu6016Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6017":
//                    daySaveFileChunJiShu6017Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6018":
//                    daySaveFileChunJiShu6018Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                case "6019":
//                    daySaveFileChunJiShu6019Function.dayZhuHeChunJishuFunction(stockCode);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            daySaveFileChunJiShu001Function.dayZhuHeChunJishuFunction(stockCode);
//                            continue;
//                        case "603":
//                            daySaveFileChunJiShu603Function.dayZhuHeChunJishuFunction(stockCode);
//                            continue;
//                        default:
//                            continue;
//                    }
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public boolean getChunTuXing() throws IOException {
//        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
//        if (stockCodeList == null || stockCodeList.isEmpty()) {
//            return false;
//        }
//        for (StockCode stockCode : stockCodeList) {
//            switch (stockCode.getId().substring(0, 4)) {
//                case "0000":
//                    if (stockCode.getId().equals("000001")&&stockCode.getEx().equals("SH")) {
//                        continue;
//                    }else {
//                        daySaveFileChunTuXing0000Function.dayZhuHeChunTuxingFunction(stockCode);
//                    }
//                    continue;
//                case "0001":
//                    daySaveFileChunTuXing0001Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0002":
//                    daySaveFileChunTuXing0002Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0003":
//                    daySaveFileChunTuXing0003Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0004":
//                    daySaveFileChunTuXing0004Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0005":
//                    daySaveFileChunTuXing0005Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0006":
//                    daySaveFileChunTuXing0006Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0007":
//                    daySaveFileChunTuXing0007Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0008":
//                    daySaveFileChunTuXing0008Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0009":
//                    daySaveFileChunTuXing0009Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0020":
//                    daySaveFileChunTuXing0020Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0021":
//                    daySaveFileChunTuXing0021Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0022":
//                    daySaveFileChunTuXing0022Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0023":
//                    daySaveFileChunTuXing0023Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0024":
//                    daySaveFileChunTuXing0024Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0025":
//                    daySaveFileChunTuXing0025Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0026":
//                    daySaveFileChunTuXing0026Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0027":
//                    daySaveFileChunTuXing0027Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "0028":
//                    daySaveFileChunTuXing0028Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "3000":
//                    daySaveFileChunTuXing3000Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "3001":
//                    daySaveFileChunTuXing3001Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "3002":
//                    daySaveFileChunTuXing3002Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "3003":
//                    daySaveFileChunTuXing3003Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "3004":
//                    daySaveFileChunTuXing3004Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "3005":
//                    daySaveFileChunTuXing3005Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6000":
//                    daySaveFileChunTuXing6000Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6001":
//                    daySaveFileChunTuXing6001Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6002":
//                    daySaveFileChunTuXing6002Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6003":
//                    daySaveFileChunTuXing6003Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6004":
//                    daySaveFileChunTuXing6004Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6005":
//                    daySaveFileChunTuXing6005Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6006":
//                    daySaveFileChunTuXing6006Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6007":
//                    daySaveFileChunTuXing6007Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6008":
//                    daySaveFileChunTuXing6008Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6009":
//                    daySaveFileChunTuXing6009Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6010":
//                    daySaveFileChunTuXing6010Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6011":
//                    daySaveFileChunTuXing6011Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6012":
//                    daySaveFileChunTuXing6012Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6013":
//                    daySaveFileChunTuXing6013Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6014":
//                    daySaveFileChunTuXing6014Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6015":
//                    daySaveFileChunTuXing6015Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6016":
//                    daySaveFileChunTuXing6016Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6017":
//                    daySaveFileChunTuXing6017Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6018":
//                    daySaveFileChunTuXing6018Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                case "6019":
//                    daySaveFileChunTuXing6019Function.dayZhuHeChunTuxingFunction(stockCode);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            daySaveFileChunTuXing001Function.dayZhuHeChunTuxingFunction(stockCode);
//                            continue;
//                        case "603":
//                            daySaveFileChunTuXing603Function.dayZhuHeChunTuxingFunction(stockCode);
//                            continue;
//                        default:
//                            continue;
//                    }
//            }
//        }
//        return false;
//    }
//
//
//
//
//}
