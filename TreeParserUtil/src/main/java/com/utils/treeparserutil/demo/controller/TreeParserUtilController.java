package com.utils.treeparserutil.demo.controller;

import com.utils.treeparserutil.demo.service.TreeParserUtilService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by narcissist Date 2021/5/3 10:21 上午 Description
 */
@RestController
public class TreeParserUtilController {
    @Autowired
    private TreeParserUtilService treeService;

    /**
     * TreeParserUtil展示
     */
    @GetMapping("tree")
    public Object getTree() {
        return treeService.getTree();
    }
}
