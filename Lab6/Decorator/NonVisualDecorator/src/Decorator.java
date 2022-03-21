/**
 * Decorator extending from Content because it has something in common
 */
public class Decorator extends Content{
    // Object with Content type to reference the content
    private Content contentToBeDecorated;
    Decorator(Content contentToBeDecorated){this.contentToBeDecorated = contentToBeDecorated;}
    public void show(){contentToBeDecorated.show();}
}



