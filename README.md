# CSCI5444-Project1-2_2
### Lukas Zumwalt
* Java Version: Oracle openjdk-18.0.2.1

> This compiled package serves to meet CU Boulder course requirements for CSCI 5444 Project 1.2, Program 2

### This package performs a somewhat-unintuitive "palindrome" creation based on any user-provided string of characters.

## How To Use:
* Build and run the **_run.java_** file, a run terminal will pop up
* User provides a string of characters in any desireable order or (sensible) form
* Once a desired value is provided to terminal, carriage return (hit enter)
* The provided string will be treated, and a "palindrome-d" version is logged to the file **Results2.txt**
* After user is done converting strings into a symmetrical mess, carriage return a null (empty) string to end the program

## Important Notes:
* This system works by recieving an ASCII stream via terminal, sorts it by natural ASCII order, and generates a palindrome on this sorted string _pivoting_ about the first character by natural order.
    * Thus, it will include the first natural character **_once_** in the center of the output, and every other character in a symmetrical order by nature.
* The user need not _only_ provide alpha-numerics.  It sifts by ASCII code, which includes all accessible output characters on a standard keyboard.
