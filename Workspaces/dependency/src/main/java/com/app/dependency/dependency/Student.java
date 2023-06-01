package com.app.dependency.dependency;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class Student {

    private final School school;
    private final Teacher teacher;

}
