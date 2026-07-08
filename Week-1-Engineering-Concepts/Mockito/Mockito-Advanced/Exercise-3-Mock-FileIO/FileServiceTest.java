import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class FileServiceTest {

    @Mock
    FileReader fileReader;

    @Mock
    FileWriter fileWriter;

    @InjectMocks
    FileService fileService;

    @Test
    public void testServiceWithMockFileIO() {

        when(fileReader.read()).thenReturn("Mock File Content");

        String result = fileService.processFile();

        verify(fileWriter).write("Processed Mock File Content");

        assertEquals("Processed Mock File Content", result);
    }
}