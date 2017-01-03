#!/bin/bash
#decription     	: HackerRank Bash - Compute the Average
#author		 				: niklasad1

let sum=0
read -r lines
for ((i=0; i<$lines; i++))
do
  read -r line
  let sum+=$line
done
printf "%.3f\n" $(echo $sum/$lines | bc -l)
