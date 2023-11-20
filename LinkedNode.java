public class LinkedNode<T> {
  T data_ = null;
  LinkedNode<T> next_ = null;

  // TODO: constructors

  public LinkedNode(T data, LinkedNode<T> next){
    this.data_ = data;
    this.next_ = next;
  }

  // TODO: getters and setters
  public T getData_() {
    return getData_;
  }

  public void setData_(T data_) {
    this.data_ = data_;
  }

  public LinkedNode<T> getNext_() {
    return next_;
  }

  public void setNext_(LinkedNode<T> next_) {
    this.next_ = next_;
  }

  // Provide String-representation for list beginning at `this` node.
  @Override
  public String toString() {
    // TODO: show data_ from this to the end

    String str = "" + this.data_ + ", " + next_.data_;
    return str;
  }

  public String toSringAll(){
    String str = "" +this.data_;
    LinkedNode<T> node = this.next_;

    while (node.next_ != null){
      str = str + ", " + node.getData_();
      node = node.getNext_();
    }
    str += ", " + node.getData_();
    return str;
  }

  // You must provide a main() method!
  public static void main(String[] args) {
    // TODO: Test

    LinkedNode<String> ausschlafen = new LinkedNode<String>("ausschlafen", null);
    LinkedNode<String> vorlesung = new LinkedNode<String>("Vorlesung", null);
    LinkedNode<String> mensa = new LinkedNode<String>("Mensa gehen", null);
    LinkedNode<String> spieleabend = new LinkedNode<String>("spieleabend", null);
    LinkedNode<String> schlafen = new LinkedNode<String>("schlafen gehen", null);

    LinkedNode<String> Montag = new LinkedNode<String>("Montag", null);
    LinkedNode<String> Dienstag = new LinkedNode<String>("Dienstag", null);
    LinkedNode<String> Mittwoch = new LinkedNode<String>("Mittwoch", null);
    LinkedNode<String> Donnerstag = new LinkedNode<String>("Donnerstag", null);
    LinkedNode<String> Freitag = new LinkedNode<String>("Freitag", null);
    LinkedNode<String> Samstag = new LinkedNode<String>("Samstag", null);
    LinkedNode<String> Sonntag = new LinkedNode<String>("Sonntag", null);


    ausschlafen.setNext_(vorlesung);
    vorlesung.setNext_(mensa);
    mensa.setNext_(spieleabend);
    spieleabend.setNext_(schlafen);

    Montag.setNext_(Dienstag);
    dienstag.setNext_(Mittwoch);
    Mittwoch.setNext_(Donnerstag);
    Donnerstag.setNext_(Freitag);
    Freitag.setNext_(Samstag);
    Samstag.setNext_(Sonntag);

    System.out.println (ausschlafen.toString());
    System.out.println (ausschlafen.toStringAll());
    System.out.println (Montag.toStringAll());

  }
}

/*
public class LinkedNode<T> {
  T data_ = null;
  LinkedNode<T> next_ = null;

  // TODO: constructors

  // TODO: getters and setters

  // Provide String-representation for list beginning at `this` node.
  @Override
  public String toString() {
    // TODO: show data_ from this to the end
  }

  // You must provide a main() method!
  public static void main(String[] args) {
    // TODO: Test
  }
}
*/





