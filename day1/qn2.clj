(def outputs {clojure.lang.PersistentArrayMap :map clojure.lang.PersistentVector :vector clojure.lang.PersistentList :list})

(defn collection-type [col] (outputs (type col)))

(collection-type [])
(collection-type '(1))
(collection-type {})
(collection-type '())
