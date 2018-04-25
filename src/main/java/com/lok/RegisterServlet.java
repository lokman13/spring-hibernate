package com.lok;

import com.lok.tables.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

        String fullName = request.getParameter("nom");


        String userName = request.getParameter("prenom");

        Configuration cfg= new Configuration();
        cfg.configure("META-INF/hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction= session.beginTransaction();

        User user = new User();
        user.setId(1);
        user.setNom(fullName);
        user.setPrenom(userName);

        session.save(user);
        transaction.commit();
        session.close();
        request.getRequestDispatcher("/register.jsp").forward(request, response);
        }

    }

