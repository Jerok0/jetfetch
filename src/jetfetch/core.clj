(ns jetfetch.core
  (:gen-class))
(use 'clojure.pprint)

(defn url-builder
  [from to]
  (str "http://www.mapsofindia.com/flight-schedule/" from "-" to ".html"))

(defn get-table
  [contents]
  (re-seq #"(?<=<td class='text'>).*(?=</td>)" contents)) ;"

(defn mapper
  [sample]
  (for [[name code arrival depature dates] (partition 5 sample)] {:name name :code code :arrival arrival :depature depature :days dates}))

(defn -main
  [from to]
  (let [url (url-builder from to)
        contents  (slurp url)
        table (get-table contents)
        info-map (mapper table)]
    (clojure.pprint/print-table info-map)))

;(clojure.pprint/print-table (apply -main (rest *command-line-args*)))