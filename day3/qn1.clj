(def accounts (ref []))

(defn credit [value]
  (dosync (alter accounts conj value))
)

(defn debit [value]
  (dosync (alter accounts conj (* -1 value)))
)

(defn balance [x]
  (reduce + x)
)

(credit 2)
(credit 3)
(debit 1)
(credit 4)
(balance @accounts)


;do it using recursion????? - doesn't work!!!!!
(defn balance [values]
	(if (= 1 (size values))
		(
			(println (str "last one:" (first values) " size:" (size values)))
			(first values)
		)
		(
			(println (str "calling balance again for vector values:" (rest values) " size:" (size values)))
			(def result (+ result (balance (rest values))))
		)
	)
)

(balance [1 2])


(defn size [v]
	(if (empty? v)
		0
		(inc (size(rest v)))
		)

	)

