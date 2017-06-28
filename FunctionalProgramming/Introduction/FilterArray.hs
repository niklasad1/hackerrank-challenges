module FilterArray (f) where

f :: Int -> [Int] -> [Int]
f n arr = filter (< n) arr
