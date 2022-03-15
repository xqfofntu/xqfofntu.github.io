
package 操作系统;

/**
 * @author xqf
 */

import java.util.*;

public class Cz1 {
    public static void main(String[] args) {

        Pcb pcb = new Pcb();
        pcb.work();

    }
}

class Pcb {
    private String id;
    private int time;
    private int priority;
    private String state = "R";
    //R表示就绪，E表示运行，F表示结束

    public Pcb() {

    }

    public Pcb(String id, int time, int priority) {
        this.id = id;
        this.time = time;
        this.priority = priority;
    }

    private int n;
    private int m;
    private List<Pcb> jx = new ArrayList<>();
    //就绪队列

    private List<Pcb> yx = new ArrayList<>();
    //运行队列

    private List<Pcb> wc = new ArrayList<>();
    //完成队列

    public void work() {
        n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println("输入第" + (i + 1) + "个进程名");
            Scanner scan1 = new Scanner(System.in);
            String id = scan1.next();

            System.out.println("输入第" + (i + 1) + "个进程运行时间");
            Scanner scan2 = new Scanner(System.in);
            int time = scan2.nextInt();

            System.out.println("输入第" + (i + 1) + "个进程的优先级");
            Scanner scan3 = new Scanner(System.in);
            int priority = scan3.nextInt();

            jx.add(new Pcb(id, time, priority));
            //把进程加入到就绪队列
        }

        boolean flag = true;
        m = 0;

        Collections.sort(jx, (o1, o2) -> o2.priority - o1.priority);
        //进程优先级排序

        m++;
        while (flag) {
            if (yx == null) {
                yx.add(jx.get(0));
            }
            //运行队列为空时，进程加入

            jx.get(0).time -= 1;
            jx.get(0).priority -= 1;
            jx.get(0).state = "E";

            for (int i = 0; i < jx.size(); i++) {
                if (jx.get(i).time == 0) {
                    jx.get(i).state = "F";
                }
            }
            //判断进程是否完成

            System.out.println("经过" + m + "个时间片后，" + jx.get(0).id + "被调用,还需要" + jx.get(0).time + "个时间");

            for (int j = 0; j < jx.size(); j++) {
                System.out.println("经过" + m + "个时间片后，" + jx.get(j).id + "的状态为" + jx.get(j).state);
            }

            for (int j = 0; j < wc.size(); j++) {
                System.out.println("经过" + m + "个时间片后，" + wc.get(j).id + "的状态为" + wc.get(j).state);
            }

            if (jx.get(0).time != 0) {
                jx.get(0).state = "R";
            }
            //当进程未完成时，将进程状态改回就绪状态

            Collections.sort(jx, (o1, o2) -> o2.priority - o1.priority);
            //进程优先级排序

            for (int i = 0; i < jx.size(); i++) {
                if (jx.get(i).time == 0) {
                    jx.get(i).state = "F";
                    wc.add(jx.get(i));
                    jx.remove(i);
                }
            }
            //进程完成时，放入完成队列

            if (wc.size() == n) {
                flag = false;
                System.out.println("进程全部完成调度！");
            }
        }
    }
}

