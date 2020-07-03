/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

import java.util.ArrayList;

/**
 *
 * @author
 */
public class AlocaUsuario {
    private Double id;
    private final String AdminU = "Admin";
    private final String AdminS = "Admin";
    private final String PS = "Nasa";
    private String Usuario;
    private String Senha;
    private static String TesteU;
    private static String TesteS;
    
     public Double getId() {
    return id;
    }
 
    public void setId(Double id) {
    this.id = id;
    }
    
    public String getPS() { //Palavra-passe
        return PS;
    }

    public String getAdminU() {
        return AdminU;
    }

    public String getAdminS() {
        return AdminS;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Senha
     */
    public String getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void login(String Usuario, String Senha) {
        this.TesteU = Usuario;
        this.TesteS = Senha;
        
    }

    public String getUser() {
        return TesteU;
    }

    public String getS() {
        return TesteS;
    }

}
