// Пример конфигурации jib в build.gradle файле

plugins {
//    id ("org.springframework.boot")
//    id ("com.google.cloud.tools.jib")
//    id ("fr.brouillard.oss.gradle.jgitver")
}


dependencies {
//    implementation ("org.springframework.boot:spring-boot-starter-web")
//    implementation ("org.springframework.boot:spring-boot-starter-actuator")
//    implementation ("org.flywaydb:flyway-core")
//    implementation ("org.postgresql:postgresql")
//
//    testImplementation ("org.testcontainers:testcontainers")
//    testImplementation ("org.testcontainers:postgresql")
//    testImplementation ("org.junit.jupiter:junit-jupiter-api")
//    testImplementation ("org.junit.jupiter:junit-jupiter-engine")
//    testImplementation ("org.assertj:assertj-core")
//    testImplementation ("org.springframework.boot:spring-boot-starter-test")
}

jib {
    container {
        creationTime.set("USE_CURRENT_TIMESTAMP")
    }
    // Указываем где берем основу для нашего образа (OS + JDK)
    from {
        image = "bellsoft/liberica-openjdk-alpine-musl:17.0.2-9"
    }

    to {
        // Указываем где будет храниться наш собранный образ (registry)
        image = "registry.gitlab.com/petrelevich/dockerregistry/rest-hello"
        // Передаем версию проекта
        tags = setOf(project.version.toString())
        auth {
            // Логин и пароль можно задать как системные переменные и передавать здесь
            // либо прописать алиасы с означением в gradle.properties и передавать уже их
            // (gitlabUser, gitlabPassword)
            username = System.getenv("GITLAB_USERNAME")
            password = System.getenv("GITLAB_PASSWORD")
        }
    }
}
/*
сборка проекта:
./gradlew :*module name*:build

публикация:
./gradlew :*module name*:jib
*/
