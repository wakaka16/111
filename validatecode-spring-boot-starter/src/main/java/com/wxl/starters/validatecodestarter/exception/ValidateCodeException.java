package com.wxl.starters.validatecodestarter.exception;

/**
 * @author wangxiaolong
 * @date 2019/5/21 14:33
 */
public class ValidateCodeException extends RuntimeException {

  private static final long serialVersionUID = -3311409982889114576L;

  public ValidateCodeException(String msg) {
    super(msg);
  }
}

