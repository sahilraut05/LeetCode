class Solution {
    public String simplifyPath(String A) {
        Stack<String> st = new Stack<String>();
        String res = "/";
        int len_A = A.length();

        for (int i = 0; i < len_A; i++) {
            String dir = "";

            while (i < len_A && A.charAt(i) == '/') {
                i++;
            }

            while (i < len_A && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }

            if (dir.equals("..")) {
                if (!st.empty()) {
                    st.pop();
                }
            } else if (!dir.equals(".") && dir.length() != 0) {
                st.push(dir);
            }
        }

        Stack<String> st1 = new Stack<String>();

        while (!st.empty()) {
            st1.push(st.pop());
        }

        while (!st1.empty()) {
            if (st1.size() != 1) {
                res += (st1.pop() + "/");
            } else {
                res += st1.pop();
            }
        }

        return res;
    }
}
