package com.learn.java.dp.decorator;

public class VisualComponentClient {
    public static void main(String[] args) {
        VisualComponent window = new Window();
        VisualComponent listBox = new ListBox();
        VisualComponent textBox = new TextBox();
        //为窗体增加黑色边框
        VisualComponent decoratorWindow = new BlackBorderDecorator(window);
        decoratorWindow.display();
        //为列表增加黑色边框
        VisualComponent decoratorListBox = new BlackBorderDecorator(listBox);
        decoratorListBox.display();

        //增加黑边框同时增加滚动条，实现多次包装
        VisualComponent decoratorWindow2 = new ScrollBarDecorator(decoratorWindow);
        decoratorWindow2.display();
    }
}
