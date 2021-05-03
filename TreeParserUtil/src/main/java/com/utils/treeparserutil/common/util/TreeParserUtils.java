package com.utils.treeparserutil.common.util;


import com.utils.treeparserutil.common.bean.TreeEntity;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.core.collection.CollUtil;

/**
 * 解析树形数据工具类
 *
 * Created by Qing.Li7
 * Date 2021/4/20 10:30
 * Description
 */
public class TreeParserUtils {

    /**
     * 解析树形数据
     *
     * @param topId
     * @param entityList
     * @return
     * @date 2017年5月29日
     */
    public static <E extends TreeEntity<E>> List<E> getTreeList(Object topId, List<E> entityList) {
        List<E> resultList = new ArrayList<>();

        //获取顶层元素集合
        for (E entity : entityList) {
            if (entity.getParentId() == null || topId.equals(entity.getParentId().toString())) {
                resultList.add(entity);
            }
        }

        //获取每个顶层元素的子数据集合
        for (E entity : resultList) {
            entity.setChildren(getSubList(entity.getId(), entityList));
        }
        return resultList;
    }

    /**
     * 获取子数据集合
     *
     * @param parentId
     * @param entityList
     * @return
     * @author jianda
     * @date 2017年5月29日
     */
    private static <E extends TreeEntity<E>> List<E> getSubList(Object parentId, List<E> entityList) {
        List<E> childList = new ArrayList<>();

        //子集的直接子对象
        for (E entity : entityList) {
            if (parentId.equals(entity.getParentId())) {
                childList.add(entity);
            }
        }
        //子集的间接子对象
        for (E entity : childList) {
            entity.setChildren(getSubList(entity.getId(), entityList));
        }

        //递归退出条件
        if (CollUtil.isEmpty(childList)) {
            return CollUtil.newArrayList();
        }
        return childList;
    }
}
