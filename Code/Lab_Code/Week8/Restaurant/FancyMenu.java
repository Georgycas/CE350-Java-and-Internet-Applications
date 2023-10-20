public class FancyMenu extends Menu {

    protected String MenuColor;

    public FancyMenu(
            String title,
            String name,
            String phoneNum,
            String MenuColor) {
        super(title, name, phoneNum);
        this.MenuColor = MenuColor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()); // Leveraging the parent's toString()

        sb.append("Color: ").append(MenuColor).append("\n");

        return sb.toString();
    }
}
