package cn.itcast.travel.service;

public interface FavoriteService {
    boolean isFavorite(String rid,int uid);

    /**
     * 添加收藏
     * @param rid
     * @param uid
     */
    void add(String rid, int uid);
}
