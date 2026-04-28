# [Silver III] SGA President - 25873

[문제 링크](https://www.acmicpc.net/problem/25873)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 19, 맞힌 사람: 18, 정답 비율: 72.000%

### 분류

조합론, 자료 구조, 해시를 사용한 집합과 맵, 수학, 집합과 맵

### 문제 설명

<p>After an amazing performance at World Finals, Timothy and Alex, who are no longer eligible for ICPC, have decided to look for a new challenge. They&#39;d like to run for SGA President and Vice President. Unfortunately, they have realized that with tickets from the previous election such as Josh/Jad and Brad/Breon, they have no hope of winning because all winning tickets must have two distinct names that start with the same first letter, so Timothy and Alex just won&#39;t do.</p>

<p>Naturally, Timothy was despondent about this revelation and to make himself feel better came up with a problem for locals. Given the names of each student at UCF, Timothy wondered how many potential winning pairs for SGA President and Vice-President there might be. In order for a pair to have the potential to win, their names must be different but start with the same first letter. Since President and Vice President are different roles, we count the ticket of Josh and Jad differently than the ticket of Jad and Josh. (The first name listed is the candidate for President while the second name listed is the corresponding candidate for Vice President.) Note that UCF has many students that share a first name, so there might be several potential winning pairs of Josh and Jad. For example, if there are 10 Joshes and 3 Jads on campus, there are 30 Josh/Jad pairs with a Josh running for President and a Jad running for Vice President (and these should all be counted).</p>

<p>Given the names of each UCF student, calculate the number of possible President/Vice-President pairs who have a potential to win the SGA election.</p>

### 입력

<p>The first line of input contains a single positive integer, n (n &le; 66,183), representing the number of UCF students. The following n lines each contain a single first name of one UCF student. All names will consist of uppercase letters only and be between 1 and 20 letters long, inclusive. Each line represents a distinct student, but distinct students may have the same first name.</p>

### 출력

<p>On a line by itself, output the total number of President-Vice President pairs that have a chance to win the SGA election.</p>