#!/bin/bash

for ((i=1;i<=1000;i++));
do
   curl -i http://k8s-master-node/actuator/health
   echo $i
done
