/**
 *
 */
package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Meigen;
import com.example.demo.repository.MeigenMapper;

/**
 * @author lepra
 *
 */
@RestController
public class QuoteController {
  private static final Logger logger = LoggerFactory.getLogger(QuoteController.class);

  @Autowired
  private MeigenMapper meigenMapper;

  @RequestMapping("/meigenset")
  public Meigen meigenSet(@RequestBody Meigen meigen) throws Exception {
    logger.info("Called greetingPost.");
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
    meigenMapper.insert(newMeigen);
    Meigen getMeigen = meigenMapper.select(newMeigen.getId());
    return getMeigen;
  }

  @RequestMapping("/meigengets")
    public Meigen[] meigenGets() {
      logger.info("Called greetingPost.");
      Meigen[] getMeigen = meigenMapper.selectAll();
      return getMeigen;
    }
}