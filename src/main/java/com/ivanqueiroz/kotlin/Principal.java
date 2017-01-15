package com.ivanqueiroz.kotlin;

import com.ivanqueiroz.kotlin.dto.Usuario;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public class Principal {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("JOAO", 35);
        Usuario usuario2 = new Usuario("MARIA", 30);
        
        System.out.println("Nome: "+usuario.getNome());
        System.out.println("Idade: "+usuario.getIdade());
        System.out.println(usuario.toString());
        
        System.out.println("Nome: "+usuario2.getNome());
        System.out.println("Idade: "+usuario2.getIdade());
        System.out.println(usuario2.toString());
        
        System.out.println("Hash usuario: "+usuario.hashCode());
        System.out.println("Hash usuario2: "+usuario.hashCode());
        
        System.out.println("usuario.equals(usuario2) = "+usuario.equals(usuario2));
        
    }
    
}
