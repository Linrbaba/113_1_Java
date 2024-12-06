public class UncheckedException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        }catch (RuntimeException e) {
            System.out.println("處理未受檢例外：" + e.getMessage());
        }
    }
}
