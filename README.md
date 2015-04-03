PrimeFaces Cookbook (Second Edition). All examples are compatible with PrimeFaces 5.x.

[![Build Status](https://travis-ci.org/ova2/primefaces-cookbook.svg)](https://travis-ci.org/ova2/primefaces-cookbook)

Prerequisites
-------------

* Install Git as described in the [Pro Git book][Pro-Git-book].
* Install [Maven 3][Maven-3] if you don't have it as this project is a Maven based project. You might need a JDK installation instead of a JRE for running Maven.
* Install [WildFly][WildFly] or [Apache TomEE][Apache-TomEE] if you don't have it installed on your local.

Compile and Run Project
-----------------------

Open your console / terminal window and clone the repository with

<pre>
git clone git://github.com/ova2/primefaces-cookbook.git
</pre>

You can now explore the source code with samples, compile and run the project. To install the project, go to the project root folder <tt>primefaces-cookbook</tt> and type the following command

<pre>
mvn install
</pre>

The WAR file is located in the <tt>target</tt> folder below project root. The demo web application is prepared to run with PrimeFaces 5.2 and JSF 2.2.

You can deploy the WAR file on every Servlet 3.x compatible application server such as [WildFly][WildFly] or [Apache TomEE][Apache-TomEE].
The demo application is running under

<pre>
http://localhost:8080/pf-cookbook/
</pre>

Download WAR file
-----------------

We use [Travis][Travis-CI] and [Jenkins][Jenkins-CI] as continuous integration tools. They builds the project after each commit. You can download the runnable showcase from the [Jenkins' last build][Jenkins-WAR].

[Pro-Git-book]: http://git-scm.com/book/en/Getting-Started-Installing-Git
[Maven-3]: http://maven.apache.org/
[WildFly]: http://wildfly.org/downloads
[Apache-TomEE]: http://tomee.apache.org/downloads.html
[Travis-CI]: https://travis-ci.org/
[Jenkins-CI]: https://jenkins-ci.org/
[Jenkins-WAR]: https://buildhive.cloudbees.com/view/Dashboard/job/ova2/job/primefaces-cookbook/lastBuild/org.primefaces.cookbook$showcase/ 