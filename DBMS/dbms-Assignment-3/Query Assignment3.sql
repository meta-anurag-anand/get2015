use librarySecond;
-- Assignment-1
-- Question -1
SELECT m.member_name,m.member_Id,t.title_Name,t.title_Id,b.accession_No,b.issue_Date,b.due_Date , DATEDIFF(due_Date,issue_Date ) AS DiffDate  from Members m,Book_Issue b,Title t, Books bk
WHERE (m.member_id = b.member_id && t.title_id = bk.title_id && bk.accession_No = b.accession_No) &&( DATEDIFF(b.due_Date,b.issue_Date )) > 60 order By member_name ,title_Name;

-- Question -2
select member_name, length( member_name ) from Members where length( member_name ) = ( select max( length( member_name ) ) from Members );

-- Question -3
SELECT COUNT(*) from Book_Issue GROUP BY (issue_Date);




-- Assignment -2
-- Question -1
SELECT subject_name, s.subject_Id, count(t.title_id) as "Number Of books purchased" FROM Subjects s, Title t where t.subject_id = s.subject_Id GROUP BY(subject_id);

-- Question -2
SELECT m.member_name,m.member_Id,t.title_Name,t.title_Id,b.accession_No,b.issue_Date,b.due_Date , DATEDIFF(due_Date,issue_Date ) AS DiffDate  from Members m,Book_Issue b,Title t, Books bk
WHERE (m.member_id = b.member_id && t.title_id = bk.title_id && bk.accession_No = b.accession_No) &&( DATEDIFF(b.due_Date,b.issue_Date )) > 60 ;

-- Question -3
SELECT accession_No,title_Id, purchase_Date, price, status from Books WHERE price > (SELECT MIN(price) FROM Books);


-- Assignment -3
-- Question-1
select count(if(category="m",member_name,null))as number_of_faculty ,count(if(category="f",member_name,null)) as number_of_other from members ;

-- Question-2
select a.title_name as TitleName,count(b.accession_no) as number from book_issue b, title  a,books bs where bs.accession_no=b.accession_no and a.title_id =bs.title_id
group by a.title_Name HAVING count(a.title_Name) ;

-- Question-3
select m.member_name as Name,m.category as Category,b.member_id as ID,t.title_name as Title,bs.accession_no as AccessionNumber,b.issue_date as IssuedON,b.due_date as SubmittedON
from book_issue b,members m,title t ,books bs where m.member_id=b.member_id and bs.accession_no=b.accession_no and t.title_id = bs.title_id and
m.category NOT IN("F");

-- Question-4
select distinct a.author_id as ID,concat(a.author_Name) as Name from author a,books b,Title_Author at
where at.title_id= b.title_id and a.author_id= at.author_id;



