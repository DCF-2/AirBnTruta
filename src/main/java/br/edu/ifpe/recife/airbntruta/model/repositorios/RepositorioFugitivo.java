/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.airbntruta.model.repositorios;

import br.edu.ifpe.recife.airbntruta.model.negocio.Fugitivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class RepositorioFugitivo {
    
    private static List<Fugitivo> fugitivos;
    
    static{
        
        fugitivos = new ArrayList<>();
        
    }
    
    public static void inserir(Fugitivo f){
        RepositorioFugitivo.fugitivos.add(f);
    }
    
    public static void atualizar(Fugitivo f){
        
        /*
        Análogo ao foreach sem o foreach
        for(int i = 0; i<fugitivos.size();i++){
            Fugitivo fAux = fugitivos.get(i);
            
            if(fAux.getCodigo() == f.getCodigo()){
                fAux.setDescricao(f.getDescricao());
                fAux.setEspecialidade(f.getEspecialidade());
                fAux.setFaccao(f.getFaccao());
                fAux.setNome(f.getNome());
                fAux.setVulgo(f.getVulgo());
                
                return;
            }
        }*/
        for(Fugitivo fAux: fugitivos){
            if(fAux.getCodigo() == f.getCodigo()){
                fAux.setDescricao(f.getDescricao());
                fAux.setEspecialidade(f.getEspecialidade());
                fAux.setFaccao(f.getFaccao());
                fAux.setNome(f.getNome());
                fAux.setVulgo(f.getVulgo());
                
                return;
            }
        }
        
    }
    
    public static Fugitivo ler(int codigo){
        
        for(Fugitivo fAux: fugitivos){
            if(fAux.getCodigo() == codigo){
                
                /*
                clonar é a forma certa de fazer!
                Fugitivo clone = new Fugitivo();
                
                clone.setCodigo(codigo);
                
                return clone;*/
                
                // esta é a forma errada, por que?
                return fAux;
            }
        }
        
        return null;
        
    }
    
    public static void deletar(int codigo){
        
        for(Fugitivo fAux: fugitivos){
            
            if(fAux.getCodigo() == codigo){
                fugitivos.remove(fAux);
                
                return;
            }
            
        }
        
    }
    
    public static List<Fugitivo> lerTudo(){
        return fugitivos;
    }
    
}
