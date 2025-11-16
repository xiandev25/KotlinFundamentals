// 2. Define a class

// The part of the syntax before the opening curly brace is also referred to as the class header.
// Recommended naming conventions for naming a class:
//      - Don't use Kotlin keywords as a class name
//      - Use PascalCase for naming a class
class SmartDevice {
    // 4. Define a class methods
    
    // When you define a function in the class body, it's referred to as a member function or method, and it represents
    // the behavior of the class.
    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // 3. Create an instance of a class

    // val variables that contain an object reference are read-only themselves, but the objet proper they are
    // referencing remains mutable.
    // The following initializes a read-only variable smartTvDevice with an instance of the class SmartDevice.
    val smartTvDevice = SmartDevice()
}