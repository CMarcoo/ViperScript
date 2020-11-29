package me.thevipershow.viperscript.core.lexer;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public final class OrderedInstructions {

    /**
     * The root node.
     */
    private final Node<Instruction> rootNode;

    /**
     * Run all of the instructions in order.
     */
    public final void runOrdered() {
        for (Node<Instruction> node : this.rootNode.getChildren()) {
            Instruction instruction = node.getData();
            if (instruction == null) {
                continue;
            }
            instruction.execute();
        }
    }
}
