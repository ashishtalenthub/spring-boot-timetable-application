package com.example.demo.entity;


import lombok.*;

import javax.persistence.*;


@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Class")
@Builder
@Getter
@Setter
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_number")
    private long classNumber;

    @Column(name = "class_strength")
    private int classStrength;

    @Column(name = "subject_list" )
    private String subjects;


}
