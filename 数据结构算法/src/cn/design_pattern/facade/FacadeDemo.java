package cn.design_pattern.facade;

/**
 * 外观模式
 * 模拟计算机开机
 */
public class FacadeDemo {

    class CPU{
        public void startCPU(){
            System.out.println("CPU started...");
        }
    }
    class Disk{
        public void startDisk(){
            System.out.println("Disk started...");
        }
    }
    class Memory{
        public void startMemory(){
            System.out.println("Memory started...");
        }
    }

    /**
     * 外观类
     */
    class StartBtn{
        public void start(){
            FacadeDemo demo = new FacadeDemo();
            demo.new CPU().startCPU();
            demo.new Disk().startDisk();
            demo.new Memory().startMemory();
        }
    }
    public void test(){
        FacadeDemo demo = new FacadeDemo();
        //不使用外观模式 开机过程需要
        demo.new CPU().startCPU();
        demo.new Disk().startDisk();
        demo.new Memory().startMemory();

        //使用外观模式后 只需要
        demo.new StartBtn().start();
    }
}
