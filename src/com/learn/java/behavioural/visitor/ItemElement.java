package com.learn.java.behavioural.visitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
