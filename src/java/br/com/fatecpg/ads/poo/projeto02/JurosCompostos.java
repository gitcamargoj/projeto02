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
@WebServlet(name = "JurosCompostos", urlPatterns = {"/juroscomposto"})
public class JurosCompostos extends HttpServlet {

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
/* FIM - NAVBAR + CSS */


            try {
int qtdparcelas = Integer.parseInt(request.getParameter("periodo"));
float txjuros = (Float.parseFloat(request.getParameter("taxa")));
float investimento = Float.parseFloat(request.getParameter("capital" ));
float investimentoInicial = investimento;

DecimalFormat formatter = new DecimalFormat("#.00");
int count;      
     out.println("<div class='container divOne'><h2>O investivento inicial foi de: "+investimentoInicial+"</h2>"
     +"<h2>Com uma taxa de juros de: "+(txjuros)+" %</h2>"
     +"<h2>em um periodo de: "+qtdparcelas+"</div ></h2>");
     txjuros= txjuros/100;
     String display = formatter.format(investimento);
     out.println("<button class=\"btn btn-primary botao\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapseExample\" aria-expanded=\"false\" aria-controls=\"collapseExample\">\n" +
"    Expandir as parcelas" +
"  </button>");
     out.println("<div class=\"collapse \" id=\"collapseExample\">\n" +
"  <div class=\"card card-body\">");
for (count=0; count< qtdparcelas; count++){
    investimento=investimento+(investimento*txjuros);
    display= formatter.format(investimento);  

<<<<<<< HEAD
    if (count % 2 == 0){
        out.println("<h3  class='container  impar'>O valor da parcela "+(count+1)+" é do valor de: R$" +display+"</h3>");
        
    }else{
        out.println("<h3  class='container  par'>O valor da parcela "+(count+1)+" é do valor de: R$" +display+"</h3>");
    }
=======
    
    out.println("<h3  class='container divOne'>O valor da parcela "+(count+1)+" é do valor de: R$" +display+"</h3>");
     
>>>>>>> origin/master

}
out.println("</ div>");
out.println("</div>");
} catch (Exception e) {
    
    out.println("<div class=\"container divOne\"><h4>Os dados estão inconcistentes</h4>"
            + "<h4>Por favor usarem pontos ao inves de virgula</h4>"
            + "<h4>Usarem numeros inteiros ao informar a quantidades de parcelas</h4>"
            + "<h4>Obrigado</h4>"
            + "<button type='button' class='btn btn-outline-primary'><a href='home'>Voltar</a></button></div>"  );
            }
            
            
            
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

    public JurosCompostos() {
        
        
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


