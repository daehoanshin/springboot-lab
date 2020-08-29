package me.xbb123.datajpa03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Meeting {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;

}
