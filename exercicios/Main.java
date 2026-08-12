public class Main {

    static double calcularSubtotal(double precoUnitario, int quantidade) {
        return precoUnitario * quantidade;
    }

    public static void main(String[] args) {
        String[] descricao = { 
            "Teclado", "Monitor", "Mouse", "Headset", "Mousepad"
        };

        double[] precoUnitario = { 150.0, 450.0, 30.0, 250.0, 15.0 };
        int[] quantidade = { 2, 3, 1, 2, 2 };
        double total = 0;

        for (int i = 0; i < precoUnitario.length; i++) {
            double subtotal = calcularSubtotal(precoUnitario[i], quantidade[i]);

            // Menu de compra
            System.out.printf("- %d. Menu de Itens ------------\n", i+1);
            System.out.printf("Produto: %s\n", descricao[i]);
            System.out.printf("Quantidade: %d\n", quantidade[i]);
            System.out.printf("Preço unit.: R$ %.2f\n", precoUnitario[i]);
            System.out.printf("Subtotal: R$ %.2f\n", subtotal);
            System.out.printf("-------------------------------\n\n");

            total += subtotal;
        };

        System.out.printf("Total: R$ %.2f\n", total);
    }
}

