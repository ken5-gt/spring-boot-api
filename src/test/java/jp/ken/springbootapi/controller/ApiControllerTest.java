package jp.ken.springbootapi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunnner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApiControllerTest {
    // Spring MVCのモック
    private MockMvc mockMvc;

    @BeforeEach
    void setup() {

        // Spring MVCのモックを設定する
        this.mockMvc = MockMvcBuilders.standaloneSetup(new ApiController()).build();
    }

    @Test
    void GETでアクセスする() throws Exception {

        // GETで「/」にアクセスする
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                // レスポンスのステータスコードが200であることを検証する
                .andExpect(status().isOk())
                // レスポンスボディが「Hello World」であることを検証する
                .andExpect(content().string("Hello World"));
    }

    @Test
    void POSTでアクセスする() throws Exception {

        // POSTで「/」にアクセスする
        mockMvc.perform(MockMvcRequestBuilders.post("/"))
                // レスポンスのステータスコードが405（METHOD_NOT_ALLOWED）であることを検証する
//                .andExpect(content().string("Hello World"));
                .andExpect(status().isMethodNotAllowed());
    }
}
