#!/bin/bash


GIT="https://github.com/CSE237SP2022/project-anderson-georger-styka.git"

git clone $GIT

git checkout bo

cd project-anderson-georger-styka/src/baseballGame

javac Main.java

java Main