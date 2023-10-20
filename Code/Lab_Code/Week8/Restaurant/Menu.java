import java.util.Vector;

public class Menu implements Cloneable {

    protected String title;
    protected FrontCover frontCover;
    protected BackCover backCover;
    protected Vector<Page> pages = new Vector<>();

    public Menu(String title, String name, String phoneNum) {
        this.title = title;
        this.frontCover = new FrontCover(name);
        this.backCover = new BackCover(phoneNum);
    }

    class FrontCover {

        String name;
        int numOfDishes = 10;

        FrontCover(String name) {
            this.name = name;
        }
    }

    class BackCover {

        String phoneNum;

        BackCover(String phoneNum) {
            this.phoneNum = phoneNum;
        }
    }

    class Page {

        int pageNum;

        Page(int pageNum) {
            this.pageNum = pageNum;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Title: ").append(title).append("\n");
        sb.append("Front Cover:\n");
        sb.append("    Name: ").append(frontCover.name).append("\n");
        sb
                .append("    Number of Dishes: ")
                .append(frontCover.numOfDishes)
                .append("\n");

        sb.append("Total number of pages: ").append(pages.size()).append("\n");

        for (Page page : pages) {
            sb.append("    PageNum: ").append(page.pageNum).append("\n");
        }
        sb.append("Back Cover:\n");
        sb.append("    Phone Number: ").append(backCover.phoneNum).append("\n");

        return sb.toString();
    }
}
