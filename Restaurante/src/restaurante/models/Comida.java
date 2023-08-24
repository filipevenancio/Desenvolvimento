package restaurante.models;

import java.util.UUID;

public class Comida extends Produto{
    
    private int pesoGramaPorcao;
    private boolean ehVegetariano;

    public int getPesoGramaPorcao() {
        return pesoGramaPorcao;
    }

    public boolean isEhVegetariano() {
        return ehVegetariano;
    }

    public void setPesoGramaPorcao(int pesoGramaPorcao) {
        this.pesoGramaPorcao = pesoGramaPorcao;
    }

    public void setEhVegetariano(boolean ehVegetariano) {
        this.ehVegetariano = ehVegetariano;
    }
    
    public Comida (UUID uuid) {
        super(uuid);
    }
    
}
