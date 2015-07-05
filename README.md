# cljs-ssr-app

Lein template for CLJS app with Server Side Rendering based on [cljs-ssr-node](https://github.com/rukor/cljs-ssr-node)

### Usage

To At a shell prompt, type:

```
lein new cljs-ssr-app example
cd example
lein less once
lein build && npm install
node resources/index.js
```

Then navigate to http://localhost:3000

To deploy to heroku, type:

```
lein with-profile prod build
npm install
```

The app is then ready to deploy to heroku via git push per heroku's instructions. Note that the same applies for other heroku style PaaS like deis and flynn.

This is a pre-alpha quality proof of concept, pull requests welcome.

## License

Copyright © 2015 Roland Ukor

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
