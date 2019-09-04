package day.eleven;

import java.util.Scanner;

public class demo01 {
    static String[] usernames = {"张三","李四","王五"};
    public static void main(String[] args) throws ReasigerException{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        checkUsername(username);
    }
    public static void checkUsername(String username) throws ReasigerException{
        for (String name :
                usernames) {
            if (name.equals(username)) {
//                try {
//                    throw new ReasigerException("亲，你的用户名已被注册!!!");
//                }catch (ReasigerException e){
//                    e.printStackTrace();
//                    return;
//                }
                throw new ReasigerException("亲，你的用户名已被注册!!!");
            }
        }
        System.out.println("注册成功!!!");
    }


}
