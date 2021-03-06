package com.mock.flight.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "Staff")
public class  Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "staff_code")
    private String staffCode;

    @Column(name = "salary")
    private String salary;

    @Column(name = "name")
    private String name;


    @Override
    public String toString() {
        return "Staff{" +
                "staffCode='" + staffCode + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
