# [Bronze I] Application List - 32903

[문제 링크](https://www.acmicpc.net/problem/32903)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 112, 정답: 94, 맞힌 사람: 83, 정답 비율: 84.694%

### 분류

구현, 문자열, 사칙연산, 수학

### 문제 설명

<p>In a distant land, there lived a wise elder who was the keeper of all computer programs that ever existed. One day, the ruler of the land decreed to create a list all the programs, and the elder decided to do it by creating an Application List that would display the presence or absence of various applications.</p>

<p>He turned to you for help in this important task. You are given a list of programs with names consisting of lowercase English letters.</p>

<p>Your task is to fill a table of five rows and six columns. The first 26 cells of the table correspond to letters "<code>a</code>", "<code>b</code>", ..., "<code>z</code>" in alphabetic order. The last four cells are empty. Each cell contains the corresponding letter if there is at least one program in the list whose name starts with that letter. If there are no such programs, a dot should be placed instead.</p>

### 입력

<p>The first line contains an integer $n$: the number of programs ($0 \le n \le 100$). Next, there are $n$ lines listing the program names. Each name contains from $1$ to $20$ lowercase English letters.</p>

### 출력

<p>Output the Application List in the format described above: five lines with letters and dots, without spaces between them. The first four lines must contain six characters each. The last line must contain two characters.</p>