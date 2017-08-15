package cn.diary.controller;

import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

/**
 * Created by handong on 2017/7/25.
 */
public class BaseController {
    @Autowired
    protected HttpServletRequest request;
    @Resource
    protected HttpSession session;
    @Resource
    protected HttpServletResponse response;

    /*public BaseController(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        this.request = request;
        this.session = session;
        this.response = response;
    }*/

    protected void json(Object result) throws Exception {
        if (result == null)
            json("{}");
        else
            json(new Gson().toJson(result));
    }

    protected void json(Map<String, Object> result) throws Exception {
        if (result == null || result.size() == 0)
            json("{}");
        else
            json(new Gson().toJson(result));
    }

    protected void json(List<?> results) throws Exception {
        if (results == null || results.size() == 0)
            json("[]");
        else
            json(new Gson().toJson(results));
    }

    protected void json(String json) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
        out.close();
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpSession getSession() {
        return session;
    }

    public void setSession(HttpSession session) {
        this.session = session;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }


}
