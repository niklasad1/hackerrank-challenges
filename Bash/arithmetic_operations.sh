#!/bin/bash
#decription     	: HackerRank Bash - Arithmetic Operations
#author		 				: niklasad1
#date            	: 2017-01-03
#version         	: 1.0
#filename		 			: arithmetic_operations.sh
#notes           	: Read an expression from STDIN
#arguments	    	: N/A
#==============================================================================

read input
printf "%.3f\n" $(echo "$input" | bc -l)
