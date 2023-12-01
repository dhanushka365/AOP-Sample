package com.example.AOP.Sample.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO{
    @Override
    public void addAccount() {
        System.out.println(getClass()+":DOING MY DB WORK:ADDING AN MEMBERSHIP ACCOUNT");
    }

    @Override
    public void addSillyMember() {
        System.out.println(getClass()+":DOING MY DB WORK:ADDING A SILLY MEMBER");
    }

    @Override
    public boolean deleteSillyMember() {
        System.out.println(getClass()+":DOING MY DB WORK:ADDING A SILLY MEMBER Delete( check return type)");
        return true;
    }
}
