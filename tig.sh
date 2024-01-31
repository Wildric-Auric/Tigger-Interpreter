#!/bin/bash

if [ $# -lt 1 ]; then
    echo "Bad usage, require 1 arguments:"
    echo ".tig file expected"
    exit 1
fi
java -cp .:out/:jar/* Tigger $1
