DROP TABLE author_book;
DROP TABLE authors;
DROP TABLE book_genre;
DROP TABLE books;
DROP TABLE genres;



CREATE TABLE authors (
    name text NOT NULL,
    date_of_birth date NOT NULL,
    "author_id" serial PRIMARY KEY,
    biography text
);
ALTER TABLE authors OWNER TO postgres;

CREATE TABLE books (
    name text NOT NULL,
    publication date NOT NULL,
    "book_id" serial PRIMARY KEY
);
ALTER TABLE books OWNER TO postgres;

CREATE TABLE author_book (
    "author_id" integer NOT NULL,
    "book_id" integer NOT NULL,
    "author_book_id" serial PRIMARY KEY
);
ALTER TABLE author_book OWNER TO postgres;

CREATE TABLE genres (
    name text NOT NULL,
    "genres_id" serial PRIMARY KEY
);
ALTER TABLE genres OWNER TO postgres;

CREATE TABLE book_genre (
    "book_id" integer NOT NULL,
    "genre_id" integer NOT NULL,
    "book_genre_id" serial PRIMARY KEY
);
ALTER TABLE book_genre OWNER TO postgres;



INSERT INTO author_book ("author_id", "book_id", "author_book_id") VALUES (1, 1, 1);


INSERT INTO authors (name, date_of_birth, "author_id", biography) VALUES ('Джордж Оруэлл', '1903-06-25', 1, 'Родился 25 июня 1903 в Матихари (Бенгалия). Его отец, британский колониальный служащий, занимал незначительный пост в индийском таможенном управлении. Оруэлл обучался в школе св. Киприана, в 1917 получил именную стипендию и до 1921 посещал Итонский колледж. В 1922-1927 служил в колониальной полиции в Бирме. В 1927, вернувшись домой в отпуск, решил подать в отставку и заняться писательством. Ранние — и не только документальные — книги Оруэлла в значительной мере автобиографичны. Побывав судомоем в Париже и сборщиком хмеля в Кенте, побродив по английским сёлам, Оруэлл получает материал для своей первой книги «Собачья жизнь в Париже и Лондоне» (Down and Out in Paris and London, 1933). «Дни в Бирме» (Burmese Days, 1934) в значительной степени отобразили восточный период его жизни.');


INSERT INTO book_genre ("book_id", "genre_id", "book_genre_id") VALUES (1, 1, 1);


INSERT INTO books (name, publication, "book_id") VALUES ('1984', '2017-01-01', 1);


INSERT INTO genres (name, "genres_id") VALUES ('Фантастика', 1);
INSERT INTO genres (name, "genres_id") VALUES ('Ужасы', 2);


REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;

