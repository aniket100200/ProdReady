package ProdReady.study.MultiThreading.RecordClasses.Record;

// class Alien {
//  private final int id;
//  private final String name;
//
//  public Alien(int id, String name) {
//    this.id = id;
//    this.name = name;
//  }
//
//  public int getId() {
//    return id;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  @Override
//  public String toString() {
//    return "Alien{" + "id=" + id + ", name='" + name + '\'' + '}';
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(this.id, this.name);
//  }
//
//  @Override
//  public boolean equals(Object obj) {
//    if (this == obj) return true;
//    Alien a2 = (Alien) obj;
//
//    return this.id == a2.id && Objects.equals(this.name, ((Alien) obj).name);
//  }
// }
record Alien(int i, String name) {}

public class Solution {
  public static void main(String[] args) {
    Alien a1 = new Alien(1, "Aniket");
    Alien a2 = new Alien(1, "Aniket");

    System.out.print(a1);
  }
}
