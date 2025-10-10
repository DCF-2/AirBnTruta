/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.airbntruta.model.repositorios;

import br.edu.ifpe.recife.airbntruta.model.negocio.Servico;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ALUNO
 */
public class RepositorioServico {

    private static List<Servico> servicos;

    static {
        servicos = new ArrayList<>();
    }

    public static void inserir(Servico s) {
        RepositorioServico.servicos.add(s);
    }

    public static void atualizar(Servico s) {
        for (Servico sAux : servicos) {
            if (sAux.getCodigo() == s.getCodigo()) {
                sAux.setDescricao(s.getDescricao());
                sAux.setNome(s.getNome());
                sAux.setTipo(s.getTipo());

                return;
            }
        }
    }

    public static Servico ler(int codigo) {
        for (Servico sAux : servicos) {
            if (sAux.getCodigo() == codigo) {

                return sAux;
            }
        }
        return null;
    }

    public static void deletar(int codigo) {
        for (Servico sAux : servicos) {
            if (sAux.getCodigo() == codigo) {
                servicos.remove(sAux);

                return;
            }
        }
    }
    
    public static List<Servico> lerTudo(){
        return servicos;
    }

}
