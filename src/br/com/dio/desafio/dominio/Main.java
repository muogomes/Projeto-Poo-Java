package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrição curso de Java");
		curso1.setCargaHoraria(8);
		
		curso2.setTitulo("curso Js");
		curso2.setDescricao("descrição curso de Js");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("descrição mentoria Java");
		mentoria.setData(LocalDate .now());

		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		*/
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("BootCamp Java");
		bootcamp.setDescricao("Descrição do Bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMurilo = new Dev();
		devMurilo.setNome("Murilo");
		devMurilo.inscreverBootcamp(bootcamp);
		devMurilo.progredir();
		devMurilo.progredir();
		System.out.println("-");
		System.out.println("Conteudo Inscritos: " + devMurilo.getConteudosIncritos());
		System.out.println("Conteudo Concluidos: " + devMurilo.getConteudosConcluidos());
		System.out.println("XP: " + devMurilo.calcularTotalXp());
		
		System.out.println("----------------");
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		devMaria.progredir();
		System.out.println("-");
		System.out.println("Conteudo Inscritos: " + devMaria.getConteudosIncritos());
		System.out.println("Conteudo Concluidos: " + devMaria.getConteudosConcluidos());
		System.out.println("XP: " + devMaria.calcularTotalXp());
		
		System.out.println("----------------");
		
		Dev devElaine = new Dev();
		devElaine.setNome("Elaine");
		devElaine.inscreverBootcamp(bootcamp);
		devElaine.progredir();
		System.out.println("-");
		System.out.println("Conteudo Inscritos: " + devElaine.getConteudosIncritos());
		System.out.println("Conteudo Concluidos: " + devElaine.getConteudosConcluidos());
		System.out.println("XP: " + devElaine.calcularTotalXp());
		
		
		
		
		
		
	}

}
