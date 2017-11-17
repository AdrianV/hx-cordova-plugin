pushd %~dp0
rem @echo off
echo syncing
rem the root path of your project
set SYNC.ROOT=%cd%
set SYNC.PLUG=%SYNC.ROOT%\plugins\haxe.backend.Plugin
BuildTool --quiet sync-java-plug.xml
set SYNC.PLATFORM=%SYNC.ROOT%\platforms\android
if EXIST "%SYNC.PLATFORM%" (
BuildTool --quiet sync-java.xml
)
