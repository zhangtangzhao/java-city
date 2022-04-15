package com.city.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

public class GzipUtil {


    public static String uncompressToString(byte[] bytes,String encoding){
        if (bytes == null || bytes.length == 0) return null;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        try {
            GZIPInputStream ungzip = new GZIPInputStream(in);
            byte[] buffer = new byte[256];
            int n;
            while((n = ungzip.read(buffer)) >= 0){
                out.write(buffer,0,n);
            }
            in.close();
            ungzip.close();
            return out.toString(encoding);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
