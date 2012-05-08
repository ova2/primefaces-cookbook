Getting Started
===============

== Prerequisites ==

- Install Git as described in the [http://git-scm.com/book/en/Getting-Started-Installing-Git Pro Git book].
- Install [http://maven.apache.org/ Maven] if you don't have it as this project is a Maven based project.

== Compile and Run Project ==

Open your console / terminal window and clone the repository with
{{{
git clone git://github.com/ova2/primefaces-cookbook.git
}}}
You can now explore the source code, compile and run the project. To install the project, go to the project root folder and type the following command
{{{
mvn install
}}}
The demo web application is prepared to run with Jetty 8 server. To run it with JSF Mojarra implementation, type in the console / terminal window
{{{
mvn jetty:run
}}}
To run it with JSF MyFaces implementation, type
{{{
mvn jetty:run -Pmyfaces
}}}
This starts Jetty server and the demo app is available under the following URL in a web browser
{{{
http://localhost:8080/primefaces-cookbook/
}}}
Jetty will continue to run until you stop it with a <Ctrl+C> in the console / terminal window where it is running.