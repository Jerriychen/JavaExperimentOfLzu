class myexception extends Exception {
  String mymsg="我的异常信息！";
  myexception() {
    super("我自己定义的异常");
  }
  myexception(String msg) {
    super(msg);
  }
  public void display() {
    System.out.println(mymsg);
  }
}

public class exceptiontest {
  public static void main(String[] args) {
    try{
      if(args[0].charAt(0)=='A'){
        myexception e = new myexception();
        throw e;
      }
      else {
        System.out.println(args[0]);
      }
    }
    catch(myexception e) {
      System.out.println(e.getMessage());
      e.display();
    }
  }
}
