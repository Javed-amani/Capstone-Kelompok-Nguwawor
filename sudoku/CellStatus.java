/**
 * ES234317-Algorithm and Data Structures
 * Semester Ganjil, 2024/2025
 * Group Capstone Project
 * Group "Nguwawor"
 * 1 - 5026231162 - I Nyoman Mahadyana Bhaskara
 * 2 - 5026231186 - Javed Amani Syauki
 */

package sudoku;
/**
 * An enumeration of constants to represent the status
 * of each cell.
 */
public enum CellStatus {
    GIVEN,         // clue, no need to guess
    TO_GUESS,      // need to guess - not attempted yet
    CORRECT_GUESS, // need to guess - correct guess
    WRONG_GUESS    // need to guess - wrong guess
    // The puzzle is solved if none of the cells have
    //  status of TO_GUESS or WRONG_GUESS
}