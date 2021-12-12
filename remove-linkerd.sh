#!/bin/bash

linkerd viz uninstall | kubectl delete -f -

linkerd jaeger uninstall | kubectl delete -f -

linkerd multicluster uninstall | kubectl delete -f -

