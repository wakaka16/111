package com.wxl.starters.validatecodestarter.annotion;

import com.wxl.starters.validatecodestarter.configuration.ValidateCodeAutoConfiguration;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

/**
 * 使用此注解启用验证码
 */
@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(value = {java.lang.annotation.ElementType.TYPE})
@Documented
@Import(ValidateCodeAutoConfiguration.class)
public @interface EnableValidateCode {

}
