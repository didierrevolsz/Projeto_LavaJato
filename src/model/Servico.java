package model;

public class Servico {
    private int id_servico;
    private String descricao;
    private double preco_servicos;

    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco_servicos() {
        return preco_servicos;
    }

    public void setPreco_servico(double preco_servicos) {
        this.preco_servicos = preco_servicos;
    }
    
}
