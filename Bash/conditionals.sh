#!/bin/bash
#decription     	: HackerRank Bash - More Conditionals find if a triange is  either "SCALENE" or "EQUILATERAL" or "ISOSCELES"
#author		 				: niklasad1
#date            	: 2016-12-23
#version         	: 1.0
#filename		 			: conditonals.sh
#notes           	: N/A
#arguments	    	: N/A
#==============================================================================

read x
read y
read z

if [[ $x -eq $y ]] && [[ $x -eq $z ]]; then
  echo "EQUILATERAL"
elif [[ $x -lt $y ]] && [[ $y -lt $z ]]; then
  echo "SCALENE"
else
  echo "ISOSCELES"
fi
