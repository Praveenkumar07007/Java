public class SecondLargest {
  public static void main(String[] args) {
    int arr[] = {5, 2, 6, 2, 8, 9, 24, 87, 875, 454};

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondLargest && arr[i] != largest) {
        secondLargest = arr[i];
      }

      if (arr[i] < smallest) {
        secondSmallest = smallest;
        smallest = arr[i];
      } else if (arr[i] < secondSmallest && arr[i] != smallest) {
        secondSmallest = arr[i];
      }
    }

    System.out.println("Second Largest: " + secondLargest);
    System.out.println("Second Smallest: " + secondSmallest);
  }
}
