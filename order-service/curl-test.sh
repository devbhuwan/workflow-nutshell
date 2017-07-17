#!/usr/bin/env bash
curl -H "Content-Type: application/json" -X POST -d '{"id":"1","detail":"abc"}' http://localhost:8788/orders
curl -H "Content-Type: application/json" -X GET http://localhost:8788/orders
