/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.UsuariosModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Gabriel
 */
public class CadastrarUsuarios {
     

   
    
    public void CriarUsuario(String Nome, String CPF, String Email) throws Exception{
        //Metodo para criar Usuario de acordo com o Modelo
        if (!validarDados(Nome, CPF, Email)) {
            throw new Exception("Dados inválidos");
        }

        UsuariosModel user = new UsuariosModel(Nome, Email, CPF);
        JOptionPane.showMessageDialog(null, "Dados do Cliente Cadastrados");
    }
    
    protected boolean validarDados(String nome, String cpf, String email) {
        
        //Metodo para Avaliar se os dados estao de acordos.
        if (nome == null || nome.isEmpty()) {
            return false;
        }

        if (cpf == null ) {
            return false;
        }

        if (email == null ||!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            return false;
        }
        
        return true;
    }
 }
        
 
