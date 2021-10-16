package bytecodeEnhance.dynamic;

import bytecodeEnhance.Base;

import java.lang.instrument.Instrumentation;

public class MyAgent {
    public static void agentmain(String args, Instrumentation inst) {
        inst.addTransformer(new MyClassFileTransformer(), true);
        try {
            inst.retransformClasses(Base.class);
            System.out.println("Agent Load Done.");
        } catch (Exception e) {
            System.out.println("agent load failed!");
        }
    }
}
