package Case;

import java.util.Random;

/**
 * @author HongTea
 * 软件构造案例,
 * 一个Java程序，随机产生并逐行输出50道100以内的加减法算式
 */
public class Case01 {
    public static void main(String[] args) {
        int op,a,b,sum;
        int count = 1;
        while(count < 51){
            Random random = new Random();
            op = random.nextInt(2);//产生一个随机的操作符 0代表 ：“-” ； 1代表 ：”+“;
            a = random.nextInt(101);//随机产生两个0~100的数
            b = random.nextInt(101);
            if(op == 1){
                sum = a + b;
                if(sum <= 100){
                    System.out.println("第"+count+"道题:"+ "a=" + a + ";" + "b=" + b + ";" + "a+b=" + sum);
                    count++;
                }
            }else{
                sum = a - b;
                if(sum >= 0){
                    System.out.println("第"+count+"道题:"+ "a=" + a + ";" + "b=" + b + ";" + "a-b=" + sum);
                    count++;
                }
            }
        }
    }
}
