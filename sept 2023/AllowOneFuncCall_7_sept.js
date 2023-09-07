// leetcode 2666- Allow Function Call only once

var once = function(fn) {
    let t=true;
    let result;
    return function(...args){
        if(t)
        {
            result = fn(...args);
            t= false;
            return result;
        }
        else
       { return undefined;}
    }
};
