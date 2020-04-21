package com.acabra.codeforces.below1000;

import org.junit.Assert;
import org.junit.Test;

public class SuffixTree1281ATest {

    @Test
    public void test_case() {
        Assert.assertEquals("FILIPINO", SuffixTree1281A.Solution.solution("kamusta_po"));
        Assert.assertEquals("FILIPINO", SuffixTree1281A.Solution.solution("hajime_no_ippo"));
        Assert.assertEquals("FILIPINO", SuffixTree1281A.Solution.solution("bensamu_no_sentou_houhou_ga_okama_kenpo"));
        Assert.assertEquals("JAPANESE", SuffixTree1281A.Solution.solution("genki_desu"));
        Assert.assertEquals("JAPANESE", SuffixTree1281A.Solution.solution("ohayou_gozaimasu"));
        Assert.assertEquals("JAPANESE", SuffixTree1281A.Solution.solution("ang_halaman_doon_ay_sarisari_singkamasu"));
        Assert.assertEquals("JAPANESE", SuffixTree1281A.Solution.solution("si_roy_mustang_ay_namamasu"));
        Assert.assertEquals("KOREAN", SuffixTree1281A.Solution.solution("annyeong_hashimnida"));
    }
}