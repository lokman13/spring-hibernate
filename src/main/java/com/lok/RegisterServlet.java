package com.lok;

import com.lok.dao.RegisterDao;
import com.lok.entity.RegisterBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    public RegisterServlet(){

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fullName = request.getParameter("fullname");
        String email = request.getParameter("email");
        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        RegisterBean registerBean = new RegisterBean();
        registerBean.setFullName(fullName);
        registerBean.setEmail(email);
        registerBean.setUserName(userName);
        registerBean.setPassword(password);


        String userRegistered = RegisterDao.registerUser(registerBean);

        if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
        {
            request.getRequestDispatcher("/home.jsp").forward(request, response);
        }
        else   //On Failure, display a meaningful message to the User.
        {
            request.setAttribute("errMessage", userRegistered);
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }

    }
}