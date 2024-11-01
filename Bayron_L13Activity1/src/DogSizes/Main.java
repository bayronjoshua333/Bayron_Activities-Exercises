package DogSizes;

public class Main {
    public static void main(String[] args) {      
        String sizeInput = "Small";
        DogSize selectedSize = null;
        try {
            selectedSize = DogSize.valueOf(sizeInput.toUpperCase());
        } catch (IllegalArgumentException e) {
        	System.out.println("I don't know which one you like");
        }

        DogSelector dogSelector = new DogSelector(selectedSize);
        dogSelector.selectDogSize();
    }
}
