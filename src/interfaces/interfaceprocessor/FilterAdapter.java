package interfaces.interfaceprocessor;

import interfaces.filters.Filter;
import interfaces.filters.Waveform;

public class FilterAdapter implements Processor {
    //组合滤波器，使用代理
    Filter filter;
    //构造器，接收滤波器对象
    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }
    //实现所有接口定义的方法，同时这些方法也是filter中的所有方法，所以说这是一个代理类
    @Override
    public String name() {
        return filter.name();
    }

    @Override
    /**
     * Object 换成 Waveform 对象范围缩小
     */
    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}
