package me.thevipershow.viperscript.core.lexer;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This is a node.
 * @param <T> Anything.
 */
public interface Node<T> {

    /**
     * Add a single child to this node.
     * @param child The child.
     * @return The child added, or null.
     */
    @NotNull
    Node<T> addChild(@NotNull Node<T> child);

    /**
     * Add children nodes to this node.
     * @param children The children.
     */
    void addChildren(@NotNull List<Node<T>> children);

    /**
     * Get the children of this node.
     * @return The children.
     */
    @NotNull
    List<Node<T>> getChildren();

    /**
     * @return Get the data of this node.
     */
    @Nullable
    T getData();

    /**
     * Set the data of this node.
     *
     * @param data The data.
     */
    void setData(@Nullable T data);

    /**
     * Set the parent node of this node.
     *
     * @param parent The parent.
     */
    void setParent(@Nullable Node<T> parent);

    /**
     * Get the parent Node of this Node.
     *
     * @return The parent, null if absent.
     */
    @Nullable
    Node<T> getParent();
}
