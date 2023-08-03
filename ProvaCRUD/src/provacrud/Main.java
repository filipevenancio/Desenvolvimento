/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provacrud;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Product> listProduct = new ArrayList<>();
        String menu = "Estoque da JôJóias\n"
                + "\n1 - Consultar estoque atual"
                + "\n2 - Cadastrar novo produto"
                + "\n3 - Atualizar produto do estoque"
                + "\n4 - Remover produto do estoque"
                + "\n5 - Entrada de produto"
                + "\n6 - Saída de produto"
                + "\n7 - Encerrar aplicação\n";

        String resp = "";
        while (!resp.equals("7")) {
            resp = JOptionPane.showInputDialog(menu);
            switch (resp) {
                case "1":
                    readStock(listProduct);
                    break;
                case "2":
                    createProduct(listProduct);
                    break;
                case "3":
                    updateProduct(listProduct);
                    break;
                case "4":
                    removeProduct(listProduct);
                    break;
                case "5":
                    entryOfProduct(listProduct);
                    break;
                case "6":
                    exitOfProduct(listProduct);
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "Encerrando aplicação...\nAté logo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção " + resp + " é inválida!");
                    break;
            }
        }
    }

    private static void readStock(List<Product> list) {
       
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Estoque sem produtos cadastros!");
        } else {
            String productsToPrint = "Lista de Produtos (nome, custo, qtd, res)\n";
            for (int i = 0; i < list.size(); i++) {
                productsToPrint += "\n" + list.get(i).toString();
                if (i % 10 == 0 || i == list.size() - 1) {
                    JOptionPane.showMessageDialog(null, productsToPrint);
                    productsToPrint = "Lista de Produtos (nome, custo, qtd, res)\n";
                }
            }
        }
    }

    private static void createProduct(List<Product> list) {

        String name = JOptionPane.showInputDialog("Nome produto:");
        Double cost = Double.parseDouble(JOptionPane.showInputDialog("Custo unitário:"));
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Qtd Disponível:"));
        int res = Integer.parseInt(JOptionPane.showInputDialog("Qtd Reservada:"));

        Product p = new Product(name, cost, qtd, res);

        list.add(p);
    }

    private static void updateProduct(List<Product> list) {

    }

    private static void removeProduct(List<Product> list) {

    }

    private static void entryOfProduct(List<Product> list) {

    }

    private static void exitOfProduct(List<Product> list) {

    }

    private static Product searchProduct(List<Product> list) {
        return null;
    }

}
