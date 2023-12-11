INSERT INTO post(id, title          , description             , content                                 , created_at      , updated_at)
VALUES           (1, "Java Advanced", "Learn Spring Framework","Learn Spring Framework with mentor Khoa",CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
INSERT INTO comment (id,name             ,email           ,body                   ,created_at       ,updated_at       , post_id)
VALUES              (1,"Nguyen Van Khoa","khoa.nv@gmail.com","Bai viet rat bo ich",CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 1      );