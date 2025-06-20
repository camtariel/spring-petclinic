/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */
@SpringBootApplication
@ImportRuntimeHints(PetClinicRuntimeHints.class)
public class PetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}

}

public class ProblematicCode {

    // Unused variable
    private int unusedVariable;

    // Method with cognitive complexity and a long parameter list
    public void complexMethod(int param1, int param2, int param3, int param4, int param5) {
        // High cognitive complexity due to nested loops and conditions
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i > j) {
                    if (j < i) {
                        if (param1 > param2) {
                            System.out.println("Complex logic here");
                        }
                    }
                }
            }
        }
    }

    // Empty catch block
    public void riskyOperation() {
        try {
            // Risky operation that may throw an exception
            int result = 10 / 0;
        } catch (Exception e) {
            // Empty catch block
        }
    }

    // Duplicate code block
    public void duplicateCodeExample() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " + i);
        }
    }

    public void anotherDuplicateCodeExample() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " + i);
        }
    }

    // Hardcoded password
    private String password = "password123";

    // Method with too many lines
    public void longMethod() {
        // Imagine this method has more than 100 lines of code
        // ...
    }
}
