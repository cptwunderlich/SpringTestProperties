# SpringTestProperties

Minimal reproduction of problem loading properties for tests.

I tried loading a second properties file for my unit tests,
that would overwrite some properties.

Loading it with `@PropertySource` on a `@Configuration` didn't work,
loading it with `@TestPropertySource` didn't work either.
Only setting `properties` directly on `@TesPropertySource` works,
but it does NOT work when I try to make it into a meta-annotation.

Then I tried using `@ActiveProfiles` to set a 'test' profile to load 'application-test.properties'.
That works, but I'd need to put it on each and every test. I tried creating a meta-annotation,
so that I can bundle any config needed for all integration tests, but that didn't work.
According to the documentation for `@ActiveProfiles` it **should** support meta-annotations.
