class TestMain {

    public static void main(String[] args) {

      TestPerson person1 = new TestPerson("Kate", "Jones", 27, 1.6, 50.0,"医者");
      person1.printData();

      TestPerson person2 = new TestPerson("John", "Christopher", "Smith", 65, 1.75, 80.0,"教師");
      person2.printData();
      System.out.println("----------------------");

      person1.setJob("獣医");
      
      System.out.println("person1の仕事を" + person1.getJob() + "に変更しました");
      
      person1.printData();
    }
  }
  