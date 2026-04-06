package ProdReady.study.MultiThreading.SealedClasses;

public sealed interface SealedClasses permits E {}

non-sealed interface E extends SealedClasses {}
