# [Bronze II] Grid Pattern - 14539

[문제 링크](https://www.acmicpc.net/problem/14539)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 254, 정답: 164, 맞힌 사람: 141, 정답 비율: 63.229%

### 분류

구현, 문자열

### 문제 설명

<p>Games that are commonly found in the Unix System during the 70s and 80s are design in text mode. Grid is the basic layout for many of these games where pieces or items are positioned in rows and columns. Classic examples would be tic-tac-toe, chess and minesweeper. You are to design a simple text-based grid layout engine that can be used in the games.</p>

<p>Given specified dimensions, print a text-based grid pattern. Use the | (pipe) sign to print vertical elements, the &ndash; (minus) to print horizontal ones and + (plus) for crossing. The rest of the spaces are filled with * (asterisk).</p>

### 입력

<p>The first line of input contains a positive integer <em>N</em> (<em>N</em> &le; 100) which indicates the number of test cases. Each of the following <em>N</em> lines contains four positive integers: <em>row</em> &ndash; the number of rows, <em>col</em> &ndash; the number of columns, <em>w</em> and <em>h</em> &ndash; the width and height of the single grid respectively. (1 &le; <em>row</em>, <em>col</em> &le; 10; 1 &le;&nbsp; <em>w</em>, <em>h</em> &le; 5 )</p>

### 출력

<p>For each test case, output a line in the format &quot;Case #x:&quot; where x is the case number (starting from 1), follow by the grid pattern as shown in the sample output.</p>