module HelloWorldNTimes (hello_worlds) where

hello_worlds 0 = return ()
hello_worlds n = do putStrLn "Hello World"
                    hello_worlds(n-1)
