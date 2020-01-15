package test.joggle;

/**
 * @Discription
 */
public class JoggleImpl implements Joggle{
    @Override
    public Integer overrideFun(int i) {
        return i;
    }

    @Override
    public String overrideFun(int i, String s) {
        return s;
    }
}
