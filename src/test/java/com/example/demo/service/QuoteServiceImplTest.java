/**
 *
 */
package com.example.demo.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Before;
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
  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  /**
   * This is a test method for the confirmation of the null
   */
  @Test
  public void testGetQuotesNullCheck() {
    when(meigenMapper.selectAll()).thenReturn(null);
    List<Meigen> meigen = quoteServiceImpl.getQuoteList();
    assertNull(meigen);
  }

}
