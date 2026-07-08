package com.cognizant.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVoidMethodThrowsException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("API Error"))
                .when(mockApi)
                .sendData("Hello");

        MyService service = new MyService(mockApi);

        assertThrows(
                RuntimeException.class,
                () -> service.processData("Hello")
        );

        verify(mockApi).sendData("Hello");

    }

}