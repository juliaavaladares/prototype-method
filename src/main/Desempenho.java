package main;

public class Desempenho implements Cloneable{
    private String posicao;
    private float numeroDeGols;
    private float golsPorPartida;
    private Integer partidasJogadas;
    private Integer cartoesLevados;

    public Desempenho(String posicao, float numeroDeGols, Integer partidasJogadas,Integer cartoesLevados) {
        this.posicao = posicao;
        this.numeroDeGols = numeroDeGols;
        this.partidasJogadas = partidasJogadas;
        this.cartoesLevados = cartoesLevados;

        golsPorPartida = numeroDeGols/partidasJogadas;
    }

    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public float getNumeroDeGols() {
        return numeroDeGols;
    }
    public void setNumeroDeGols(float numeroDeGols) {
        this.numeroDeGols = numeroDeGols;
    }
    public float getGolsPorPartida() {
        return golsPorPartida;
    }
    public void setGolsPorPartida(float golsPorPartida) {
        this.golsPorPartida = golsPorPartida;
    }
    public Integer getPartidasJogadas() {
        return partidasJogadas;
    }
    public void setPartidasJogadas(Integer partidasJogadas) {
        this.partidasJogadas = partidasJogadas;
    }
    public Integer getCartoesLevados() {
        return cartoesLevados;
    }
    public void setCartoesLevados(Integer cartoesLevados) {
        this.cartoesLevados = cartoesLevados;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Desempenho{" +
                "posicao='" + posicao + '\'' + "," +
                "numeroDeGols=" + numeroDeGols + "," +
                "golsPorPartida=" + golsPorPartida + "," +
                "partidasJogadas=" + partidasJogadas +
                ", cartoesLevados=" + cartoesLevados +
                '}';
    }

}
