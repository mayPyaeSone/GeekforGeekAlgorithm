/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Alice", 22),
                new Student("Bob", 20),
                new Student("Charlie", 21),
                new Student("aye", 12)
        );

        List<String> sortedNames = students.stream()
                .map(student -> student.name)
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());

        System.out.println(sortedNames);

    }

}

class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
