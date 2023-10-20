public class Main {

    public static void main(String[] args) {
        // Create a Chinese menu and add pages
        Menu chineseMenu = new Menu(
                "Chinese Food",
                "Forbidden City",
                "408-123-4356");
        chineseMenu.pages.add(chineseMenu.new Page(1));
        chineseMenu.pages.add(chineseMenu.new Page(2));
        chineseMenu.pages.add(chineseMenu.new Page(3));

        System.out.println("---------- Chinese Menu ----------");
        System.out.println(chineseMenu);
        System.out.println("-------------------------------\n");

        // Create a fancy Mexican menu and add pages
        FancyMenu mexicanMenu = new FancyMenu(
                "Mexican Food",
                "Taco Bell",
                "510-123-4567",
                "red");
        mexicanMenu.pages.add(mexicanMenu.new Page(1));
        mexicanMenu.pages.add(mexicanMenu.new Page(2));
        mexicanMenu.pages.add(mexicanMenu.new Page(3));
        mexicanMenu.pages.add(mexicanMenu.new Page(4));

        // Print Fancy Mexican menu details
        System.out.println("---------- Fancy Mexican Menu ----------");
        System.out.println(mexicanMenu);
        System.out.println("--------------------------------------");
        // Japanese menu
        Menu japaneseMenu = new Menu(
                "Japanese Food",
                "Sushi Joe",
                "408-123-4356");
        japaneseMenu.pages.add(japaneseMenu.new Page(1));
        japaneseMenu.pages.add(japaneseMenu.new Page(2));
        japaneseMenu.pages.add(japaneseMenu.new Page(3));

        System.out.println("---------- Japanese Menu ----------");
        System.out.println(japaneseMenu);
        System.out.println("-------------------------------\n");

        // Korean menu
        Menu koreanMenu = new Menu(
                "Korean Food",
                "Korean BBQ",
                "408-123-4356");
        koreanMenu.pages.add(koreanMenu.new Page(1));
        koreanMenu.pages.add(koreanMenu.new Page(2));
        koreanMenu.pages.add(koreanMenu.new Page(3));

        System.out.println("---------- Korean Menu ----------");
        System.out.println(koreanMenu);
        System.out.println("-------------------------------\n");
        // Vietnamese menu
        Menu vietnameseMenu = new Menu(
                "Vietnamese Food",
                "Pho King",
                "408-123-4356");
        vietnameseMenu.pages.add(vietnameseMenu.new Page(1));
        vietnameseMenu.pages.add(vietnameseMenu.new Page(2));
        vietnameseMenu.pages.add(vietnameseMenu.new Page(3));

        System.out.println("---------- Vietnamese Menu ----------");
        System.out.println(vietnameseMenu);
        System.out.println("-------------------------------\n");
        // Indian menu
        Menu indianMenu = new Menu(
                "Indian Food",
                "Curry House",
                "408-123-4356");
        indianMenu.pages.add(indianMenu.new Page(1));
        indianMenu.pages.add(indianMenu.new Page(2));
        indianMenu.pages.add(indianMenu.new Page(3));

        System.out.println("---------- Indian Menu ----------");
        System.out.println(indianMenu);
        System.out.println("-------------------------------\n");

        // American menu
        Menu americanMenu = new Menu(
                "American Food",
                "McDonalds",
                "408-123-4356");
        americanMenu.pages.add(americanMenu.new Page(1));
        americanMenu.pages.add(americanMenu.new Page(2));
        americanMenu.pages.add(americanMenu.new Page(3));

        System.out.println("---------- American Menu ----------");
        System.out.println(americanMenu);
        System.out.println("-------------------------------\n");

        // Italian menu

        Menu italianMenu = new Menu(
                "Italian Food",
                "Olive Garden",
                "408-123-4356");
        italianMenu.pages.add(italianMenu.new Page(1));
        italianMenu.pages.add(italianMenu.new Page(2));
        italianMenu.pages.add(italianMenu.new Page(3));

        System.out.println("---------- Italian Menu ----------");
        System.out.println(italianMenu);
        System.out.println("-------------------------------\n");

        // French menu
        FancyMenu frenchMenu = new FancyMenu(
                "French Food",
                "Le Bistro",
                "408-123-4356",
                "blue");
        frenchMenu.pages.add(frenchMenu.new Page(1));
        frenchMenu.pages.add(frenchMenu.new Page(2));
        frenchMenu.pages.add(frenchMenu.new Page(3));
        frenchMenu.pages.add(frenchMenu.new Page(4));

        // Print Fancy Mexican menu details
        System.out.println("---------- Fancy French Menu ----------");
        System.out.println(frenchMenu);
        System.out.println("--------------------------------------");

        // Thai menu
        Menu thaiMenu = new Menu(
                "Thai Food",
                "Thai Express",
                "408-123-4356");
        thaiMenu.pages.add(thaiMenu.new Page(1));
        thaiMenu.pages.add(thaiMenu.new Page(2));
        thaiMenu.pages.add(thaiMenu.new Page(3));

        System.out.println("---------- Thai Menu ----------");
        System.out.println(thaiMenu);
        System.out.println("-------------------------------\n");
    }
}
