(ns hackerrank-fp-clj.list-replication)

(defn list_replication
  [num list]
  (doseq [x list]
    (loop [i 0]
      (when (< i num)
        (println x)
        (recur (inc i)))
      ))
  )

(list_replication 6 [1 2 3])
