package tabulator;

public interface Tabulator {
	Object[][][] tabulate(String mode, String expr, int x1, int x2, int y1, int y2, int z1, int z2);
}
