SET VERSION=V12
REM SET VERSION=V12

SET SCHEMA-PATH=schema\%VERSION%

SET OUTPUT-PATH=%SCHEMA-PATH%\src-output
SET PACKAGE=rmds.xml
rmdir /Q /s .\%OUTPUT-PATH%
mkdir .\%OUTPUT-PATH%
for /r %%f in (*.xsd) do (

"C:\Program Files\Java\jdk1.8.0_171\bin\xjc.exe" -d %OUTPUT-PATH% %SCHEMA-PATH%\%%~nf%%~xf -p %PACKAGE%.%%~nf
)
