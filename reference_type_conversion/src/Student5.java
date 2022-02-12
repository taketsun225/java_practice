public class Student5 extends Person5{
  private int stuNo;

  public Student5(String name, int setNo) {
    super(name);
    this.stuNo = setNo;
  }

  public void display() {
    super.display();
    System.out.println("学籍番号：" + stuNo);
  }

  public void chgStuNo(int stuNo) {
    this.stuNo = stuNo;
  }
}
