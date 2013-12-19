# JetFetch
JetFetch is a simple script which will fetch airline information given a origin and a destination Indian city as arguments
and will print it in a nice table. More features like database storage and data building, queries and international flight support
are in the pipeline

## Installation

Clone this repo.

## Usage
    $ java -jar jetfetch-0.1.0-standalone.jar origin-city destination-city
## Options
Currently only two required arguments must be passed to the jar, the origin city and the destination
## Examples
    java -jar ~/awesomeapps/jetfetch-v1-standalone.jar delhi mumbai
### Bugs
1. Non existent cities cause major breakdown.
1. Will print nothing if there was nothing to scrape
## License
Copyright © 2013 The JetFetch Project

Distributed under the Eclipse Public License either version 1.0
