package com.away1994.base;

import com.away1994.common.utils.hash.Hash;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

public class HashTest {

    @Test
    public void testMD5() {
        String data = "$CLASS(NSArray)$FILE(NSArray+RACSequenceAdditions.m)$PATH(.%2Fsrc%2Ftest%2Fjava%2Fresources%2Fuml%2Fproject%2FReactiveCocoa)";
        //MD5
        try {
            System.out.println("MD5 : "+ Hash.md5(data));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSHA1() {
        String data = "$CLASS(NSArray)$FILE(NSArray+RACSequenceAdditions.m)$PATH(.%2Fsrc%2Ftest%2Fjava%2Fresources%2Fuml%2Fproject%2FReactiveCocoa)";

        //SHA1
        try {
            System.out.println("SHA1 : "+ Hash.sha1(data));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
