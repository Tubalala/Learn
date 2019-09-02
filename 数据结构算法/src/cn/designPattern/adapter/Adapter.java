package cn.designPattern.adapter;

/**
 * 适配器模式
 */
public class Adapter {
    /**
     * 新定义的接口
     */
    interface MyMusicPlayer{
        void play(String type,String filename);
    }

    /**
     * 已存在的实现类
     */
    class ExistPlayer{
        public void playMP3(String filename){
            System.out.println("mp3格式:"+filename);
        }
        public void playAvi(String filename){
            System.out.println("avi格式："+filename);
        }
    }

    /**
     * 适配器
     */
    class MusicAdapter implements MyMusicPlayer{

        private ExistPlayer existPlayer;

        public MusicAdapter() {
            this.existPlayer = new ExistPlayer();
        }

        @Override
        public void play(String type, String filename) {
            if (type.equalsIgnoreCase("mp3")) {
                existPlayer.playMP3(filename);
            } else if (type.equalsIgnoreCase("avi")) {
                existPlayer.playAvi(filename);
            }else {
                System.out.println("error");
            }
        }
    }

    public static void main(String[] args) {
        Adapter demo = new Adapter();
        MusicAdapter adapter = demo.new MusicAdapter();
        adapter.play("mp3","xxx.mp3");
        adapter.play("avi","xxx.avi");
    }
}
