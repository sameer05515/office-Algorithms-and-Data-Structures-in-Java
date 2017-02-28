package CoreJava;

/**
 * Created by sujeet on 31/12/14.
 */
public class TestI implements ITest {
    // these methods have to be public,
    // since in interface everything is public so visibility cannot be reduced
    
    public int test() {
        return 0;
    }

    
    public int dheeraj(String h) {
        return Integer.parseInt(h);
    }
}
