# [Gold IV] Elder price robot - 24241

[문제 링크](https://www.acmicpc.net/problem/24241)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 81, 정답: 36, 맞힌 사람: 26, 정답 비율: 39.394%

### 분류

자료 구조, 스택

### 문제 설명

<p>The idea behind your latest business adventure, BarGain Overview (BGO), is to collect the history of prices for a certain item that is available for sale on the web. The <em>BarGain score</em> of a particular day is defined as the number of days since the price was lower or equal to today&#39;s price. The worst BarGain score is thus $1$, and if the price is strictly better than all previous prices ever recorded, then it is <code>infinity</code>. You want to report the BarGain score to your customers to help them identify a good buy.</p>

### 입력

<p>The first line of input contains a single integer $2 \leq n \leq 400\,000$, the number of days for which you have collected price data for the item. On the second line of input follows $n$ space-separated integers $p_1, p_2, \ldots, p_{n}$, where $0 \leq p_i \leq 10^6$ is the price of the item $i-1$ days ago. Today&#39;s price is $p_1$.</p>

### 출력

<p>Output $n$ rows, one for each day you have collected price data for the item. On the $i^{\text{th}}$ such line, output the BarGain score for the day that was $i-1$ days ago.</p>