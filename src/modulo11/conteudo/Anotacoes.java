package modulo11.conteudo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Anotacoes {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        var obj = new MyClass();

        new Processor().process(obj);
    }
}

class Processor {
    public void process(Object obj) throws InvocationTargetException, IllegalAccessException {
        // retorna lista de metodos da classe
        var methods = obj.getClass().getDeclaredMethods();
        // percorre metodos das classe
        for (Method method : methods) {
            // verifica se o metodo contem nossa anotacao
            if (method.isAnnotationPresent(PrintHello.class)) {
                System.out.println("Hello do process!");
                method.invoke(obj);
            }

        }


    }
}

class MyClass {
    @PrintHello
    public void myMethod() {
        System.out.println("My Method's logic...");
    }
}

/**
 * nossa anotacao
 */
// como compilador deve aplicar
@Retention(RetentionPolicy.RUNTIME)
// aonde é aplicado
@Target(ElementType.METHOD)
@interface PrintHello {

}

