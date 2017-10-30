/**
 *
 */
package com.example.demo.model;

import java.util.Date;

/**
 * @author lepra
 *
 */
public class Meigen {
  private int id;
  private String title;
  private String name;
  private String quote;
  private Date createdate;
  /**
   * @return id
   */
  public int getId() {
    return id;
  }
  /**
   * @param id セットする id
   */
  public void setId(int id) {
    this.id = id;
  }
  /**
   * @return title
   */
  public String getTitle() {
    return title;
  }
  /**
   * @param title セットする title
   */
  public void setTitle(String title) {
    this.title = title;
  }
  /**
   * @return name
   */
  public String getName() {
    return name;
  }
  /**
   * @param name セットする name
   */
  public void setName(String name) {
    this.name = name;
  }
  /**
   * @return quote
   */
  public String getQuote() {
    return quote;
  }
  /**
   * @param quote セットする quote
   */
  public void setQuote(String quote) {
    this.quote = quote;
  }
  /**
   * @return createdate
   */
  public Date getCreatedate() {
    return createdate;
  }
  /**
   * @param createdate セットする createdate
   */
  public void setCreatedate(Date createdate) {
    this.createdate = createdate;
  }

}
