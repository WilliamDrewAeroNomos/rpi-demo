#!/bin/bash

kubectl apply -f deployment.yaml

kubectl get deployment rpi-demo-app -o yaml | linkerd inject - | kubectl apply -f -

#kubectl rollout status deployment/rpi-demo-app -n rpi

