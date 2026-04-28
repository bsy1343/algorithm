# [Gold IV] BUY LOW, BUY LOWER - 27083

[문제 링크](https://www.acmicpc.net/problem/27083)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 18, 맞힌 사람: 17, 정답 비율: 36.957%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The advice to &quot;buy low&quot; is half the formula to success in the bovine stock market.To be considered a great investor you must also follow this problems&#39; advice:</p>

<pre>
&quot;Buy low; buy lower&quot;</pre>

<p>Each time you buy a stock, you must purchase it at a lower price than the previous time you bought it. The more times you buy at a lower price than before, the better! Your goal is to see how many times you can continue purchasing at ever lower prices.</p>

<p>You will be given the daily selling prices of a stock (positive 16-bit integers) over a period of time. You can choose to buy stock on any of the days. Each time you choose to buy, the price must be strictly lower than the previous time you bought stock. Write a program which identifies which days you should buy stock in order to maximize the number of times you buy.</p>

<p>Here is a list of stock prices:</p>

<pre>
 Day   1  2  3  4  5  6  7  8  9 10 11 12
Price 68 69 54 64 68 64 70 67 78 62 98 87</pre>

<p>The best investor (by this problem, anyway) can buy at most four times if each purchase is lower then the previous purchase. One four day sequence (there might be others) of acceptable buys is:</p>

<pre>
Day    2  5  6 10
Price 69 68 64 62</pre>

### 입력

<ul>
	<li>Line 1: N (1 &le; N &le; 5000), the number of days for which stock prices are given</li>
	<li>Lines 2..etc: A series of N space-separated integers, ten per line except the final line which might have fewer integers.</li>
</ul>

### 출력

<p>Two integers on a single line:</p>

<ul>
	<li>The length of the longest sequence of decreasing prices</li>
	<li>The number of sequences that have this length (guaranteed to fit in 31 bits)</li>
</ul>

<p>In counting the number of solutions, two potential solutions are considered the same (and would only count as one solution) if they repeat the same string of decreasing prices, that is, if they &quot;look the same&quot; when the successive prices are compared. Thus, two different sequence of &quot;buy&quot; days could produce the same string of decreasing prices and be counted as only a single solution.</p>