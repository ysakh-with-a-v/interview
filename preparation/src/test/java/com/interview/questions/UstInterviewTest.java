package com.interview.questions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UstInterviewTest {

    @InjectMocks
    private UstInterview interview;



    @Test
    public void sortTest(){
        interview.sortInput();
    }

    @Test
    public void swapTests(){
        interview.swapAdjacent();
//        22,11,44,33,55,66,55
    }
}
