# Find All Recipes You Can Make

## Problem Statement
Given a list of recipes, their corresponding ingredients, and available supplies, determine which recipes can be made. A recipe can be made if all its ingredients are either supplies or another recipe that has already been made.

## Approach
1. **Use a HashSet for Supplies**  
   - Store all initial supplies in a HashSet for quick lookup.
   
2. **Iterate Until No More Recipes Can Be Made**  
   - Use a flag-based approach to repeatedly check which recipes can be made.
   - If all ingredients of a recipe exist in the set, add the recipe to the set and store it in the result list.

3. **Continue Until No More Recipes Can Be Added**  
   - If no new recipes are added in an iteration, stop the process.

## Time Complexity
- **O(R × I)**, where `R` is the number of recipes and `I` is the average number of ingredients per recipe.
- Since we iterate through recipes and ingredients in a loop, worst-case scenario is `O(R × I)`, but generally performs well in practice.

## Space Complexity
- **O(R + S)**, where `R` is the number of recipes and `S` is the number of supplies stored in the HashSet.

## Example
```java
String[] recipes = {"bread", "sandwich"};
List<List<String>> ingredients = Arrays.asList(
    Arrays.asList("flour", "water"),
    Arrays.asList("bread", "ham")
);
String[] supplies = {"flour", "water", "ham"};

Solution solution = new Solution();
List<String> result = solution.findAllRecipes(recipes, ingredients, supplies);
System.out.println(result);  // Output: ["bread", "sandwich"]
