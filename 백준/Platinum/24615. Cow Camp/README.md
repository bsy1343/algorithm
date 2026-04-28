# [Platinum II] Cow Camp - 24615

[문제 링크](https://www.acmicpc.net/problem/24615)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 37, 맞힌 사람: 33, 정답 비율: 61.111%

### 분류

수학, 누적 합, 조합론, 매개 변수 탐색, 확률론

### 문제 설명

<p>To qualify for cow camp, Bessie needs to earn a good score on the last problem of the USACOW Open contest. This problem has $T$ distinct test cases ($2\le T\le 10^3$) weighted equally, with the first test case being the sample case. Her final score will equal the number of test cases that her last submission passes.</p>

<p>Unfortunately, Bessie is way too tired to think about the problem, but since the answer to each test case is either &quot;yes&quot; or &quot;no,&quot; she has a plan! Precisely, she decides to repeatedly submit the following nondeterministic solution:</p>

<pre>
if input == sample_input:
  print sample_output
else:
  print &quot;yes&quot; or &quot;no&quot; each with probability 1/2, independently for each test case
</pre>

<p>Note that for all test cases besides the sample, this program may produce a different output when resubmitted, so the number of test cases that it passes will vary.</p>

<p>Bessie knows that she cannot submit more than $K$ ($1\le K\le 10^9$) times in total because then she will certainly be disqualified. What is the maximum possible expected value of Bessie&#39;s final score, assuming that she follows the optimal strategy?</p>

### 입력

The only line of input contains two space-separated integers $T$ and $K.$

### 출력

The answer as a decimal that differs by at most $10^{-6}$ absolute or relative
error from the actual answer.