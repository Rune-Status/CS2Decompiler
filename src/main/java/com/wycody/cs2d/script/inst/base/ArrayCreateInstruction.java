package com.wycody.cs2d.script.inst.base;

import com.jagex.core.stringtools.general.StringTools;
import com.jagex.core.constants.SerialEnum;
import com.jagex.game.runetek5.config.vartype.constants.ScriptVarType;
import com.wycody.cs2d.Context;
import com.wycody.cs2d.print.ScriptPrinter;
import com.wycody.cs2d.script.inst.Instruction;
import com.wycody.cs2d.script.inst.InstructionType;
import com.wycody.cs2d.script.inst.types.StackType;

public class ArrayCreateInstruction extends Instruction {
    
    Object size;

    public ArrayCreateInstruction() {
        super(InstructionType.NEW_ARRAY);
    }

    @Override
    public void process(Context context) {
        size = pop(StackType.INT);
    }

    @Override
    public void print(Context context, ScriptPrinter printer) {
        int arrayId = this.integerOperand >> 16;
        char character = (char) (this.integerOperand & 0xffff);
        	
        ScriptVarType arrayType = null;//TODO might not work always
        if(StringTools.method12875(character))
        	arrayType = ScriptVarType.getByChar(character);
        else
        	arrayType = SerialEnum.forID(ScriptVarType.values(), (int)character);
        printer.println(arrayType.name().toLowerCase()+"[]"+" array"+arrayId+" = new "+arrayType.name().toLowerCase()+"["+size+"];");
    }

    @Override
    public int getPushCount(StackType type) {
        return 0;
    }

    @Override
    public int getPopCount(StackType type) {        
        if (StackType.INT == type) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
