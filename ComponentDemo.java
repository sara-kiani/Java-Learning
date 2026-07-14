abstract class Component {
    private final int width;
    private final int height;

    public Component(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    public abstract void show();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Component component = (Component) obj;
        return width == component.width && height == component.height;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(width, height);
    }
}

class TextBox extends Component {
    private String text;

    public TextBox(int width, int height, String text) {
        super(width, height);
        this.text = text;
    }

    @Override
    public void show() {
        System.out.println("TextBox: width=" + getWidth() + ", height=" + getHeight() + ", text='" + text + "'");
    }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}

class Button extends Component {
    private String label;

    public Button(int width, int height, String label) {
        super(width, height);
        this.label = label;
    }

    @Override
    public void show() {
        System.out.println("Button: width=" + getWidth() + ", height=" + getHeight() + ", label='" + label + "'");
    }

    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }
}

public class ComponentDemo {
    public static void main(String[] args) {
        Component[] components = new Component[4];
        components[0] = new TextBox(100, 30, "Hello World");
        components[1] = new Button(80, 40, "Click Me");
        components[2] = new TextBox(120, 20, "Another Text");
        components[3] = new Button(90, 50, "Submit");

        System.out.println("=== All Components ===");
        for (Component comp : components) {
            comp.show();
        }

        Component comp1 = new TextBox(100, 30, "Hello");
        Component comp2 = new TextBox(100, 30, "World");
        System.out.println("\n=== Equals Test ===");
        System.out.println("comp1.equals(comp2): " + comp1.equals(comp2));

        System.out.println("\n=== Final Test ===");
        System.out.println("comp1 width: " + comp1.getWidth() + " (cannot be changed)");
    }
}