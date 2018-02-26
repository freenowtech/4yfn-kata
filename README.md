![Alt text](Braze-Referal.png?raw=true "Title")


# 4yfn-kata
Coding kata for the 2018 4yfn event .The following is a TDD Kata, an exercise in coding, refactoring and test-first.

## Before you start
* Try not to read ahead.
* Do one task at a time. The trick is to learn to work incrementally.
* Make sure you only test for correct inputs. There is no need to test for invalid inputs for this kata.
* There are several folders , each one belonging to a specific language or technology in which you can solve the exercise. 
* **Follow the red-green-refactor approach**


## Instructions


* Please create a separate git branch from master with your solution
	* ``` git checkout master```  
	* ``` git pull origin master```
	* ``` git checkout -b <your_branch_name>``` ( to create a branch from master). As branch name we suggest you to use your name and surname  separated by underscores( e.g. markus_wallace)
	
* Commit each one of the requested tasks separately :
	
	* ``` git add -u . ```
	* ``` git commit -m "<message regarding the task you are solving>"```

* Push your changes :	
	*  ``` git push origin <your_branch_name>```
	*  The user and passwords if required will be given at the momment of solving the exercise 	

	

## The kata

### Step 1: the simplest thing
Create a simple String calculator with a method `int add(String numbers)`.

* The string argument can contain 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example `""` or `"1"` or `"1,2"`.
* Start with the simplest test case of an empty string and move to one and two numbers.
* Remember to solve things as simply as possible so that you force yourself to write tests you did not think about.
* Remember to refactor after each passing test.

### Step 2: handle an unknown amount of numbers
Allow the `add()` method to handle an unknown amount of numbers.

### Step 3: handle new lines between numbers
Allow the `add()` method to handle new lines between numbers (instead of commas).

* the following input is ok:  `"1\n2,3"` (will equal 6)
* the following input is NOT ok:  `"1,\n"` (not need to prove it - just clarifying)

### Step 4: negative numbers
Calling `add()` with a negative number will throw an exception `"negatives not allowed"` - and the negative that was passed.

For example `add("1,4,-1")` should throw an exception with the message `"negatives not allowed: -1"`.

If there are multiple negatives, show all of them in the exception message.

### Step 5: ignore big numbers
Numbers bigger than 1000 should be ignored, so adding 2 + 1001  = 2

