#!/bin/bash

if [ "$#" -ne 1 ]; then
    echo "Error: Incorrect number of parameters."
    echo "The following parameters are required:"
    echo "Arg #1 - Node name (i.e. - k8s-node-01"
    echo "Example: > rm-taint.sh k8s-node-01"
    exit 2
fi

nodeName="$1"

kubectl taint nodes $nodeName node.kubernetes.io/unreachable:NoSchedule-

kubectl taint nodes $nodeName node.kubernetes.io/unreachable:NoExecute-

