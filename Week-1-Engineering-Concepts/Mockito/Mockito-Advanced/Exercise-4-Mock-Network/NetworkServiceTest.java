import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class NetworkServiceTest {

    @Mock
    NetworkClient networkClient;

    @InjectMocks
    NetworkService networkService;

    @Test
    public void testServiceWithMockNetworkClient() {

        when(networkClient.connect()).thenReturn("Mock Connection");

        String result = networkService.connectToServer();

        verify(networkClient).connect();

        assertEquals("Connected to Mock Connection", result);
    }
}