create table Bollywood (
id int PRIMARY KEY NOT NULL,
question varchar(750) NOT NULL UNIQUE,
option_1 varchar(100) NOT NULL,
option_2 varchar(100) NOT NULL,
option_3 varchar(100) NOT NULL,
option_4 varchar(100) NOT NULL,
correct_option varchar(1) NOT NULL);

drop table Bollywood;

insert into Bollywood values (1,'Which Bollywood actor played the character of Munna Bhai in the movie Munna Bhai M.B.B.S.?', 'Sanjay Dutt', 'Salman Khan', 'Shah Rukh Khan', 'Aamir Khan', 'A'),
(2,'Who directed the movie Dilwale Dulhania Le Jayenge?', 'Karan Johar', 'Aditya Chopra', 'Sanjay Leela Bhansali', 'Yash Chopra', 'B'),
(3,'In the movie Kabhi Khushi Kabhie Gham, which actor played the role of Rahul?', 'Hrithik Roshan', 'Shah Rukh Khan', 'Saif Ali Khan', 'Aamir Khan', 'B'),
(4,' Who is the father of Bollywood actor Shahid Kapoor?', 'Anupam Kher', 'Pankaj Kapoor', 'Amitabh Bachchan', 'Rishi Kapoor', 'B'),
(5,'Which actress made her Bollywood debut with the movie Om Shanti Om opposite Shah Rukh Khan?', 'Anushka Sharma', 'Deepika Padukone', 'Kareena Kapoor', 'Priyanka Chopra', 'B'),
(6,'Which Bollywood actor has won the maximum number of Filmfare Awards for Best Actor?', 'Amitabh Bachchan', 'Shah Rukh Khan', 'Dilip Kumar', 'Rajesh Khanna', 'A'),
(7,'Who directed the movie 3 Idiots?', 'Aamir Khan', 'Rajkumar Hirani', 'Farhan Akhtar', 'Karan Johar', 'B'),
(8,'Which actress played the character of Chandramukhi in the movie "Devdas"?', 'Madhuri Dixit', 'Aishwarya Rai', 'Rani Mukerji', 'Preity Zinta', 'B'),
(9,'In the movie Bajrangi Bhaijaan, which actor played the character of "Pawan Kumar Chaturvedi"?', 'Salman Khan', 'Shah Rukh Khan', 'Aamir Khan', 'Akshay Kumar', 'A'),
(10,'Who composed the music for the movie Dil Chahta Hai?', 'Shankar-Ehsaan-Loy', 'A. R. Rahman', 'Vishal-Shekhar', 'Jatin-Lalit', 'A'),
(11,'Which Bollywood actor won the National Film Award for Best Actor for his role in the movie Uri: The Surgical Strike?', 'Ayushmann Khurrana', 'Ranveer Singh', 'Vicky Kaushal', 'Rajkummar Rao', 'C'),
(12,'Which Bollywood actress won the Best Actress award at the 66th National Film Awards for her role in the movie Badhaai Ho?', 'Alia Bhatt', 'Priyanka Chopra', 'Kangana Ranaut', 'Neena Gupta', 'D'),
(13,'Who composed the music for the movie Dilwale Dulhania Le Jayenge?', 'A.R. Rahman', 'Shankar-Ehsaan-Loy', 'Jatin-Lalit', 'Vishal-Shekhar', 'C'),
(14,'In which year was the movie Sholay released?', '1972', '1975', '1978', '1981', 'B'),
(15,' Which Bollywood actor played the role of Bhuvan in the movie Lagaan?', 'Aamir Khan', 'Shah Rukh Khan', 'Salman Khan', 'Akshay Kumar', 'A'),
(16,'Who directed the movie Gully Boy?', 'Zoya Akhtar', 'Farhan Akhtar', 'Karan Johar', 'Anurag Kashyap', 'A'),
(17,'Which Bollywood actress played the role of Mastani in the movie Bajirao Mastani?', 'Deepika Padukone', 'Priyanka Chopra', 'Katrina Kaif', 'Kareena Kapoor Khan', 'A'),
(18,'Which Bollywood movie is the highest-grossing movie of all time in India?', 'Dangal', 'Baahubali 2: The Conclusion', 'PK', 'Kabir Singh', 'B'),
(19,'Which Bollywood actor played the role of Sanjay Dutt in the movie Sanju?', 'Shahid Kapoor', 'Ranbir Kapoor', 'Hrithik Roshan', 'Varun Dhawan', 'B'),
(20,'Who directed the movie Kabhi Khushi Kabhie Gham?', 'Sanjay Leela Bhansali', 'Karan Johar', 'Imtiaz Ali', 'Anurag Kashyap', 'B'),
(21,'Who played the character of Bhuvan in the movie Lagaan?', 'Aamir Khan', 'Salman Khan', 'Shahrukh Khan', 'Saif Ali Khan', 'A'),
(22,'Which actor won the National Film Award for Best Actor for the movie Rustom?', 'Akshay Kumar', 'Shahid Kapoor', 'Ranbir Kapoor', 'Varun Dhawan', 'A'),
(23,'Who directed the movie Dilwale Dulhania Le Jayenge?', 'Aditya Chopra', 'Karan Johar', 'Sanjay Leela Bhansali', 'Yash Chopra', 'A'),
(24,'Which Bollywood actress made her Hollywood debut in the movie xXx: Return of Xander Cage?', 'Priyanka Chopra', 'Deepika Padukone', 'Katrina Kaif', 'Anushka Sharma', 'B'),
(25,'What is the name of the character played by Kareena Kapoor in the movie Jab We Met?', 'Geet', 'Pooja', 'Anjali', 'Rani', 'A'),
(26,'Who won the Best Actress Award at the 2021 Filmfare Awards for her performance in the movie Thappad?', 'Taapsee Pannu', 'Vidya Balan', 'Kangana Ranaut', 'Alia Bhatt', 'A'),
(27,'Who played the role of Mauji in the movie Sui Dhaaga: Made in India?', 'Varun Dhawan', 'Ayushmann Khurrana', 'Ranveer Singh', 'Shahid Kapoor', 'A'),
(28,'Which Bollywood actor played the role of a wrestler in the movie Dangal?', 'Aamir Khan', 'Salman Khan', 'Shahrukh Khan', 'Hrithik Roshan', 'A'),
(29,'Who composed the music for the movie Dil Chahta Hai?', 'A.R. Rahman', 'Shankar-Ehsaan-Loy', 'Vishal-Shekhar', 'Pritam Chakraborty', 'B'),
(30,'Which movie won the Best Picture award at the 2021 Filmfare Awards?', 'Thappad', 'Chhichhore', 'Gully Boy', 'Kabir Singh', 'C'),
(31,'Which Bollywood actor played the role of M.S. Dhoni in the biopic M.S. Dhoni: The Untold Story?', 'Shah Rukh Khan', 'Hrithik Roshan', 'Sushant Singh Rajput', 'Ranveer Singh', 'C'),
(32,'In the movie Kabhi Khushi Kabhie Gham, what is the nickname of Shah Rukh Khan character Rahul?', 'Ra.One', 'Raj', 'Rahul Baba', 'Rocky', 'B'),
(33,'Which Bollywood actress played the role of a spy in the movie Ek Tha Tiger?', 'Katrina Kaif', 'Deepika Padukone', 'Priyanka Chopra', 'Anushka Sharma', 'A'),
(34,'Which Bollywood actor played the role of a visually impaired man in the movie Kaabil?', 'Hrithik Roshan', 'Ranbir Kapoor', 'Salman Khan', 'Shahid Kapoor', 'A'),
(35,'In the movie Dilwale Dulhania Le Jayenge, what is the name of Kajol''s character?', 'Simran', 'Anjali', 'Pooja', 'Naina', 'A'),
(36,'Who composed the music for the movie Dil Chahta Hai?', 'A.R. Rahman', 'Shankar-Ehsaan-Loy', 'Vishal-Shekhar', 'Jatin-Lalit', 'B'),
(37,'Which Bollywood actor played the role of a hockey player in the movie Chak De India!?', 'Shah Rukh Khan', 'Aamir Khan', 'Salman Khan', 'Akshay Kumar', 'A'),
(38,'In the movie Hum Aapke Hain Koun..! what is the name of Madhuri Dixit''s character?', 'Nisha', 'Pooja', 'Anjali', 'Radha', 'A'),
(39,'Who directed the movie Lagaan Once Upon a Time in India?', 'Sanjay Leela Bhansali', 'Ashutosh Gowariker', 'Karan Johar', 'Farhan Akhtar', 'B'),
(40,'Which Bollywood movie won the National Film Award for Best Popular Film Providing Wholesome Entertainment in 2019?', 'Andhadhun', 'Badhaai Ho', 'Padmaavat', 'Uri: The Surgical Strike', 'D');



select * from Bollywood where id = 40;