// Rule 07. Exceptional Behavior (ERR)
// ERR04-J. Do not complete abruptly from a finally block
// Given unsanitized code below
class TryFinally {
    private static boolean doLogic() {
        try {
            throw new IllegalStateException();
        } finally {
            System.out.println("logic done");
            return true;
        }
    }
}