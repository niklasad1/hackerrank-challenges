#!/bin/bash
#decription     	: HackerRank Bash - Arithmetic Operations
#author		 				: niklasad1
#notes           	: Read an expression from STDIN

read input
printf "%.3f\n" $(echo "$input" | bc -l)
