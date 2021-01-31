package org.alaguna.testingstrategy.acceptance;

import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class BookAcceptanceTest extends AcceptanceTests {

    @Test
    public void getAllBooks() throws Exception{
        String endpoint = "/books";
        int expectedStatusCode = 200;
        String expectedResponse = "[{\"id\":-1,\"name\":\"Gray Mountain\",\"sheetsNumber\":10,\"bookTopic\":{\"id\":-1,\"name\":\"Historical\"}},{\"id\":-2,\"name\":\"Speak English\",\"sheetsNumber\":200,\"bookTopic\":{\"id\":-2,\"name\":\"Educational\"}},{\"id\":-3,\"name\":\"Speak English 2\",\"sheetsNumber\":30,\"bookTopic\":{\"id\":-2,\"name\":\"Educational\"}}]";
        //TODO: IS THIS THE BEST WAY TO ASSERT ACCEPTANCE TESTS?

        mockMvc.perform(get(endpoint)).andExpect(status().is(expectedStatusCode))
                .andExpect(content().string(expectedResponse));
    }

}
