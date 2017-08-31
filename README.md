# Java Quick and Dirty - Stage2

## The Purpose

The purpose of this stage is to present a few slightly more challenging problems to resolve. You will solidify your knowledge from Stage1, and implement two new methods.

## Prerequisites

* [Installed JBoss Developer Studio](https://access.redhat.com/jbossnetwork/restricted/softwareDownload.html?softwareId=53011). If you do not have access to the Customer Portal, Eclipse will do as well.

## Importing The Project
If you have not imported the project yet, see the README of the `Stage1` branch for information about importing and testing the project.

## What Next?

The `Stage2` branch serves two purposes:

1. It provides solution to the `Stage1` problems.
2. It provides two additional issues to solve.

To solve the additional issues, open the `brq.redhat.model.RedHat` (further referred to as `RedHat`) class. The `RedHat` class simulates a RH building. Your task is the following:

1. Employees have to swipe a badge to enter the building. A mock database of people who can enter is statically loaded during object instantiation using the `loadDatabase` method. Your task is to implement the `canEnter` method, which accepts a `Person` object and determines whether the person can access the building. You should check the `HashSet<Person> database` object, which contains a set of people who can enter. If the person is in the database, he or she can enter, and you should return `true`. Otherwise, return `false`.

2. The basic RedHat building has a coffee machine. Thus, you should implement a method that checks whether a person can make coffee. Implement the method `makeCoffee` based on the comments in the `RedHat` class.

To help you check whether your implementation is correct or not, I have included tests in the `brq.redhat.tests.TestStage2` class.  

Check the `Stage1` branch README for how-to on how to execute the tests. Check the `Stage2-finished` branch for solution to `Stage2` problems. 

## Resources

This Java exercise uses a `HashSet` class. If you are completely lost, check the [HashSet tutorial](https://www.tutorialspoint.com/java/java_hashset_class.htm). Otherwise, simply check the `brq.redhat.model.CoffeeMachine` class for all the available methods to help you in solving the `makeCoffee` method.