# SpringTestProperties

Minimal reproduction of problem loading properties for tests.

I tried loading a second properties file for my unit tests,
that would overwrite some properties.

Loading it with `@PropertySource` on a `@Configuration` didn't work,
loading it with `@TestPropertySource` didn't work either.
Only setting `properties` directly on `@TesPropertySource` works,
but it does NOT work when I try to make it into a meta-annotation.
