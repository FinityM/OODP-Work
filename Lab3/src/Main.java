/**
 * Main class for checking the OS of the system
 * */
public class Main{
  public static void main(String[] args){
    GUIBuilder builder = new GUIBuilder();
    AbstractWidgetFactory widgetFactory = null;
    //check what platform we're on
    if (System.getProperty("os.name").toLowerCase().contains("mac")){
      widgetFactory  = new MacOSXWidgetFactory();
    } else if (System.getProperty("os.name").toLowerCase().contains("unix")) {
      widgetFactory = new UnixWindowsWidgetFactory();
    } else {
      widgetFactory  = new MsWindowsWidgetFactory();
    }
    builder.buildWindow(widgetFactory, "New Window");
  }
}



