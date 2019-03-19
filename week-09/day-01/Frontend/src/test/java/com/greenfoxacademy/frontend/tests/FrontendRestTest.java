package com.greenfoxacademy.frontend.tests;

import com.greenfoxacademy.frontend.controller.MainRestController;
import com.greenfoxacademy.frontend.service.LogEntryService;
import com.greenfoxacademy.frontend.service.MainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
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
                .andExpect(MockMvcResultMatchers.jsonPath("$.error")
                        .value("Please provide a name!"));
    }

    @Test
    public void greeter_ReturnErrorTitleRequiredWhenTitleIsMissing() throws Exception {
        mockMvc.perform(get("/greeter?name=Peter"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.error")
                        .value("Please provide a title!"));
    }

    @Test
    public void greeter_ReturnWelcomeMessageWithNameAndTitleWhenBothArePresent() throws Exception {
        mockMvc.perform(get("/greeter?name=Peter&title=scholar"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.welcome_message")
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
                .andExpect(MockMvcResultMatchers.jsonPath("$.appended")
                        .value("kutya"));
    }

    @Test
    public void doUntil_ReturnPageNotFoundErrorWhenCalledWithoutAction() throws Exception{

        mockMvc.perform(put("/dountil/"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void doUntil_ReturnCorrectResultWhenSumActionAndBodyArePresent() throws Exception{

        when(mainService.doAction(eq("sum"), eq(5))).thenReturn(15);

        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 5}"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result")
                        .value(15));
    }

    @Test
    public void doUntil_ReturnPredefinedErrorWhenNoContentIsPresent() throws Exception{

        mockMvc.perform(post("/dountil/sum"))
                .andExpect(MockMvcResultMatchers.jsonPath("error")
                        .value("Please provide a number!"));
    }

    @Test
    public void processArraysAsGiven_ReturnCorrectResultWhenWhatIsDoubleAndNumbersArraysIsPresent() throws Exception{

        when(mainService.doOneAction(eq("double"), eq(new int[]{1,2,5,10}))).thenReturn(new int[]{2,4,10,20});

        mockMvc.perform(post("/arrays/")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"what\": \"double\", \"numbers\": [1,2,5,10]}"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result[0]").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result[1]").value(4))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result[2]").value(10))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result[3]").value(20));
    }

    @Test
    public void processArraysAsGiven_ReturnCorrectResultWhenWhatIsMultiplyAndNumbersArraysIsPresent() throws Exception{

        when(mainService.doOneAction(eq("multiply"), eq(new int[]{1,2,5,10}))).thenReturn(100);

        mockMvc.perform(post("/arrays/")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"what\": \"multiply\", \"numbers\": [1,2,5,10]}"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value(100));
    }
}
