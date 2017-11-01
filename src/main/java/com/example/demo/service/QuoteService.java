/**
 *
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Meigen;

/**
 * Manage the Quote (Interface)
 * @author lepra
 *
 */
public interface QuoteService {
  /*
   * Insert a Quote
   * */
  public void setQuote(Meigen meigen);
  /*
   * Get a Quotes
   *
   * */
  public List<Meigen> getQuoteList();

}
