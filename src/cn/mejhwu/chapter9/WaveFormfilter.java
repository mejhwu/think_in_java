package cn.mejhwu.chapter9;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 16-12-21
 * Time: 下午6:16.
 */

class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return "Waveform " + id;
    }
}

class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) {
        return input;
    }
}

class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}

class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}

class BandPass extends Filter {
    double lowCutoff, highCutoff;
    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}

class FilterAdapter extends Processor {
    Filter filter;
    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    String name() {
        return filter.name();
    }

    @Override
    Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}

public class WaveFormfilter {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
    }
}
