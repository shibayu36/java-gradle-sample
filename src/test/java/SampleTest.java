import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shibayu36 on 2016/12/17.
 */
public class SampleTest {
    @Test
    public void addNum() throws Exception {
        assertEquals(Sample.addNum(1, 2), 3);
    }
}