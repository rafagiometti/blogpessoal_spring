package com.generation.blogpessoal.util;

import com.generation.blogpessoal.model.Usuario;

public class TestBuilder { 
	
	public static Usuario criarUsuario(Long id, String nome, String usuario, String senha) {
		
			Usuario usuario1 = new Usuario();
			usuario1.setId(id);
			usuario1.setNome(nome);
			usuario1.setUsuario(usuario);
			usuario1.setSenha(senha);
			usuario1.setFoto("-");
		
		return usuario1;
		
	}
	
	public static Usuario criarUsuarioRoot() {
		return criarUsuario(null, "Root", "root@email.com", "rootroot");
	}

}
