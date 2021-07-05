package com.tlj.blockhead.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
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
    @NotBlank(message = "T名字不能为空")
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
//    @NotBlank(message = "T邮箱不能为空")
    @Column(name = "t_mail")
    String email;

}
