class Main {
    public static void main(String[] args) {
        
      // こんにちはJavaを出力
      System.out.println("こんにちは、Java");

      // データ型　整数
      byte var = 1;  
      short var02 = 12345;
      int var_03 = 1234567890;
      long var04 = 123456789000L;

      System.out.println(var);
      System.out.println(var02);
      System.out.println(var_03);
      System.out.println(var04);

      // データ型　小数
      double var05 = 1.234546789;
      float var06 = 1.234F; //floatは最後にFをつける

      System.out.println(var05);
      System.out.println(var06);
      
      //データ型　文字 charは文字１つ　Stringは文字２つ以上（正確にはクラス）
      char var07='C';  //シングル
      String var08= "Hello World!!"; //ダブル
      System.out.println(var07);
      System.out.println(var08);
      
      // データ型　ブール型＝ブーリアン型　（真偽・0か1）
      int var_a=10;
      int var_b=1;
      boolean var_bool;
      var_bool=(var_a > var_b);

      System.out.println(var_bool);



  
    }
  }


