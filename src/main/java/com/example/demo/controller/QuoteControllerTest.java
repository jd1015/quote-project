package com.example.demo.controller;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Meigen;

import junit.framework.TestCase;

public class QuoteControllerTest{

    private static String GREET = "hoge";

    @Mock
    private Meigen meigen;

    @InjectMocks
    private QuoteController quoteController;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void 順番の担保() {
        DemoEntity demoEntity = DemoEntity.builder()
                .code("hoge")
                .value("fuga")
                .updateAt(null)
                .build();
        when(demoRepository.findByCode(anyObject())).thenReturn(demoEntity);
        when(demoService.greeting(anyObject())).thenReturn("hello");
        DemoRequest demoRequest = new DemoRequest();
        demoRequest.setCode(GREET);
        String expected = demoController.demo(demoRequest);

        verify(demoRepository, times(1)).findByCode(GREET);
        verify(demoService, times(1)).greeting("fuga");

        assertThat("hello", is(expected));
    }

}