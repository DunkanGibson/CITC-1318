public class Rose extends Plant {

    private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 1;
    // A rose grows each year to the same height. During the winter they die down
    // to ground level.//
    private void grow() {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
    }

    private void dieDownForWinter() {
        setHeight(0);
    }

    public void doSpring() {
        grow();
        addYearToAge();
        System.out.println("Spring: The rose is starting to grow " + "up from the ground");
        System.out.println("\t Current Age: " + getAge() + " " + "Current Height: " + getHeight());
    }

    public void doSummer() {
        System.out.println("Summer: The rose has stopped growing " + "and is flowering");
        System.out.println("\t Current Age: " + getAge() + " " + "Current Height: " + getHeight());
    }

    public void doFall() {
        System.out.println("Fall: The rose begins to wilt");
        System.out.println("\t Current Age: " + getAge() + " " + "Current Height: " + getHeight());
    }

    public void doWinter() {
        dieDownForWinter();
        System.out.println("Winter: The rose is dormant underground");
        System.out.println("\t Current Age: " + getAge() + " " + "Current Height: " + getHeight());
    }
    
}
