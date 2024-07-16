select a.title, a.content, u.email  from user u join article a on u.id = a.user_id;
select * from article where article_id between 7 and 12;