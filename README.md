-----------------
BlueJ Portable:
-----------------
Developed for the PortableApps.com Platform

This is the first attempt that I know of to put BlueJ, the easy to use and learn Java programming interface, into the PortableApps.com platform. Every single version will be available as they are made.

These versions will be depreciated when the official OpenJDK release comes out for PortableApps.com. If and when that occurs, the OpenJDK 7 beta release will be removed from my development. I apologize to those who use the JDK 7 release, but we can hope that PA.c will be able to have a version available.

-----------------
Release Log:
-----------------
3.0.4 Pre-Dev Alpha 1:
- Initial attempt at making BlueJ portable
- Included the Oracle Java Development Kit
- Will not be available to download because of licence issues
- Also it was an absolutely massive file
- Installer size: 82.3 MB
- MD5 Hash: e870ded0764aef07b9a41ae184df0552

3.0.4 Pre-Dev Alpha 2:
- Tried using no JDK whatsoever to make things work
- Failed miserably
- Originaly an internal milestone, but publically released now
- First freely downloadable version
- Installer size: 28.9 MB
- MD5 Hash: f3b989297b560a533c124befc089c58a

3.0.4 Pre-Dev Alpha 3:
- First attempt at using the OpenJDK
- Failed a good 50% of the time
- Started messing with commandline settings and such
- Also originally an internal milestone
- Installer size: 43.2 MB
- MD5 Hash: e02485f398c4c15dcab02b583d23d259

3.0.4 Pre-Dev Alpha 4 / Dev Test 4:
- Completely scrapped original install of BlueJ
- Used an alternate installer for BlueJ and enabled more options
- Got the first fully working BlueJ portable out
- First publically available version
- Alpha Installer size: 43.2 MB
- Alpha MD5 Hash: 6f4df964ae3326ca5561d4eef07f4498
- Dev Test Installer size: 43.2 MB
- Dev Test MD5 Hash: e2c93d0e04254089ed9d306d5b62c8c5

3.0.4 Dev Test 5:
- Completely finalized the PortableApps.com standard for the project
- Some minor preference changes were made to better suit the portable platform
- Unfortunately, it is going to be replaced because of naming conventions
- Installer size: 43.2 MB
- MD5 Hash: 88759f7b7ae4eadeabeb11da7bad1e73
 
3.0.4 Dev Test 2:
- Unchanged from Dev Test 5, just a naming convention change for PA.c
- Properly renamed version
- Installer size: 43.2 MB
- MD5 Hash: 978b3ba9fc3fa0b22a2d20c728b2532f

3.0.5 Dev Test 1:
- Updated BlueJ version from 3.0.4 to 3.0.5
- Still waiting on OpenJDK implementation of JDK 7
- Installer size: 44.1 MB
- MD5 Hash: 3b29e40cd94a737852d28a924d190560

3.0.6 Dev Test 1:
- Updated BlueJ version from 3.0.5 to 3.0.6
- Installer size: 44.4 MB
- MD5 Hash: af2a355dfd560abda4c07e7707bf2df0

3.0.6 Dev Test 2:
- Updated OpenJDK to 7 b146 (http://jdk7.java.net/java-se-7-ri/)
- Installer size: 76.7 MB
- MD5 Hash: 17351f583e667adfee1f2cd35ccf36b6

3.0.7 Dev Test 1:
- Updated BlueJ version from 3.0.6 to 3.0.7
- Reverted to OpenJDK 6
- Updated to PortableApps.com Installer 3.0.3 and Launcher 2.1.2
- Installer size: 44.4 MB
- MD5 Hash: 4b1cfb7f5cfd3429dc46bd62ac99489d

3.0.7 Dev Test 2:
- Updated OpenJDK to 7 b146 (http://jdk7.java.net/java-se-7-ri/)
- Installer size: 76.7 MB
- MD5 Hash: e81b03a057130ad7d17d5659a343f02f

3.0.8 Dev Test 1:
- Updated BlueJ version from 3.0.7 to 3.0.8
- Reverted to OpenJDK 6
- Installer size: 44.4 MB
- MD5 Hash: 60a892137520a7e62ab715088df5ab69

3.0.8 Dev Test 2:
- Updated OpenJDK to 7 b146 (http://jdk7.java.net/java-se-7-ri/)
- Installer size: 76.7 MB
- MD5 Hash: fbcccef0e46e39649980f1a9f831723c

3.0.8 Dev Test 3:
- Rebuilt the structure of the application in accordance to PA.c guidelines
- Removed PA.c installer source from the installer
- Reverted to OpenJDK 6
- Long-name Installer size: 44.3 MB
- Long-name MD5 Hash: 735cbabbeb201fbc45cdad403a7db0d3
- Short-name Installer size: 44.3 MB
- Short-name MD5 Hash: 6397eed1c0c0eb470e0d72ad744b2e9f

3.0.8 Dev Test 4:
- Updated OpenJDK to 7 b146 (http://jdk7.java.net/java-se-7-ri/)
- Long-name Installer size: 76.5 MB
- Long-name MD5 Hash: ed19999ae4f3e6dee9a2f8fa10825b8b
- Short-name Installer size: 76.5 MB
- Short-name MD5 Hash: 46cca9135db7225470d39c4531345a23

3.0.8 Dev Test 5:
- Made OpenJDK the only available option when running BlueJ
- Moved user directory to Data folder (using bluej.defs)
- Reverted to OpenJDK 6
- Installer size: 44.2 MB
- MD5 Hash: 6c255bfac93b7689619c29bc741b6014

3.0.8 JDK 7 Dev Test 5:
- Branched to include only OpenJDK 7 b146 (http://jdk7.java.net/java-se-7-ri/)
- Installer size: 76.5 MB
- MD5 Hash: f1ee27a4654dddbc2b3dbc979b54b0db

3.0.8 Dev Test 6:
- Removed OpenJDK from package
- Merged development branches again
- Now relies on external OpenJDK
	+ Version 7 Update 9 b02 (http://portableapps.com/node/35441)
	+ Compiled by gluxon
	+ For full functionality, must have it installed
	+ Otherwise you must rely on locally installed versions
- Found and removed residual registry items
- Properly handle locally installed versions
- Package now much smaller
- Installer size: 6.81 MB
- MD5 Hash: efa531420004385593153d7efa70e67f

3.0.8 Dev Test 7:
- Now saves configuration files in Data folder
- Sets custom folders for user libraries and extensions
- Now saves profile between sessions
- Installer size: 6.81 MB
- MD5 Hash: ec603cdfc5c458ae5d8bf9ec6c798906

3.0.8 Dev Test 8:
- PortableApps.com launcher tweaks
	+ By default, allows for OpenJDK via the launcher
	+ OpenJDK takes precidence over jPortable if both installed
- Stopped using supplied executable file
	+ Uses a direct Java call
	+ Allows for user home relocation
	+ Removed need for some prior file and folder moving
- Installer size: 6.81 MB
- MD5 Hash: 12478bdfdb036e10d5327099a6c30603

3.0.9 Dev Test 1:
- Updated base app to 3.0.9
- Removed BlueJ executable from package
- Installer size: 6.77 MB
- MD5 Hash: a461dfdeab19aebcbf9f88573f25f642

3.1.0 Dev Test 1:
- Updated base app to 3.1.0
- Installer size: 7.37 MB
- MD5 Hash: 742491b946266b1267d88df3c895c1de