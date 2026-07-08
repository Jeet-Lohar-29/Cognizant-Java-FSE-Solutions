import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

    @Mock
    Repository repository;

    @InjectMocks
    Service service;

    @Test
    public void testServiceWithMockRepository() {

        // Stub the repository
        when(repository.getData()).thenReturn("Mock Data");

        // Test service
        String result = service.processData();

        // Verify result
        assertEquals("Processed Mock Data", result);
    }
}