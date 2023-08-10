/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provacrud;

/**
 *
 * @author Aluno
 */
public class Product {

    private String name;
    private Double unitCost;
    private int quantity;
    private int qReserved;

    public Product(String name, Double unitCost, int quantity, int qReserved) {
        this.name = name;
        this.unitCost = unitCost;
        this.quantity = quantity;
        this.qReserved = qReserved;
    }

    public void entryOfProduct(int qEntry) {
        this.quantity += qEntry;
    }

    public void exitOfProduct(int qExit) {
        if (this.qReserved > 0) {
            this.qReserved -= qExit;
        }

        if (this.qReserved < 0) {
            this.quantity += this.qReserved;
            this.qReserved = 0;
        }

        if (this.qReserved == 0) {
            this.quantity -= qExit;
        }
    }

    public String toString() {
        return this.name
                + " - R$ " + this.unitCost
                + " - Qtd: " + this.quantity
                + " - Res: " + this.qReserved;
    }

}
