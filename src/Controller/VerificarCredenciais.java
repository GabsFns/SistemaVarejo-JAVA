/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Gabriel
 */
public class VerificarCredenciais {
    public static boolean Verificar(String User, String Senha) {
    
         return (User.equals("atendente01") || User.equals("adm01")) && Senha.equals("1234");
    
}
}
