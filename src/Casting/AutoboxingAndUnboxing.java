package Casting;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        //Autoboxing (primitive --> to object)

        float num = 45.6F;
        Float numFloat = num;

        // Unboxing (object --> to primitive)
        Character character = 'D';
        char characterPrimitive = character;

        System.out.println(numFloat);
        System.out.println(characterPrimitive);

    }
}
