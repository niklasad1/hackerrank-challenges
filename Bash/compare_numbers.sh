#!/bin/bash
#decription     	: HackerRank Bash - Compairing Two Numbers
#author		 				: niklasad1
#date            	: 2016-12-23
#version         	: 1.0
#filename		 			: compare_numbers.sh
#notes           	: N/A
#arguments	    	: N/A
#==============================================================================

read x
read y

if [[ $x -gt $y ]]; then
  echo "X is greater than Y"
elif [[ $x -lt $y ]]; then
  echo "X is less than Y"
else
  echo "X is equal to Y"  
fi
