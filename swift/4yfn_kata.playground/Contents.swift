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

    let separators = CharacterSet(charactersIn: ",\n")
    let array = numbers
        .components(separatedBy: separators)
        .flatMap { Int($0) }
        .forEach {
            output += $0
        }

    return output;
}

test();
add(numbers: "1,2,3\n4")

