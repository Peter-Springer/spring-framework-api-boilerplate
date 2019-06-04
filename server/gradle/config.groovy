environments {
    local {
        flywayUrl = 'jdbc:mysql://localhost:3306/spring_starter?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC'
        flywayUser = ${username}
        flywayPassword =
        springDataSourceUsername = ${username}
        springDataSourcePassword =
        springDataSourceUrl = 'jdbc:mysql://localhost:3306/spring_starter?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC'
    }
}