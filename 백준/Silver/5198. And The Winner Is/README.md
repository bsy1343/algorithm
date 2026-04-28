# [Silver I] And The Winner Is - 5198

[문제 링크](https://www.acmicpc.net/problem/5198)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 15, 맞힌 사람: 10, 정답 비율: 52.632%

### 분류

구현

### 문제 설명

<p>Finally, we must count the votes for the candidates, and determine the winners of the elections. But we must be careful, as people sometimes fill out ballots incorrectly, and such ballots must be discarded. You are to write software that correctly determines the winners of the elections.</p>

<p>Why multiple elections? Usually, on one ballot, there are many different votes you make, for senator, congressperson, district positions, and many others. Here, we assume that if the vote for any one of those categories is incorrect, then the entire ballot is discarded.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of the data set contains three numbers n, r, v, the number of candidates (between 1 and 100), the number of races (between 1 and 9), and the number of voters (between 1 and 10000). This is followed by n lines, describing the candidates. Each of these lines first contains a number between 1 and 9, which describes the race that this candidate is running in. This is followed by a single space, and then the name of the candidate. For each race, there will be at least one candidate in it.</p>

<p>The next v lines each describe a voter&rsquo;s vote. Each line is a sequence of exactly n characters, each of which is either x or #. An x in position j means that voter i voted for candidate j, and an # in position j means that voter i did not vote for candidate j. If a voter voted for more than one candidate in the same race, the entire ballot is discarded. On the other hand, if a voter did not vote for any candidate in a particular race, that&rsquo;s ok.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output all the candidates who were in first place (or tied for first place) in their race, in the order in which they appeared in the input file.</p>