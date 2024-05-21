
package com.matheus.logintdd;

import org.junit.jupiter.api.Test;

import com.matheus.logintdd.LoginScreen;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para a classe LoginScreen.
 * Esta classe contém métodos de teste para verificar o comportamento do método login da classe LoginScreen.
 *
 * @author Admin
 */
public class LoginScreenTest {

    /**
     * Testa o login com um usuário e senha inválidos.
     */
    @Test
    public void testLoginInvalido() {
        // Cria uma instância do serviço de login
        LoginScreen loginService =  new LoginScreen();
        
        // Efetua o login com um usuário e senha inválidos
        boolean result = loginService.login("UsuarioInvalido","SenhaInvalida");
        
        // Verifica se o resultado do login é falso
        assertFalse(result,"Não efetuar o login com usuario ou senha incorreta");
    }
    
    /**
     * Testa o login com um usuário e senha válidos.
     */
    @Test
    public void testLoginValido(){
        // Cria uma instância do serviço de login
        LoginScreen loginService = new LoginScreen();
        
        // Efetua o login com um usuário e senha válidos
        boolean result = loginService.login("UsuarioValido","SenhaValida");
        
        // Verifica se o resultado do login é verdadeiro
        assertTrue(result, "Logar corretamente com usuário e senha corretas");    
    }
    
    /**
     * Testa o login com um usuário vazio.
     */
    @Test
    public void testUsuarioVazio(){
        // Cria uma instância do serviço de login
        LoginScreen loginService = new LoginScreen();
        
        // Efetua o login com um usuário vazio
        boolean result = loginService.login("","SenhaValida");
        
        // Verifica se o resultado do login é falso
        assertFalse(result,"Não logar por usuário vazio");
    }
    
    /**
     * Testa o login com uma senha vazia.
     */
    @Test
    public void testSenhaVazia(){
        // Cria uma instância do serviço de login
        LoginScreen loginService = new LoginScreen();
        
        // Efetua o login com uma senha vazia
        boolean result = loginService.login("UsuarioValido","");
        
        // Verifica se o resultado do login é falso
        assertFalse(result,"Não logar por senha vazia");
    }
}

