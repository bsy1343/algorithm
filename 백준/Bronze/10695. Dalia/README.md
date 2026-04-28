# [Bronze III] Dalia - 10695

[문제 링크](https://www.acmicpc.net/problem/10695)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 553, 정답: 399, 맞힌 사람: 351, 정답 비율: 72.074%

### 분류

수학, 구현

### 문제 설명

<p>The ICPC community feels like an extended family across the world; one of the things that deepens that feeling is when the contest organizers, judges and coaches bring their families with them to the contest sites, so it is not unusual to find children on the contest sites. In the 2013 ICPC, one of the kids who attended was Mohamed, Dalia El-Hefny&rsquo;s (member in the fund raising team in the ACPC and a very close friend to Fegla since 1998) young son. While wandering around the IBM Chill Zone he happened to come across people playing chess and asked them to teach him how to play, so one of them gave him an introductory book about chess.</p>

<p>One of the sections in that book discussed the knight piece and it is complex movements. In an attempt to teach the reader, the book had many pages where it states a starting position for a knight on a very large board and states an ending position, and asks the reader to decide if the knight can reach the ending position from the starting position after exactly one move. Since you are a smart programmer, Mohamed has asked you to help him to solve the questions in the book.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100). Followed by T lines, each test case is a single line containing 5 integers, n, r1, c1, r2, c2. The chess board is of size n * n (2 &le; n &le; 10<sup>9</sup>). (r1,c1) is the starting position of the knight and (r2,c2) is the ending position. (1 &le; r1, c1, r2, c2 &le; n)</p>

### 출력

<p>For each test case print a single line containing &ldquo;Case n:&rdquo; (without the quotes) where n is the test case number (starting from 1) followed by a space then &ldquo;YES&rdquo; (without the quotes) if the knight can reach the ending position after making exactly one move or &ldquo;NO&rdquo; (without the quotes) if he can not.</p>

### 힌트

<p>A knight in position (r,c) (r is the row number, and c is the column number, the rows are numbered from 1 to n from the top to the bottom and the columns are numbered from 1 to n from the left to the right) on a chessboard, can move only to one of 8 possible other positions (if that position is within the chess board): (r-1 , c+2) (r-1 , c-2) , (r+1 , c+2) , (r+1 , c-2) , (r-2 , c+1) , (r-2 , c-1) , (r+2 , c+1) , (r+2 , c-1)</p>

<p>About the IBM Chill Zone &ldquo;a relaxing, fun way to unwind nightly with old and new friends at the ACMICPC World Finals is to stop by the IBM Chill Zone! A great way to participate in interactive games and interesting conversation with innovative IBMers and attendees from all over the world, the IBM Chill Zone is always a favorite for all.&rdquo;</p>