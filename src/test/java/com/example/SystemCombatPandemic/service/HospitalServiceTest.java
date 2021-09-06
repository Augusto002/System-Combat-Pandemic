package com.example.SystemCombatPandemic.service;


import com.example.SystemCombatPandemic.repository.HospitalRepository;
import com.example.SystemCombatPandemic.utils.HospitalUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HospitalServiceTest {

    @Mock
    private HospitalRepository hospitalRepository;

    @InjectMocks
    private HospitalService hospitalService;

    @Test
    void testGivenHospitalDTOThenSaveMessage() {
        HospitalUtils.createFakeDTO();
    }
}
