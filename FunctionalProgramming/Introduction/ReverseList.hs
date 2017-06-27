module ReverseList (rev) where

-- easiest way use built-in reverse function
rev :: [a] -> [a]
rev [] = []
rev (x:xs) = rev xs ++ [x]

