package com.project.appwebgonrod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.appwebgonrod.services.UsuarioService;

@SpringBootApplication
public class AppWebGonrodApplication implements CommandLineRunner {

	@Autowired
	UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(AppWebGonrodApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Usuario usuario1 = new Usuario();
		// usuario1.setNombres("Gonzalo Alexander");
		// usuario1.setApellidos("Sihues Yanqui");
		// usuario1.setDni("12345678");
		// usuario1.setCelular("123456789");
		// usuario1.setCorreo("sihues2@gmail.com");
		// usuario1.setContrasena("Gonzalo2603");

		// Rol rol1 = new Rol();
		// rol1.setNombre("MESERO");
		// rol1.setRango(1);

		// Rol rol2 = new Rol( );
		// rol2.setNombre("CAJERO");
		// rol2.setRango(2);

		// UsuarioRol usuarioRol1 = new UsuarioRol();
		// usuarioRol1.setRol(rol1);
		// usuarioRol1.setUsuario(usuario1);
		// UsuarioRol usuarioRol2 = new UsuarioRol();
		// usuarioRol2.setRol(rol2);
		// usuarioRol2.setUsuario(usuario1);

		// List<UsuarioRol> usuarioRoles = new ArrayList<>();
		// usuarioRoles.add(usuarioRol1);
		// usuarioRoles.add(usuarioRol2);

		// //Guardar los datos creados
		// Usuario usuarioGuardado = usuarioService.saveNewUsuario(usuario1,
		// usuarioRoles);

		// //Mostrar los datos guardados
		// System.out.println("Los roles del usuario " + usuarioGuardado.getNombres() +
		// " " + usuarioGuardado.getApellidos() + " son:");

		// for (UsuarioRol nombreRol : usuarioGuardado.getUsuarioRoles()) {
		// 	System.out.println(nombreRol.getRol().getNombre());	
		// }

		// System.out.println("\nCorreo: " + usuarioGuardado.getCorreo());
		// System.out.println("DNI: " + usuarioGuardado.getDni());
		// System.out.println("Celular: " + usuarioGuardado.getCelular());
	}
}
