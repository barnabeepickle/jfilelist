# jFileList

jFileList is a simple Java clone of ls, the common Unix and Unix-like command for Listing Files.<br/>

## About

This project was created to learn more about how to code and build projects with Java, in this I was successful but it did not go smoothly.<br/>
Additionally I started this project by creating a Python implmentation of what I wanted to do in Java which you can [find here.](https://github.com/barnabeepickle/crosstest/tree/python)

### Now with out further ado,<br/> the following is an incomplete list of the problems I encountered:<br/>

+ I forgot some of my process for python development so it took me about a day long than normal to make the Python version.
+ I didn't know what groupId and artifactId I needed to use for Maven (I know now).
+ I couldn't create a Maven project in Eclipse IDE.
+ I had to ditch Eclipse IDE for VSCode (with [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)).
+ I kept messing up the project creation process (you need to clone the Github repo first then create a Java project of the same name and tell it that it should still use that same folder the repo is in).
+ I was struggling to read javadoc
+ I was not able to understand how to use PicoCLI.
+ My first implmentation sucked a lot.
+ My next implmentation was a lot better and it used Apache Commons CLI instead of PicoCLI.
+ I still kinda sucked at reading javadoc.
+ When implmenting a help function the HelpFormatter() kept erroring saying it needed a constructor of some type.
+ I then switched to a slightly older version of Apache Commons CLI (1.10.0 -> 1.9.0) to fix the HelpFormatter() issue.
+ I then forgot to add a statment to not always print help.

So thats some of the issues I encounterd in my first proper Java project.

## Info

[Eclipse IDE](https://eclipseide.org/) (Good even if it didn't work out for me.)<br/>
[Maven](https://maven.apache.org/)<br/>
[PicoCLI](https://picocli.info/)<br/>
[Apache Commons CLI](https://commons.apache.org/proper/commons-cli/)<br/>
[Visual Studio Code](https://code.visualstudio.com/)<br/>
VSCode [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

### License

This project is Licensed under Apache License Version 2.0
