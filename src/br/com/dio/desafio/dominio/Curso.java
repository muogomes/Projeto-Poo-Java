package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	
	//Atributos:
	
	
	private int cargaHoraria;
	
	@Override
	public double calcularXP() {
		
		return XP_PADRAO * cargaHoraria ;
	}
	
	
	
	//Metodos de Acesso:
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	//Metodo toString():
	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}

	

}
