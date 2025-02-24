import java.util.Arrays;
import java.util.Scanner;

public class FilaRecreio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, insira o número de casos de teste:");
        int N = scanner.nextInt(); //casos N
        
        for (int i = 0; i < N; i++) {
            int M = scanner.nextInt();
            int[] notas = new int[M]; // alunos M
            
           
            for (int j = 0; j < M; j++) {
                notas[j] = scanner.nextInt(); //notas de cada aluno
            }
            
            
            int[] notasOrdenadas = Arrays.copyOf(notas, M); //copia o array p um novo
            Arrays.sort(notasOrdenadas); //ordenacao crescente
            // Inverte a ordem para ficar em ordem decrescente
            for (int j = 0; j < M / 2; j++) {
                int temp = notasOrdenadas[j];
                notasOrdenadas[j] = notasOrdenadas[M - 1 - j];
                notasOrdenadas[M - 1 - j] = temp;
            }
            
            
            int count = 0;
            for (int j = 0; j < M; j++) {
                if (notas[j] == notasOrdenadas[j]) { //contagem de quantos alunos permaneceram
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
        scanner.close();
    }
}