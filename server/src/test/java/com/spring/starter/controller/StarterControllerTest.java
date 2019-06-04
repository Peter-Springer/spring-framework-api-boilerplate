package com.spring.starter.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.starter.entity.Starter;
import com.spring.starter.json.RequestJson;
import com.spring.starter.service.StarterService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(MockitoJUnitRunner.class)
public class StarterControllerTest {

    @Mock
    private StarterService service;

    @InjectMocks
    private StarterController controller;

    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Before
    public void setup() {
        mockMvc = standaloneSetup(controller).build();
    }

    @Test
    public void gettingStarted_returnsTheStarterEntity() throws Exception {

        RequestJson requestJson = RequestJson.builder()
                .request("hello")
                .build();

        Starter entity = Starter.builder()
                .column("hello")
                .build();

        when(service.saveRecord(any(Starter.class))).thenReturn(entity);

        mockMvc.perform(post("/api/v1/gettingStarted")
                .content(objectMapper.writeValueAsString(requestJson))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("column").value("hello"));

        verify(service).saveRecord(entity);
    }
}