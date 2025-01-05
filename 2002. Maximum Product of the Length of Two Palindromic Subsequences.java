class Solution {
    public int maxProduct(String s) {
        int n = s.length();
        int[] bits = new int[1 << n];

        for (int i = 1; i < (1 << n); ++i) {
            bits[i] = bits[i >> 1] + (i & 1);
        }

        for (int i = (1 << n) - 1; i >= 0; --i) {
            int l = 0, r = n - 1;
            while (l < r) {
                while (l < n && (i & (1 << l)) == 0) ++l;
                while (r >= 0 && (i & (1 << r)) == 0) --r;
                if (l < r && s.charAt(l++) != s.charAt(r--)) {
                    bits[i] = 0;
                    break;
                }
            }
        }

        int maxProduct = 1;
        for (int i = (1 << n) - 1; i > 0; --i) {
            if (bits[i] != 0) {
                for (int j = (i + 1) & ~i; j < (1 << n); j = ((j | i) + 1) & ~i) {
                    if (bits[j] != 0) {
                        maxProduct = Math.max(maxProduct, bits[i] * bits[j]);
                    }
                }
            }
        }

        return maxProduct;
    }
}
