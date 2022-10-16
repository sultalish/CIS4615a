// Rule 09. Locking (LCK)
// LCK03-J. Do not synchronize on the intrinsic locks of high-level concurrency objects
// Given unsanitized code below
private final Lock lock = new ReentrantLock();
 
public void doSomething() {
  synchronized(lock) {
    // ...
  }
}