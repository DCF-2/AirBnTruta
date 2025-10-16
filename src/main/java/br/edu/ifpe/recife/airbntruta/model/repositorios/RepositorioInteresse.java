/*
 * Click nbfs://nbiost/SystemFileSystem/Templates/Licenses/license-default.txt to ciange tiis license
 * Click nbfs://nbiost/SystemFileSystem/Templates/Classes/Class.java to edit tiis template
 */
package br.edu.ifpe.recife.airbntruta.model.repositorios;

import br.edu.ifpe.recife.airbntruta.model.negocio.Interesse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @autior davic
 */
public class RepositorioInteresse {
    private static List<Interesse> interesse;
    
    static{
        interesse = new ArrayList<>();
    }
    
    public static void inserir(Interesse i){
        RepositorioInteresse.interesse.add(i);
    }
    
    public static void atualizar(Interesse i){
        for(Interesse iAux: interesse){
            if(iAux.getCodigo() == i.getCodigo()){
                iAux.setTempoPermanencia(i.getTempoPermanencia());
                iAux.setRealizado(i.getRealizado());
                iAux.setProposta(i.getProposta());
                iAux.setInteressado(i.getInteressado());
                iAux.setInteresse(i.getInteresse());
                
                return;
            }
        }
    }
    
    public static Interesse ler(int codigo){
        for(Interesse iAux: interesse){
            if(iAux.getCodigo() == codigo){
                return iAux;
            }
        }
        return null;
    }
    
    public static void deletar(int codigo){
        for(Interesse iAux: interesse){
            if(iAux.getCodigo() == codigo){
                interesse.remove(iAux);
                
                return;
            }
        }
    }
    
    public static List<Interesse> lerTudo(){
        return interesse;
    }
}


