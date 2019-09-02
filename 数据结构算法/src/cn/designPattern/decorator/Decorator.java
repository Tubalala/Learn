package cn.designPattern.decorator;

import java.io.InputStream;

/**
 * 装饰者模式
 */
public class Decorator {
    /**
     * 被装饰对象
     */
    interface Person{
        int doOperation();
        void show();
    }

    /**
     * 装饰器
     */
    abstract class DecoratorPerson implements Person{
        protected Person person;

        public DecoratorPerson(Person person) {
            this.person = person;
        }
    }

    /**
     * 未被装饰前对象
     */
    class NoDecoratorPerson implements Person{
        @Override
        public int doOperation() {
            return 0;
        }

        @Override
        public void show() {
            System.out.println("未被装饰:"+this.doOperation());
        }
    }

    /**
     * A装饰后
     */
    class DecoratorPersonByA extends DecoratorPerson{
        public DecoratorPersonByA(Person person) {
            super(person);
        }

        @Override
        public int doOperation() {
            return person.doOperation() + 10;
        }

        @Override
        public void show() {
            person.show();
            System.out.println("A装饰后:"+this.doOperation());
        }
    }

    /**
     * B装饰后
     */
    class DecoratorPersonByB extends DecoratorPerson{

        public DecoratorPersonByB(Person person) {
            super(person);
        }

        @Override
        public int doOperation() {
            return person.doOperation() + 20;
        }

        @Override
        public void show() {
            person.show();
            System.out.println("B装饰后:"+this.doOperation());
        }
    }

    public static void main(String[] args) {
        Decorator demo = new Decorator();
        Person a = demo.new NoDecoratorPerson();
        a = demo.new DecoratorPersonByA(a);
        a = demo.new DecoratorPersonByB(a);
        a.show();
        System.out.println("最终:"+a.doOperation());
    }
}
