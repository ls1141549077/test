package test.jdk;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InterfaceImplTest implements InterfaceTest{

    @Override
    public String testFunction() {
        return null;
    }

    @Override
    public String testException() throws FileNotFoundException {
        if(1==1){
            throw  new FileNotFoundException();
        }
        return "OK";
    }
}
