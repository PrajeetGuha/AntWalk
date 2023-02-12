# Assignment 10

## Objective
Add one more entity Student ( to AOP Application) entity with

Attributes:

 - Name
 - engMarks
 - hindiMarks
 - MathsMarks
 
Method:
- avgMarks()
- showMarks()

Create an Aspect and Add Before and After advice!

## Terminal Output
```
PS C:\Users\RICK\Documents\AntWalk\aop>  c:; cd 'c:\Users\RICK\Documents\AntWalk\aop'; & 'C:\Users\RICK\.vscode\extensions\redhat.java-1.14.0-win32-x64\jre\17.0.5-win32-x86_64\bin\java.exe' '@C:\Users\RICK\AppData\Local\Temp\cp_3zzcei8piz9g6w2oup959ign8.argfile' 'org.nrifintech.aop.AopApplication'

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.2)

2023-02-12T19:34:44.171+05:30  INFO 6772 --- [           main] org.nrifintech.aop.AopApplication        : Starting AopApplication using Java 17.0.5 with PID 6772 (C:\Users\RICK\Documents\AntWalk\aop\target\classes started by RICK in C:\Users\RICK\Documents\AntWalk\aop)
2023-02-12T19:34:44.174+05:30  INFO 6772 --- [           main] org.nrifintech.aop.AopApplication        : No active profile set, falling back to 1 default profile:
"default"
2023-02-12T19:34:44.683+05:30  INFO 6772 --- [           main] org.nrifintech.aop.AopApplication        : Started AopApplication in 0.784 seconds (process running for 1.095)
Advice before

Average is calculated

Name: prajeet
English Marks: 70
Hindi Marks: 80
Math Marks: 98
Average Marks: 82

Advice after
PS C:\Users\RICK\Documents\AntWalk\aop>
```

Run the jar to check the result.
