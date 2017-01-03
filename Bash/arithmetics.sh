#!/bin/bash
#decription     	: HackerRank Bash - The World of Numbers
#author		 				: niklasad1
#date            	: 2016-12-23
#version         	: 1.0
#filename		 			: arithmetics.sh
#notes           	: Read two numbers from STDIN
#arguments	    	: N/A
#==============================================================================

read x
read y
# can use `expr $x+$y`
echo "$(($x+$y))"
echo "$(($x-$y))"
echo "$(($x*$y))"
echo "$(($x/$y))"
