# [Platinum II] School Pairing - 15192

[문제 링크](https://www.acmicpc.net/problem/15192)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 46, 정답: 1, 맞힌 사람: 1, 정답 비율: 12.500%

### 분류

자료 구조, 집합과 맵, 오프라인 쿼리, mo's

### 문제 설명

<p>The school of Auckbury has one of the highest admission rates in the world. In some years its annual enrolment almost reached one million! This school highly values the ability to succeed at programming competitions, and therefore on admission each student is graded on how well they can compete. The grade is an integer in the range &minus;10<sup>9</sup> to 10<sup>9</sup>.&nbsp;</p>

<p>Each year, the newly admitted students are assigned a number from 1 to N, where N is the number of students admitted that year. This is so the new students can easily be identified for the &ldquo;Freshman competitions&rdquo;. These competitions are held very frequently throughout the year and only apply to the recently admitted. When a competition occurs, the staff computer will generate two numbers between 1 and N, representing student numbers.</p>

<p>The competition then proceeds by students between these two inclusively getting into teams of two, if possible, to compete against other teams. However, the principal prides himself for how fair he is and therefore will only allow a team of two to compete if the team has a joint skill level (by summing the two) equal to K, which is determined at the start of each day.</p>

<p>Given the M competitions held each year, the principal would like to know how many teams can be formed between the two numbers generated.</p>

### 입력

<p>Input will begin with a line containing three integers, N, M and K. 1 &le; N,M,K &le; 10<sup>6</sup></p>

<p>Following this will be a line containing all the N students skill levels. &minus;10<sup>9</sup> &le; N<sub>i</sub> &le; 10<sup>9</sup></p>

<p>Followed by M pairs of student numbers i and j, 1 &le; i,j &le; N representing the two numbers generated.&nbsp;</p>

<p>Input will contain many test cases, representing each competition, the last case being denoted by N, M and K all being 0.</p>

### 출력

<p>Output the number of distinct teams of students that form a total skill level of K between each pair of student numbers in order of queries received. After each test case print a blank line.</p>

### 힌트

<p>There are four students lined up on the field, and the principal wishes teams to have a combined skill level of 5. He first points at the first and fourth student, encompassing all four inclusively. There exists one team in this range, consisting of the first two students which has a combined skill of 5. He then points at the third and fourth students, between which there exists no team of two with a total skill of 5.</p>