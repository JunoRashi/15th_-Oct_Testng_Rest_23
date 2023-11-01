package org.example.builderpattern;

import org.example.builderpattern.BuilderPattern;
import org.example.builderpattern.NonBuilderPattern;

public class Main {

    public static void main(String[] args) {

        // Rest Assured - Lib which help you to make the HTTP Request + Verify it
        // TestNG - To manage our Test cases - Testing Framework
        // Allure Report - Reporting Purpose
        // Maven - Build and Dependency management and Taking care of our Project

        // Rest Assured  - BDD(gherkin) Syntax - Given -> When -> Then
        // Pattern - Builder Pattern ?

        NonBuilderPattern nonBuilderPattern = new NonBuilderPattern();

        // dasdasdasdas
        // 10,000
        nonBuilderPattern.secondFloor();
        nonBuilderPattern.newuild();
        nonBuilderPattern.groundFloor();



        BuilderPattern bp = new BuilderPattern();
        bp.groundFloor().firtFloor().secondFloor(); // Perfect Step by Step (Building)








    }


}
