/**
 *
 */
package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Meigen;
import com.example.demo.repository.MeigenMapper;

/**
 * @author lepra
 *
 */
public class QuoteServiceImpl implements QuoteService {

  @Autowired
  private MeigenMapper meigenMapper;

  /* (非 Javadoc)
   * @see com.example.demo.service.QuoteService#setQuote(com.example.demo.model.Meigen)
   */
  @Override
  public void setQuote(Meigen meigen) {
    meigenMapper.insert(meigen);
  }

  /* (非 Javadoc)
   * @see com.example.demo.service.QuoteService#getQuoteList()
   */
  @Override
  public List<Meigen> getQuoteList() {
    Meigen[] getMeigen = meigenMapper.selectAll();
    return Arrays.asList(getMeigen);
  }

}
