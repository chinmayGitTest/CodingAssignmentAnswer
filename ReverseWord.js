/**
 * 
 */
 
 
 
function reverseWords(sentence) {
    
    let words = sentence.split(' ');

    
    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    
    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}


function sortDescending(arr) {
    return arr.sort(function(a, b) {
        return b - a;
    });
}


let inputSentence = prompt("Enter a sentence:");
let reversedSentence = reverseWords(inputSentence);
console.log("Reversed Words in the Sentence:", reversedSentence);

let numbersArray = [5, 2, 9, 1, 5, 6];
let sortedArray = sortDescending(numbersArray);
console.log("Sorted Array in Descending Order:", sortedArray);
 
 