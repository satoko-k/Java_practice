class TestMain {

    public static void main(String[] args) {

      TestPerson person1 = new TestPerson("Kate", "Jones", 27, 1.6, 50.0,"���");
      person1.printData();

      TestPerson person2 = new TestPerson("John", "Christopher", "Smith", 65, 1.75, 80.0,"���t");
      person2.printData();
      System.out.println("----------------------");

      person1.setJob("�b��");
      
      System.out.println("person1�̎d����" + person1.getJob() + "�ɕύX���܂���");
      
      person1.printData();
    }
  }
  