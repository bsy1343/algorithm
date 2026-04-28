# [Gold III] Gerrymandering - 5194

[문제 링크](https://www.acmicpc.net/problem/5194)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 16, 맞힌 사람: 8, 정답 비율: 44.444%

### 분류

애드 혹, 다이나믹 프로그래밍, 정렬

### 문제 설명

<p>Gerrymandering is the technique of assigning electoral districts so as to favor one party over another. Originally, voting districts were supposed to be reviewed on a once-a-decade basis so as to ensure roughly equal representation among voters. Nowadays, the party in power often seems to consider redistricting a useful tools for ensuring that it gets more seats in future elections. Of course, this tends to completely contradict the original intent, in that many voters are in fact disenfranchised by this redistricting. But hey, one does what one can for winning in an election, right?</p>

<p>Of course, in order to gerrymander well, one needs a computer program to produce the best voting districts. The fact that these districts don&rsquo;t tend to look all that &ldquo;natural&rdquo; won&rsquo;t matter. In our case, we assume that there are a number of voting precincts, which are to be divided into two districts. The program is to find out if a particular party can make sure to win both districts, one district, or no district. Of course, each voting district will have to contain at least one precinct, but the two district don&rsquo;t need to contain the same (or even nearly the same) number of precincts.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of each data set contains one number n, between 1 and 100, the number of precincts. This is followed by n lines, each describing one precinct i by giving two numbers pi and qi, the number of voters likely to vote for the two parties P and Q. These numbers are between 0 and 1000.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the maximum number of districts (0, 1, or 2) that party P can win with optimal gerrymandering.</p>