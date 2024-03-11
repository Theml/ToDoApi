package br.edu.uniacademia.toDoApi;

import br.edu.uniacademia.toDoApi.model.Admin;
import br.edu.uniacademia.toDoApi.model.Etipo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ToDoApiApplication.class, args);
	}


	@Override
	public void run(String... args)throws Exception{
		System.out.println("Bem vindo ao Spring");
		Admin adm = new Admin( "Lua","lu","123");
		adm.setTipoAdmin( Etipo.AdminFull );
		adm.setEmail("Moon");
		adm.setSaldo(15000);
		System.out.printf("Olá " + adm.getNome() + "\nSeu saldo atual é de :" + adm.getSaldo());
	}
}
