module ListLength (len) where

-- easiest use built-in length function
len :: [a] -> Int
len [] = 0
len (x:xs) = 1 + len xs
