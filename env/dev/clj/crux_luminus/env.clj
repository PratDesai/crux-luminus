(ns crux-luminus.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [crux-luminus.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[crux-luminus started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[crux-luminus has shut down successfully]=-"))
   :middleware wrap-dev})
