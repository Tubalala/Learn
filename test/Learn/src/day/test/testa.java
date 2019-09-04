package day.test;

public class testa {
    public static void main(String[] args){
        System.out.println("hello world!");
        System.out.println( sort(5,6,3));
        System.out.println("1-100结果是"+sum(1));
        System.out.println("1-100结果是"+sum(2));
    }
//    public static int arrySort(){
//
//    }
    public static int sum(int a){
        int sum=0;
        if(a == 1 ){
            for (int i = 1; i < 100; i++) {
                sum += i;
            }
        }else if (a == 2){
            for (int i = 1; i < 100; i++) {
                if (i % 2 == 0){
                    sum += i;
                }
            }
        }
        return sum;
    }

    public static int sort(int a , int b,int c){
        for (int i = 0; i < c; i++) {
            System.out.println("========");
        }
        int max =0;
        if (a<b){
            return a =+ ++b;
        } else {
            max = a > b ? a : b;
            return max;
        }
    }
}
