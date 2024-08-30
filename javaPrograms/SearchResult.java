public class SearchResult {
    private int index;
    private int value;

    // Constructor
    public SearchResult(int index, int value) {
        this.index = index;
        this.value = value;
    }

    // Getters
    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }

    // Method to display the result
    public void display() {
        if (index >= 0) {
            System.out.println("Element " + value + " found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
