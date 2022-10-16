// Rule 17. Java Native Interface (JNI)
// JNI00-J. Define wrappers around native methods
// Given unsanitized code below
public final class NativeMethod {

    // Public native method
    public native void nativeOperation(byte[] data, int offset, int len);

    // Wrapper method that lacks security checks and input validation
    public void doOperation(byte[] data, int offset, int len) {
        nativeOperation(data, offset, len);
    }

    static {
        // Load native library in static initializer of class
        System.loadLibrary("NativeMethodLib");
    }
}