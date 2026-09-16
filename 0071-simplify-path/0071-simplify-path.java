class Solution {
    public String simplifyPath(String path) {
        // Split the path by "/" to get components
        String[] parts = path.split("/");
        // Use a stack to process directories
        Deque<String> stack = new ArrayDeque<>();
        
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                // Skip empty or current directory
                continue;
            } else if (part.equals("..")) {
                // Go up one directory if possible
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Valid directory/file name
                stack.push(part);
            }
        }
        
        // Build the canonical path
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.insert(0, "/" + dir);
        }
        
        // If stack is empty, return root "/"
        return result.length() == 0 ? "/" : result.toString();
    }
}
