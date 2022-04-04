package com.learn.java.dp.builder;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * 具体装修材料装配实现
 */
@Slf4j
public class ConcreteFinishingDirector implements FinishingDirector {

    /**
     * 装修style
     */
    private String style;

    /**
     * 装修面积
     */
    private BigDecimal area;

    /**
     * 装修清单
     */
    private List<Material> materialList = new ArrayList<>();

    public ConcreteFinishingDirector(String style, BigDecimal area) {
        this.style = style;
        this.area = area;
    }

    @Override
    public FinishingDirector appendCeiling(Material material) {
        materialList.add(material);
        return this;
    }

    @Override
    public FinishingDirector appendCoat(Material material) {
        materialList.add(material);
        return this;
    }

    @Override
    public FinishingDirector appendFloor(Material material) {
        materialList.add(material);
        return this;
    }

    @Override
    public FinishingDirector appendTile(Material material) {
        materialList.add(material);
        return this;
    }

    @Override
    public FinishingModel getFinishingDetail() {
        FinishingModel model = new FinishingModel();
        model.setStyle(style);
        model.setArea(area);
        BigDecimal total = BigDecimal.ZERO;
        if (CollectionUtils.isNotEmpty(materialList)) {
            for (Material m : materialList) {
                total = total.add(m.price().multiply(area).setScale(2, RoundingMode.HALF_UP));
            }
        }
        model.setTotalPrice(total);

        StringBuilder sb = new StringBuilder();
        sb.append("材料订单:[");
        for (Material material : materialList) {
            sb.append(material.disPlay()).append("\n");
        }
        sb.append("]");
        model.setDesc(sb.toString());
        return model;
    }
}
