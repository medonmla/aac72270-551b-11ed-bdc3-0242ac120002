CREATE TABLE countries(
                          id             VARCHAR(36) NOT NULL
    ,country_name   VARCHAR(32) NOT NULL
    ,country_code   VARCHAR(2) NOT NULL PRIMARY KEY
    ,slug           VARCHAR(32) NOT NULL
    ,new_confirmed  INT
    ,total_confirmed INT
    ,new_deaths     INT
    ,total_deaths   INT
    ,new_recovered  INT
    ,total_recovered INT
    ,date           VARCHAR(24) NOT NULL
);