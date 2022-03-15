package 操作系统;

import java.util.*;

/**
 * @Author xqf
 */
public class 磁盘调度 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = rand.nextInt(10) + 10;
//        访问的柱面号个数

        List<Integer> xl = new ArrayList<>();
//        柱面访问序列

        for (int i = 0; i < sum; i++) {
            int zmh = rand.nextInt(199);
            xl.add(zmh);
        }
        System.out.println("访问序列为");
        System.out.println(xl);

        int start = rand.nextInt(50) + 50;
        String fx = "由外向内";
        System.out.println("磁头开始位置为：" + start + "," + "方向为：" + fx);
//        确定磁头的开始位置和方向

        for (int j = 0; j < 2; j++) {
            System.out.print("输入调用的方法(FCFS、LOOK)：");
            Scanner sc = new Scanner(System.in);
            String type = sc.nextLine();

            if (type.equals("FCFS")) {
//              先来先服务算法`
                System.out.println("先来先服务算法：");
                System.out.println("移动臂的顺序为：" + xl);

                int count1 = xl.get(0) - start;
                if (count1 < 0) {
                    count1 *= -1;
                }

                for (int i = 0; i < sum - 1; i++) {
                    int num = 0;
                    num = xl.get(i + 1) - xl.get(i);
                    if (num < 0) {
                        num *= -1;
                    }
                    count1 += num;
                }
                System.out.println("移动总量为" + count1);
            }

            if (type.equals("LOOK")) {
//              电梯调度算法
                System.out.println("电梯调度算法：");

                Collections.sort(xl, (o1, o2) -> o2 - o1);
                int m = xl.get(0) - start;
                int n = xl.get(sum - 1) - start;
                if (m < 0) {
                    m *= -1;
                }
                if (n < 0) {
                    n *= -1;
                }
                int count2 = m + n;

                System.out.print("移动臂的顺序为：");
                System.out.print("[");
                for (int i = sum - 1; i >= 0; i--) {
                    if (xl.get(i) > start) {
                        System.out.print(xl.get(i) + ",");
                    }
                }
                for (int i = 0; i < sum; i++) {
                    if (xl.get(i) < start) {
                        System.out.print(xl.get(i) + ",");
                    }
                }
                System.out.println("]");
                System.out.println("移动总量为：" + count2);
            }

        }
    }
}


