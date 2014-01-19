package simplify.exec.instruction;

import org.jf.dexlib2.iface.instruction.formats.Instruction22c;
import org.jf.dexlib2.iface.reference.TypeReference;

import simplify.exec.MethodExecutionContext;
import simplify.exec.UnknownValue;

public class NewArrayInstruction {

    public static void execute(MethodExecutionContext ectx, Instruction22c instruction, int index) {
        String type = ((TypeReference) instruction.getReference()).toString();

        // Use UnknownValue since type is all that really matters and null is not expected.
        ectx.addRegister(instruction.getRegisterA(), type, new UnknownValue(), index);
    }

}