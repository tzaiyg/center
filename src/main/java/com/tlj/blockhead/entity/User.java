package com.tlj.blockhead.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Table(name = "t_user")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @Column(name = "t_id")
    String id;
    @Column(name = "t_name")
    String name;
    @Column(name = "t_head")
    String head;
    @Column(name = "t_pass")
    String pass;
    @Column(name="t_days")
    Integer days;
    @Column(name="t_money")
    BigDecimal money;

}
