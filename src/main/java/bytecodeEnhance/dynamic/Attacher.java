package bytecodeEnhance.dynamic;


import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

public class Attacher {
    public static void main(String[] args) throws IOException, AttachNotSupportedException, AgentLoadException, AgentInitializationException {
        // 传入目标 JVM pid
        VirtualMachine vm = VirtualMachine.attach("16096");
        vm.loadAgent("C:\\File\\ideaworkspace\\ideaworkspace\\springboot\\src\\main\\java\\bytecodeEnhance\\dynamic\\myagent.jar");
    }
}
