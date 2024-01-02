package edu.fundamentos.jar;

import edu.fundamentos.jar.models.AbstractPersona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import edu.fundamentos.jar.models.Alumno;
import edu.fundamentos.jar.models.Profesor;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class JarApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JarApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		List<AbstractPersona> personas = new ArrayList<AbstractPersona>();
		Alumno alumnoUno = new Alumno();
		alumnoUno.registrarAsistencia();
		Alumno alumnoDos = new Alumno();
		alumnoDos.registrarAsistencia();
		Profesor profesorUno = new Profesor("Edwin","Tumax","edwintumax@gmail.com","1999");
		profesorUno.registrarAsistencia();
		personas.add(alumnoUno);
		personas.add(alumnoDos);
		personas.add(profesorUno);
		System.out.println("Iniciando sistema ... en " + Profesor.getEstablecimiento());

		System.out.println("Datos del almuno: "+ alumnoUno.getApellidos() + " " + alumnoUno.getNombres() + " " + ((Alumno) alumnoUno).getCarne());
		System.out.println("Fin del programa");


		int valor1 = 100;
		float valor2 = 99f;
		double valor3 = 1000d;
		byte valor4 =100;

		String.valueOf(valor1);
		String.valueOf(valor2);
		String.valueOf(valor3);
		String.valueOf(valor4);
	}

}
