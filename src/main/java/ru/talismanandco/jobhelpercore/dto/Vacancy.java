package ru.talismanandco.jobhelpercore.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vacancy {

    private String company;
    /** пример от 510 000 до 572 000 руб. до вычета налогов */
    private Salary salary;
    private String title;
    /** пример "Java" "Spring Framework" */
    private List<String> skills;
}
