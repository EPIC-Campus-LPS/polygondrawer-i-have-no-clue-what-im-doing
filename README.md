# Lab 1 : Polygon Drawer
For this lab, you will create an application to "draw" polygons using the Model-View-Controller design scheme. Your program will open a window using Java's Swing library and allow users to click the screen to add vertexes to their polygon. Your program will also allow users to undo the last vertex they added or clear the screen and start again.

## Example Video


https://github.com/gormes-EPIC/PolygonApplicationSample/assets/134316348/0cb59dbe-535e-425a-80ff-3a9d92f43192



## Resources
[Java Polygon class](https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/awt/Polygon.html) - *You will want to use these to represent each vertex. The polygons the user sees will be a collection of these vertexes.*

[Java Swing examples](http://www.java2s.com/Tutorials/Java/Swing.htm) - *The Swing library allows programmers to create simple GUI for Java programs. For this project, the window has been created for you, but you will need to connect the visual elements to their respective functionalities*

[Original project this assignment was adapted from](https://github.com/heineman/tangram/tree/master/TangramCourseProject/sample)

[Tutorial for original assignment with old Java](https://heineman.github.io/TangramProject/sample/) - ***USE THIS RESOURCE***

---
## Polygon Drawer - Part 1

### Getting Started
1. Create a GUI with Swing in an `Application` class
   1. Add JMenuBar, JMenu, and JMenuItem as components
   2. Create your layout with a JMenuBar with 2 JMenus, each with 1 JMenuItem. This should all be part of a JPanel.
   3. Rename menu components
   4. Add a constructor
      1. Set the title, close operations, and bounds
      2. Initialize menu components and add them to each other
      3. Add keybindings for menu item shortcuts
      4. Set border, layout, and content pane
2. Add a `model`, `view`, and `controller` folders and change the Project Structure to mark each of those as sources
3. Run the application and make sure it works!
4. Add Javadoc comments


### Building Basic Functionality
1. Create a `Model` class to represent the model for this class. Rather than use an external database, you may choose to store your vertices(of type `Polygon`) in a data structure of your choice. It is also important that the order in which vertexes were added to the polygon is maintained.
2. Create a `PolygonDrawer` class to extend JPanel
3. Add getters for `PolygonDrawer`, and both JMenuItems
4. Update the `Application` constructor to be a parameter of the model
5. Update the `Application` so WindowBuilder doesn't complain
6. Update the main to add the `Model` and `Application`
