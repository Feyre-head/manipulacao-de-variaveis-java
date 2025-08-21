//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String personName = "Inara";
        String personAge = "24";

        float monthlySalary = 5000F;
        float fixedDiscount = 2000F;

        int monthsWorked = 12;
        int productsPurchased = 50;
        float totalSpent = 300;

        //Salario Anual
        float yearSalary = monthlySalary * monthsWorked;

        //Salario Bruto Anual
        float liquidAnualSalary = yearSalary - fixedDiscount;

        //Média valor gasto por produto
        float averageSpentPerProduct = totalSpent / productsPurchased;


        System.out.println("Nome: " + personName);
        System.out.println("Idade: " + personAge);
        System.out.println("Salário Mensal: R$" + monthlySalary);
        System.out.println("Salário Anual: R$" + yearSalary);
        System.out.println("Total de Desconto Anual: -R$"+fixedDiscount);
        System.out.println("Salário Anual com Desconto: R$"+ liquidAnualSalary);
        System.out.println("Produtos Comprados: " + productsPurchased);
        System.out.println("Média Gasta por produto: R$" + averageSpentPerProduct);

    }
}