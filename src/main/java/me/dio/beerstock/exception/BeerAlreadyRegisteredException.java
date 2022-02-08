package me.dio.beerstock.exception;

public class BeerAlreadyRegisteredException extends Exception{
    public BeerAlreadyRegisteredException() {
        super("Beer Already Registered!");
    }
}
