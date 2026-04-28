# [Platinum III] maraton - 3166

[문제 링크](https://www.acmicpc.net/problem/3166)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 7, 맞힌 사람: 6, 정답 비율: 33.333%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 희소 배열

### 문제 설명

<p>N teams are participating in a football marathon. A total of K matches are to be played, one match at a time.&nbsp;</p>

<p>The first match is played between teams 1 and 2. After that match, the defeated team leaves the field while the winner stays and plays team 3. After that match, the winner again stays on the field and plays the team 4 etc.&nbsp;</p>

<p>After team N finishes playing its match, we start over with team 1, then team 2, and so on. If a team is supposed to enter the field, but it is already there (as the winner), or if it has just left the field (was defeated), the next team enters the field.&nbsp;</p>

<p>Because of the big differences between teams in the tournament, the results are very predictive, and for each two teams we know who will be the winner in a match between them.&nbsp;</p>

<p>Write a program that finds the total number of matches that each of the teams will play.&nbsp;</p>

### 입력

<p>The first line of input contains two integers N and K, 3 &le; N &le; 1000, 0 &le; K &le; 10<sup>14</sup>.&nbsp;</p>

<p>Each of the following N lines contains sequence of N integers representing the NxN matrix consisting only of zeros and ones.&nbsp;</p>

<p>If A<sub>ij</sub> is 1 in the matrix, then team i defeats team j every time they play and if A<sub>ij</sub>=0 then team j defeats team i (A<sub>ij</sub> &ne; A<sub>ji</sub>).&nbsp;</p>

### 출력

<p>The first and only line of output should contain N numbers &ndash; the i<sup>th</sup> number is the total number of matches that team i will play in the tournament.&nbsp;</p>

<p>Note: use the 64-bit signed integer type (int64 in Pascal, long long in C/C++).&nbsp;</p>