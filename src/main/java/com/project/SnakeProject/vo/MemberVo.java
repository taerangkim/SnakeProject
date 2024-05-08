package com.project.SnakeProject.vo;

import java.util.Date;

public class MemberVo {
    private int MIdx, MemberSex;
    private String MemberId, MemberPw, MemberName, MemberPhone;
    private Date MRegDate;

    public int getMIdx() {
        return MIdx;
    }

    public void setMIdx(int MIdx) {
        this.MIdx = MIdx;
    }

    public int getMemberSex() {
        return MemberSex;
    }

    public void setMemberSex(int memberSex) {
        MemberSex = memberSex;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getMemberPw() {
        return MemberPw;
    }

    public void setMemberPw(String memberPw) {
        MemberPw = memberPw;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getMemberPhone() {
        return MemberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        MemberPhone = memberPhone;
    }

    public Date getMRegDate() {
        return MRegDate;
    }

    public void setMRegDate(Date MRegDate) {
        this.MRegDate = MRegDate;
    }


}
