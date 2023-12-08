/*/*
 * Student Database Management
 * You are tasked with managing a student database for IIIT Dharwad. Each
 * student record contains information such as student ID, name, and GPA. Design
 * an algorithm to efficiently sort and search for student records
 */
// Time Complexity: O(nlogn) for sorting and O(logn) for searching
// Sorting Algorithm: heap sort
// Searching Algorithm: binary search */
// display sorted student details

import java.util.Scanner;

class Student {
    int studentID;
    String name;
    double GPA;

    public Student(int studentID, String name, double GPA) {
        this.studentID = studentID;
        this.name = name;
        this.GPA = GPA;
    }

    public String toString() {
        return "Student ID: " + studentID + ", Name: " + name + ", GPA: " + GPA;
    }
}

public class StudentDatabase {
    public static void heapSort(Student[] arr) {
        int n = arr.length;

        // Build heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Extract elements from heap in reverse order (sorting)
        for (int i = n - 1; i > 0; i--) {
            // Swap root (largest element) with the last element
            Student temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(Student[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child is larger than root
        if (left < n && arr[left].studentID > arr[largest].studentID)
            largest = left;

        // Check if right child is larger than largest so far
        if (right < n && arr[right].studentID > arr[largest].studentID)
            largest = right;

        // If largest is not root
        if (largest != i) {
            Student swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static int binarySearch(Student[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid].studentID == target)
                return mid;

            // If target greater, ignore left half
            if (arr[mid].studentID < target)
                left = mid + 1;
            // If target smaller, ignore right half
            else
                right = mid - 1;
        }

        // If target is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[numStudents];

        // Exception handling for invalid number of students
        if (numStudents <= 0) {
            System.out.println("Invalid number of students.");
            System.exit(0);
        }

        // Getting student details from user

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Enter Student ID: ");
            int studentID = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Exception handling for invalid student ID
            if (studentID <= 0) {
                System.out.println("Invalid student ID.");
                System.exit(0);
            }

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Student GPA: ");
            double GPA = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Exception handling for invalid GPA
            if (GPA < 0 || GPA > 10) {
                System.out.println("Invalid GPA.");
                System.exit(0);
            }

            students[i] = new Student(studentID, name, GPA);
        }

        // Sorting the student records using heap sort
        heapSort(students);

        // Displaying sorted student details
        System.out.println("\nSorted Student Records:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Searching for a student by ID (Using Binary Search)
        System.out.print("\nEnter the Student ID to search: ");
        int targetStudentID = scanner.nextInt();

        int index = binarySearch(students, targetStudentID);

        if (index != -1) {
            System.out.println("\nStudent Found at index " + index + ":");
            System.out.println(students[index]);
        } else {
            System.out.println("\nStudent with ID " + targetStudentID + " not found.");
        }

        scanner.close();
    }
}

// pseudo code
/*
 * Class Student:
 * Attributes:
 * studentID (integer)
 * name (string)
 * GPA (float)
 * 
 * Method:
 * Student(studentID, name, GPA) - Initialize student object with given details
 * toString() - Return string representation of the student details
 * 
 * Function heapSort(arr):
 * n = length of arr
 * # Build heap
 * for i = n / 2 - 1 to 0:
 * heapify(arr, n, i)
 * 
 * # Extract elements from heap in reverse order (sorting)
 * for i = n - 1 to 0:
 * Swap arr[0] with arr[i]
 * heapify(arr, i, 0)
 * 
 * Function heapify(arr, n, i):
 * largest = i
 * left = 2 * i + 1
 * right = 2 * i + 2
 * 
 * # Check if left child is larger than root
 * if left < n AND arr[left].studentID > arr[largest].studentID:
 * largest = left
 * 
 * # Check if right child is larger than largest so far
 * if right < n AND arr[right].studentID > arr[largest].studentID:
 * largest = right
 * 
 * # If largest is not root
 * if largest != i:
 * Swap arr[i] with arr[largest]
 * heapify(arr, n, largest)
 * 
 * Function binarySearch(arr, target):
 * left = 0
 * right = length of arr - 1
 * 
 * while left <= right:
 * mid = left + (right - left) / 2
 * 
 * # Check if target is present at mid
 * if arr[mid].studentID == target:
 * return mid
 * 
 * # If target greater, ignore left half
 * if arr[mid].studentID < target:
 * left = mid + 1
 * # If target smaller, ignore right half
 * else:
 * right = mid - 1
 * 
 * # If target is not present in the array
 * return -1
 * 
 * Function main():
 * Create Scanner object for user input
 * 
 * Print "Enter the number of students: "
 * numStudents = Input number of students
 * 
 * Create an array students of Student objects with size numStudents
 * 
 * For i = 0 to numStudents - 1:
 * Print "Enter details for student " + (i + 1) + ":"
 * Input studentID, name, GPA
 * Create a Student object with input details and add it to students[i]
 * 
 * Call heapSort(students) to sort the student records
 * 
 * Print "\nSorted Student Records:"
 * For each student in students:
 * Print student details
 * 
 * Print "\nEnter the Student ID to search: "
 * targetStudentID = Input student ID to search
 * 
 * index = binarySearch(students, targetStudentID)
 * 
 * If index != -1:
 * Print "Student Found at index " + index + ":"
 * Print student details at index
 * Else:
 * Print "Student with ID " + targetStudentID + " not found."
 * 
 * Close Scanner object
 */

// output

/*
 * Enter the number of students: 5
 * 
 * Enter details for student 1:
 * Enter Student ID: 1
 * Enter Student Name: A
 * Enter Student GPA: 9.5
 * 
 * Enter details for student 2:
 * Enter Student ID: 2
 * Enter Student Name: B
 * Enter Student GPA: 8.5
 * 
 * Enter details for student 3:
 * Enter Student ID: 3
 * Enter Student Name: C
 * Enter Student GPA: 7.5
 * 
 * Enter details for student 4:
 * Enter Student ID: 4
 * Enter Student Name: D
 * Enter Student GPA: 6.5
 * 
 * Enter details for student 5:
 * Enter Student ID: 5
 * Enter Student Name: E
 * Enter Student GPA: 5.5
 * 
 * Sorted Student Records:
 * Student ID: 1, Name: A, GPA: 9.5
 * Student ID: 2, Name: B, GPA: 8.5
 * Student ID: 3, Name: C, GPA: 7.5
 * Student ID: 4, Name: D, GPA: 6.5
 * Student ID: 5, Name: E, GPA: 5.5
 * 
 * Enter the Student ID to search: 3
 * 
 * Student Found at index 2:
 * Student ID: 3, Name: C, GPA: 7.5
 */
