package restaurante.models;

import java.util.UUID;

public class Bebida extends Produto{
    
    private int qtdMlDrink;
    private boolean temAlcool;

    public int getQtdMlDrink() {
        return qtdMlDrink;
    }

    public boolean isTemAlcool() {
        return temAlcool;
    }

    public void setQtdMlDrink(int qtdMlDrink) {
        this.qtdMlDrink = qtdMlDrink;
    }

    public void setTemAlcool(boolean temAlcool) {
        this.temAlcool = temAlcool;
    }

    public Bebida(UUID uuid) {
        super(uuid);
    }
    
}

