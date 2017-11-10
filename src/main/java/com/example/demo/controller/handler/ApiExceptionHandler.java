/**
 *
 */
package com.example.demo.controller.handler;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.MyBatisSystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author lepra
 *
 */
@ControllerAdvice
public class ApiExceptionHandler {

  private static final Logger logger = LoggerFactory.getLogger(ApiExceptionHandler.class);

  /**
   * MyBatisSystemException handling method.
   * @param ex
   * @return
   */
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler({ MyBatisSystemException.class})
  @ResponseBody
  public Map<String, String> handleMyBatisSystemException(MyBatisSystemException ex) {
    logger.info("Called handleExceptionError is start.");
    Map<String, String> errorMap = new HashMap<String, String>();
    errorMap.put("message", "エラーが発生しました。");
    logger.info(ex.getMessage(), ex);
    logger.info("Called handleExceptionError is end.");
    return errorMap;
  }
}
