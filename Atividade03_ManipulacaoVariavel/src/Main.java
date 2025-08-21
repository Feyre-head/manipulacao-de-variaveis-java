//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Nome Item
        String productName = "Meta Quest 3";

        //Quantidade
        int quantityPurchased = 10;

        //Valor Unitário
        double unitPrice = 3500.00;

        //Taxa
        double taxRate = 0.20;

        //Margem Lucro
        double profitMargin = 0.30;

        var subTotal = unitPrice * quantityPurchased;
        var subTotalTax = (subTotal * taxRate) + subTotal;

        //Falta calcular a margem de lucro
        //DecimalFormat para formatar os números como moeda

        System.out.println("Valor Total R$" + subTotal);
        System.out.println("Valor Total com Imposto R$" + subTotalTax);




//        precoDeVenda = totalComImpostos * (1 + margemLucro);
//        A parte 1 + 0.30 está fazendo o seguinte:
//
//        1 representa 100% do valor original (ou seja, sem lucro ainda)
//
//        0.30 representa 30% de lucro desejado
//
//        Então://
//
//        1 + 0.30 = 1.30 → significa 130% do valor original

//        precoDeVenda = 100 * 1.30 = 130
    }
}