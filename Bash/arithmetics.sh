#!/bin/bash
#decription     	: HackerRank Bash - The World of Numbers
#author		 				: niklasad1
#notes           	: Read two numbers from STDIN

read x
read y
# can use `expr $x+$y`
echo "$(($x+$y))"
echo "$(($x-$y))"
echo "$(($x*$y))"
echo "$(($x/$y))"
