package com.spring.starter.service;

import com.spring.starter.repository.StarterRepository;
import com.spring.starter.entity.Starter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StarterServiceTest {

    @Mock
    StarterRepository repository;

    @InjectMocks
    StarterService service;

    @Test
    public void saveRecord() {

        Starter entity = Starter.builder().build();

        when(repository.save(any(Starter.class))).thenReturn(entity);

        service.saveRecord(entity);

        verify(repository).save(entity);
    }
}