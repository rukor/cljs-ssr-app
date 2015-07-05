(ns leiningen.new.cljs-ssr-app
    (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "cljs-ssr-app"))

(defn cljs-ssr-app
      [name]
      (let [data {:name      name
                  :ns-name   (sanitize-ns name)
                  :sanitized (name-to-path name)}]
           (->files data
                    ["src/app/{{sanitized}}/app/page/om.cljs" (render "om.cljs" data)]
                    [".gitignore" (render ".gitignore")]
                    ["Procfile" (render "Procfile")]
                    ["README.md" (render "README.md" data)]
                    ["tasks/leiningen/packagejson.clj" (render "packagejson.clj")]
                    [".lein-classpath" (render ".lein-classpath")]
                    ["app.json" (render "app.json")]
                    ["test/{{sanitized}}/core_test.clj" (render "core_test.clj" data)]
                    ["src/app/{{sanitized}}/app/main.cljs" (render "main.cljs" data)]
                    ["src/app/{{sanitized}}/app/service.cljs" (render "service.cljs" data)]
                    ["src/app/{{sanitized}}/app/page/reagent.cljs" (render "reagent.cljs" data)]
                    ["src/app/{{sanitized}}/app/state.cljs" (render "state.cljs" data)]
                    ["project.clj" (render "project.clj" data)]
                    ["src/app/{{sanitized}}/app/routes.cljs" (render "routes.cljs" data)]
                    ["src/server/{{sanitized}}/server/core.cljs" (render "core.cljs" data)]
                    ["src/app/{{sanitized}}/app/util.cljs" (render "util.cljs" data)]
                    ["resources/public/css/styles.css" (render "styles.css")]
                    ["resources/index.html" (render "index.html" data)]
                    ["src/less/styles.less" (render "styles.less")]
                    ["resources/include.js" (render "include.js")]
                    )))
