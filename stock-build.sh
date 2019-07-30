#!/bin/bash
/usr/local/bin/docker-compose -f basic-compose.yml down --rmi all

/usr/local/bin/docker-compose -f stock-compose.yml down --rmi all

/usr/local/bin/docker-compose -f basic-compose.yml up -d

/usr/local/bin/docker-compose -f stock-compose.yml up -d
