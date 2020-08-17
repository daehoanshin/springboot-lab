package me.xbb123;

/**
 * @author xbb123
 */
public class SpySampleService implements SampleService {
    @Override
    public String getName() {
        return "Spy";
    }

    @Override
    public int getNumber() {
        return 0;
    }
}
