# Collins

## Overview

There is good documentation available at http://tumblr.github.com/collins. The
documentation below is for developers or people setting up a new instance.

There is currently no 'production' build of collins. By that I mean no
prepackaged version. You must build yourself from source.

## Quickstart - Screencast

http://www.youtube.com/watch?v=rEyoS-iofK8

## Quickstart - Building Collins

 1. Download play from here: http://download.playframework.org/releases/play-2.0.3.zip
 2. Unpack the zip into `$HOME/src/play-2.0.3`
 3. In this directory type `~/src/play-2.0.3/play` and hit enter (this will take a minute the first time)
 4. Once you are in the play console, type `compile` and hit enter, you should see no errors. We're just testing your environment, you normally won't do this.
 5. Break out of the play console (`ctrl-d` or `quit`)
 6. Run `./scripts/package.sh`. This will create a fat zip with all the requirements and dependencies.

## Quickstart - Developing Collins

Follow the building quickstart but instead of breaking out of the play console
or running the package step, just type `run` and then visit `http://localhost:9000`.

Alternatively, to run in dev with a different configuration do
`run -Dconfig.file=conf/alt.conf` where `alt.conf` is your alternate configuration.

Edits you make to the code just require reloading the page (or hitting an API
endpoint). The code will be recompiled on the fly.

By default the authentication is provided via the MockAuthenticationProvider.
Available usernames/passwords/roles can be found here:

https://github.com/tumblr/collins/blob/master/app/util/security/MockAuthenticationProvider.scala

## Additional Notes

There is a supplied init script at `scripts/collins.sh`. This is a useful
starting point for running the app. Note that the init script requires the
daemon (http://libslack.org/daemon/).

## License

Copyright 2012 Tumblr, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

## Support/Questions

Email collins-sm@googlegroups.com or see the mailing list archive at https://groups.google.com/forum/#!forum/collins-sm

# Users

If you are using the supplied users.conf, usernames and passwords are:

    blake - 8vCeb3h8F863
    matt  - 0592607689Cr
    test  - h2624A7WJA3y
    joeengineer - 4ZRl5311al77

