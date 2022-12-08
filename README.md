# Spring Inconsistent Traces Sample

To reproduce:
1. `docker-compose up`
2. Run one of the two apps
3. `curl -u user:password http://localhost:8888`, notice the logging inconsistency at this point
4. Head to [Grafana](http://localhost:3500) and view your trace, notice the trace inconsistency
5. Repeat steps 2-4 with the other app (servlet or webflux)
