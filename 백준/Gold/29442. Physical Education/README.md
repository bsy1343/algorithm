# [Gold II] Physical Education - 29442

[문제 링크](https://www.acmicpc.net/problem/29442)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 11, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>There is a physical education lesson in the school. Unfortunately, there are a lot of classes, but only one teacher. So, $n$ classes have the lesson together. Students in every class form a row. In each row girls and boys are mixed.</p>

<p>It is inconvenient to conduct a lesson for the set of rows, so the teacher decided to combine all rows in one. He can take two rows and place all students from one of them at the end of another, so it will be one long row. It is not allowed to change the order of students inside rows.</p>

<p>After the teacher forms one single row, the students are divided into two groups as follows. The students say in the order they appear in the row : &quot;First&quot;, &quot;Second&quot;, &quot;First&quot;, &quot;Second&quot;, etc. So the students who stand on odd places form the &quot;First&quot; group, and students who stand on even places form the &quot;Second&quot; group. The &quot;First&quot; group go to play football and a &quot;Second&quot; group go to play volleyball.</p>

<p>Boys like to play football, and girls don&#39;t. Therefore, the teacher wants to arrange students in such a way so the number of boys playing football will be as large as possible. Help him find the maximum number of boys that can go play football.</p>

### 입력

<p>The first line of input contains one integer number $n$ ($1 \le n \le 100,000$) --- the number of classes.</p>

<p>The next $n$ lines contain descripions of initial rows. Each line is a string of letters  <code>B</code> and <code>G</code>. The letter  <code>B</code> means a boy, and the letter <code>G</code> means a girl. The first letter in a string corresponds to the first student in a row. Each row is not empty and contains at most $100$ letters.</p>

<p>The total number of students does not exceed $10^6$.</p>

### 출력

<p>Output single integer number --- the maximum possible number of boys playing football. </p>

### 힌트

<p>In the sample above, it is not possible for all boys to play football in the same time, but if we arrange the rows as follows: <code>BGG</code>, <code>BB</code>, <code>GG</code>, <code>GBG</code>, then three of four boys will play football.</p>