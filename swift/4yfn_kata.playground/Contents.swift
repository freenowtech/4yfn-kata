//: Playground - noun: a place where people can play

import UIKit

var str = "Welcome to Mytaxi 4yfn-kata. Breath and do your best!"

func test() {
    var err = 0;
    if (add(numbers: "") == 0) { print("OK") } else { print("KO"); err += 1 }
    if (add(numbers: "34") == 34) { print("OK") } else { print("KO"); err += 1 }
    if (add(numbers: "1,2") == 3) { print("OK") } else { print("KO"); err += 1 }
    
    print("Total errors: ", err)
}

func add(numbers: String) -> Int {
    var output = 0
    var i = 0;
    
    let array = numbers
        .split(separator: ",")
        .flatMap { Int($0) }

    while (i < array.count) {
        output += array[i]
        i += 1
    }
    
    return output;
}

test();
add(numbers: "1,33")
