package com.utils.treeparserutil.demo.service.impl;

import com.utils.treeparserutil.common.constants.BasicsConstants;
import com.utils.treeparserutil.common.util.TreeParserUtils;
import com.utils.treeparserutil.demo.bean.resp.TreeEntityResp;
import com.utils.treeparserutil.demo.service.TreeParserUtilService;

import org.springframework.stereotype.Service;

import java.util.List;

import cn.hutool.core.collection.CollUtil;

/**
 * Created by narcissist Date 2021/5/3 10:27 上午 Description
 */
@Service
public class TreeParserUtilServiceImpl implements TreeParserUtilService {
    @Override
    public List<TreeEntityResp> getTree() {
        List<TreeEntityResp> list = CollUtil.newArrayList();
        return TreeParserUtils.getTreeList(BasicsConstants.MENU_TREE_TOP,list);
    }
}
