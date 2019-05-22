package com.wxl.starters.validatecodestarter.generator;

import com.wxl.starters.validatecodestarter.pojo.ImageCode;
import javax.servlet.http.HttpServletRequest;

/**
 * @author wangxiaolong
 * @date 2019/3/27 17:22
 * 验证码生成器
 */
public interface ValidateCodeGenerator {

  /**
   * 创建验证码
   * @param request
   * @return
   */
  ImageCode createCode(HttpServletRequest request);
}
