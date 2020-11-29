package me.thevipershow.viperscript.core.lexer;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DataNode<T> implements Node<T> {

    private T data = null;
    private Node<T> parent = null;
    private final List<Node<T>> children = new ArrayList<>();

    public DataNode(T data) {
        this.data = data;
    }

    /**
     * Add a single child to this node.
     *
     * @param child The child.
     * @return The child added, or null.
     */
    @Override
    public @NotNull Node<T> addChild(@NotNull Node<T> child) {
        child.setParent(this);
        this.children.add(child);
        return child;
    }

    /**
     * Add children nodes to this node.
     *
     * @param children The children.
     */
    @Override
    public void addChildren(@NotNull List<Node<T>> children) {
        for (final Node<T> node : children) {
            node.setParent(this);
        }
        this.children.addAll(children);
    }

    /**
     * Get the children of this node.
     *
     * @return The children.
     */
    @Override
    public @NotNull List<Node<T>> getChildren() {
        return this.children;
    }

    /**
     * @return Get the data of this node.
     */
    @Override
    public @Nullable T getData() {
        return this.data;
    }

    /**
     * Set the data of this node.
     *
     * @param data The data.
     */
    @Override
    public void setData(@Nullable T data) {
        this.data = data;
    }

    /**
     * Set the parent node of this node.
     *
     * @param parent The parent.
     */
    @Override
    public void setParent(@Nullable Node<T> parent) {
        this.parent = parent;
    }

    /**
     * Get the parent Node of this Node.
     *
     * @return The parent, null if absent.
     */
    @Override
    public @Nullable Node<T> getParent() {
        return this.parent;
    }
}
