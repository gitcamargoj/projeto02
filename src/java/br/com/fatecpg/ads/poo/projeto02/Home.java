/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.ads.poo.projeto02;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author junio
 */
@WebServlet(name = "Home", urlPatterns = {"/home"})
public class Home extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"pt-br\">");
                out.println("<head>");
                    out.println("<!-- CSS Bootstrap -->");
                    out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
                    out.println("<link rel=\"icon\" href=\"imagens/favicon/favicon.png\">");
                    out.println("<title>Juros.calc</title>");     
                    
                    out.println("<!-- Responsive meta tag Bootstrap -->");
                    out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
                out.println("</head>");
                out.println("<body>");
                    out.println("<!-- Navbar Bootstrap -->");
                    out.println(
                        "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n" +
                        "  <a class=\"navbar-brand\" href=\"#\">Juros.calc</a>\n" +
                        "  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                        "    <span class=\"navbar-toggler-icon\"></span>\n" +
                        "  </button>\n" +
                        "  <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n" +
                        "    <ul class=\"navbar-nav\">\n" +
                        "      <li class=\"nav-item active\">\n" +
                        "        <a class=\"nav-link\" href=\"#\">Home<span class=\"sr-only\">(current)</span></a>\n" +
                        "      </li>\n" +
                        "      <li class=\"nav-item\">\n" +
                        "        <a class=\"nav-link\" href=\"#\">Juros Simples</a>\n" +
                        "      </li>\n" +
                        "      <li class=\"nav-item\">\n" +
                        "        <a class=\"nav-link\" href=\"#\">Juros Composto</a>\n" +
                        "      </li>\n" +
                        "    </ul>\n" +
                        "  </div>\n" +
                        "</nav>");
                    
                    out.println("<!-- Image caps Bootstrap -->");
                    out.println(
                        "<div class=\"card mb-3\">\n" +
                        "  <img class=\"card-img-top\" src=\"...\" alt=\"Card image cap\">\n" +
                        "  <div class=\"card-body\">\n" +
                        "    <h5 class=\"card-title\">Card title</h5>\n" +
                        "    <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n" +
                        "    <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\n" +
                        "  </div>\n" +
                        "</div>");
                    
                    out.println("<!-- Alerts Bootstrap -->");
                    out.println(
                        "<div class=\"alert alert-light\" role=\"alert\">\n" +
                        "  Conheça os nossos desenvolvedores.\n" +
                        "</div>");
                    out.println("<!-- Card groups Bootstrap -->");
                    out.println(
                        "<div class=\"card-group\">\n" +
                        "  <div class=\"card\">\n" +
                        "    <img class=\"card-img-top\" src=\"...\" alt=\"Card image cap\">\n" +
                        "    <div class=\"card-body\">\n" +
                        "      <h5 class=\"card-title\">Card title</h5>\n" +
                        "      <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n" +
                        "      <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "  <div class=\"card\">\n" +
                        "    <img class=\"card-img-top\" src=\"...\" alt=\"Card image cap\">\n" +
                        "    <div class=\"card-body\">\n" +
                        "      <h5 class=\"card-title\">Card title</h5>\n" +
                        "      <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\n" +
                        "      <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "  <div class=\"card\">\n" +
                        "    <img class=\"card-img-top\" src=\"...\" alt=\"Card image cap\">\n" +
                        "    <div class=\"card-body\">\n" +
                        "      <h5 class=\"card-title\">Card title</h5>\n" +
                        "      <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>\n" +
                        "      <p class=\"card-text\"><small class=\"text-muted\">Last updated 3 mins ago</small></p>\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "</div>");
                    
                    out.println("<!-- Alerts Bootstrap -->");
                    out.println(
                        "<div class=\"alert alert-light\" role=\"alert\">\n" +
                        "  Cálcule agora mesmo juros simples e composto!\n" +
                        "</div>");
                    out.println("<!-- Grid markup Bootstrap -->");
                    out.println(
                        "<div class=\"row\">\n" +
                        "  <div class=\"col-sm-6\">\n" +
                        "    <div class=\"card\">\n" +
                        "      <div class=\"card-body\">\n" +
                        "        <h5 class=\"card-title\">Special title treatment</h5>\n" +
                        "        <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n" +
                        "        <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n" +
                        "      </div>\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "  <div class=\"col-sm-6\">\n" +
                        "    <div class=\"card\">\n" +
                        "      <div class=\"card-body\">\n" +
                        "        <h5 class=\"card-title\">Special title treatment</h5>\n" +
                        "        <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n" +
                        "        <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n" +
                        "      </div>\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "</div>");
                    
                    out.println("<!-- JS Bootstrap -->");
                    out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
                    out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>");
                    out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
                out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
