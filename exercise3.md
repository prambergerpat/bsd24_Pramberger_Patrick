# Exercise 3

## Documentation
1. I downloaded maven via homebrew. Version:
   - Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
     Maven home: /usr/local/Cellar/maven/3.9.9/libexec
     Java version: 23, vendor: Oracle Corporation, runtime: /Users/patrickpramberger/Library/Java/JavaVirtualMachines/openjdk-23/Contents/Home
     Default locale: de_AT, platform encoding: UTF-8
     OS name: "mac os x", version: "15.3.2", arch: "x86_64", family: "mac"

2. Checked the java version and those are:
   - openjdk version "23" 2024-09-17
   - OpenJDK Runtime Environment (build 23+37-2369)
   - OpenJDK 64-Bit Server VM (build 23+37-2369, mixed mode, sharing)

3. The path for java can be displayed with the command: printenv

4. After that i created the maven project in intellij. 

5. Committed the changes into to `init_project` branch and merged it back to the `main` branch.

6. Created class `Calculator` and added the demanded methods, such as `MainClass`.

7. When the program is executed, intellij itself builds and compiles the project and makes a new directory called "**target**"

8. It seems that `logger.info()` is not visible in the terminal output, `logger.error()` is visible.

9. Added a debug massage to each method of the calculator, and for division by zero a special error message

10. `log4j2.xml` was configured, had some issues with the logs in the terminal, fixed it

11. 