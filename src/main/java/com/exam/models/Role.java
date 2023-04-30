package com.exam.models;

import jakarta.persistence.*;

@Entity
@Table(name="roles")
public class Role {
    @Id
    private Long roleID;
    private String roleName;

    public Role() {
    }

    public Role(Long roleID, String roleName) {
        this.roleID = roleID;
        this.roleName = roleName;
    }

    public Long getRoleID() {
        return roleID;
    }

    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
