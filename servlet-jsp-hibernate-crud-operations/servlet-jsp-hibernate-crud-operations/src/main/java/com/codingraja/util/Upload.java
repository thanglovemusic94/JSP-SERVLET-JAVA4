package com.codingraja.util;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.*;



@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 10,
        maxFileSize = 1024 * 1024 * 50,
        maxRequestSize = 1024 * 1024 * 100
)
public class Upload extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String  UPLOAD_DIR = "images";

    public static String uploadFile(HttpServletRequest request) throws IOException, ServletException {
        String fileName="";
        String basePath = "";
        try{
            Part filePart = request.getPart("photo");
            fileName = (String) getFileName(filePart);
            String applicationPath = request.getServletContext().getRealPath("");
            basePath = applicationPath + File.separator + UPLOAD_DIR + File.separator;
            InputStream inputStream = null;
            OutputStream outputStream = null;
            try {
                File dir = new File(basePath);
                if (!dir.exists()) {
                    dir.mkdir();
                }

                basePath = basePath + fileName;
                File outputFilePath = new  File(basePath);
                inputStream = filePart.getInputStream();

                outputStream = new FileOutputStream(outputFilePath);
                int read = 0;
                final byte[] bytes =  new  byte[1024];
                while((read = inputStream.read(bytes)) != -1){
                    outputStream.write(bytes, 0, read);
                }

//                byte[] fileContent = FileUtils.readFileToByteArray(outputFilePath);
//                String encodedString = Base64.getEncoder().encodeToString(fileContent);
//                return  encodedString;
//                byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
//                FileUtils.writeByteArrayToFile(new File(applicationPath + File.separator + "imagecopy" + File.separator + fileName), decodedBytes);
            } catch (Exception e) {
                e.printStackTrace();
                fileName = "";
                return  null;
            }finally{
                if(inputStream != null){
                    inputStream.close();
                }
                if(outputStream != null){
                    outputStream.close();
                }
            }
        }catch(Exception e){
            fileName = "";
            return  null;
        }
        return basePath;
    }
    private static String  getFileName(Part part){
        final String  partHeader = part.getHeader("content-disposition");
        System.out.println("*****partHeader :"+ partHeader);
        for(String content : part.getHeader("content-disposition").split(";")){
            if(content.trim().startsWith("filename")){
                return content.substring(content.indexOf('=')+1).trim().replace("\"", "" );
            }
        }
        return null;
    }


}
