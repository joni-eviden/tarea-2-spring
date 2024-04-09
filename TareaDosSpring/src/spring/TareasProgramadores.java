package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TareasProgramadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");

		// Una vez cargado el archivo XML, le pedimos a ete XML el bean (el objeto)

		Programadores Joni = contexto.getBean("tarea", Programadores.class);

		System.out.println( "Joni "+ Joni.getTarea());

		// Hacemos lo mismo pero para tener otro ejemplo
		Programadores Pepe = contexto.getBean("tarea1", Programadores.class);
		System.out.println( "Pepe "+ Joni.getTarea());

		// Cerramos el archivo XML
		contexto.close();

	}

}
