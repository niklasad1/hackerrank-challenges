module FilterPosList(f) where

-- use two iterators one for position and one element
f :: [Int] -> [Int]
f lst = [j | (i, j) <- zip [0..] lst, odd i]
