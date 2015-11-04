/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.nio.charset.MalformedInputException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author target
 */
public class CtrlCeletista {
    
    
    
    public static void validaCampos(view.ViewCadCLT guiCLT)throws Exception{
        
     if(guiCLT.jTextCPF.getText().equals("") ||
        guiCLT.jTextEndereco.getText().equals("") ||
        guiCLT.jTextHorasTrabalhadas.getText().equals("") ||
        guiCLT.jTextImposto.getText().equals("") ||
        guiCLT.jTextNome.getText().equals("") ||
        guiCLT.jTextRG.getText().equals("")   || 
        guiCLT.jTextSalarioBruto.getText().equals("") ||
        guiCLT.jTextSalarioLiquido.getText().equals("") ||        
        guiCLT.jTextTelefone.getText().equals(""))
     {
             throw new Exception("Por Favor Preencha Todos os campos.");
     
     }
     
    }
       
    public static double validaSalario(int horasTrabalhadas, double salario){
        
        double salarioBruto=0;
        int horaExtra=0;
        
        if(horasTrabalhadas < 160){
            salarioBruto = salario;    
        }
            if(horasTrabalhadas >= 161){
                horaExtra = (int)salario/160;
                salarioBruto=(double)horasTrabalhadas*horaExtra;    
            }           
    return salarioBruto;
} 
    
public static double validaImposto(double salario, view.ViewCadCLT guiCadCLT)throws MalformedInputException, Exception{
        
    double imposto = 0;
    
        if(salario < 1.499_16){
            imposto=0;
        }
        else    
            if (salario >=1.499_16 && 2.246_75<=salario) {            
                imposto=(salario*7.5)/100-112.43;
            }
            else    
                if (salario >=2.246_76 && 2.995_70 <= salario) {
                    imposto=(salario*15)/100-280.94;
                }
                else    
                    if (salario >=2.995_71 && 3.743_19 <=salario) {
                        imposto=(salario*22.5)/100-505.62;
                    }
                    else
                        if(salario>= 3.743_20){
                           imposto=(salario*27.5)/100-692.78;
                    }
                        else
                            if(guiCadCLT.jTextSalarioLiquido.getText().equals("")){
                              throw 
                                   new Exception("Calcule o salario bruto antes de verificar o imposto!");
                            }
        else{
            throw 
                 new Exception("Entrada Invalida, Digite um Valor Valido.");
        }
        
    return imposto;
}       

public static void validaINSS(double salario){
        
        if(salario<965.67){
            salario = (salario*8)/100;   
        }
        else
            if(salario>=965.68 && 1.609_45<= salario){
                salario = (salario*9)/100;
            }
            else
                if(salario>=1.609_46){
                   salario = (salario*11)/100; 
                }
        if (salario>=354.08) {
            salario = 354.08;
        }
    }
}
