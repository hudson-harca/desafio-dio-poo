package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Java", "Descrição do curso Java", 8);
		Curso curso2 = new Curso("Js", "Descrição do curso Js", 4);
		
		Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição da Mentoria Java", LocalDate.now());

		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteudos Inscritos:" + devCamila.getConteudosInscritos());
		System.out.println("Conteudos Inscritos:" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("Conteudos Inscritos:" + devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluídos:" + devCamila.getConteudosConcluidos());

		
		System.out.println("XP: " + devCamila.calculartotalXP());
		System.out.println("--------------------");

		Dev devJoao = new Dev("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos:" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("---");
		System.out.println("Conteudos Inscritos:" + devJoao.getConteudosInscritos());
		System.out.println("Conteudos Concluídos:" + devJoao.getConteudosConcluidos());
		System.out.println("XP: " +devJoao.calculartotalXP());
		
	}

}
