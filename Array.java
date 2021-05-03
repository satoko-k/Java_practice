class Array {
    public static void main(String[] args) {
        //宣言と代入を別々に 
        // String[] arr;
        // arr=new String[3];
        // arr[0]="0番目";
        // arr[1]="1番目";
        // arr[2]="2番目";

        // 宣言と代入を同時に
        String[] arr = {"0番目","1番目","2番目"};

        arr[1] ="1番目を変更";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


        // 2次元配列
        String[][] array;
        array = new String[2][2];
        
        array[0][0]="Satou";
        array[0][1]="Suzuki";
        array[1][0]="Yamada";
        array[1][1]="Tanaka";

        System.out.println(array[0][1]);

        // 2次元配列の省略
        String[][]arr01 = {{"0の0","0の1"},{"1の0","1の1"}};
        System.out.println(arr01[1][0]);
    
    





    }
    
}
