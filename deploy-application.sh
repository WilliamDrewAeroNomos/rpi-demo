#!/bin/bash

kubectl apply -f minikube-deployment.yaml

kubectl rollout restart deployment/rpi-demo-app -n rpi
