package com.utils.treeparserutil.common.bean;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * Created by Qing.Li7
 * Date 2021/4/22 21:09
 * Description
 */
@Data
public class TreeEntity<E> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 这里id和parentId强制要用Long类型
     */
    Long id;
    Long parentId;
    List<E> children;
}
