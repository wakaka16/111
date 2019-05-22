package com.wxl.starters.validatecodestarter.configuration.property;

/**
 * @author wangxiaolong
 * @date 2019/3/27 17:41
 * 图像验证码配置类
 */
public class ImageCodeProperties {
  /**
   * 验证码宽度
   */
  private int width = 67;
  /**
   * 高度
   */
  private int height = 23;
  /**
   * 长度（几个数字）
   */
  private int length = 4;
  /**
   * 过期时间
   */
  private int expireIn = 60;

  /**
   * 需要图形验证码的 url（，分割）
   */
  private String url;

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getExpireIn() {
    return expireIn;
  }

  public void setExpireIn(int expireIn) {
    this.expireIn = expireIn;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
