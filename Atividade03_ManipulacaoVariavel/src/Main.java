import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Nome Item
        String productName = "Meta Quest 3";

        //Quantidade
        int quantityPurchased = 2;

        //Valor Unitário
        double unitPrice = 500.00;

        //Taxa
        double taxRate = 0.20;

        //Margem Lucro
        double profitMargin = 0.30;

        //Subtotal Bruto
        double subTotal = unitPrice * quantityPurchased;

        //Subtotal com Imposto
        var subTotalTax = subTotal + (subTotal * taxRate);

        //Valor de Lucro (30% sobre subtotal com imposto)
        double profitValue = subTotalTax * profitMargin;

        //Preço final com lucro
        double finalPrice = subTotalTax + profitValue;

        //Formatação moeda
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        System.out.println("Produto: " + productName);
        System.out.println("Quantidade: " + quantityPurchased);
        System.out.println("Subtotal: " + df.format(subTotal));
        System.out.println("Com Imposto: " + df.format(subTotalTax));
        System.out.println("Lucro (30%): " + df.format(profitValue));
        System.out.println("Valor Final com Lucro: " + df.format(finalPrice));

    }
}