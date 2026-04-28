# [Bronze II] ICPC Score Totalizer Software - 4974

[문제 링크](https://www.acmicpc.net/problem/4974)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 228, 정답: 201, 맞힌 사람: 178, 정답 비율: 89.447%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>The International Clown and Pierrot Competition (ICPC), is one of the most distinguished and also the most popular events on earth in the show business.</p>

<p>One of the unique features of this contest is the great number of judges that sometimes counts up to one hundred. The number of judges may differ from one contestant to another, because judges with any relationship whatsoever with a specific contestant are temporarily excluded for scoring his/her performance.</p>

<p>Basically, scores given to a contestant&#39;s performance by the judges are averaged to decide his/her score. To avoid letting judges with eccentric viewpoints too much influence the score, the highest and the lowest scores are set aside in this calculation. If the same highest score is marked by two or more judges, only one of them is ignored. The same is with the lowest score. The average, which may contain fractions, are truncated down to obtain final score as an integer.</p>

<p>You are asked to write a program that computes the scores of performances, given the scores of all the judges, to speed up the event to be suited for a TV program.</p>

### 입력

<p>The input consists of a number of datasets, each corresponding to a contestant&#39;s performance. There are no more than 20 datasets in the input.</p>

<p>A dataset begins with a line with an integer n, the number of judges participated in scoring the performance (3 &le; n &le; 100). Each of the n lines following it has an integral score s (0 &le; s &le; 1000) marked by a judge. No other characters except for digits to express these numbers are in the input. Judges&#39; names are kept secret.</p>

<p>The end of the input is indicated by a line with a single zero in it.</p>

### 출력

<p>For each dataset, a line containing a single decimal integer indicating the score for the corresponding performance should be output. No other characters should be on the output line.</p>