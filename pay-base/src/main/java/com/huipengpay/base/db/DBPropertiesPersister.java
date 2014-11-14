package com.huipengpay.base.db;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.util.DefaultPropertiesPersister;

import java.io.*;
import java.util.Properties;

/**
 * Created by Administrator on 2014/11/13.
 */
public class DBPropertiesPersister extends DefaultPropertiesPersister {
    private static final String jdbc_username = "jdbc.username";
    private static final String jdbc_password = "jdbc.password";

    public void load(Properties props, InputStream is) throws IOException {
        Properties properties = new Properties();
        properties.load(is);
        try {
            
            String sqlUsername = properties.getProperty(jdbc_username);
            if (StringUtils.isNotEmpty(sqlUsername)) {
                //TODO 数据库用户名解密
                properties.setProperty(jdbc_username,sqlUsername);
            }

            String sqlPassWord = properties.getProperty(jdbc_password);
            if (StringUtils.isNotEmpty(sqlPassWord)) {
                //TODO 数据库密码解密
                properties.setProperty(jdbc_password,sqlPassWord);
            }


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new BeanInitializationException(e.getMessage());
        }

        OutputStream outputStream = null;
        try {
            outputStream = new ByteArrayOutputStream();
            properties.store(outputStream, "");
            is = outStream2InputStream(outputStream);
            super.load(props, is);
        } catch (IOException e) {
            throw e;
        } finally {
            outputStream.close();
        }
    }

    private InputStream outStream2InputStream(OutputStream out) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos = (ByteArrayOutputStream) out;
        ByteArrayInputStream swapStream = new ByteArrayInputStream(
                bos.toByteArray());
        return swapStream;
    }


}
