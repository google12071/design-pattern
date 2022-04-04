package com.learn.java.dp.builder;

/**
 * 装修装配器，负责对象装配
 */
public interface FinishingDirector {
    /**
     * 添加吊顶
     *
     * @param material
     * @return
     */
    FinishingDirector appendCeiling(Material material);

    /**
     * 添加涂料
     *
     * @param material
     * @return
     */
    FinishingDirector appendCoat(Material material);

    /**
     * 添加地板
     *
     * @param material
     * @return
     */
    FinishingDirector appendFloor(Material material);

    /**
     * 添加地砖
     *
     * @param material
     * @return
     */
    FinishingDirector appendTile(Material material);

    /**
     * 装修明细
     * @return
     */
    FinishingModel getFinishingDetail();
}
