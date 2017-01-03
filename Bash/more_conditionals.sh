#!/bin/bash
#decription     	: HackerRank Bash - Conditionals
#author		 				: niklasad1
#date            	: 2016-12-23
#version         	: 1.0
#filename		 			: conditonals.sh
#notes           	: N/A
#arguments	    	: N/A
#==============================================================================

read input
if [[ "$input" == "y" || "$input" == "Y" ]]; then
  echo "YES"
else
  echo "NO"
fi
