package kr.hs.study.beans;

public class TestBean2 {
    private DataBean2 data1;
    private DataBean2 data2;

    public TestBean2(DataBean2 data1, DataBean2 data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public DataBean2 getData1() {
        return data1;
    }

    public DataBean2 getData2() {
        return data2;
    }
}
