@echo off
set APPBASE="%CD%\App\BlueJ"
set CP=%APPBASE%\lib\bluej.jar;%APPBASE%\lib\openjdk-6.0.21\lib\tools.jar
%APPBASE%\lib\openjdk-6.0.21\bin\java.exe -cp %CP% bluej.Boot  %1 %2 %3 %4 %5 %6 %7 %8 %9