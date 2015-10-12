package com.anc;


import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

//import android.util.Base64;

/**
 * Created by AAbraham on 8/11/2015.
 */
public class TestMain {

    private static Cipher cipher;
    private static SecretKeySpec key;
    private static AlgorithmParameterSpec spec;

    abstract class  abst {
        private String sss;

        abstract void bbc( );
        private void bbs2() {

        }
    }

    class abstImpl extends abst{


        @Override
        void bbc() {

        }
    }


    @FunctionalInterface
    public interface abcd {
        void method();
        default void maymetod() {}
        static void sdsd(){}

    }

    public static void main(String[] agrs) throws InvalidAlgorithmParameterException, InvalidKeyException {


        Arrays.asList("a", "d", "c").sort((a1, a2) -> a1.compareTo(a2) );

        List<Integer> abc = Arrays.asList(1,2,3,4,5);
        abc.forEach(System.out::println);
//
//        System.out.println(abc.stream()
//                                        .filter(s -> s % 2 != 0)
//                                        .map(a -> a * 2)
//                                        .reduce(0, (c, e) ->  c + e));



        //List<Person> persons =



//            cipher.init(Cipher.DECRYPT_MODE, key, spec);
//            byte[] bytes = Base64.decode("sds", Base64.BASE64DEFAULTLENGTH);
//            byte[] decrypted = cipher.doFinal(bytes);
//            String decryptedText = new String(decrypted, "UTF-8");
//
//            return decryptedText;



        //System.out.println("Hai from test main..!");
    }




}


