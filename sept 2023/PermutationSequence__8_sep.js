// leetcode 60 - Permutation Sequence
var getPermutation = function(n, k) {
    // Create an array to store factorial values.
    const fact = [1];
    let f = 1;
    
    // Calculate and store factorials from 1 to 9.
    for (let i = 1; i <= 9; i++) {
    f *= i;
    fact.push(f);
    }
    
    // Create an array to store numbers from 1 to n.
    const num = [];
    for (let i = 0; i < n; i++) {
    num.push(i + 1);
    }
    
    let ret = ''; // Initialize an empty string to store the resulting permutation.
    let cmp, idx;
    
    // Iterate through each position in the permutation.
    for (let i = 0; i < n; ++i) {
    cmp = fact[n - i - 1]; // Get the factorial value for the current position.
    idx = Math.floor((k - 1) / cmp); // Calculate the index of the number to select.
    k -= idx * cmp; // Update the remaining k value.
    
     ret += num[idx]; // Append the selected number to the result string.
     num.splice(idx, 1); // Remove the selected number from the available numbers.
    }
    
    return ret; // Return the resulting permutation as a string.
    };