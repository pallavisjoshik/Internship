// leetcode 77 - Combinations

var combine = function(n, k) {
    // Initialize an array to store the final combinations.
    const result = [];
    
    // Call the 'backtrack' function to start generating combinations.
    backtrack(n, k, 1, [], result);
    
    // Return the array of generated combinations.
    return result;
    };
    
    /**
    
    This recursive function generates combinations using a backtracking approach.
    
    @param {number} n - The range of numbers to choose from.
    
    @param {number} k - The length of combinations to generate.
    
    @param {number} start - The starting number for the loop.
    
    @param {number[]} combination - The current combination being generated.
    
    @param {number[][]} result - The array to store all valid combinations.
    */
    function backtrack(n, k, start, combination, result) {
    // Base case: If the current combination is of length 'k', it's a valid combination.
    if (combination.length === k) {
    // Push a copy of the valid combination into the 'result' array.
    result.push([...combination]);
    return; // Return to continue exploring other possibilities.
    }
    
    // Loop through numbers from 'start' to 'n' to build combinations.
    for (let i = start; i <= n; i++) {
    // Add the current number to the 'combination'.
    combination.push(i);
    
     // Recursively call 'backtrack' with updated parameters.
     // 'i + 1' is the new 'start' to avoid duplicate elements in combinations.
     backtrack(n, k, i + 1, combination, result);
     
     // Remove the last added element to backtrack and explore other possibilities.
     combination.pop();
    }
    }
    
    // Call the 'combine' function to generate all combinations of length 'k' from 1 to 'n'.
    // Example: combine(4, 2) will generate all 2-length combinations from [1, 2, 3, 4].