/**
 * Marker interface for tests which need to be run in isolation (a separate JVM).
 * This can be required for PowerMock tests, as they perform byte-code manipulation which
 * can interfere with other, unrelated tests.
 */
public interface IsolatedTests {
}