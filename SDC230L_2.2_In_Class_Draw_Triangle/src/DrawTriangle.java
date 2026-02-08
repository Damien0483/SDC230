/*================================================================================
Name: Damien Harmon
Date: February 6, 2026
Assignment: In Class 2.2 Drawing Traingles 
Description: create a Java application to render and manage geometric patterns. 
This exercise emphasizes encapsulation, nested control structures, and user 
interaction using the Scanner class to drive a menu-based system.
================================================================================== */
public class DrawTriangle {

    private int size;

    /* ============================================================================
            Name:         DrawTriangle (Constructor)
            Parameters:   int size – initial triangle size requested by user
            Return:       None (constructor)
            Description:  Creates a DrawTriangle object. If the provided size is
                          valid (> 0), it is stored. Otherwise, a default size
                          of 5 is used.
    ============================================================================*/
    public DrawTriangle(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            this.size = 5;
        }
    }

    /* ============================================================================
            Name:         getSize
            Parameters:   None
            Return:       int – the current triangle size
            Description:  Returns the stored triangle size.
    ============================================================================*/
    public int getSize() {
        return size;
    }

    /* ============================================================================
            Name:         setSize
            Parameters:   int size – new triangle size
            Return:       void
            Description:  Updates the triangle size only if the provided value
                          is greater than zero. Invalid sizes are ignored.
    ============================================================================*/
    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        }
    }

    /* ============================================================================
            Name:         drawPatternA
            Parameters:   None
            Return:       void
            Description:  Prints a left‑aligned triangle that grows from 1 star
                          up to the current size.
    ============================================================================*/
    public void drawPatternA() {

        /* ------------------------------------------------------------------------
                Loop: Outer loop (rows)
                Purpose: Controls the number of rows printed, increasing from
                         1 up to the triangle size.
        ------------------------------------------------------------------------ */
        for (int i = 1; i <= size; i++) {

            /* --------------------------------------------------------------------
                    Loop: Inner loop (stars)
                    Purpose: Prints i stars on each row, creating a growing
                             left‑aligned triangle.
            -------------------------------------------------------------------- */
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }

    /* ============================================================================
            Name:         drawPatternB
            Parameters:   None
            Return:       void
            Description:  Prints a left‑aligned triangle that shrinks from the
                          full size down to 1 star.
    ============================================================================*/
    public void drawPatternB() {

        /* ------------------------------------------------------------------------
                Loop: Outer loop (rows)
                Purpose: Starts at full size and decreases each row, creating a
                         shrinking triangle.
        ------------------------------------------------------------------------ */
        for (int i = size; i >= 1; i--) {

            /* --------------------------------------------------------------------
                    Loop: Inner loop (stars)
                    Purpose: Prints i stars on each row, decreasing each time.
            -------------------------------------------------------------------- */
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }

    /* ============================================================================
            Name:         drawPatternC
            Parameters:   None
            Return:       void
            Description:  Prints a right‑aligned triangle that shrinks from full
                          size down to 1 star.
    ============================================================================*/
    public void drawPatternC() {

        /* ------------------------------------------------------------------------
                Loop: Outer loop (rows)
                Purpose: Controls the number of rows, decreasing from size to 1.
        ------------------------------------------------------------------------ */
        for (int i = size; i >= 1; i--) {

            /* --------------------------------------------------------------------
                    Loop: Spaces loop
                    Purpose: Prints leading spaces to right‑align the stars.
            -------------------------------------------------------------------- */
            for (int spaces = 0; spaces < size - i; spaces++) {
                System.out.print(' ');
            }

            /* --------------------------------------------------------------------
                    Loop: Stars loop
                    Purpose: Prints i stars, shrinking each row.
            -------------------------------------------------------------------- */
            for (int stars = 0; stars < i; stars++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }

    /* ============================================================================
            Name:         drawPatternD
            Parameters:   None
            Return:       void
            Description:  Prints a right‑aligned triangle that grows from 1 star
                          up to the full size.
    ============================================================================*/
    public void drawPatternD() {

        /* ------------------------------------------------------------------------
                Loop: Outer loop (rows)
                Purpose: Controls the number of rows, increasing from 1 to size.
        ------------------------------------------------------------------------ */
        for (int i = 1; i <= size; i++) {

            /* --------------------------------------------------------------------
                    Loop: Spaces loop
                    Purpose: Prints leading spaces so the stars align to the right.
            -------------------------------------------------------------------- */
            for (int spaces = 0; spaces < size - i; spaces++) {
                System.out.print(' ');
            }

            /* --------------------------------------------------------------------
                    Loop: Stars loop
                    Purpose: Prints i stars, increasing each row.
            -------------------------------------------------------------------- */
            for (int stars = 0; stars < i; stars++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}
