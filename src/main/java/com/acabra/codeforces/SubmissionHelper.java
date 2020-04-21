package com.acabra.codeforces;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class SubmissionHelper {
    private static final String inputClassName = "NewYearNaming1284A";
    private static final String outputName = "Solution.java";
    private static final String FILE_SEPARATOR = System.getProperty("file.separator");
    private final String source;
    private final String output;

    public SubmissionHelper(String packageName, String fileName) {
        this.source = packageName + fileName;
        this.output = getOutputFolder() + outputName;
        File f = new File(this.output);
        try {
            Files.deleteIfExists(f.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = inputClassName + ".java";
        try {
            SubmissionHelper.of(getPackageName(), fileName).buildSubmissionFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getPackageName() throws IOException {
        File file = new File("").getCanonicalFile();
        String[] sourceFolder = {file.getCanonicalPath(), "src", "main", "java", "com", "acabra", "codeforces", "below1000"};
        return String.join(FILE_SEPARATOR, sourceFolder) + FILE_SEPARATOR;
    }

    private static String getOutputFolder() {
        File file = null;
        try {
            file = new File("").getCanonicalFile();
            String[] sourceFolder = {file.getCanonicalPath(), "target"};
            return String.join(FILE_SEPARATOR, sourceFolder) + FILE_SEPARATOR;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private void buildSubmissionFile() throws IOException {
        boolean packageFixed = false;
        boolean wrapperClassDeclareFixed = false;
        boolean solutionClassStaticReplaced = false;
        ArrayDeque<String> submissionContents = new ArrayDeque<>();
        try(BufferedReader bf = Files.newBufferedReader(Paths.get(this.source))) {
            String line = null;
            while ((line=bf.readLine()) != null) {
                if (!packageFixed && line.startsWith("package")) {
                    packageFixed = true;
                    continue;
                }
                if (!wrapperClassDeclareFixed && line.startsWith("public class")) {
                    wrapperClassDeclareFixed = true;
                    continue;
                }
                if (!solutionClassStaticReplaced && line.contains("static public class Solution")) {
                    submissionContents.add("public class Solution {\n");
                    solutionClassStaticReplaced = true;
                    continue;
                }
                submissionContents.add((line.startsWith("    ") ? line.substring(4) : line)+"\n");
            }
            submissionContents.removeLast();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try(BufferedWriter bw = Files.newBufferedWriter(Paths.get(this.output))){
            while(!submissionContents.isEmpty()) {
                bw.write(submissionContents.remove());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static SubmissionHelper of(String packageName, String fileName) {
        return new SubmissionHelper(packageName, fileName);
    }
}
