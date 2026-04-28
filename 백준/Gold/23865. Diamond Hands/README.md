# [Gold III] Diamond Hands - 23865

[문제 링크](https://www.acmicpc.net/problem/23865)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 8, 맞힌 사람: 8, 정답 비율: 44.444%

### 분류

해 구성하기, 구현, 시뮬레이션

### 문제 설명

<p>The &quot;Diamond Hands&quot; corporation has a long and eventful history. Starting from its foundation, they had a lot of successful and unsuccessful days. For simplicity, let&#39;s consider a day successful if its stock price increased by one (in abstract units). Similarly, we consider a day unsuccessful if its stock price decreased by one. As it often happens, successful days come in long streaks, as do unsuccessful days. There is no middle ground: every day is either successful or unsuccessful.</p>

<p>You would like to figure out which days were successful and unsuccessful for the corporation. To accomplish it, you obtained the historical stock price data: $n$ pairs &nbsp;$(d_i, p_i)$, meaning that after $d_i$ days after issuing stock the difference with the starting stock price was $p_i$ units ($p_i$ can be an arbitrary integer, including any negative number).</p>

<p>Represent the corporation&#39;s history with the <strong>minimum</strong> number of successful or unsuccessful day streaks, or report that data contains an error and it&#39;s impossible to achieve it. If there are multiple possible answer with the minimum number of streaks, output any one of them.</p>

### 입력

<p>The first line of the input contains an integer $n$ ($1 \le n \le 200\,000$). Next $n$ lines contain a pair of integers $d_i \; p_i$ each ($1 \le d_i \le 10^8$; $-10^8 \le p_i \le 10^8$; $d_i &lt; d_{i+1}$ for all $i$ from $1$ to $n - 1$).&nbsp;</p>

### 출력

<p>If there are errors in the historical stock price data, output $-1$. Otherwise, print $k$, the number of streaks, in the first line. Next, print $k$ lines describing successful or unsuccessful streaks. Each line should contain a pair $l_i \; c_i$ ($1 \le l_i \le 10^8$; $c_i \in \{\texttt{+}, \texttt{-}\}$), meaning that the next streak lasted for $l_i$ days, and was successful if $c_i = \texttt{+}$, or unsuccessful if $c_i = \texttt{-}$.</p>

<p>The description of streaks must be done in chronological order, starting from the day stock was issued and ending on day $d_n$. This means that the sum of all $l_i$ must be equal to $d_n$.</p>

### 힌트

<p>In the first example, first three days are successful, so after 2 days the difference is 2, and after 3 days the difference is 3. Next three days are unsuccessful, so after 5 days the difference becomes 1, and after 6 days the stock price is back to the initial value. The last seventh day is successful, so the final difference after 7 days is 1.</p>