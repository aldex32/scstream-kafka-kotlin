#!/bin/bash

echo "Killing containers"
docker-compose down --volumes

echo "Running containers"
docker-compose -f docker-compose.yml up -d
