#!/bin/bash

kubectl apply -f deployment.yaml

kubectl rollout status deployment/rpi-demo-app -n rpi

