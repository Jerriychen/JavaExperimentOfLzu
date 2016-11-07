public class program {
  String name="兰州大学信息学院";
  int n1=10;
  int n2=20;
  public program() {
    try{
      System.out.println(name);
      System.out.println("相除结果为："+n1/n2);
    }
    catch(ArithmeticException I){
      System.out.println("不能除以0");
    }
    finally{
    name=null;
    System.out.println("finally 已经执行!");
  }
  }
  public static void main(String[] args) {
    new program();
  }
}
