package bytecodeEnhance;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

public class JavaAssistTest {
    public static void main(String[] args) throws Exception {
        Base b = new Base();
        ClassPool cp = ClassPool.getDefault();
        CtClass cc = cp.get("bytecodeEnhance.Base");
        CtMethod m = cc.getDeclaredMethod("process");
        m.insertBefore("{ System.out.println(\"start\"); }");
        m.insertAfter("{ System.out.println(\"end\"); }");
        Class c = cc.toClass();
        cc.writeFile("./");
        Base h = (Base) c.newInstance();
        h.process();
    }
}
