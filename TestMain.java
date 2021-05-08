class TestMain {

    public static void main(String[] args) {

      TestPerson person1 = new TestPerson("Kate", "Jones", 27, 1.6, 50.0,"ˆãÒ");
      person1.printData();

      TestPerson person2 = new TestPerson("John", "Christopher", "Smith", 65, 1.75, 80.0,"‹³t");
      person2.printData();
      System.out.println("----------------------");

      person1.setJob("bˆã");
      
      System.out.println("person1‚Ìd–‚ğ" + person1.getJob() + "‚É•ÏX‚µ‚Ü‚µ‚½");
      
      person1.printData();
    }
  }
  