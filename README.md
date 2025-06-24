# Spring-By-Tech-M
https://docs.google.com/document/d/1buAtdgy23tWsOfHljOzK1Ft23fpp-PV62rBcQNrKUJc/edit?usp=sharing


 Not compiling test sources
[INFO] 
[INFO] [1m<<< [0;32mspring-boot:3.5.3:run[m [1m(default-cli)[0;1m < [0;1mtest-compile[m @ [36mEkartstore[0;1m <<<[m
[INFO] 
[INFO] 
[INFO] [1m--- [0;32mspring-boot:3.5.3:run[m [1m(default-cli)[m @ [36mEkartstore[0;1m ---[m
[INFO] Attaching agents: []
Error: LinkageError occurred while loading main class com.example.Ekartstore.EkartstoreApplication
	java.lang.UnsupportedClassVersionError: com/example/Ekartstore/EkartstoreApplication has been compiled by a more recent version of the Java Runtime (class file version 67.0), this version of the Java Runtime only recognizes class file versions up to 65.0
[INFO] [1m------------------------------------------------------------------------[m
[INFO] [1;31mBUILD FAILURE[m
[INFO] [1m------------------------------------------------------------------------[m
[INFO] Total time:  1.840 s
[INFO] Finished at: 2025-06-24T20:21:41+05:30
[INFO] [1m------------------------------------------------------------------------[m
[ERROR] Failed to execute goal [32morg.springframework.boot:spring-boot-maven-plugin:3.5.3:run[m [1m(default-cli)[m on project [36mEkartstore[m: [1;31mProcess terminated with exit code: 1[m -> [1m[Help 1][m
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the [1m-e[m switch.
[ERROR] Re-run Maven using the [1m-X[m switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [1m[Help 1][m http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
