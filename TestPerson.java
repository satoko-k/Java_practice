class TestPerson {
    private static int count = 0;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    // �C���X�^���X�t�B�[���h�ujob�v��ǉ����Ă�������
    private String job;
    
  //  �R���X�g���N�^
    TestPerson(String firstName, String lastName, int age, double height, double weight,String job) {
      TestPerson.count++;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.height = height;
      this.weight = weight;
      this.job = job;
    }
    
    // �R���X�g���N�^
    TestPerson(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {
      this(firstName, lastName, age, height, weight,job);
      this.middleName = middleName;
    }
  
    public String getMiddleName() {
      return this.middleName;
    }
    
    // job�̃Q�b�^�[���`���Ă�������
    public String getJob(){
      return this.job;
    }
  
  
    public void setMiddleName(String middleName) {
      this.middleName = middleName;
    }
    
    // job�̃Z�b�^�[���`���Ă�������
    public void setJob(String job){
      this.job = job;
    }
    
  
    public String fullName() {
      if (this.middleName == null) {
        return this.firstName + " " + this.lastName;
      } else {
        return this.firstName + " " + this.middleName + " " + this.lastName;
      }
    }
  
    public void printData() {
      System.out.println("���̖��O��" + this.fullName() + "�ł�");
      System.out.println("�N���" + this.age + "�΂ł�");
      System.out.println("BMI��" + Math.round(this.bmi()) + "�ł�");
      // �u�d���́����ł��v�Əo�͂��Ă�������
      System.out.println("�d����" + this.job + "�ł�");
      
      
    }
  
    public double bmi() {
      return this.weight / this.height / this.height;
    }
  
    public static void printCount() {
      System.out.println("���v" + TestPerson.count + "�l�ł�");
    }
  }
  