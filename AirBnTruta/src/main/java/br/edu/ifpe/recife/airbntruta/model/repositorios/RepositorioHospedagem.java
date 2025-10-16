/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.airbntruta.model.repositorios;

import br.edu.ifpe.recife.airbntruta.model.negocio.Hospedagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davic
 */
public class RepositorioHospedagem {
    private static List<Hospedagem> hospedagens;
    
    static{
        hospedagens = new ArrayList<>();
    }
    
    public static void inserir(Hospedagem h){
        RepositorioHospedagem.hospedagens.add(h);
    }
    
    public static void atualizar(Hospedagem h){
        for(Hospedagem hAux: hospedagens){
            if(hAux.getCodigo() == h.getCodigo()){
                hAux.setDescricaoCurta(h.getDescricaoCurta());
                hAux.setDescricaoLonga(h.getDescricaoLonga());
                hAux.setLocalizacao(h.getLocalizacao());
                hAux.setDiaria(h.getDiaria());
                hAux.setServicos(h.getServicos());
                hAux.setInicio(h.getInicioFormatado());
                hAux.setFim(h.getFimFormatado());
                hAux.setFugitivo(h.getFugitivo());
                hAux.setHospedeiro(h.getHospedeiro());
                
                return;
            }
        }
    }
    
    public static Hospedagem ler(int codigo){
        for(Hospedagem hAux: hospedagens){
            if(hAux.getCodigo() == codigo){
                return hAux;
            }
        }
        return null;
    }
    
    public static void deletar(int codigo){
        for(Hospedagem hAux: hospedagens){
            if(hAux.getCodigo() == codigo){
                hospedagens.remove(hAux);
                
                return;
            }
        }
    }
    
    public static List<Hospedagem> lerTudo(){
        return hospedagens;
    }
}
