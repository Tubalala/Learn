package cn.tu.le;


import java.util.ArrayList;

public class OperationTest {
    public int test(String str){
        if (str == null || str.length() == 0) {
            return 0;
        }
        StringStack op = new StringStack();
        StringStack num = new StringStack();
        return 0;
    }
    static class StringStack{
        private ArrayList<String> list;
        private int count;

        private StringStack() {
            this.list = new ArrayList<>();
            this.count = 0;
        }

        public boolean push(String item) {
            list.add(item);
            return true;
        }

        public String pop(){
            if (list.size() == 0) {
                return null;
            }
            String res = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return res;
        }
    }

}
