/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author target
 */
public class Celetista extends Colaboradores{
    
    private String RG;
    private String CPF;
    private String salarioMensal;

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the salarioMensal
     */
    public String getSalarioMensal() {
        return salarioMensal;
    }

    /**
     * @param salarioMensal the salarioMensal to set
     */
    public void setSalarioMensal(String salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
