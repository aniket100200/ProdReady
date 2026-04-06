package ProdReady.study.MultiThreading.SealedClasses;

import ch.qos.logback.core.joran.conditional.ThenAction;

sealed class A extends ThenAction implements Cloneable permits B, C {}

final class B extends A {}

sealed class C extends A permits D {}

non-sealed class D extends C {}

public class Solution {
  public static void main(String[] args) {
    D d = new D();
  }
}
