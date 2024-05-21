package com.matheus.logintdd;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe que representa a tela de login.
 * Esta classe permite autenticar usuários com base em credenciais armazenadas.
 * 
 * @autor Admin
 */
public class LoginScreen {

    private Map<String, String> users = new HashMap<>();

    /**
     * Construtor da classe LoginScreen.
     * Inicializa a lista de usuários com um usuário válido e sua senha.
     */
    public LoginScreen() {
        users.put("usuario", "123");
    }

    /**
     * Método para verificar o login de um usuário.
     *
     * @param usuario O nome de usuário.
     * @param senha A senha do usuário.
     * @return true se o login for bem-sucedido, false caso contrário.
     */
    public boolean login(String usuario, String senha) {
        if (usuario == null || usuario.isEmpty() || senha == null || senha.isEmpty()) {
            return false;
        }
        
        // Verifica se o usuário e senha correspondem aos armazenados no mapa
        return users.containsKey(usuario) && users.get(usuario).equals(senha);
    }
}
