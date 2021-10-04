#!/bin/bash

#docker build --no-cache -t williamdrew/rpi-demo .

docker buildx build --platform linux/amd64,linux/arm64 -t williamdrew/rpi-demo:latest --push .
