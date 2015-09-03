;print numbers from 1 to 100
(def get-100-numbers (range 1 101))

(defn fizz? [nume]
	(if (= 0 (rem nume 3))
		true
	)
)

(defn buzz? [nume]
	(if (= 0 (rem nume 5))
		true
	)
)

(defn display-fizz-buzz [the-number]
	(if (and (fizz? the-number) (buzz? the-number))
		(println "fizzbuzz")
		(if (fizz? the-number) 
			(println "fizz")
			(if (buzz? the-number) 
				(println "buzz")
				(println the-number)
			)	
		)
	)
)

(for [x get-100-numbers]
	(do ;not necessary here but this shows you how to perform multiple lines in a for-statement
		(display-fizz-buzz x)
	)
)
