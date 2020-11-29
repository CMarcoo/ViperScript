package me.thevipershow.viperscript.core.lexer;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public abstract class LexerParseOutput {

    protected final List<ListenerData> listenerData = new ArrayList<>();


}
