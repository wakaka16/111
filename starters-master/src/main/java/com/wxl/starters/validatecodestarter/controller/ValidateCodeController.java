package com.wxl.starters.validatecodestarter.controller;

import com.wxl.starters.validatecodestarter.constant.ValidateCode;
import com.wxl.starters.validatecodestarter.exception.ValidateCodeException;
import com.wxl.starters.validatecodestarter.generator.ValidateCodeGenerator;
import com.wxl.starters.validatecodestarter.pojo.ImageCode;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiaolong
 * @date 2019/3/27 17:19
 * 验证码访问控制器
 */
@RestController
@RequestMapping(value = "/v1/validateCode")
public class ValidateCodeController{

  @Autowired
  private ValidateCodeGenerator imageCodeGenerator;

  /**
   * 获取图片验证码
   * @param request
   * @param response
   * @throws IOException
   */
  @GetMapping("/image")
  public void createImageCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
    //创建图片验证码生成器
    ImageCode imageCode = imageCodeGenerator.createCode(request);
    //将随机数 放到Session中
    request.getSession().setAttribute(ValidateCode.SESSION_KEY,imageCode);
    //写给response 响应
    ImageIO.write(imageCode.getImage(),"JPEG",response.getOutputStream());
  }

  @RequestMapping(value = "/error", method = {RequestMethod.GET, RequestMethod.POST})
  public String error(HttpServletRequest request) {
    Object exception = request.getAttribute(ValidateCode.VALIDATE_CODE_EXCEPTION);
    ValidateCodeException validateCodeException = (ValidateCodeException)exception;
    return validateCodeException.getMessage();
  }


}
