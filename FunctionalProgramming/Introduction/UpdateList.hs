module UpdateList (f) where

f :: (Num a) => [a] -> [a]
f arr = map abs arr
