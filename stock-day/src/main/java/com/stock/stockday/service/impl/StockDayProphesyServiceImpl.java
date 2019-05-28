//package com.stock.stockday.service.impl;
//
//import com.stock.stockday.entity.StockCode;
//import com.stock.stockday.entity.StockDay0000;
//import com.stock.stockday.entity.StockDay399;
//import com.stock.stockday.service.StockCodeService;
//import com.stock.stockday.service.StockDay0000Service;
//import com.stock.stockday.service.StockDay399Service;
//import com.stock.stockday.service.StockDayProphesyService;
//import com.stock.stockday.service.savaFile.DaySavaFile0000Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0001Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0002Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0003Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0004Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0005Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0006Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0007Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0008Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0009Function;
//import com.stock.stockday.service.savaFile.DaySavaFile001Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0020Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0021Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0022Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0023Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0024Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0025Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0026Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0027Function;
//import com.stock.stockday.service.savaFile.DaySavaFile0028Function;
//import com.stock.stockday.service.savaFile.DaySavaFile3000Function;
//import com.stock.stockday.service.savaFile.DaySavaFile3001Function;
//import com.stock.stockday.service.savaFile.DaySavaFile3002Function;
//import com.stock.stockday.service.savaFile.DaySavaFile3003Function;
//import com.stock.stockday.service.savaFile.DaySavaFile3004Function;
//import com.stock.stockday.service.savaFile.DaySavaFile3005Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6000Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6001Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6002Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6003Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6004Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6005Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6006Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6007Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6008Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6009Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6010Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6011Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6012Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6013Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6014Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6015Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6016Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6017Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6018Function;
//import com.stock.stockday.service.savaFile.DaySavaFile6019Function;
//import com.stock.stockday.service.savaFile.DaySavaFile603Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240000Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240001Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240002Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240003Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240004Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240005Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240006Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240007Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240008Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240009Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile24001Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240020Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240021Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240022Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240023Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240024Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240025Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240026Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240027Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile240028Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile243000Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile243001Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile243002Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile243003Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile243004Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile243005Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246000Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246001Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246002Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246003Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246004Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246005Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246006Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246007Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246008Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246009Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246010Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246011Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246012Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246013Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246014Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246015Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246016Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246017Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246018Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile246019Function;
//import com.stock.stockday.service.saveFile24.DaySaveFile24603Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330000Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330001Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330002Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330003Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330004Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330005Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330006Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330007Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330008Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330009Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile33001Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330020Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330021Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330022Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330023Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330024Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330025Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330026Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330027Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile330028Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile333000Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile333001Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile333002Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile333003Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile333004Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile333005Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336000Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336001Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336002Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336003Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336004Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336005Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336006Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336007Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336008Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336009Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336010Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336011Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336012Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336013Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336014Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336015Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336016Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336017Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336018Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile336019Function;
//import com.stock.stockday.service.saveFile33.DaySaveFile33603Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420000Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420001Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420002Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420003Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420004Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420005Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420006Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420007Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420008Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420009Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile42001Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420020Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420021Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420022Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420023Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420024Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420025Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420026Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420027Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile420028Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile423000Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile423001Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile423002Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile423003Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile423004Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile423005Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426000Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426001Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426002Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426003Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426004Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426005Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426006Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426007Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426008Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426009Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426010Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426011Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426012Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426013Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426014Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426015Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426016Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426017Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426018Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile426019Function;
//import com.stock.stockday.service.saveFile42.DaySaveFile42603Function;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//import java.util.List;
//
//@Service
//public class StockDayProphesyServiceImpl implements StockDayProphesyService {
//    @Autowired
//    private StockCodeService stockCodeService;
//    @Autowired
//    private StockDay0000Service stockDay0000Service;
//    @Autowired
//    private StockDay399Service stockDay399Service;
//    @Autowired
//    private DaySavaFile0000Function savaFile0000Function;
//    @Autowired
//    private DaySavaFile0001Function savaFile0001Function;
//    @Autowired
//    private DaySavaFile0002Function savaFile0002Function;
//    @Autowired
//    private DaySavaFile0003Function savaFile0003Function;
//    @Autowired
//    private DaySavaFile0004Function savaFile0004Function;
//    @Autowired
//    private DaySavaFile0005Function savaFile0005Function;
//    @Autowired
//    private DaySavaFile0006Function savaFile0006Function;
//    @Autowired
//    private DaySavaFile0007Function savaFile0007Function;
//    @Autowired
//    private DaySavaFile0008Function savaFile0008Function;
//    @Autowired
//    private DaySavaFile0009Function savaFile0009Function;
//    @Autowired
//    private DaySavaFile0020Function savaFile0020Function;
//    @Autowired
//    private DaySavaFile0021Function savaFile0021Function;
//    @Autowired
//    private DaySavaFile0022Function savaFile0022Function;
//    @Autowired
//    private DaySavaFile0023Function savaFile0023Function;
//    @Autowired
//    private DaySavaFile0024Function savaFile0024Function;
//    @Autowired
//    private DaySavaFile0025Function savaFile0025Function;
//    @Autowired
//    private DaySavaFile0026Function savaFile0026Function;
//    @Autowired
//    private DaySavaFile0027Function savaFile0027Function;
//    @Autowired
//    private DaySavaFile0028Function savaFile0028Function;
//    @Autowired
//    private DaySavaFile3000Function savaFile3000Function;
//    @Autowired
//    private DaySavaFile3001Function savaFile3001Function;
//    @Autowired
//    private DaySavaFile3002Function savaFile3002Function;
//    @Autowired
//    private DaySavaFile3003Function savaFile3003Function;
//    @Autowired
//    private DaySavaFile3004Function savaFile3004Function;
//    @Autowired
//    private DaySavaFile3005Function savaFile3005Function;
//    @Autowired
//    private DaySavaFile6000Function savaFile6000Function;
//    @Autowired
//    private DaySavaFile6001Function savaFile6001Function;
//    @Autowired
//    private DaySavaFile6002Function savaFile6002Function;
//    @Autowired
//    private DaySavaFile6003Function savaFile6003Function;
//    @Autowired
//    private DaySavaFile6004Function savaFile6004Function;
//    @Autowired
//    private DaySavaFile6005Function savaFile6005Function;
//    @Autowired
//    private DaySavaFile6006Function savaFile6006Function;
//    @Autowired
//    private DaySavaFile6007Function savaFile6007Function;
//    @Autowired
//    private DaySavaFile6008Function savaFile6008Function;
//    @Autowired
//    private DaySavaFile6009Function savaFile6009Function;
//    @Autowired
//    private DaySavaFile6010Function savaFile6010Function;
//    @Autowired
//    private DaySavaFile6011Function savaFile6011Function;
//    @Autowired
//    private DaySavaFile6012Function savaFile6012Function;
//    @Autowired
//    private DaySavaFile6013Function savaFile6013Function;
//    @Autowired
//    private DaySavaFile6014Function savaFile6014Function;
//    @Autowired
//    private DaySavaFile6015Function savaFile6015Function;
//    @Autowired
//    private DaySavaFile6016Function savaFile6016Function;
//    @Autowired
//    private DaySavaFile6017Function savaFile6017Function;
//    @Autowired
//    private DaySavaFile6018Function savaFile6018Function;
//    @Autowired
//    private DaySavaFile6019Function savaFile6019Function;
//    @Autowired
//    private DaySavaFile603Function savaFile603Function;
//    @Autowired
//    private DaySavaFile001Function savaFile001Function;
//    @Autowired
//    private DaySaveFile240000Function saveFile240000Function;
//    @Autowired
//    private DaySaveFile240001Function saveFile240001Function;
//    @Autowired
//    private DaySaveFile240002Function saveFile240002Function;
//    @Autowired
//    private DaySaveFile240003Function saveFile240003Function;
//    @Autowired
//    private DaySaveFile240004Function saveFile240004Function;
//    @Autowired
//    private DaySaveFile240005Function saveFile240005Function;
//    @Autowired
//    private DaySaveFile240006Function saveFile240006Function;
//    @Autowired
//    private DaySaveFile240007Function saveFile240007Function;
//    @Autowired
//    private DaySaveFile240008Function saveFile240008Function;
//    @Autowired
//    private DaySaveFile240009Function saveFile240009Function;
//    @Autowired
//    private DaySaveFile240020Function saveFile240020Function;
//    @Autowired
//    private DaySaveFile240021Function saveFile240021Function;
//    @Autowired
//    private DaySaveFile240022Function saveFile240022Function;
//    @Autowired
//    private DaySaveFile240023Function saveFile240023Function;
//    @Autowired
//    private DaySaveFile240024Function saveFile240024Function;
//    @Autowired
//    private DaySaveFile240025Function saveFile240025Function;
//    @Autowired
//    private DaySaveFile240026Function saveFile240026Function;
//    @Autowired
//    private DaySaveFile240027Function saveFile240027Function;
//    @Autowired
//    private DaySaveFile240028Function saveFile240028Function;
//    @Autowired
//    private DaySaveFile243000Function saveFile243000Function;
//    @Autowired
//    private DaySaveFile243001Function saveFile243001Function;
//    @Autowired
//    private DaySaveFile243002Function saveFile243002Function;
//    @Autowired
//    private DaySaveFile243003Function saveFile243003Function;
//    @Autowired
//    private DaySaveFile243004Function saveFile243004Function;
//    @Autowired
//    private DaySaveFile243005Function saveFile243005Function;
//    @Autowired
//    private DaySaveFile246000Function saveFile246000Function;
//    @Autowired
//    private DaySaveFile246001Function saveFile246001Function;
//    @Autowired
//    private DaySaveFile246002Function saveFile246002Function;
//    @Autowired
//    private DaySaveFile246003Function saveFile246003Function;
//    @Autowired
//    private DaySaveFile246004Function saveFile246004Function;
//    @Autowired
//    private DaySaveFile246005Function saveFile246005Function;
//    @Autowired
//    private DaySaveFile246006Function saveFile246006Function;
//    @Autowired
//    private DaySaveFile246007Function saveFile246007Function;
//    @Autowired
//    private DaySaveFile246008Function saveFile246008Function;
//    @Autowired
//    private DaySaveFile246009Function saveFile246009Function;
//    @Autowired
//    private DaySaveFile246010Function saveFile246010Function;
//    @Autowired
//    private DaySaveFile246011Function saveFile246011Function;
//    @Autowired
//    private DaySaveFile246012Function saveFile246012Function;
//    @Autowired
//    private DaySaveFile246013Function saveFile246013Function;
//    @Autowired
//    private DaySaveFile246014Function saveFile246014Function;
//    @Autowired
//    private DaySaveFile246015Function saveFile246015Function;
//    @Autowired
//    private DaySaveFile246016Function saveFile246016Function;
//    @Autowired
//    private DaySaveFile246017Function saveFile246017Function;
//    @Autowired
//    private DaySaveFile246018Function saveFile246018Function;
//    @Autowired
//    private DaySaveFile246019Function saveFile246019Function;
//    @Autowired
//    private DaySaveFile24603Function saveFile24603Function;
//    @Autowired
//    private DaySaveFile24001Function saveFile24001Function;
//    @Autowired
//    private DaySaveFile330000Function saveFile330000Function;
//    @Autowired
//    private DaySaveFile330001Function saveFile330001Function;
//    @Autowired
//    private DaySaveFile330002Function saveFile330002Function;
//    @Autowired
//    private DaySaveFile330003Function saveFile330003Function;
//    @Autowired
//    private DaySaveFile330004Function saveFile330004Function;
//    @Autowired
//    private DaySaveFile330005Function saveFile330005Function;
//    @Autowired
//    private DaySaveFile330006Function saveFile330006Function;
//    @Autowired
//    private DaySaveFile330007Function saveFile330007Function;
//    @Autowired
//    private DaySaveFile330008Function saveFile330008Function;
//    @Autowired
//    private DaySaveFile330009Function saveFile330009Function;
//    @Autowired
//    private DaySaveFile330020Function saveFile330020Function;
//    @Autowired
//    private DaySaveFile330021Function saveFile330021Function;
//    @Autowired
//    private DaySaveFile330022Function saveFile330022Function;
//    @Autowired
//    private DaySaveFile330023Function saveFile330023Function;
//    @Autowired
//    private DaySaveFile330024Function saveFile330024Function;
//    @Autowired
//    private DaySaveFile330025Function saveFile330025Function;
//    @Autowired
//    private DaySaveFile330026Function saveFile330026Function;
//    @Autowired
//    private DaySaveFile330027Function saveFile330027Function;
//    @Autowired
//    private DaySaveFile330028Function saveFile330028Function;
//    @Autowired
//    private DaySaveFile333000Function saveFile333000Function;
//    @Autowired
//    private DaySaveFile333001Function saveFile333001Function;
//    @Autowired
//    private DaySaveFile333002Function saveFile333002Function;
//    @Autowired
//    private DaySaveFile333003Function saveFile333003Function;
//    @Autowired
//    private DaySaveFile333004Function saveFile333004Function;
//    @Autowired
//    private DaySaveFile333005Function saveFile333005Function;
//    @Autowired
//    private DaySaveFile336000Function saveFile336000Function;
//    @Autowired
//    private DaySaveFile336001Function saveFile336001Function;
//    @Autowired
//    private DaySaveFile336002Function saveFile336002Function;
//    @Autowired
//    private DaySaveFile336003Function saveFile336003Function;
//    @Autowired
//    private DaySaveFile336004Function saveFile336004Function;
//    @Autowired
//    private DaySaveFile336005Function saveFile336005Function;
//    @Autowired
//    private DaySaveFile336006Function saveFile336006Function;
//    @Autowired
//    private DaySaveFile336007Function saveFile336007Function;
//    @Autowired
//    private DaySaveFile336008Function saveFile336008Function;
//    @Autowired
//    private DaySaveFile336009Function saveFile336009Function;
//    @Autowired
//    private DaySaveFile336010Function saveFile336010Function;
//    @Autowired
//    private DaySaveFile336011Function saveFile336011Function;
//    @Autowired
//    private DaySaveFile336012Function saveFile336012Function;
//    @Autowired
//    private DaySaveFile336013Function saveFile336013Function;
//    @Autowired
//    private DaySaveFile336014Function saveFile336014Function;
//    @Autowired
//    private DaySaveFile336015Function saveFile336015Function;
//    @Autowired
//    private DaySaveFile336016Function saveFile336016Function;
//    @Autowired
//    private DaySaveFile336017Function saveFile336017Function;
//    @Autowired
//    private DaySaveFile336018Function saveFile336018Function;
//    @Autowired
//    private DaySaveFile336019Function saveFile336019Function;
//    @Autowired
//    private DaySaveFile33603Function saveFile33603Function;
//    @Autowired
//    private DaySaveFile33001Function saveFile33001Function;
//    @Autowired
//    private DaySaveFile420000Function saveFile420000Function;
//    @Autowired
//    private DaySaveFile420001Function saveFile420001Function;
//    @Autowired
//    private DaySaveFile420002Function saveFile420002Function;
//    @Autowired
//    private DaySaveFile420003Function saveFile420003Function;
//    @Autowired
//    private DaySaveFile420004Function saveFile420004Function;
//    @Autowired
//    private DaySaveFile420005Function saveFile420005Function;
//    @Autowired
//    private DaySaveFile420006Function saveFile420006Function;
//    @Autowired
//    private DaySaveFile420007Function saveFile420007Function;
//    @Autowired
//    private DaySaveFile420008Function saveFile420008Function;
//    @Autowired
//    private DaySaveFile420009Function saveFile420009Function;
//    @Autowired
//    private DaySaveFile420020Function saveFile420020Function;
//    @Autowired
//    private DaySaveFile420021Function saveFile420021Function;
//    @Autowired
//    private DaySaveFile420022Function saveFile420022Function;
//    @Autowired
//    private DaySaveFile420023Function saveFile420023Function;
//    @Autowired
//    private DaySaveFile420024Function saveFile420024Function;
//    @Autowired
//    private DaySaveFile420025Function saveFile420025Function;
//    @Autowired
//    private DaySaveFile420026Function saveFile420026Function;
//    @Autowired
//    private DaySaveFile420027Function saveFile420027Function;
//    @Autowired
//    private DaySaveFile420028Function saveFile420028Function;
//    @Autowired
//    private DaySaveFile423000Function saveFile423000Function;
//    @Autowired
//    private DaySaveFile423001Function saveFile423001Function;
//    @Autowired
//    private DaySaveFile423002Function saveFile423002Function;
//    @Autowired
//    private DaySaveFile423003Function saveFile423003Function;
//    @Autowired
//    private DaySaveFile423004Function saveFile423004Function;
//    @Autowired
//    private DaySaveFile423005Function saveFile423005Function;
//    @Autowired
//    private DaySaveFile426000Function saveFile426000Function;
//    @Autowired
//    private DaySaveFile426001Function saveFile426001Function;
//    @Autowired
//    private DaySaveFile426002Function saveFile426002Function;
//    @Autowired
//    private DaySaveFile426003Function saveFile426003Function;
//    @Autowired
//    private DaySaveFile426004Function saveFile426004Function;
//    @Autowired
//    private DaySaveFile426005Function saveFile426005Function;
//    @Autowired
//    private DaySaveFile426006Function saveFile426006Function;
//    @Autowired
//    private DaySaveFile426007Function saveFile426007Function;
//    @Autowired
//    private DaySaveFile426008Function saveFile426008Function;
//    @Autowired
//    private DaySaveFile426009Function saveFile426009Function;
//    @Autowired
//    private DaySaveFile426010Function saveFile426010Function;
//    @Autowired
//    private DaySaveFile426011Function saveFile426011Function;
//    @Autowired
//    private DaySaveFile426012Function saveFile426012Function;
//    @Autowired
//    private DaySaveFile426013Function saveFile426013Function;
//    @Autowired
//    private DaySaveFile426014Function saveFile426014Function;
//    @Autowired
//    private DaySaveFile426015Function saveFile426015Function;
//    @Autowired
//    private DaySaveFile426016Function saveFile426016Function;
//    @Autowired
//    private DaySaveFile426017Function saveFile426017Function;
//    @Autowired
//    private DaySaveFile426018Function saveFile426018Function;
//    @Autowired
//    private DaySaveFile426019Function saveFile426019Function;
//    @Autowired
//    private DaySaveFile42603Function saveFile42603Function;
//    @Autowired
//    private DaySaveFile42001Function saveFile42001Function;
//
//    @Override
//    public boolean getProphesyProbability1() throws IOException {
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
//                        savaFile0000Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    }
//                    continue;
//                case "0001":
//                    savaFile0001Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0002":
//                    savaFile0002Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0003":
//                    savaFile0003Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0004":
//                    savaFile0004Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0005":
//                    savaFile0005Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0006":
//                    savaFile0006Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0007":
//                    savaFile0007Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0008":
//                    savaFile0008Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0009":
//                    savaFile0009Function.daySavaFileFunction(stockCode, stockDay399001List);
//                    continue;
//                case "0020":
//                    savaFile0020Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0021":
//                    savaFile0021Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0022":
//                    savaFile0022Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0023":
//                    savaFile0023Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0024":
//                    savaFile0024Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0025":
//                    savaFile0025Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0026":
//                    savaFile0026Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0027":
//                    savaFile0027Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "0028":
//                    savaFile0028Function.daySavaFileFunction(stockCode, stockDay399005List);
//                    continue;
//                case "3000":
//                    savaFile3000Function.daySavaFileFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3001":
//                    savaFile3001Function.daySavaFileFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3002":
//                    savaFile3002Function.daySavaFileFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3003":
//                    savaFile3003Function.daySavaFileFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3004":
//                    savaFile3004Function.daySavaFileFunction(stockCode, stockDay399006List);
//                    continue;
//                case "3005":
//                    savaFile3005Function.daySavaFileFunction(stockCode, stockDay399006List);
//                    continue;
//                case "6000":
//                    savaFile6000Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6001":
//                    savaFile6001Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6002":
//                    savaFile6002Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6003":
//                    savaFile6003Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6004":
//                    savaFile6004Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6005":
//                    savaFile6005Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6006":
//                    savaFile6006Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6007":
//                    savaFile6007Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6008":
//                    savaFile6008Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6009":
//                    savaFile6009Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6010":
//                    savaFile6010Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6011":
//                    savaFile6011Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6012":
//                    savaFile6012Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6013":
//                    savaFile6013Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6014":
//                    savaFile6014Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6015":
//                    savaFile6015Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6016":
//                    savaFile6016Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6017":
//                    savaFile6017Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6018":
//                    savaFile6018Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                case "6019":
//                    savaFile6019Function.daySavaFileFunction(stockCode, stockDay000001List);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            savaFile001Function.daySavaFileFunction(stockCode, stockDay399001List);
//                            continue;
//                        case "603":
//                            savaFile603Function.daySavaFileFunction(stockCode, stockDay000001List);
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
//    public boolean getZhuHe24() throws IOException {
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
//                        saveFile240000Function.dayZhuHe24Function(stockCode);
//                    }
//                    continue;
//                case "0001":
//                    saveFile240001Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0002":
//                    saveFile240002Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0003":
//                    saveFile240003Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0004":
//                    saveFile240004Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0005":
//                    saveFile240005Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0006":
//                    saveFile240006Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0007":
//                    saveFile240007Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0008":
//                    saveFile240008Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0009":
//                    saveFile240009Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0020":
//                    saveFile240020Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0021":
//                    saveFile240021Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0022":
//                    saveFile240022Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0023":
//                    saveFile240023Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0024":
//                    saveFile240024Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0025":
//                    saveFile240025Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0026":
//                    saveFile240026Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0027":
//                    saveFile240027Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "0028":
//                    saveFile240028Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "3000":
//                    saveFile243000Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "3001":
//                    saveFile243001Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "3002":
//                    saveFile243002Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "3003":
//                    saveFile243003Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "3004":
//                    saveFile243004Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "3005":
//                    saveFile243005Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6000":
//                    saveFile246000Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6001":
//                    saveFile246001Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6002":
//                    saveFile246002Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6003":
//                    saveFile246003Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6004":
//                    saveFile246004Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6005":
//                    saveFile246005Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6006":
//                    saveFile246006Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6007":
//                    saveFile246007Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6008":
//                    saveFile246008Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6009":
//                    saveFile246009Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6010":
//                    saveFile246010Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6011":
//                    saveFile246011Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6012":
//                    saveFile246012Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6013":
//                    saveFile246013Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6014":
//                    saveFile246014Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6015":
//                    saveFile246015Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6016":
//                    saveFile246016Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6017":
//                    saveFile246017Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6018":
//                    saveFile246018Function.dayZhuHe24Function(stockCode);
//                    continue;
//                case "6019":
//                    saveFile246019Function.dayZhuHe24Function(stockCode);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            saveFile24001Function.dayZhuHe24Function(stockCode);
//                            continue;
//                        case "603":
//                            saveFile24603Function.dayZhuHe24Function(stockCode);
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
//    public boolean getZhuHe33() throws IOException {
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
////                        saveFile330000Function.dayZhuHe33Function(stockCode);
////                    }
////                    continue;
////                case "0001":
////                    saveFile330001Function.dayZhuHe33Function(stockCode);
////                    continue;
////                case "0002":
////                    saveFile330002Function.dayZhuHe33Function(stockCode);
////                    continue;
////                case "0003":
////                    saveFile330003Function.dayZhuHe33Function(stockCode);
////                    continue;
////                case "0004":
////                    saveFile330004Function.dayZhuHe33Function(stockCode);
////                    continue;
////                case "0005":
////                    saveFile330005Function.dayZhuHe33Function(stockCode);
////                    continue;
//                case "0006":
//                    saveFile330006Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "0007":
//                    saveFile330007Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "0008":
//                    saveFile330008Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "0009":
//                    saveFile330009Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "0020":
//                    saveFile330020Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "0021":
//                    saveFile330021Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "0022":
//                    saveFile330022Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "0023":
//                    saveFile330023Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "0024":
//                    saveFile330024Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "0025":
//                    saveFile330025Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "0026":
//                    saveFile330026Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "0027":
//                    saveFile330027Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "0028":
//                    saveFile330028Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "3000":
//                    saveFile333000Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "3001":
//                    saveFile333001Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "3002":
//                    saveFile333002Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "3003":
//                    saveFile333003Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "3004":
//                    saveFile333004Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "3005":
//                    saveFile333005Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6000":
//                    saveFile336000Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6001":
//                    saveFile336001Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6002":
//                    saveFile336002Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6003":
//                    saveFile336003Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6004":
//                    saveFile336004Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6005":
//                    saveFile336005Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6006":
//                    saveFile336006Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6007":
//                    saveFile336007Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6008":
//                    saveFile336008Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6009":
//                    saveFile336009Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6010":
//                    saveFile336010Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6011":
//                    saveFile336011Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6012":
//                    saveFile336012Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6013":
//                    saveFile336013Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6014":
//                    saveFile336014Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6015":
//                    saveFile336015Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6016":
//                    saveFile336016Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6017":
//                    saveFile336017Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6018":
//                    saveFile336018Function.dayZhuHe33Function(stockCode);
//                    continue;
//                case "6019":
//                    saveFile336019Function.dayZhuHe33Function(stockCode);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            saveFile33001Function.dayZhuHe33Function(stockCode);
//                            continue;
//                        case "603":
//                            saveFile33603Function.dayZhuHe33Function(stockCode);
//                            continue;
//                        default:
//                            continue;
//                    }
//            }
//        }
//        return false;
//    }
//
//    public boolean getZhuHe42() throws IOException {
//        List<StockCode> stockCodeList = stockCodeService.getStockCodeList();
//        if (stockCodeList == null || stockCodeList.isEmpty()) {
//            return false;
//        }
//
//        for (StockCode stockCode : stockCodeList) {
//            boolean fage;
//            switch (stockCode.getId().substring(0, 4)) {
//                case "0000":
//                    if (stockCode.getId().equals("000001")&&stockCode.getEx().equals("SH")) {
//                        continue;
//                    }else {
//                        saveFile420000Function.dayZhuHe42Function(stockCode);
//                    }
//                    continue;
//                case "0001":
//                    saveFile420001Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0002":
//                    saveFile420002Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0003":
//                    saveFile420003Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0004":
//                    saveFile420004Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0005":
//                    saveFile420005Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0006":
//                    saveFile420006Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0007":
//                    saveFile420007Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0008":
//                    saveFile420008Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0009":
//                    saveFile420009Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0020":
//                    saveFile420020Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0021":
//                    saveFile420021Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0022":
//                    saveFile420022Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0023":
//                    saveFile420023Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0024":
//                    saveFile420024Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0025":
//                    saveFile420025Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0026":
//                    saveFile420026Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0027":
//                    saveFile420027Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "0028":
//                    saveFile420028Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "3000":
//                    saveFile423000Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "3001":
//                    saveFile423001Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "3002":
//                    saveFile423002Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "3003":
//                    saveFile423003Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "3004":
//                    saveFile423004Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "3005":
//                    saveFile423005Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6000":
//                    saveFile426000Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6001":
//                    saveFile426001Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6002":
//                    saveFile426002Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6003":
//                    saveFile426003Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6004":
//                    saveFile426004Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6005":
//                    saveFile426005Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6006":
//                    saveFile426006Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6007":
//                    saveFile426007Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6008":
//                    saveFile426008Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6009":
//                    saveFile426009Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6010":
//                    saveFile426010Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6011":
//                    saveFile426011Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6012":
//                    saveFile426012Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6013":
//                    saveFile426013Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6014":
//                    saveFile426014Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6015":
//                    saveFile426015Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6016":
//                    saveFile426016Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6017":
//                    saveFile426017Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6018":
//                    saveFile426018Function.dayZhuHe42Function(stockCode);
//                    continue;
//                case "6019":
//                    saveFile426019Function.dayZhuHe42Function(stockCode);
//                    continue;
//                default:
//                    switch (stockCode.getId().substring(0, 3)) {
//                        case "001":
//                            saveFile42001Function.dayZhuHe42Function(stockCode);
//                            continue;
//                        case "603":
//                            saveFile42603Function.dayZhuHe42Function(stockCode);
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
//}
