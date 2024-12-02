#Poker Game Application

## Overview
This Java application simulates a basic poker game by reading poker hand rankings from a CSV file (`PokerHands.csv`) and performing operations like removing and adding specific hands. The program stores the hands in a `HashSet` and prints the results after each operation.

## Features
- Reads a list of poker hands from a CSV file.
- Uses a `HashSet` to store and manage the poker hands.
- Performs the following actions:
  - Removes specific poker hands (e.g., "ACE HIGH" and "QUEEN HIGH").
  - Updates the poker hands by removing "PAIR" and adding "DEUCES".
  
## How to Use
1. **Prepare the CSV File**: Ensure you have a file named `PokerHands.csv` in the root directory of your project. The file should contain poker hand data in the format: `ID, Hand Name`, where each line represents a poker hand.
2. **Run the Application**: 
   - Compile and run the `PokerGameApplication` class.
   - The program will read the CSV file, manipulate the poker hands (remove/add specific hands), and print the updated hands.

## Sample Output
```
[ACE HIGH, QUEEN HIGH, PAIR, DEUCES, FULL HOUSE, ...]
-----------------
removing ACE HIGH
[QUEEN HIGH, PAIR, DEUCES, FULL HOUSE, ...]
-----------------
removing QUEEN HIGH
[PAIR, DEUCES, FULL HOUSE, ...]
-----------------
removing PAIR
[DEUCES, FULL HOUSE, ...]
-----------------
ADDING DEUCES
[DEUCES, FULL HOUSE, ...]
```

## Key Concepts
- **BufferedReader**: Used to read the CSV file line by line.
- **HashSet**: A collection that stores unique poker hand names.
- **String manipulation**: Splitting CSV data and performing operations on it.

## Requirements
- Java JDK (version 8 or later).
- A properly formatted `PokerHands.csv` file containing poker hand rankings.

## Extensions and Challenges
- Add functionality to allow for user input to add or remove hands.
- Implement additional hand ranking operations or sorting.
