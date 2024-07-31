package org.example.w2.bmi;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
@WebServlet(value = "/bmi")
public class BMIController extends HttpServlet {

      @Override
      protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
          try {
              req.getRequestDispatcher("/WEB-INF/bmiInput.jsp")
                      .forward(req,resp);
          }catch(Exception e) {
              e.printStackTrace();
          }
      }
      @Override
      protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
          try {
              req.getRequestDispatcher("/WEB-INF/bmiResult.jsp")
                      .forward(req,resp);
          }catch(Exception e) {
              e.printStackTrace();
          }
      }

}
