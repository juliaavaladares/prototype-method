package main;


public class Atacante implements Cloneable{
    private int id;
    private String nome;
    private Desempenho desempenho;
    private String localNascimento;
    private String cpf;
    private String time;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public Desempenho getDesempenho() {
        return desempenho;
    }
    public void setDesempenho(Desempenho desempenho) {
        this.desempenho = desempenho;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocalNascimento() {
        return localNascimento;
    }
    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }


    @Override
    public Atacante clone() throws CloneNotSupportedException {
        Atacante atacanteClone = (Atacante) super.clone();
        atacanteClone.desempenho = (Desempenho) atacanteClone.desempenho.clone();
        
        return atacanteClone;
    }

    @Override
    public String toString() {
        return "Atacante{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", time='" + time + '\'' +
                ", desempenho=" + desempenho +
                ", localNascimento='" + localNascimento + '\'' +
                '}';
    }
}