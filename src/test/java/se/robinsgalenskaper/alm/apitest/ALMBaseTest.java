package se.robinsgalenskaper.alm.apitest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public abstract class ALMBaseTest {

    @Autowired
    protected MockMvc mockMvc;

    protected final ObjectMapper jsonMapper;

    protected ALMBaseTest() {
        jsonMapper = new ObjectMapper();
        jsonMapper.findAndRegisterModules(); // to get mapping of LocalDateTime correct
    }
}
