/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.airbntruta.model.repositorios;

import br.edu.ifpe.recife.airbntruta.model.negocio.Hospedeiro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class RepositorioHospedeiro {

    private static List<Hospedeiro> hospedeiros;
    
    static{
        hospedeiros = new ArrayList<>();
    }
    
    public static void inserir(Hospedeiro h){
        RepositorioHospedeiro.hospedeiros.add(h);
    }
    
    public static void atualizar(Hospedeiro h){
        for(Hospedeiro hAux: hospedeiros){
            if(hAux.getCodigo() == h.getCodigo()){
                hAux.setContato(h.getContato());
                hAux.setNome(h.getNome());
                hAux.setVulgo(h.getVulgo());
                
                return;
            }
        }
    }
    
    public static Hospedeiro ler(int codigo){
        for(Hospedeiro hAux: hospedeiros){
            if(hAux.getCodigo() == codigo){
                return hAux;
            }
        }
        return null;
    }
    
    public static void deletar(int codigo){
        for(Hospedeiro hAux: hospedeiros){
            if(hAux.getCodigo() == codigo){
                hospedeiros.remove(hAux);
                
                return;
            }
        }
    }
    
    public static List<Hospedeiro> lerTudo(){
        return hospedeiros;
    }
}
