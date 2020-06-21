package model;

public class Lavagem {
    private int id_lavagem;
    private Servico servico;
    private int id_servico;
    private Funcionario funcionario;
    private Veiculo veiculo;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getId_servico() {
        return id_servico;
    }

    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public int getId_lavagem() {
        return id_lavagem;
    }

    public void setId_lavagem(int id_lavagem) {
        this.id_lavagem = id_lavagem;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    
}
