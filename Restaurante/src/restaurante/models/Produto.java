package restaurante.models;

import java.util.UUID;

public class Produto {
    
    private UUID uuid;
    private String nome;
    private String ingredientes;
    private Double preco;
    private int pessoasServidas;
    private boolean temLactose;
    private boolean temGluten;

    public String getNome() {
        return nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public Double getPreco() {
        return preco;
    }

    public int getPessoasServidas() {
        return pessoasServidas;
    }

    public boolean isTemLactose() {
        return temLactose;
    }

    public boolean isTemGluten() {
        return temGluten;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setPessoasServidas(int pessoasServidas) {
        this.pessoasServidas = pessoasServidas;
    }

    public void setTemLactose(boolean temLactose) {
        this.temLactose = temLactose;
    }

    public void setTemGluten(boolean temGluten) {
        this.temGluten = temGluten;
    }

    public Produto(UUID uuid) {
        this.uuid = uuid;
    }
    
    
    
}
