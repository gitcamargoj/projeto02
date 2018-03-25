/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.ads.poo.projeto02;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tenorio
 */
@WebServlet(name = "JurosSimples", urlPatterns = {"/jurossimples"})
public class JurosSimples extends HttpServlet {

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
/* INICIO - NAVBAR + CSS */
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
                        "      <li class=\"nav-item\">\n" +
                        "        <a class=\"nav-link\" href=\"home\">Home<span class=\"sr-only\">(current)</span></a>\n" +
                        "      </li>\n" +
                        "      <li class=\"nav-item active\">\n" +
                        "        <a class=\"nav-link\" href=\"jurossimples\">Juros Simples</a>\n" +
                        "      </li>\n" +
                        "      <li class=\"nav-item\">\n" +
                        "        <a class=\"nav-link\" href=\"juroscomposto\">Juros Composto</a>\n" +
                        "      </li>\n" +
                        "    </ul>\n" +
                        "  </div>\n" +
                        "</nav>");
/* FIM - NAVBAR + CSS */
/* INICIO - FORMULARIO JUROS SIMPLES */  

                   
                    out.println("<br><br><!-- Grid markup Bootstrap -->");
                    out.println(
                        "  <center><div class=\"col-sm-6\">\n" +
                        "    <div class=\"card\">\n" +
                        "      <div class=\"card-body\">\n" +
                        "        <h5 class=\"card-title h5body\">Juros Simples</h5>\n" +
                        "        <p class=\"card-text pbody\">Digite os dados solicitados a baixo para o cálculo do Juros Simples.</p>\n" +
                        "        <form action=\"jurossimples\"> "+
                        "<table>" +
                        "        <tr><td><input class=\"form-control\" type=\"text\" name=\"capital\" placeholder=\"Informe o Capital\"></td></tr>" +
                        "        <tr><td><input class=\"form-control\" type=\"text\" name=\"taxa\" placeholder=\"Informe a Taxa\"></td></tr>" +
                        "        <tr><td><input class=\"form-control\" type=\"text\" name=\"periodo\" placeholder=\"Periodo (em meses)\"></td></tr>" +
                        "</table>" +
                        "        <br><input class=\"bttbody btn btn-primary\" type=\"submit\" name=\"enviar\" value=\"Calcular!\">"+
                        "        </form> " +
                        "      </div>\n" +
                        "    </div>\n" +
                        "</div></center>");
/* FIM - FORMULARIO JUROS SIMPLES */
/* INICIO - CALCULO JUROS SIMPLES */  
            try{
                float cap = Float.parseFloat(request.getParameter("capital"));
                float tax = Float.parseFloat(request.getParameter("taxa"));
                float per = Float.parseFloat(request.getParameter("periodo"));
                
                tax = (tax / 100);
                
                float montante = (cap * tax * per) - cap;
                float valorFinal = cap + montante;
                
                out.println("<br><center>");
                out.println(
                    "  <div class=\"col-sm-6\">\n" +
                    "    <div class=\"card\">\n" +
                    "      <div class=\"card-body\">\n" +
                    "        <h5 class=\"card-title h5body\">Juros Calculado</h5>\n" +
                    "        <p class=\"card-text pbody\">Informações do calculo realizado</p>\n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "</div></center>");
                
                DecimalFormat formatter = new DecimalFormat("#.00");
                String converteCap = formatter.format(cap);
                String converteValorFinal = formatter.format(valorFinal);
                float total = (valorFinal + cap);
                String converteTotal = formatter.format(total);
                
                out.println("<br><center>Valor do Capital: R$ " + converteCap);
                out.println("<br><center>Valor do Juros: R$ " + converteValorFinal);
                out.println("<br>Valor Total: R$ " + (converteTotal));
                
            }catch(Exception ex){
                out.println("<br><center><p class=\"pbody\">Entrar com um valor válido acima.</p>");
             }
/* FIM - CALCULO JUROS SIMPLES */ 

/* FIM - JUROS SIMPLES */      
            
            
            
/* INICIO - FOOTER */            
	    out.println("<!-- Footer -->");
                out.println("<hr><br><br><center><footer class=\"footerbody\">GitHub do Projeto: <a href=\"https://github.com/junioracamargo/projeto02\">Projeto Juros.calc</a></footer></center><br><br>");
                    
                out.println("<!-- JS Bootstrap -->");
                out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
                out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>");
                out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
                
/* FIM - FOOTER */                  
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
