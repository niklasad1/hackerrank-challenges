#!/bin/bash
#decription     	: HackerRank Bash - More Conditionals
#author		 				: niklasad1

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
