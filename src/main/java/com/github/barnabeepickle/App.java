package com.github.barnabeepickle;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.help.HelpFormatter;

public class App 
{
    public static void main(String[] args) throws IOException, ParseException
    {
        // create Options object
        Options options = new Options();
        options.addOption("path", true, "The file path to list, default = current dir");
        // do help stuff
        //options.addOption("h", "help", false, "print this message");
        
        String header = "List files and folders in a directory";
        String footer = "Please report issues at https://github.com/barnabeepickle/jfilelist/issues";

        // setup the HelpFormmatter
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("jfilelist", header, options, footer, true);

        // create Parser
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);
        
        // get the value of the path option
        String fileDirectory = cmd.getOptionValue("path");
        
        // check if it was used so we can asign a default if needed
        String directoryPath = null;
        if(fileDirectory == null) {
            directoryPath = System.getProperty("user.dir");
        }
        else {
            directoryPath = fileDirectory;
        }

        // create a Path object for the directory
        Path directory = Paths.get(directoryPath);

        // use DirectoryStream to list files in the directory
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory)) {
          
          // use a for loop to print them on the command line
            for (Path file : stream) {
                System.out.println(file.getFileName());
            }
        }
    }
}
