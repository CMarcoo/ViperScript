package me.thevipershow.viperscript.core.lexer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ScriptExtension {

    VIPER_SCRIPT("vpsc"),
    VIPER_SCRIPT_OBJECT("vpsco");

    public final String extension;
}
