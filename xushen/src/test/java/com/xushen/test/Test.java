package com.xushen.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Test {
    public static void main(String[] args) {
        try {
            String ss= URLDecoder.decode("23sf3dwio|ocNpGYLIsab3PJSvRqJbcsFcgy831j5lObjljH2DDYztbcdy6BpYCTlk+xtpBWLdain7/jbUzKgEVHedDLrVIIPcmlYkwV5Jyeiqx2R5kA86bmCtc0HOufqS1jM3hLMKWlkktWNHQhWozFSknASeGidIIrEe1rcZTETKfZui/To=|zHUuXcfv7F8EExhOOxdow6/6rHpeOhJpZlWAfhtfpoRViLl7lju9sbA8c41im8xtYMXQYFlHNZJ8XZD/GKwj/PoksKKvgGdnPXKjqk+Banx0SXa2F5KrIx/mPjmvHe21FhNs51A5o2QwNzaVSkUA3Cboc9Jrxkj4mScm5ws07znWde34kfuVrSY8xrJPFO0pkrbX4Ap42mb.\"","UTF-8");
            System.out.println(ss);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
