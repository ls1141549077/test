package proxy.jdkproxy;

import com.sun.org.apache.xpath.internal.operations.String;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author YSH
 * @ClassName JdkProxy
 * @Discription jdk动态代理
 * @date 2019/5/8 0008
 */
public class JdkProxy<T> implements InvocationHandler {

    public Object target ;

    public JdkProxy(Object target){
        this.target = target ;
    }

    public T getProxy(){
        return  (T)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 执行代理
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("前置 : 打印日志");
        method.invoke(this.target ,args);
        System.out.println("后置 : 打印日志");
        return null;
    }


}
