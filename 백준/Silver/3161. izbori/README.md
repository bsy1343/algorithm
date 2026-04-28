# [Silver III] izbori - 3161

[문제 링크](https://www.acmicpc.net/problem/3161)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 134, 정답: 81, 맞힌 사람: 79, 정답 비율: 68.103%

### 분류

구현

### 문제 설명

<p>Presidential elections are underway in a small country. There are a total of M citizens choosing between N candidates labeled 1 to N.&nbsp;</p>

<p>Each voter fills his ballot by listing all the candidates in order of preference &ndash; they put their favorite candidate in the first place, the second one in the second place, &hellip;, the least favored candidate in the last place.&nbsp;</p>

<p>We say that candidate A defeated candidate B if the number of voters that put candidate A in front of candidate B is greater than the number of voters that put candidate B in front of candidate A. For a candidate A we define his score as the total number of candidates he defeated. We say that a candidate is a winner of the elections if his score is greater than or equal to the score of every other candidate.&nbsp;</p>

<p>Write a program that, given the votes of the citizens, finds the winner (or winners) of the elections.&nbsp;</p>

### 입력

<p>The first line of input contains two integers M and N, 1 &le; M,N &le; 50, M is odd.&nbsp;</p>

<p>Each of the next M lines contains sequence of N numbers, the contents of each citizen&#39;s ballot.&nbsp;</p>

### 출력

<p>If there is only one winner, output his label on the first and only line.&nbsp;</p>

<p>If there are more winners, output their labels in arbitrary order, each label in its own line.&nbsp;</p>