import java.util.Scanner;

class Sample {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("名前： ");
        
        // 変数nameを定義し、コンソールから文字列を受け取って代入
        String name = scanner.next();
        
        System.out.println("こんにちは"+ name + "さん");
      }
    
}
