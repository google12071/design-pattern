package com.learn.java.dp.builder;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 装修建造者（自由装配）
 */
@Data
public class FinishingBuilder {
    /**
     * 一级吊顶
     *
     * @param area
     * @return
     */
    public FinishingDirector levelOne(BigDecimal area) {
        return new ConcreteFinishingDirector("豪华欧式", area)
                .appendCeiling(new LevelOneCeiling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new ShengXiangFloor());
    }

    /**
     * 二级吊顶
     *
     * @param area
     * @return
     */
    public FinishingDirector levelTwo(BigDecimal area) {
        return new ConcreteFinishingDirector("轻奢田园", area)
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new LiBangCoat())
                .appendFloor(new MarcoPoloTile());
    }

    /**
     * 三级吊顶
     *
     * @param area
     * @return
     */
    public FinishingDirector levelThree(BigDecimal area) {
        return new ConcreteFinishingDirector("现代简约", area)
                .appendCeiling(new LevelOneCeiling())
                .appendCoat(new LiBangCoat())
                .appendTile(new DongPengTile());
    }
}
