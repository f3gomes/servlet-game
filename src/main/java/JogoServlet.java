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
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Resultado do Jogo</title>");
        out.println("</head>");
        out.println("<body style='font-family: Arial, sans-serif; background-color: #f4f7fb; color: #333; display: flex; justify-content: center; flex-direction: column; align-items: center; height: 100vh;'>");
        out.println("<h1 style='font-size: 3rem; color: #4caf50; margin-bottom: 20px; text-align: center; font-weight: 700;'>Resultado do Jogo</h1>");
        out.println("<ul>");
        out.println("<li style='font-size: 1.25rem; color: #007bff;'>Jogador 1: " + jogador1 + " (" + valor1 + ")</li>");
        out.println("<li style='font-size: 1.25rem; color: #007bff;'>Jogador 2: " + jogador2 + " (" + valor2 + ")</li>");
        out.println("<li><strong style='font-size: 1.5rem;'>" + jogo.getResultado() + "</strong></li>");
        out.println("</ul>");
        out.println("<a href='index.html' style='text-decoration: none; font-size: 1.25rem; font-weight: 500; color: #007bff; padding: 10px 20px; border-radius: 5px; background-color: #fff; box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1); transition: background-color 0.3s ease;'>Voltar para a Página Inicial</a>");
        out.println("</body>");
        out.println("</html>");

    }
}
