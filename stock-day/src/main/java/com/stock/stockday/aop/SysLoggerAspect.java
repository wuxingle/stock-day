package com.stock.stockday.aop;

import com.stock.apicommon.model.ResultData;
import com.stock.apicommon.security.SessionUserUtil;
import com.stock.stockday.newService.LoggerService;
import com.stock.stockday.vo.StockDayVo;
import com.stock.stockday.vo.StockLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Component
@Aspect
public class SysLoggerAspect {
    @Autowired
    private LoggerService loggerService;

    @Pointcut("execution(public * com.stock.stockday.controller.FindController.*(..))")
    public void loggerPointCut() {

    }


//    @Around("loggerPointCut()")
//    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("around before");
//        StockLog stockLog = new StockLog();
//        //设置日志各字段信息
//        stockLog.setContext("获取日数据开始");
//        String userId = SessionUserUtil.getCurrentUserId();
//        stockLog.setOperateId(StringUtils.isEmpty(userId)?"system":userId);
//        loggerService.log(stockLog);
//        pjp.proceed();
//        stockLog.setContext("获取日数据结束");
//        stockLog.setOperateId(StringUtils.isEmpty(userId)?"system":userId);
//        loggerService.log(stockLog);
//    }

//    @Around("loggerPointCut()")
//    public ResultData<List<StockDayVo>> doFindControllerAround(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("around before");
//        StockLog stockLog = new StockLog();
//        //设置日志各字段信息
//        stockLog.setContext("查询概率数据开始");
//        String userId = SessionUserUtil.getCurrentUserId();
//        stockLog.setOperateId(StringUtils.isEmpty(userId)?"system":userId);
//        loggerService.log(stockLog);
//        ResultData<List<StockDayVo>> stockDayVoList=( ResultData<List<StockDayVo>>)pjp.proceed();
//        stockLog.setContext("查询概率数据结束");
//        stockLog.setOperateId(StringUtils.isEmpty(userId)?"system":userId);
//        loggerService.log(stockLog);
//        return stockDayVoList;
//    }

//    @Before("loggerPointCut()")
//    public void doFindControllerBefore(JoinPoint joinPoint) throws Throwable {
//        System.out.println("around before");
//        StockLog stockLog = new StockLog();
//        //设置日志各字段信息
//        stockLog.setContext("查询概率数据开始");
//        String userId = SessionUserUtil.getCurrentUserId();
//        stockLog.setOperateId(StringUtils.isEmpty(userId)?"system":userId);
//        loggerService.log(stockLog);
//    }
//
//    @After("loggerPointCut()")
//    public void doFindControllerAfter(JoinPoint joinPoint) throws Throwable {
//        StockLog stockLog = new StockLog();
//        //设置日志各字段信息
//        String userId = SessionUserUtil.getCurrentUserId();
//        stockLog.setContext("查询概率数据结束");
//        stockLog.setOperateId(StringUtils.isEmpty(userId)?"system":userId);
//        loggerService.log(stockLog);
//    }

    @AfterThrowing(throwing="ex", pointcut="loggerPointCut()")
    public void doThrowing(Throwable ex) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        StockLog stockLog = new StockLog();
        //设置日志各字段信息
        String userId = SessionUserUtil.getCurrentUserId();
        stockLog.setContext("查询概率数据异常"+ex.getMessage());
        stockLog.setOperateId(StringUtils.isEmpty(userId)?"system":userId);
        stockLog.setUrl(request.getRequestURI()+","+request.getMethod()+","+request.getParameterMap().size());
        stockLog.setStartTime(new Date());
        stockLog.setResult("N");
        loggerService.log(stockLog);
    }

    @AfterReturning(returning="rvt", pointcut="loggerPointCut()")
    public void doAfterReturning(Object rvt) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        StockLog stockLog = new StockLog();
        //设置日志各字段信息
        String userId = SessionUserUtil.getCurrentUserId();
        stockLog.setUrl(request.getRequestURI()+","+request.getMethod()+","+request.getParameterMap().size());
        stockLog.setContext("查询概率数据结束返回值"+rvt);
        stockLog.setStartTime(new Date());
        stockLog.setResult("Y");
        stockLog.setOperateId(StringUtils.isEmpty(userId)?"system":userId);
        loggerService.log(stockLog);
    }


//    @Before("loggerPointCut()")
//    public void saveSysLog(JoinPoint joinPoint) {
//        StockLog stockLog = new StockLog();
//        //设置日志各字段信息
//        stockLog.setContext();
//
//        //保存系统日志
//        System.out.println("********aop out success*********");
//        loggerService.log(stockLog);
//    }

}
