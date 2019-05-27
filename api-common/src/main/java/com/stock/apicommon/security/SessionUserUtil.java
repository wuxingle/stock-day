package com.stock.apicommon.security;

public class SessionUserUtil {

    public static LoginUser getCurrentLoginUser() {
        LoginUser currentLoginUser = new LoginUser();
        currentLoginUser.setId("system"); // 后期扩展,从授权中心读取
        return currentLoginUser;
    }

    public static String getLoginUserId() {
        LoginUser user = getCurrentLoginUser();
        return user == null ? null : user.getId();
    }

    public static String getUserName() {
        LoginUser user = getCurrentLoginUser();
        return user == null ? null : user.getName();
    }

    public static String getPhoneNo() {
        LoginUser user = getCurrentLoginUser();
        return user == null ? null : user.getPhoneNo();
    }
}
