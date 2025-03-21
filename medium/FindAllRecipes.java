package medium;

import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        
        HashSet<String> set = new HashSet<>();
        List<String> ans = new ArrayList<>();

        // Add all supplies to the set
        for (String s : supplies) {
            set.add(s);
        }

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < recipes.length; i++) {
                if (!set.contains(recipes[i])) {
                    boolean canMake = true;
                    for (String ingredient : ingredients.get(i)) {
                        if (!set.contains(ingredient)) {
                            canMake = false;
                            break;
                        }
                    }
                    if (canMake) {
                        flag = true;
                        set.add(recipes[i]);
                        ans.add(recipes[i]);
                    }
                }
            }
        }
        return ans;
    }
}
