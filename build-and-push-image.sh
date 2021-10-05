#!/bin/bash

docker buildx inspect --bootstrap

docker buildx build --platform linux/amd64,linux/arm64 -t williamdrew/rpi-demo:latest --push .

docker buildx imagetools inspect williamdrew/rpi-demo:latest
