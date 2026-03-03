public class ExplicitCasting {
    public static void main(String[] args){
        // Explicit Casting : Upper data type into lower
        // there is data lose

        long sal=7878787878787878L;
        int a=(int) sal;   // conversion Upper data type into lower
        System.out.println(a);

        double d=77.89;
        int i=(int) d;
        System.out.println(i); // loss decimal value

        char cg='a';
        int k=cg;
        System.out.println(k);  //output will give us in the form of ascii value
    }
}
/* ASCII Values: Uppercase A-Z
A: 65, B: 66, C: 67, D: 68, E: 69, F: 70, G: 71, H: 72, I: 73, J: 74, K: 75, L: 76, M: 77, N: 78, O: 79, P: 80, Q: 81, R: 82, S: 83, T: 84, U: 85, V: 86, W: 87, X: 88, Y: 89, Z: 90.
Hero Vired
Hero Vired
 +1
ASCII Values: Lowercase a-z
a: 97, b: 98, c: 99, d: 100, e: 101, f: 102, g: 103, h: 104, i: 105, j: 106, k: 107, l: 108, m: 109, n: 110, o: 111, p: 112, q: 113, r: 114, s: 115, t: 116, u: 117, v: 118, w: 119, x: 120, y: 121, z: 122.
*/