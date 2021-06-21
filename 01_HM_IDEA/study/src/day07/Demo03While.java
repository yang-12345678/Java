package day07;

public class Demo03While {
    public static void main(String[] args){
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        // 注意 do - while   后面要有分号
        int j = 1;
        do {
            System.out.println(j);
            j++;
        }while(j <= 10);

    }
}
