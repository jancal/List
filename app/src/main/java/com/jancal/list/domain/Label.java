package com.jancal.list.domain;

/**
 * Created by Administrator on 2016/11/19.
 */

public class Label {
    private String name;
    private Scope scope;//范围：月、日
    private PlanType planType;//类型：计划内、计划外
    private String remark;

    public Label(String name, Scope scope, PlanType planType, String remark) {
        this.name = name;
        this.scope = scope;
        this.planType = planType;
        this.remark = remark;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        if (scope == null) {
            throw new IllegalArgumentException("scope should not be empty");
        }
        this.scope = scope;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public void setPlanType(PlanType planType) {
        if (planType == null) {
            throw new IllegalArgumentException("planType should not be empty");
        }
        this.planType = planType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name should not be empty");
        }
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
