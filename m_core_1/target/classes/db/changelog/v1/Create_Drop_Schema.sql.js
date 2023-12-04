CREATE SCHEMA `1_schema` DEFAULT CHARACTER SET utf8;
CREATE TABLE `1_schema`.`user` (
    `id` BIGINT(25) NOT NULL,
    `@EMAIL` VARCHAR(45) NOT NULL,
    `PASSWORD` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `@EMAIL_UNIQUE` (`@EMAIL` ASC) VISIBLE);

CREATE TABLE `1_schema`.`role` (
    `id` BIGINT(20) NOT NULL,
    `NAME` VARCHAR(45) NULL,
    PRIMARY KEY (`id`);
    UNIQUE INDEX 'mane_UNIQUE' ('name' ASC) VISIBLE);



CREATE TABLE `1_schema`.`users_roles` (
    `users_id` BIGINT(20) NOT NULL,
    `role_id` BIGINT(20) NOT NULL,
    INDEX `fk_roles_idx` (`role_id` ASC, `users_id` ASC) VISIBLE,
    CONSTRAINT `fk_users`
FOREIGN KEY ()
REFERENCES `1_schema`.`users` ()
ON DELETE NO ACTION
ON UPDATE NO ACTION,
    CONSTRAINT `fk_roles`
FOREIGN KEY (`role_id` , `users_id`)
REFERENCES `1_schema`.`role` (`id` , `id`)
ON DELETE RESTRICT
ON UPDATE RESTRICT);

INSERT INTO `1_schema`.`role` (`id`, `NAME`) VALUES ('hello');
INSERT INTO `1_schema`.`role` (`id`, `NAME`) VALUES ('привет');
INSERT INTO `1_schema`.`role` (`id`, `NAME`) VALUES ('02', 'ADMIN');
INSERT INTO `1_schema`.`users_role` (`users_id`, 'role_id') VALUES ('1', '1');

CREATE TABLE `1_schema`.`en_words` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `meaning` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `meaning_UNIQUE` (`meaning` ASC) VISIBLE);