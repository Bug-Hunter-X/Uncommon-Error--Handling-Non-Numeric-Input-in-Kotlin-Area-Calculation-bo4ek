# Uncommon Kotlin Error: Non-Numeric Input Handling

This repository demonstrates a subtle error that can occur in Kotlin when dealing with user input and exception handling. The `calculateArea` function correctly handles negative inputs but fails gracefully when provided with non-numeric strings.  The `main` function attempts to handle this by using `toDoubleOrNull()`, but this can still lead to unexpected behavior. 

The provided solution shows a more robust way to validate input and handle various potential errors.
