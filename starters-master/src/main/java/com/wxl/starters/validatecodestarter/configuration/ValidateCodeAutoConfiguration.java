package com.wxl.starters.validatecodestarter.configuration;

import com.wxl.starters.validatecodestarter.configuration.property.ValidateCodeProperties;
import com.wxl.starters.validatecodestarter.filter.ImageValidateCodeFilter;
import com.wxl.starters.validatecodestarter.generator.ImageCodeGenerator;
import com.wxl.starters.validatecodestarter.generator.ValidateCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wangxiaolong
 * @date 2019/5/21 12:03
 */
@Configuration
@EnableConfigurationProperties({ValidateCodeProperties.class})
@ComponentScan(basePackages = "com.wxl.starters.validatecodestarter.controller")
@Import(ImageValidateCodeFilter.class)
public class ValidateCodeAutoConfiguration {

  @Autowired
  private ValidateCodeProperties validateCodeProperties;

  @Bean
  @ConditionalOnMissingBean(name = "imageCodeGenerator")
  public ValidateCodeGenerator imageCodeGenerator(){
    ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
    codeGenerator.setValidateCodeProperties(validateCodeProperties);
    return codeGenerator;
  }

}
