package com.stock.apicommon.security;


import com.stock.apicommon.model.UserInfoDetail;
import org.springframework.beans.BeanUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;


import java.util.Map;

/**
 * 当前会话用户
 */
public class SessionUserUtil {

    public static UserInfoDetail getCurrentLoginUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof OAuth2Authentication) {
            OAuth2Authentication oAuth2Auth = (OAuth2Authentication) authentication;
            authentication = oAuth2Auth.getUserAuthentication();
            if (authentication instanceof UsernamePasswordAuthenticationToken) {
                UserInfoDetail userInfoDetail = new UserInfoDetail();
                UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) authentication;
                Object principal = authentication.getPrincipal();
                if (principal instanceof LoginUser) {
                    BeanUtils.copyProperties(principal, userInfoDetail);
                    return userInfoDetail;
                } else {
                    Map map = (Map) ((Map) authenticationToken.getDetails()).get("principal");
                    if (map != null) {
                        userInfoDetail.setId((String)map.get("id"));
                        userInfoDetail.setName((String)map.get("name"));
                        userInfoDetail.setLoginName((String)map.get("loginName"));
                        userInfoDetail.setPhoneNo((String)map.get("phoneNo"));
                        userInfoDetail.setStatus((String)map.get("status"));
                        return userInfoDetail;
                    }
                }
            }
        }
        return null;
    }

    public static String getCurrentUserId() {
        UserInfoDetail user = getCurrentLoginUser();
        return user == null ? null : user.getId();
    }

    public static String getCurrentUserName() {
        UserInfoDetail user = getCurrentLoginUser();
        return user == null ? null : user.getName();
    }

    public static String getCurrentPhoneNo() {
        UserInfoDetail user = getCurrentLoginUser();
        return user == null ? null : user.getPhoneNo();
    }
}
