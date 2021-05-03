class operator {
    public static void main(String[] args){
        int x = 10;
        int y = 2;
        int z = 20;

        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x%y);
        System.out.println(x>=y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= 5 && x <= 10);
        System.out.println(x ==2 || y == 2);

        // 複合代入演算子
        int a = 8;
        int b = 12;
        int c = 20;

        System.out.println(a += 10);  //aに10をたしてxに代入
        System.out.println(b += c);  //bにcをたしてbに代入


        // インクリメント、デクリメント
        int d = 8;
        int e = 8;
        d++;
        e--;
        System.out.println(d);
        System.out.println(e);


    }
    
}
