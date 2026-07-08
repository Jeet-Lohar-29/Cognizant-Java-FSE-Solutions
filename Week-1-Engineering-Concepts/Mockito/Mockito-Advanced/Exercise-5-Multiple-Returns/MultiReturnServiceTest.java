import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MultiReturnServiceTest {

    @Mock
    Repository repository;

    @InjectMocks
    Service service;

    @Test
    public void testServiceWithMultipleReturnValues() {

        when(repository.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        String firstResult = service.processData();
        String secondResult = service.processData();

        assertEquals("Processed First Mock Data", firstResult);
        assertEquals("Processed Second Mock Data", secondResult);
    }
}