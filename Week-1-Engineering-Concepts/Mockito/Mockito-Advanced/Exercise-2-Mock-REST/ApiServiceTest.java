import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ApiServiceTest {

    @Mock
    RestClient restClient;

    @InjectMocks
    ApiService apiService;

    @Test
    public void testServiceWithMockRestClient() {

        when(restClient.getResponse()).thenReturn("Mock Response");

        String result = apiService.fetchData();

        assertEquals("Fetched Mock Response", result);
    }
}