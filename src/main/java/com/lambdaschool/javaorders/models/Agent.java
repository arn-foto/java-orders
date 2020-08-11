package com.lambdaschool.javaorders.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="agents")
public class Agent

{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( unique = true,
            nullable = false)
    private long agentcode;

    private String agentname;
    private String workingarea;
    private double commision;
    private String phone;
    private String country;

    @OneToMany(mappedBy = "agent" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Customer> customers = new ArrayList<>();

}
