module SumOfOddElements (f) where

f :: [Int] -> Int
f arr = sum $ filter odd arr


