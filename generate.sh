#!/usr/bin/env bash
swagger-codegen generate -i https://api.rokka.io/doc.json -l java -o . -c config.json
