#!/bin/bash

kubectl taint nodes k8s-node-03 node.kubernetes.io/unreachable:NoSchedule-

kubectl taint nodes k8s-node-03 node.kubernetes.io/unreachable:NoExecute-

