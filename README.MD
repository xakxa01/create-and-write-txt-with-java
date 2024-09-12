# File Creator Program

This is a simple Java program that allows users to create a text file and write content to it. The program prompts the user for a file name and the content to be written into the file. It will create the file if it doesn't already exist and ensure that the file is writable.

## How it works

1. The program prompts the user to enter a file name.
2. If the file does not exist, it will create the file inside a `files` folder.
3. The program then asks the user to input the content that will be written to the file.
4. Once the content is written, the program confirms that the file was successfully created.
5. If the file already exists or cannot be created, an error message is displayed.

## Prerequisites

- Java JDK installed on your system.
- A `files` folder created in the root directory where this program is run (the program will try to create files in this folder).

## How to Run

1. Ensure that you have [Java](https://www.java.com/en/download/) installed.
2. Clone or download the repository.
3. Open a terminal in the project directory.
4. Compile the program using:
   ```bash
   javac Main.java && java Main
