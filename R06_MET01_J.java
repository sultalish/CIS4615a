// Rule 06. Methods (MET)
// MET01-J. Never use assertions to validate method arguments
// Given unsanitized code below
public static int getAbsAdd(int x, int y) {
    return Math.abs(x) + Math.abs(y);
  }
  getAbsAdd(Integer.MIN_VALUE, 1);