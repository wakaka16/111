package com.wxl.starters.validatecodestarter.pojo;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * @author wangxiaolong
 * @date 2019/3/27 17:23
 * 这个对象是根据客户端参数生成的，
 * 然后放在session中，用于对比用户的传入验证码
 *
 */
public class ImageCode {

  /**
   * 图片
   */
  private BufferedImage image;
  /**
   * 随机数
   */
  private String code;
  /**
   * 过期时间
   */
  private LocalDateTime expireTime;

  public ImageCode(BufferedImage image, String code, LocalDateTime expireTime) {
    this.image = image;
    this.code = code;
    this.expireTime = expireTime;
  }
  public ImageCode(BufferedImage image, String code, int  expireIn) {
    this.image = image;
    this.code = code;
    //当前时间  加上  设置过期的时间
    this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
  }

  public boolean isExpried(){
    //如果 过期时间 在 当前日期 之前，则验证码过期
    return LocalDateTime.now().isAfter(expireTime);
  }

  public BufferedImage getImage() {
    return image;
  }

  public void setImage(BufferedImage image) {
    this.image = image;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LocalDateTime getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(LocalDateTime expireTime) {
    this.expireTime = expireTime;
  }
}
