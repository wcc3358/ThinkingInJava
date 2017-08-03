package interfaces.interfaceprocessor;

import interfaces.filters.BandPass;
import interfaces.filters.HighPass;
import interfaces.filters.LowPass;
import interfaces.filters.Waveform;

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform waveform = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),waveform);
        Apply.process(new FilterAdapter(new HighPass(2.0)),waveform);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),waveform);
    }
}
