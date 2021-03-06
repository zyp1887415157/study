package com.lanou.springjpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "role_info")
public class RoleInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    @Column(name = "name")
    private String name;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
