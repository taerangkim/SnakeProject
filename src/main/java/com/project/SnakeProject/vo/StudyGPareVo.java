package com.project.SnakeProject.vo;

public class StudyGPareVo {
    int SGPIdx;
    int SGIIdx;
    String SGPName;
    int SGPPrice;
    String SGIContent;

    public StudyGPareVo(int SGPIdx, int SGIIdx, String SGPName, int SGPPrice, String SGIContent) {
        this.SGPIdx = SGPIdx;
        this.SGIIdx = SGIIdx;
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
