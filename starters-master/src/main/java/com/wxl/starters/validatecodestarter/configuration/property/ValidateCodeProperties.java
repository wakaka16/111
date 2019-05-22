package com.wxl.starters.validatecodestarter.configuration.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wangxiaolong
 * @date 2019/5/21 11:58
 * 验证码配置类
 * 所有的验证码属性都通过此类进行配置
 * 包括验证码错误页面、图片验证码、短信验证码、语音验证码...
 */
@ConfigurationProperties(prefix = "validate.code")
public class ValidateCodeProperties {

  /**
   * 默认错误页面
   */
  private String defaultErrorPath = "/v1/validateCode/error";

  /**
   * 图形验证码 配置属性
   */
  private ImageCodeProperties image = new ImageCodeProperties();

  /**
   * 短信验证码 配置属性
   */


  /**
   * 其它一系列验证码
   *
   */



  public String getDefaultErrorPath() {
    return defaultErrorPath;
  }

  public void setDefaultErrorPath(String defaultErrorPath) {
    this.defaultErrorPath = defaultErrorPath;
  }


  public ImageCodeProperties getImage() {
    return image;
  }

  public void setImage(ImageCodeProperties image) {
    this.image = image;
  }

}
