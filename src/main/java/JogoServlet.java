import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/JogoServlet")
public class JogoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        

        int valor1 = Integer.parseInt(request.getParameter("valor1"));
        int valor2 = Integer.parseInt(request.getParameter("valor2"));
        
        String jogador1 = request.getParameter("jogador1");
        String jogador2 = request.getParameter("jogador2");


        Jogo jogo = new Jogo();

        jogo.setValor1(valor1);
        jogo.setValor2(valor2);
        jogo.setJogador1(jogador1);
        jogo.setJogador2(jogador2);
        

        jogo.FimDeJogo();


        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head><title>Resultado do Jogo</title></head>");
        out.println("<body>");
        out.println("<h1>Resultado do Jogo</h1>");
        out.println("<ul>");
        out.println("<li>Jogador 1: " + jogador1 + " (Valor 1: " + valor1 + ")</li>");
        out.println("<li>Jogador 2: " + jogador2 + " (Valor 2: " + valor2 + ")</li>");
        out.println("<li><strong>Resultado: " + jogo.getResultado() + "</strong></li>");
        out.println("</ul>");
        

        out.println("<a href='index.html'>Voltar para a Página Inicial</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
