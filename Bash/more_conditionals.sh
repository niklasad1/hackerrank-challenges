#!/bin/bash
#decription     	: HackerRank Bash - Conditionals
#author		 				: niklasad1

read input
if [[ "$input" == "y" || "$input" == "Y" ]]; then
  echo "YES"
else
  echo "NO"
fi
