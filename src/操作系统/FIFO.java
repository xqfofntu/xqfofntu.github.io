package 操作系统;

import java.util.*;

/**
 * @Author xqf
 */

public class FIFO {
    public static void main(String[] args) {
        Random rand = new Random();

        int sum = rand.nextInt(10) + 10;
//        访问总次数

        List<Integer> xl = new ArrayList<>();
//        调度序列

        for (int i = 0; i < sum; i++) {
            int page = rand.nextInt(10) + 1;
            xl.add(page);
        }
        System.out.println("访问序列为");
        System.out.println(xl);
        System.out.println("总计访问次数为" + sum);

        for (int k = 0; k < 2; k++) {
            List<Integer> yx = new ArrayList<>();
//            调入页框的队列

            int count = 0;
            System.out.println("输入页框的个数：");
            Scanner sc = new Scanner(System.in);
            int yk = sc.nextInt();

            for (int i = 0; i < sum; i++) {
                boolean q = false;

                if (yx.isEmpty()) {
                    yx.add(xl.get(i));
                    count++;
                    System.out.println("开始调入页面" + xl.get(i));
                    System.out.println(yx);
                    continue;
                }
//                第一个页面调入

                for (int j = 0; j < yk; j++) {
                    for (int e = 0; e < yx.size() && e < yk; e++) {
                        if (yx.get(e) == xl.get(i)) {
                            System.out.println("已有页面" + xl.get(i));
                            System.out.println(yx);
                            q = true;
                        }
                    }
//                    判断页面是否已经存在页框中

                    if (q) {
                        break;
                    }

                    if (yx.size() < yk) {
                        yx.add(xl.get(i));
                        System.out.println("调入页面" + xl.get(i));
                        System.out.println(yx);
                        count++;
                        break;
                    }
//                    在未阻塞的情况下调入页面

                    if (yx.size() == yk) {
                        System.out.println("淘汰页面" + yx.get(0) + " 调入页面" + xl.get(i));
                        yx.remove(0);
                        yx.add(xl.get(i));
                        System.out.println(yx);
                        count++;
                        break;
                    }
//                    淘汰最先进来的页面，调入新页面
                }
            }
            System.out.println("缺页中断率为" + count + "/" + sum);
        }
    }
}

