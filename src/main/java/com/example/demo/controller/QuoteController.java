/**
 *
 */
package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Util;
import com.example.demo.model.Meigen;
import com.example.demo.repository.MeigenMapper;
import com.example.demo.service.QuoteService;

/**
 * @author lepra
 *
 */
@RestController
public class QuoteController {
  private static final Logger logger = LoggerFactory.getLogger(QuoteController.class);

  @Autowired
  private QuoteService quoteService;

  @Autowired
  private MeigenMapper meigenMapper;

  @RequestMapping("/meigenset")
  public Meigen meigenSet(@RequestBody Meigen meigen) throws Exception {
    logger.info("{}.{} start.", Util.getClassName(), Util.getMethodName());
    Meigen newMeigen = new Meigen();
    if(meigen.getTitle() != null) {
      newMeigen.setTitle(meigen.getTitle());
    }else {
      throw new Exception();
    }
    if(meigen.getName() != null) {
      newMeigen.setName(meigen.getName());
    }else {
      throw new Exception();
    }
    if(meigen.getQuote() != null) {
      newMeigen.setQuote(meigen.getQuote());
    }else {
      throw new Exception();
    }
    quoteService.setQuote(newMeigen);
    Meigen getMeigen = meigenMapper.select(newMeigen.getId());
    logger.info("{}.{} end.", Util.getClassName(), Util.getMethodName());
    return getMeigen;
  }

  @RequestMapping("/meigengets")
    public List<Meigen> meigenGets() {
      logger.info("{}.{} start.", Util.getClassName(), Util.getMethodName());
      List<Meigen> getMeigen = quoteService.getQuoteList();
      logger.info("{}.{} end.", Util.getClassName(), Util.getMethodName());
      return getMeigen;
    }

  @RequestMapping("/meigendelete")
  public void meigenDelete(@RequestBody Meigen meigen) {
    logger.info("{}.{} start.", Util.getClassName(), Util.getMethodName());
    logger.info("id = " + meigen.getId());
    quoteService.removeQuote(meigen.getId());
    logger.info("{}.{} end.", Util.getClassName(), Util.getMethodName());
  }

  @RequestMapping("/meigencopy")
  public void meigenCopy(@RequestBody Meigen meigen) {
    // FIXME コピーできなくても200を返却する
    logger.info("{}.{} start.", Util.getClassName(), Util.getMethodName());
    logger.info("id = " + meigen.getId());
    quoteService.copyQuoteById(meigen.getId());
    logger.info("{}.{} end.", Util.getClassName(), Util.getMethodName());
  }
}