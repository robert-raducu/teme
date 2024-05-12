package Tema26_27;

//-Create a generic class Box<T> that can store a single item of any type.
// Implement methods to set and get the item from the box.

public class Box<T> {
    T content;

    public T getContent(){
        return content;
    }

    public void setContent(T content){
        this.content = content;
    }
}
