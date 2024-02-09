# StackGUI Class

The `StackGUI` class represents the graphical user interface (GUI) for the wagon stack program. It includes various buttons and text fields to interact with the underlying `MyStack` class.

## Exit Button

```java
private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {
    JOptionPane.showMessageDialog(null, "Bye-Bye!");
    System.exit(0);
}
```

This method is triggered when the "Exit" button (`exitBTN`) is clicked. It displays a farewell message using `JOptionPane` and then exits the application by calling `System.exit(0)`.

## Add Button

```java
private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {
    stack.pushStack(trainProductTF.getText());
}
```

This method is executed when the "Add" button (`addBTN`) is clicked. It retrieves the text from the `trainProductTF` (presumably a text field for wagon input) and calls the `pushStack` method of the `stack` object (presumably an instance of the `MyStack` class) to add the wagon to the stack.

## Number of Wagons Button

```java
private void numberBTNActionPerformed(java.awt.event.ActionEvent evt) {
    stack.sizeStack();
}
```

This method is invoked when the "Number of Wagons" button (`numberBTN`) is clicked. It calls the `sizeStack` method of the `stack` object, which presumably displays or returns the number of wagons in the stack.

## Remove Button

```java
private void removeBTNActionPerformed(java.awt.event.ActionEvent evt) {
    stack.emptyStack();
}
```

This method is triggered by clicking the "Remove" button (`removeBTN`). It calls the `emptyStack` method of the `stack`, presumably removing the top wagon from the stack.

## Remove All Button

```java
private void removeallBTNActionPerformed(java.awt.event.ActionEvent evt) {
    stack.removeWagons();
}
```

This method is executed when the "Remove All" button (`removeallBTN`) is clicked. It calls the `removeWagons` method of the `stack`, which presumably clears the entire wagon stack.

## Peek at First Wagon Button

```java
private void firstBTNActionPerformed(java.awt.event.ActionEvent evt) {
    stack.peek();
}
```

This method is invoked when the "Peek at First Wagon" button (`firstBTN`) is clicked. It calls the `peek` method of the `stack`, presumably showing the top wagon without removing it.

## List Wagons Button

```java
private void listBTNActionPerformed(java.awt.event.ActionEvent evt) {
    stack.displayStack();
}
```

This method is triggered by clicking the "List Wagons" button (`listBTN`). It calls the `displayStack` method of the `stack`, presumably showing the contents of the entire wagon stack.

## Clear Button

```java
private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {
    trainProductTF.setText(null);
    displayTA.setText(null);
}
```

This method is executed when the "Clear" button (`clearBTN`) is clicked. It clears the text in the `trainProductTF` and `displayTA`, presumably for user input and output.
```