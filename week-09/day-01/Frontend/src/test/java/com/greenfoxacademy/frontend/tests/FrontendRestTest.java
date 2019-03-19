package com.greenfoxacademy.frontend.tests;

import com.greenfoxacademy.frontend.controller.MainRestController;
import com.greenfoxacademy.frontend.service.LogEntryService;
import com.greenfoxacademy.frontend.service.MainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
// http hívásokhoz kell, innentől tudjuk használni a MockMvc-t, a program pedig tudja, hogy mit kell autowirelni
@WebMvcTest(MainRestController.class)
public class FrontendRestTest {

    @MockBean
    LogEntryService logEntryService;

    @MockBean
    private MainService mainService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void doubleInput_ReturnErrorWithoutInput() throws Exception {
        mockMvc.perform(get("/doubling"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.error").value("Please provide an input!"));
    }

    @Test
    public void doubleInput_ReturnCorrectValueWithInput() throws Exception {

        when(mainService.doubleInput(eq(15))).thenReturn(30);

        mockMvc.perform(get("/doubling?input=15"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value(30))
                .andExpect(MockMvcResultMatchers.jsonPath("$.received").value(15));
    }

    @Test
    public void greeter_ReturnErrorNameRequiredWhenNameIsMissing() throws Exception {
        mockMvc.perform(get("/greeter?title=scholar"))
                .andExpect(MockMvcResultMatchers.jsonPath("error")
                        .value("Please provide a name!"));
    }

    @Test
    public void greeter_ReturnErrorTitleRequiredWhenTitleIsMissing() throws Exception {
        mockMvc.perform(get("/greeter?name=Peter"))
                .andExpect(MockMvcResultMatchers.jsonPath("error")
                        .value("Please provide a title!"));
    }

    @Test
    public void greeter_ReturnWelcomeMessageWithNameAndTitleWhenBothArePresent() throws Exception {
        mockMvc.perform(get("/greeter?name=Peter&title=scholar"))
                .andExpect(MockMvcResultMatchers.jsonPath("welcome_message")
                        .value("Oh, hi there Peter, my dear scholar!"));
    }

    @Test
    public void appendA_ReturnError404IsNotFoundWhenNoPathVariableIsPresent() throws Exception{
        mockMvc.perform(get("/appenda/"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void appendA_ReturnPathVariableInputWithLetterAAppendedToItWhenInputIsPresent() throws Exception{
        mockMvc.perform(get("/appenda/kuty"))
                .andExpect(MockMvcResultMatchers.jsonPath("appended").value("kutya"));
    }

    @Test
    public void 
}
