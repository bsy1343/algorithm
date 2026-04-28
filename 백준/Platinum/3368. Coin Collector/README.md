# [Platinum IV] Coin Collector - 3368

[문제 링크](https://www.acmicpc.net/problem/3368)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 22, 맞힌 사람: 21, 정답 비율: 63.636%

### 분류

그리디 알고리즘

### 문제 설명

<p>In a certain country, there are N denominations of coins in circulation, including the 1-cent coin. Additionally, there&rsquo;s a bill whose value of K cents is known to exceed any of the coins. There&rsquo;s a coin collector who wants to collect a specimen of each denomination of coins. He already has a few coins at home, but currently he only carries one K-cent bill in his wallet. He&rsquo;s in a shop where there are items sold at all prices less than K cents (1 cent, 2 cents, 3 cents, &hellip; , K &iacute; 1 cents). In this shop, the change is given using the following algorithm:</p>

<ol>
	<li>Let the amount of change to give be A cents.</li>
	<li>Find the highest denomination that does not exceed A. (Let it be the B-cent coin.)</li>
	<li>Give the customer a B-cent coin and reduce A by B.</li>
	<li>If A = 0, then end; otherwise return to step 2.</li>
</ol>

<p>The coin collector buys one item, paying with his K-cent bill.</p>

<p>Your task is to write a program that determines:</p>

<ul>
	<li>How many different coins that the collector does not yet have in his collection can he acquire with this transaction?</li>
	<li>What is the most expensive item the store can sell him in the process?</li>
</ul>

### 입력

<p>The first line of the input file contains the integers N (1 &le; N &le; 500 000) and K (2 &le; K &le; 1 000 000 000). The following N lines describe the coins in circulation. The (i + 1)-th line contains the integers c<sub>i</sub> (1 &le; c<sub>i</sub> &lt; K) and d<sub>i</sub>, where c<sub>i</sub> is the value (in cents) of the coin, and d<sub>i</sub> is 1, if the collector already has this coin, or 0, if he does not. The coins are given in the increasing order of values, that is, c<sub>1</sub> &lt; c<sub>2</sub> &lt; &hellip; &lt; c<sub>N</sub>. The first coin is known to be the 1-cent coin, that is, c<sub>1</sub> = 1.</p>

### 출력

<p>The first line of the output file should contain a single integer &mdash; the maximal number of denominations that the collector does not yet have, but could acquire with a single purchase. The second line of the output file should also contain a single integer &mdash; the maximal price of the item to buy so that the change given would include the maximal number of new denominations, as declared on the first line.</p>