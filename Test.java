public class Test {
  public static void main(String[] arg) {
    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int n : numbers) {
      if (n == input) {
        System.out.println("アタリ！");
      }
    }
  }
}
