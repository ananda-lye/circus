package circus;

public abstract class Animal implements Asset {
    //abstract methods can still have a constructor and child classes can share the same attributes,
    //but cannot create an instance of animal.
    //it can lack a getvalue() method because it is abstract, but duck and parrots at least needs this method
    public abstract String speak(); //this means every animal child classes that are not abstract MUST have a speak method.
}
