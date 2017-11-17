# small demo project

You can use this project as a template for your own experiments. Or you can follow the steps you have to do in your own projects:

- you need the current version of `hx-cordova-plugin` on your haxelib. 

```
haxelib git hx-cordova-plugin https://github.com/AdrianV/hx-cordova-plugin
```

- your project.hxml must include to `-lib hx-cordova-plugin`

## Full instructions to get started with your own backend

- your own backend Handler class has to extend `cordova.backend.PluginServer`. Mark this class with `@:keep` - otherwise it is optimized away.
- override the `init()` function and add your Servers. Each Server must have a name that matches the feature in the `plugin.xml` - see below.
- a Server class must extend `cordova.backend.CustomServer`
- write your exposed functions as `public`. [manual](https://haxe.org/manual/std-remoting-connection.html)

before you first compile your backend Haxe project, you have to do these steps:

- add the android platform to your cordova project, if you don't have it already
- make an empty compile for this project. This step is necessary to create an initial classes.jar, that we need to compile the Java backend.

```
cordova platform add android
cordova build android
```
- now add the `haxe.backend.Plugin` to your cordova project. A template is in the root folder. The `feature name`in the `plugin.xml` must match with the name you gave your Server in the `init()` function of your class `Handler`.

```
cordova plugin add ..\haxe.backend.Plugin
```

- now compile your backend

```
haxe build-java-server.hxml
```

- Add the generated source to your cordova project. For that you need our BuildTool in your path. The BuildTool is driven by the sync-java.xml and the sync-java-plug.xml. Its purpose is to sync the generated Java files in java-src/src with the plugin/src/android directory with the platforms/android/src directory. It also syncs the the names of the generated Java source files in the plugin.xml file. It has some quircks - one of it is, that you can't have Haxe source with package names beginning with `com` or `org`, because there are the files from the cordova project and the other plugins.

```
sync-java.bat
```

- now you are able to build your first cordova project with a Haxe plugin

```
cordova build android
```

- now every time you compile your Haxe backend Server you need to do the last three steps 

```
haxe build-java-server.hxml
sync-java.bat
cordova build android
```

## The client

In fact there is not much to do, because Haxe remoting is doing the magic here. Create a proxy class for your Server and connect to it. You can use every public function declared in your Server in an asynchronous way.

## The server

Because the html5 frontend should run on its own thread which should not interrupted by the background, your exposed function should run on a own thread. Look at the example and at the cordova documentation how to do it.