
class Solution {
    public boolean isNumber(String s) {

        s = s.trim();

        return s.matches(
            "[+-]?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)([eE][+-]?[0-9]+)?"
        );
    }
}
