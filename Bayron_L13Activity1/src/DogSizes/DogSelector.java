package DogSizes;

public class DogSelector {
    private DogSize dogSize;

    public DogSelector(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    public void selectDogSize() {
        if (dogSize != null) {
            System.out.println("I am a " + dogSize.toString().toLowerCase() + " doggy");
        }
    }
}
