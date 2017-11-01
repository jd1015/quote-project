/**
 *
 */
package com.example.demo.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.model.Meigen;
import com.example.demo.repository.MeigenMapper;

/**
 * @author lepra
 *
 */
public class QuoteServiceImplTest {

  @Mock
  private MeigenMapper meigenMapper;

  @InjectMocks
  private QuoteServiceImpl quoteServiceImpl;

  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  /**
   * This is a test method for the confirmation of th null
   */
  @Test
  public void testGetQuotesNullCheck() {
    when(meigenMapper.selectAll()).thenReturn(null);
    List<Meigen> meigen = quoteServiceImpl.getQuoteList();
    assertNull(meigen);
  }

}
