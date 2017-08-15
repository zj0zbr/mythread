package org.socket.rpc.idl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by andilyliao on 17-4-9.
 */
public abstract class IDosomething {
    public String doSomething(Method m,String param) throws InvocationTargetException, IllegalAccessException {
        String str[]=param.split("\\|");
        boolean b= (boolean) m.invoke(this,str[2],str[3]);
       if (b){
           return "TRUE";
       }else{
           return "FALSE";
       }
    }
}
