# [Platinum V] Hell on the Markets - 3567

[문제 링크](https://www.acmicpc.net/problem/3567)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 20, 맞힌 사람: 17, 정답 비율: 56.667%

### 분류

그리디 알고리즘

### 문제 설명

<p>Most financial institutions had become insolvent during financial crisis and went bankrupt or were bought by larger institutions, usually by banks. By the end of financial crisis of all the financial institutions only two banks still continue to operate. Financial markets had remained closed throughout the crisis and now regulators are gradually opening them. To prevent speculation and to gradually ramp up trading they will initially allow trading in only one financial instrument and the volume of trading will be limited to $i$ contracts for $i$-th minute of market operation.</p>

<p>Two banks had decided to cooperate with the government to kick-start the market operation. The boards of directors had agreed on trading volume for each minute of this first trading session. One bank will be buying $a_i$ contracts ($1 \le a_i \le i$) during $i$-th minute ($1 \le i \le n$), while the other one will be selling. They do not really care whether to buy or to sell, and the outside observer will only see the volume $a_i$ of contracts traded per minute. However, they do not want to take any extra risk and want to have no position in the contract by the end of the trading session. Thus, if we define $b_i = 1$ when the first bank is buying and $b_i = -1$ when the second one is buying (and the first one is selling), then the requirement for the trading session is that $\sum_{i=1}^{n}{a_ib_i} = 0$.</p>

<p>Your lucky team of three still works in the data center (due to the crisis, banks now share the data center and its personnel) and your task is to find such $b_i$ or to report that this is impossible.</p>

### 입력

<p>The first line of the input file contains the single integer number $n ($1 \le n \le 100 000$).</p>

<p>The second line of the input file contains $n$ integer numbers &mdash; $a_i$ ($1 \le a_i \le i$).</p>

### 출력

<p>The first line of the output file must contain &ldquo;<code>Yes</code>&rdquo; if the trading session with specified volumes is possible and &ldquo;<code>No</code>&rdquo; otherwise. In the former case the second line must contain $n$ numbers &mdash; $b_i$.</p>