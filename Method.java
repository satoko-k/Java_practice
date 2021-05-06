class Method {

        public static void main(String[] args) {
         
          // String name = fullName("鈴木","花子");  
          // printData(name, 27);
          printData(fullName("鈴木","花子"),27);
          printData(fullName("John", "Christopher", "Smith"), 65);
          
        }
      
        public static void printData(String name, int age) {
          System.out.println("私の名前は" + name + "です");
          System.out.println("年齢は" + age + "歳です");
        }
      
        // fullNameメソッドを定義
        public static String fullName(String firstName,String lastName){
          return firstName + " " + lastName;
        }
        // 同名のメソッド　fullNameメソッド　オーバーロード
        public static String fullName(String firstName, String middleName, String lastName){
          return firstName + " " + middleName + " " + lastName;
        }
        
}
      
    
