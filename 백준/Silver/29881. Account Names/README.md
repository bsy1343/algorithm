# [Silver V] Account Names - 29881

[문제 링크](https://www.acmicpc.net/problem/29881)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 129, 정답: 126, 맞힌 사람: 112, 정답 비율: 97.391%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>John is preparing for the olympiad and needs a table listing the last name and the account name of each participant. He has a table listing the first name and the last name of each participant, and another one listing the first name and the account name of each participant. Looking at the data, John notices that all the $N$ first names are distinct, and so are all the $N$ last names and also all the $N$ account names.</p>

<p>Write a program to compile the table John needs.</p>

### 입력

<p>The first line contains an integer $N$, the number of participants ($1 \le N \le 20$).</p>

<p>Each of the following $N$ lines (starting from the second line) contains two space-separated strings: the first name and the last name of one participant.</p>

<p>Each of the following $N$ lines (starting from the line $N+2$) contains two space-separated strings: the first name and the account name of one participant.</p>

<p>Each name consists of 1 to 20 letters of the Latin alphabet. Usernames consist of lower-case letters only. Each first name and each last name starts with an upper-case letter, followed by lower-case letters only.</p>

### 출력

<p>Output exactly $N$ lines, one line for each participant. Each line should contain the last name and the account name of one participant, separated by a space. The lines may be in any order.</p>