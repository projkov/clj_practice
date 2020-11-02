(ns hackerrank-fp-clj.hello-world-n-times)

(defn hello_world_n_times
  [n]
  (loop [x 0]
    (when (< x n)
      (println "Hello World")
      (recur (inc x)))
    ))

(hello_world_n_times 5)

