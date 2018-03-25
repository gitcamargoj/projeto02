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
                    
                    out.println("<!-- CSS -->");
                    out.println("<link rel=\"stylesheet\" href=\"css/css.css\">");
                    
                    out.println("<!-- Google Fonts -->");
                    out.println("<link href=\"https://fonts.googleapis.com/css?family=Roboto+Slab\" rel=\"stylesheet\"> ");
                    
                    out.println("<!-- Favicon -->");
                    out.println("<link rel=\"icon\" href=\"img/favicon/dollar.gif\">");
                    
                    out.println("<title>Juros.calc</title>");     
                    
                    out.println("<!-- Responsive meta tag Bootstrap -->");
                    out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
                out.println("</head>");
                out.println("<body>");
                    out.println("<!-- Navbar Bootstrap -->");
                    out.println(
                        "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n" +
                        "  <a class=\"navbar-brand\" href=\"home\">Juros.calc</a>\n" +
                        "  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                        "    <span class=\"navbar-toggler-icon\"></span>\n" +
                        "  </button>\n" +
                        "  <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n" +
                        "    <ul class=\"navbar-nav\">\n" +
                        "      <li class=\"nav-item active\">\n" +
                        "        <a class=\"nav-link\" href=\"home\">Home<span class=\"sr-only\">(current)</span></a>\n" +
                        "      </li>\n" +
                        "      <li class=\"nav-item\">\n" +
                        "        <a class=\"nav-link\" href=\"jurossimples\">Juros Simples</a>\n" +
                        "      </li>\n" +
                        "      <li class=\"nav-item\">\n" +
                        "        <a class=\"nav-link\" href=\"juroscomposto\">Juros Composto</a>\n" +
                        "      </li>\n" +
                        "    </ul>\n" +
                        "  </div>\n" +
                        "</nav>");
                    
                    out.println("<!-- Image caps Bootstrap -->");
                    out.println(
                        "<div class=\"card mb-3\">\n" +
                        "  <img class=\"card-img-top bannerbody\" src=\"img/banner/dollar_banner.png\" alt=\"notas de dólar americano enroladas\">\n" +
                        "  <div class=\"card-body\">\n" +
                        "    <h5 class=\"card-title h5body\">Juros.calc</h5>\n" +
                        "    <p class=\"card-text pbody\">O Juros.calc é um site bem esperto feito em Java EE com o objetivo de realizar o cálculo de juros simples e composto. E apesar de parecer e me comportar como uma página HTML, na verdade sou um Servlet! Quer saber mais sobre Servlets? Então <a href=\"https://pt.wikipedia.org/wiki/Servlet\" target=\"_blank\">clica aqui</a>!</p>\n" +
                        "  </div>\n" +
                        "</div>");
                    
                    out.println("<hr><br><center><h4 class=\"h4body\">O Juros.calc foi desenvolvido por:</h4></center><br><hr>");

                    out.println("<!-- Card groups Bootstrap -->");
                    out.println(
                        "<div class=\"card-group\">\n" +
                        "  <div class=\"card\">\n" +
                        "    <center><img class=\"rounded-circle imgdev\" src=\"img/devs/junior.png\" alt=\"foto do desenvolvedor Junior, foto em preto e branco\">\n</center>" +
                        "    <div class=\"card-body\">\n" +
                        "      <h5 class=\"card-title h5body\">Junior</h5>\n" +
                        "      <p class=\"card-text pbody\">Aficionado por novas tecnologias, não perde nenhuma WWDC, Google I/O e Build. Curte cerveja e ficção científica.</p>\n" +
                        "      <p class=\"card-text\"><small class=\"text-muted\"><a href=\"https://github.com/junioracamargo\" target=\"_blank\">GitHub</a></small></p>\n" +
                        "      <p class=\"card-text\"><small class=\"text-muted\"><a href=\"https://linkedin.com/in/junioracamargo\" target=\"_blank\">LinkedIn</a></small></p>\n" +        
                        "    </div>\n" +
                        "  </div>\n" +
                        "  <div class=\"card\">\n" +
                        "    <center><img class=\"rounded-circle imgdev\" src=\"img/devs/willians.png\" alt=\"foto do desenvolvedor Willians\">\n</center>" +
                        "    <div class=\"card-body\">\n" +
                        "      <h5 class=\"card-title h5body\">Willians</h5>\n" +
                        "      <p class=\"card-text pbody\">Se tem cerveja e um projeto, não importa a linguagem!</p>\n" +
                        "      <p class=\"card-text\"><small class=\"text-muted\"><a href=\"https://github.com/wiliansaugusto\" target=\"_blank\">GitHub</a></small></p>\n" +
                        "      <p class=\"card-text\"><small class=\"text-muted\"><a href=\"https://www.linkedin.com/in/willians-tadeu-atan%C3%A1zio-augusto-629791b0\" target=\"_blank\">LinkedIn</a></small></p>\n" +   
                        "    </div>\n" +
                        "  </div>\n" +
                        "  <div class=\"card\">\n" +
                        "    <center><img class=\"rounded-circle imgdev\" src=\"img/devs/igor.png\" alt=\"foto do desenvolvedor Igor\">\n</center>" +
                        "    <div class=\"card-body\">\n" +
                        "      <h5 class=\"card-title h5body\">Igor</h5>\n" +
                        "      <p class=\"card-text pbody\">Apaixonado por Carros, tecnologias e tatuagens. Adora beber qualquer coisa que tenha álcool.</p>\n" +
                        "      <p class=\"card-text\"><small class=\"text-muted\"><a href=\"https://github.com/iitenorio\" target=\"_blank\">GitHub</a></small></p>\n" +
                        //"      <p class=\"card-text\"><small class=\"text-muted\"><a href=\"https://linkedin.com/in/\" target=\"_blank\">LinkedIn</a></small></p>\n" +   
                        "    </div>\n" +
                        "  </div>\n" +
                        "</div>");
                    
                    out.println("<hr><br><center><h4 class=\"h4body\">Cálcule agora mesmo juros simples e composto!</h4></center><br><hr>");

                    out.println("<!-- Grid markup Bootstrap -->");
                    out.println(
                        "<center><div class=\"row\">\n" +
                        "  <div class=\"col-sm-6\">\n" +
                        "    <div class=\"card\">\n" +
                        "      <div class=\"card-body\">\n" +
                        "        <h5 class=\"card-title h5body\">Juros Simples</h5>\n" +
                        "        <p class=\"card-text pbody\">Digite os dados solicitados a baixo para o cálculo do Juros Simples.</p>\n" +
                        "        <form action=\"jurossimples\"> "+
                        "<table>" +
                        "        <tr><td><input class=\"form-control\" type=\"text\" name=\"capital\" placeholder=\"Informe o Capital\"></td></tr>" +
                        "        <tr><td><input class=\"form-control\" type=\"text\" name=\"taxa\" placeholder=\"Informe a Taxa\"></td></tr>" +
                        "        <tr><td><input class=\"form-control\" type=\"text\" name=\"periodo\" placeholder=\"Informe o Periodo (em meses)\"></td></tr>" +
                        "</table>" +
                        "        <br><input class=\"bttbody btn btn-primary\" type=\"submit\" name=\"enviar\" value=\"Calcular!\">"+
                        "        </form> " +
                        "      </div>\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "  <div class=\"col-sm-6\">\n" +
                        "    <div class=\"card\">\n" +
                        "      <div class=\"card-body\">\n" +
                        "        <h5 class=\"card-title h5body\">Juros Composto</h5>\n" +
                        "        <p class=\"card-text pbody\">Digite os dados solicitados a baixo para o cálculo do Juros Composto.</p>\n" +
                        "        <form action=\"juroscomposto\"> "+   
                        "<table>" +
                        "" +        
                        "        <tr><td><input class=\"form-control\" type=\"text\" name=\"capital\" placeholder=\"Informe o Capital\"></td></tr>" +
                        "        <tr><td><input class=\"form-control\" type=\"text\" name=\"taxa\" placeholder=\"Informe a Taxa\"></td></tr>" +
                        "        <tr><td><input class=\"form-control\" type=\"text\" name=\"periodo\" placeholder=\"Informe o Periodo\"></td></tr>" +
                        "</table>" +
                        "        <br><input class=\"bttbody btn btn-primary\" type=\"submit\" name=\"enviar\" value=\"Calcular!\">"+
                        "        </form> " +        
                        "      </div>\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "</div></center>");

                    out.println("<!-- Footer -->");
                    out.println("<hr><br><br><center><footer class=\"footerbody\">GitHub do Projeto: <a href=\"https://github.com/junioracamargo/projeto02\">Projeto Juros.calc</a></footer></center><br><br>");
                    
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
