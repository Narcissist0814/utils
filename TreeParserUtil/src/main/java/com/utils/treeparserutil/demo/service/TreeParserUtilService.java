package com.utils.treeparserutil.demo.service;

import com.utils.treeparserutil.demo.bean.resp.TreeEntityResp;

import java.util.List;

/**
 * Created by narcissist
 * Date 2021/5/3 10:25 上午
 * Description
 */
public interface TreeParserUtilService {

   /**
    * TreeParserUtil的业务接口
    * @return
    */
   List<TreeEntityResp> getTree();
}
