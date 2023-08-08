package com.ltu.creational.factory;


//+------------------------+       +-----------------------+
//|       Creator          |       |     Product           |
//+------------------------+       +-----------------------+
//| + factoryMethod()      |       | + operation()         |
//+------------------------+       +-----------------------+
//        ^                                       ^
//        |                                       |
//        |                                       |
//+--------------+------------+            +-------------+-------------+
//|                          |            |                           |
//|                          |            |                           |
//+---------+          +-------------+  +------------------+    +------------------+
//|         |          |             |  |                  |    |                  |
//|CreatorA |          | CreatorB    |  | ConcreteProductA |    | ConcreteProductB |
//+---------+          +-------------+  +------------------+    +------------------+
//| + factoryMethod() |  | + factoryMethod() | | + operation()   |    | + operation()    |
//+-------------------+  +------------------+ +-----------------+    +------------------+



//+----------------------------------+
//|           AbstractFactory         |
//+----------------------------------+
//| + createProductA(): AbstractProductA |
//| + createProductB(): AbstractProductB |
//+----------------------------------+
//                 ^
//                 |
//                 |
//+-------------------+--------------------+
//|                                        |
//|                                        |
//+-----------------+                    +-----------------+
//| ConcreteFactory1|                    | ConcreteFactory2|
//+-----------------+                    +-----------------+
//| + createProductA(): ProductA       | + createProductA(): ProductA       |
//| + createProductB(): ProductB       | + createProductB(): ProductB       |
//+-------------------------------------+-------------------------------------+
//        ^                                         ^
//        |                                         |
//+-----------+---------+                 +-----------+---------+
//|                     |                 |                     |
//|                     |                 |                     |
//+----------------+    +----------------+    +----------------+    +----------------+
//| AbstractProductA|    | AbstractProductB|    | AbstractProductA|    | AbstractProductB|
//+----------------+    +----------------+    +----------------+    +----------------+
//| + operationA() |    | + operationB() |    | + operationA() |    | + operationB() |
//+----------------+    +----------------+    +----------------+    +----------------+


//Client code 
public class Client {
	public static void main(String[] args) {
		// Create a Concrete Creator A
		Creator creatorA = new ConcreteCreatorA();
		Product productA = creatorA.factoryMethod();
		productA.operation(); // Output: Concrete Product A

		// Create a Concrete Creator B
		Creator creatorB = new ConcreteCreatorB();
		Product productB = creatorB.factoryMethod();
		productB.operation(); // Output: Concrete Product B
		
		
		// Create Concrete Factory 1
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();

        productA1.operationA(); // Output: "Concrete Product A1 operation"
        productB1.operationB(); // Output: "Concrete Product B1 operation"

        // Create Concrete Factory 2
        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();

        productA2.operationA(); // Output: "Concrete Product A2 operation"
        productB2.operationB(); // Output: "Concrete Product B2 operation"
	}
}
