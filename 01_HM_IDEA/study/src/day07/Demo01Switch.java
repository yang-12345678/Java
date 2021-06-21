package day07;

/*
* 注意：
* 1. 多个 case 后面的值不能够重复，  重复编译会报错
*
* 2. switch 后面的小括号当中只能是下列数据类型
*     基本数据类型： byte/short/char/int
*     应用数据类型： String/enum
*
* 3. switch 语句格式可以很灵活， 前后顺序可以点到，，而且 break 可以省略
*    匹配哪一个 case 就从哪一个位置开始向下执行， 知道遇到 break 或 整体结束 为止
*/

public class Demo01Switch {
    public static void main(String[] args){
        int num1 = 1;
        switch (num1){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("数据不合理");
                break;

        }
    }
}
