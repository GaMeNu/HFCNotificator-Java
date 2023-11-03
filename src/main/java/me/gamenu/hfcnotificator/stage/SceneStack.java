package me.gamenu.hfcnotificator.stage;

import javafx.scene.Scene;

import java.util.Stack;

public class SceneStack {
    Stack<Scene> stack;

    public SceneStack() {
        this.stack = new Stack<>();
    }

    public void push(Scene scene) {
        this.stack.push(scene);
    }

    public Scene peek() {
        return this.stack.peek();
    }

    public Scene pop() {
        return this.stack.pop();
    }

    public Scene back() {
        this.stack.pop();
        return this.stack.peek();
    }

}
