public class JosephusProblem {

  // Solve the Josephus problem for a list of persons and a number k
  // of persons to be skipped. The solution should "simulate" the
  // counting-out and return a queue that contains all persons in the
  // order they were counted out.
  //
  public static Queue<String> solve(String[] persons, int k) {
    // TODO: implementation
    Queue<String> leben = new Queue<String>(); // erste Queue "Leben"
    Queue<String> tot = new Queue<String>();  // zweite Queue für die "toten"


    for (int i = 0; i < persons.length; ++i) { // erste Queue wird mit alle Personen befüllt
      leben.enqueue(persons[i]);
    }

    While(!leben.isEmpty());                //solange die Leben Queue nicht leer ist mache...
    {
      for (int j = 0; j <= k - 1; ++j) {  // abzählen bis zu Person an stelle K
        String pos = leben.dequeue();   //Personen vor stelle k werden aus leben entfernt
        if (j != k - 1) {
          leben.enqueue(pos);  // und hiten wieder angefügt

        }
        else {
          tot.enqueue(pos);  //person an stelle k wird in die tot Queue befördert
        }
      }
    }
    return tot;
  }
  public static void main(String[] args) {
    // TODO: test
    String[] p1 = {"Abdallah", "Ali", "Halla", "Ahmed","Tomans","Paul" };
    String[] p2 = {"1", "2", "3","4", "5", "6","7", "8", "9","10","11", "12", "13"}; // Josephus Problem
    Queue<String> s = solve(p1, 3);
    System.out.println(s.toString());
    System.out.println();

    Queue<String> Josephus = solve(p2, 7);
    System.out.println(Josephus.toString());

  }
}

