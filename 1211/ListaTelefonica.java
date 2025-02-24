import java.util.*;

public class ListaTelefonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> results = new ArrayList<>();

        System.out.println("Digite a quantidade de números da lista telefônica (ou pressione Ctrl+D para finalizar):");

        while (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            String[] phones = new String[N];
            System.out.println("Digite os " + N + " números de telefone:");

            for (int i = 0; i < N; i++) {
                phones[i] = scanner.nextLine();
            }

            // Ordenar os números de telefone em ordem crescente
            Arrays.sort(phones);

            int totalSaved = 0;

            for (int i = 1; i < N; i++) {
                String current = phones[i];
                String previous = phones[i - 1];
                int commonPrefixLength = 0;

                while (commonPrefixLength < current.length() &&
                       current.charAt(commonPrefixLength) == previous.charAt(commonPrefixLength)) {
                    commonPrefixLength++;
                }

                totalSaved += commonPrefixLength;
            }

            results.add(totalSaved);
            System.out.println("\nDigite a quantidade de números da próxima lista (ou pressione Ctrl+D para finalizar):");
        }

        System.out.println("\nResultados:");
        for (int result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}
