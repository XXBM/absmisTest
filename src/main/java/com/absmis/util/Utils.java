package com.absmis.util;

import com.absmis.domain.authority.User;
import com.absmis.service.authority.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Calendar;


/**
 * Created by ibs on 16/12/3.
 */
public class Utils {
    public static SecurityContextImpl securityContext;
    @Autowired
    public static UserService userService;
    public static String username = null;
    public static User storedUser = null;

    public static User returnUser(){
        username = SecurityContextHolder.getContext().getAuthentication().getName();
        storedUser = userService.findByUsername(username);
        return storedUser;
    }

    /**获取当前UserName*/
    public static String getCurrentUserName(HttpServletRequest request){
        securityContext = (SecurityContextImpl) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        return securityContext.getAuthentication().getName();
    }

    /**得到一个Pageable对象*/
    public static Pageable getPageable(HttpServletRequest request,
                                       Integer page,
                                       Integer size,
                                       Sort sort){
        if(sort!=null){
            sort = new Sort(Sort.Direction.fromString(request.getParameter("order")),request.getParameter("description"));
        }else{
            sort = new Sort(Sort.Direction.DESC,"id");
        }
        Pageable pageable = new PageRequest(page-1,size,sort);
        return pageable;
    }

    public static String makeMD5(String p) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("md5");
            md.update(p.getBytes());
            String password = new BigInteger(1, md.digest()).toString(16);
            return password;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }


    public static int getSeason(Calendar date) {

        int season = 0;
        int month = date.get(Calendar.MONTH);
        switch (month) {
            case Calendar.JANUARY:
            case Calendar.FEBRUARY:
            case Calendar.MARCH:
                season = 1;
                break;
            case Calendar.APRIL:
            case Calendar.MAY:
            case Calendar.JUNE:
                season = 2;
                break;
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.SEPTEMBER:
                season = 3;
                break;
            case Calendar.OCTOBER:
            case Calendar.NOVEMBER:
            case Calendar.DECEMBER:
                season = 4;
                break;
            default:
                break;
        }
        return season;
    }
}
