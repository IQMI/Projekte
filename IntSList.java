
// ruthe lösung
import aud.SList;
import java.util.function.Predicate;

// This class "wraps" an instance of `SList<Integer>` (attribute
// `li`): Calls to `toString()` and `push_front()` are "delegated" to
// the instance.
// The additional method `filter()` applies a predicate and constructs
// a new list with all items for which the predicate evaluates to `true`.
//
class even implements Predicate<Integer>{
  @Overrid
  public boolean test (Integer integer){
    return false;
  }
}
public class IntSList {
  // Store list of integers as an SList.

  //SList<Integer> li;
  SList<Integer> li-new SList();

  public IntSList() {
    // TODO: Constructor
  }

  // delegate to SList
  @Override
  public String toString() {
    return li.toString();
  }

  // delegate to SList
  public void push_front(int obj){
    li.push_front(obj);
  }

  // Filter list by predicate `p` and return list of all items for
  // which predicate evaluates to `true`.
  // The order of items in the returned list may differ from the order
  // in `this` list (because we use always `push_front()`).
  //

  public static Predicate<Integer> isEven() { return p -> p %2==0; }
  public static Predicate<Integer> is_larger42() { return p -> p > 42; }
  public IntSList filter(Predicate<Integer> p){
    // TODO: implementation
    IntSList rueckgabe = new IntSList();
    for (Integer data_: li){
      if(p.test(data_)){
        rueckgabe.push_front(data_);
      }
    }
    return rueckgabe;
  }

  // You must provide a main() method!
  public static void main(String args[]) {
    // TODO: test
    IntSList input = new IntSList();
    input.push_front(24);
    input.push_front(74);
    input.push_front(93);
    input.push_front(85);
    input.push_front(72);
    input.push_front(81);
    System.out.println(input.filter(isEven()).toString());
    System.out.println(input.filter(is_larger42()).toString());
    System.out.println(input.filter(new even()));

  }

}


// حل مضروب
/////////////////////////////////////////////////////////////
/*
   import aud.SList;

// This class "wraps" an instance of `SList<Integer>` (attribute
// `li`): Calls to `toString()` and `push_front()` are "delegated" to
// the instance.
// The additional method `filter()` applies a predicate and constructs
// a new list with all items for which the predicate evaluates to `true`.
//
public class IntSList {
  // Store list of integers as an SList.
  SList<Integer> li;

  public IntSList() {
    // TODO: Constructor
  }

  // delegate to SList
  @Override
  public String toString() {
    return li.toString();
  }

  // delegate to SList
  public void push_front(int obj){
    li.push_front(obj);
  }

  // Filter list by predicate `p` and return list of all items for
  // which predicate evaluates to `true`.
  // The order of items in the returned list may differ from the order
  // in `this` list (because we use always `push_front()`).
  //
  public IntSList filter(Predicate p){
    // TODO: implementation
    IntSList newList = new IntSList();
    for (Integer i:li) {
      if (p.test(i))
        newList.push_front(i);
    }
    return newList;
  }

  // You must provide a main() method!
  public static void main(String args[]) {
    // TODO: test
    class EvenFilter implements Predicate {
      public boolean test(int el){
        return (el % 2) == 0;
      }
    }

    class OddFilter implements Predicate {
      public boolean test (int el) {
        return (el%2)! = 0;
      }
    }
    IntSList l = new IntSList();
    l.push_front(85);
    l.push_front(72);
    l.push_front(93);
    l.push_front(81);
    l.push_front(74);
    l.push_front(42);
    IntSList filteredL = l.filter(new EvenFilter());
    System.out.println(filteredL.toString());
    IntSList list = new IntSList();
    list.push_front(85);
    list.push_front(72);
    list.push_front(93);
    list.push_front(81);
    list.push_front(74);
    list.push_front(42);
    IntSList filteredL = list.filter(new OddFilter());
    System.out.println(filteredL.toString());
  }
}
*/

///////////////////////////////////////////////////////////////
//Joel Lösung
/*
import aud.SList;

// This class "wraps" an instance of `SList<Integer>` (attribute
// `li`): Calls to `toString()` and `push_front()` are "delegated" to
// the instance.
// The additional method `filter()` applies a predicate and constructs
// a new list with all items for which the predicate evaluates to `true`.
//
public class IntSList {
  // Store list of integers as an SList.
  SList<Integer> li;

  public IntSList() {
    // TODO: Constructor
    li = new SList<>();
  }

  // delegate to SList
  @Override
  public String toString() {
    return li.toString();
  }

  // delegate to SList
  public void push_front(int obj){
    li.push_front(obj);
  }

  // Filter list by predicate `p` and return list of all items for
  // which predicate evaluates to `true`.
  // The order of items in the returned list may differ from the order
  // in `this` list (because we use always `push_front()`).
  //
  public IntSList filter(Predicate<Integer> p){
    IntSList ret = new IntSList();
    for (Integer i : this.li) {
      if (p.test(i)){
        ret.push_front(i);
      }
    }
    return ret;
  }

  // You must provide a main() method!
  public static void main(String args[]) {
    Random g = new Random(8);
    IntSList l = new IntSList();
    int n = 100;
    for (int i = 1; i <= n; i++){
      int rnd = g.nextInt(100) + i;
      l.push_back(rnd);
    }

    //1.
    System.out.println(l.filter(new Odd()).toString());

    //2.
    System.out.println(l.filter(new Predicate<Integer>() {
      //@Override
      public boolean test (Integer integer) {
        return integer % 2 == 0;
      }
    }).toString());

    //3.
    System.out.println(l.filter(o -> o < 50).toString());

  }
}

*/



//////////////////////////AdHoc////////////////////////////////
/*
import aud.SList;
public class SortList <T extends Comparable<T>>{
  public SList<T> list;
  public SortList(){
    SList<T> list = new Slist<T>();
  }
  public boolean insert(T obj){
    int count = 0;
    for(T data : list){
      if(data.compareTo(obj) > 0){
        list.insert(count, data);
        return true;
      }
      else if (data.compareTo(obj) == 0){
        return false;
      }
      else {
        count++;
      }
    }
    list.push_back(obj);
    return true;
  }

  public static void main(String[] args){
    SortList<Integer> testList = new SortList<Integer>();
    testList.insert(1);
    testList.insert(3);
    testList.insert(2);
    System.out.println
  }
}

 */