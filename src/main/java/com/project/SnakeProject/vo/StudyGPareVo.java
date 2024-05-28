package com.project.SnakeProject.vo;

public class StudyGPareVo {
    private int SGPIdx;
    private int SGIIdx;
    private String SGPName;
    private int SGPPrice;
    private String SGIContent;

    public StudyGPareVo(String SGPName, int SGPPrice, String SGIContent) {
        this.SGPName = SGPName;
        this.SGPPrice = SGPPrice;
        this.SGIContent = SGIContent;
    }

    public int getSGPIdx() {
        return SGPIdx;
    }

    public void setSGPIdx(int SGPIdx) {
        this.SGPIdx = SGPIdx;
    }

    public int getSGIIdx() {
        return SGIIdx;
    }

    public void setSGIIdx(int SGIIdx) {
        this.SGIIdx = SGIIdx;
    }

    public String getSGPName() {
        return SGPName;
    }

    public void setSGPName(String SGPName) {
        this.SGPName = SGPName;
    }

    public int getSGPPrice() {
        return SGPPrice;
    }

    public void setSGPPrice(int SGPPrice) {
        this.SGPPrice = SGPPrice;
    }

    public String getSGIContent() {
        return SGIContent;
    }

    public void setSGIContent(String SGIContent) {
        this.SGIContent = SGIContent;
    }
}
