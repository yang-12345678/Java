
public class ExceptionMessage {

    public void printExceptionInfo() {
        try {
            int x = 100;
            int y = 0;
            int z = x / y;
            System.out.println(x + "除以" + y + "的商是：" + z);
        } catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("getMessage方法:" + ex.getMessage());
            System.out.println("getLocalizedMessage方法:" + ex.getLocalizedMessage());
            System.out.println("toString方法：" + ex.toString());
        }
    }

    public static void main(String[] args) {
        ExceptionMessage ex = new ExceptionMessage();
        ex.printExceptionInfo();
    }


}
