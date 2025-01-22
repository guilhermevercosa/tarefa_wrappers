public class tarefa {
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Valor como tipo primitivo: " + num1);

        Integer numWrapper = Integer.valueOf(num1);
        System.out.println("Valor como tipo wrapper (Integer): " + numWrapper);
    }
}
