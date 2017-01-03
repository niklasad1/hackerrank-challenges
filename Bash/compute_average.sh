#!/bin/bash
#decription     	: HackerRank Bash - Compute the Average
#author		 				: niklasad1
#date            	: 2017-01-03
#version         	: 1.0   
#filename		 			: compute_average.sh
#notes           	: <NOTES>
#arguments	    	: read number from STDIN, 1 line is the number of args to be processed 
#==============================================================================
let sum=0
read -r lines
for ((i=0; i<$lines; i++))
do
  read -r line
  let sum+=$line
done
printf "%.3f\n" $(echo $sum/$lines | bc -l)
