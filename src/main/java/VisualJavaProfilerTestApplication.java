public class VisualJavaProfilerTestApplication {

    public static void main(String[] args) {
        metodoA(1_000_000);
        metodoB(5_000_000);
        metodoC(10_000_000);
        System.out.println("Execução concluída.");
    }

    public static void metodoA(int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println("Executando operação " + i);
        }
    }

    public static void metodoB(int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println("Executando operação " + i);
        }
    }

    public static void metodoC(int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println("Executando operação " + i);
        }
    }

    public static void metodoD(int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println("Executando operação " + i);
        }
    }

}
