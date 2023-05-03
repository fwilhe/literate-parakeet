package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void anotherTest() {
        
    }

    @Test
    void anotherTest2() {
        
    }

    @Test
    void anotherTest3() {
        throw new RuntimeException("foo");
    }

}
