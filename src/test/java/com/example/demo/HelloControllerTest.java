```java
package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void helloTest() {

        HelloController controller = new HelloController();

        String result = controller.hello();

        assertEquals(
            "Hello from Java Spring Boot application!",
            result
        );
    }
}
```
