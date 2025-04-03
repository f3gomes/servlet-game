
public class Jogo {
	private Integer valor1;
	private Integer valor2;
	private String jogador1;
	private String jogador2;
	private String resultado;
	
	public Integer getValor1() {
		return valor1;
	}
	
	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}
	
	public Integer getValor2() {
		return valor2;
	}
	
	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}
	
	public String getJogador1() {
		return jogador1;
	}
	
	public void setJogador1(String jogador1) {
		this.jogador1 = jogador1;
	}
	
	public String getJogador2() {
		return jogador2;
	}
	
	public void setJogador2(String jogador2) {
		this.jogador2 = jogador2;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public void FimDeJogo() {
        if (valor1 > valor2) {
            resultado = "Vencedor: " + jogador1;
        } else if (valor2 > valor1) {
            resultado = "Vencedor: " + jogador2;
        } else {
            resultado = "Empate";
        }
	}
	
}
