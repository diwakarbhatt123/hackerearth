package com.company.exercise;

import java.io.File;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Files {
    public static Set<File> sortFiles(String filePath){
        File directory = new File(filePath);
        File[] fileList = directory.listFiles();
        if(fileList != null) {
            TreeSet<File> fileTreeSet = new TreeSet<>(new Comparator<File>() {
                @Override
                public int compare(File o1, File o2) {
                    return (o1.length() == o2.length()) ? 0 : (o1.length() > o2.length() ? -1 : 1);
                }
            });
            for (int i = 0; i < fileList.length; i++) {
                if(fileList[i].isFile()){
                    fileTreeSet.add(fileList[i]);
                }
                if(fileList[i].isDirectory()){
                    File[] directoryFiles = fileList[i].listFiles();
                    if(directoryFiles != null) {
                        for (int j = 0; j < directoryFiles.length; j++) {
                            fileTreeSet.add(directoryFiles[j]);
                        }
                    }
                }
            }
            return fileTreeSet;
        }
        else
            return new TreeSet<>();
    }
    public static void main(String[] args) {
        if(args.length == 1){
            Set<File> fileSet = sortFiles(args[0]);
            for (File file:fileSet) {
                System.out.println("File Path:"+file.getAbsolutePath()+"\tFile Name:"+file.getName()+"\tFile Size:"+file.length()+"\n");
            }
        }
        else {
            System.exit(0);
        }
    }
}
