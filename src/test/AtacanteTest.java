package test;

import org.junit.jupiter.api.Test;
import main.*;
import static org.junit.jupiter.api.Assertions.*;

class AtacanteTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Atacante atacante = new Atacante(123456, "Julia",new Desempenho("ala", 3,2, 0),
        "Brasil", "Sport");

        Atacante atacanteClone = atacante.clone();

        atacanteClone.setId(654321);
        atacanteClone.setTime("Esporte");
        atacanteClone.setNome("Ala Clonada");
        atacanteClone.getDesempenho().setNumeroDeGols(5);

        assertEquals("Atacante{id=123456, nome='Julia', time='Sport', desempenho=Desempenho{posicao='ala',numeroDeGols=3.0,golsPorPartida=1.5,partidasJogadas=2, cartoesLevados=0}, localNascimento='Brasil'}", atacante.toString());
        assertEquals("Atacante{id=654321, nome='Ala Clonada', time='Esporte', desempenho=Desempenho{posicao='ala',numeroDeGols=5.0,golsPorPartida=1.5,partidasJogadas=2, cartoesLevados=0}, localNascimento='Brasil'}", atacanteClone.toString());
        
    }
    
}
