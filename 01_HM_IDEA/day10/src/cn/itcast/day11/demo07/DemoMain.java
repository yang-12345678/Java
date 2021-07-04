package cn.itcast.day11.demo07;

public class DemoMain {
    public static void main(String[] args) {
        // 首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.PowerOn();

        // 准备一个鼠标，供电脑使用
        Mouse mouse = new Mouse();
        // 首先进行向上转型
        USB usbMouse = new Mouse();
        // 参数是USB 类型，传递进去的是USB对象
        computer.useDevice(usbMouse);

        // 创建一个键盘
        Keyboard keyboard = new Keyboard();  // 没有使用多态写法
        // 参数是USB 类型，传递进去的是实现类对象
        computer.useDevice(keyboard);  // 自动向上转型，，类似于 int --> double
//        computer.useDevice(new Keyboard());

        computer.PowerOff();
    }
}
