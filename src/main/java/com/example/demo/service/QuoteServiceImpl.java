/**
 *
 */
package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Util;
import com.example.demo.model.Meigen;
import com.example.demo.repository.MeigenMapper;

/**
 * @author lepra
 *
 */
@Service
public class QuoteServiceImpl implements QuoteService {

  private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);

  @Autowired
  private MeigenMapper meigenMapper;

  /* (非 Javadoc)
   * @see com.example.demo.service.QuoteService#setQuote(com.example.demo.model.Meigen)
   */
  @Override
  public void setQuote(Meigen meigen) {
    logger.info("{}.{} start.", Util.getClassName(), Util.getMethodName());
    meigenMapper.insert(meigen);
    logger.info("{}.{} end.", Util.getClassName(), Util.getMethodName());
  }

  /* (非 Javadoc)
   * @see com.example.demo.service.QuoteService#getQuoteList()
   */
  @Override
  public List<Meigen> getQuoteList() {
    logger.info("{}.{} start.", Util.getClassName(), Util.getMethodName());
    Meigen[] getMeigen = meigenMapper.selectAll();
    logger.info("{}.{} end.", Util.getClassName(), Util.getMethodName());
    return Arrays.asList(getMeigen);
  }

  /*
   * Remove a Quotes
   * @param id
   *
   * */
  @Override
  public void removeQuote(Integer id) {
    logger.info("{}.{} start.", Util.getClassName(), Util.getMethodName());
    meigenMapper.deleteMeigenById(id);
    logger.info("{}.{} end.", Util.getClassName(), Util.getMethodName());
  }

  /*
   * Copy a Quotes
   * @param id
   *
   * */
  @Override
  public void copyQuoteById(Integer id) {
    logger.info("{}.{} start.", Util.getClassName(), Util.getMethodName());
    meigenMapper.deleteMeigenById(id);
    logger.info("{}.{} end.", Util.getClassName(), Util.getMethodName());
  }
}
