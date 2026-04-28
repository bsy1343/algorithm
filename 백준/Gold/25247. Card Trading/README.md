# [Gold V] Card Trading - 25247

[문제 링크](https://www.acmicpc.net/problem/25247)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 29, 맞힌 사람: 29, 정답 비율: 46.774%

### 분류

구현, 시뮬레이션, 누적 합, 두 포인터

### 문제 설명

<p>Recently, I got into playing the trading card game <em>Wizardry -- The Meeting</em>. And since I really wanted to build an awesome deck, I decided to search online for only the best cards. It turns out most of those cards are quite expensive and can only be acquired by insane luck, when purchasing a random set of cards, or by bidding in online auctions. As auctions are a huge time sink and I really rather wanted to play instead of bidding the whole day, I came up with a different idea: A trading card marketplace.</p>

<p>Each card type is produced in bulk, so a buyer does not really care from which seller they buy a specific card. Therefore, the idea is to create one web page for each card type and users can set buy and sell offers. Take the card &quot;Green Mana&quot; for instance. If you wanted to buy one, you could create a <em>buy offer</em>, e.g. for $10.00$&euro;. This offer means that you are willing to buy the card for $10.00$&euro; or less (if there is a seller for less). On the other hand, if you wanted to sell one &quot;Green Mana&quot; card, you could create a <em>sell offer</em>, e.g. for $12.01$&euro;. This offer means you are willing to sell your card for $12.01$&euro; or more (if there is a buyer for more).</p>

<p>Now, every couple of seconds, the website automatically calculates a card price based on both types of offers. It then considers only those offers that are compatible with this price (as described above) and satisfies as many of those as possible.</p>

<p>As an aspiring entrepreneur, I decided that I deserve a cut of every sale happening on the website. But I have a little trouble to come up with an algorithm that determines the price such that the <em>turnover</em>, i.e. the price times the number of successful sales, is as high as possible (which would mean my cut being as high as possible).</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with one integer $n$ ($1 \le n \le 10^{5}$), the number of different prices at which offers exist.</li>
	<li>$n$ lines, each containing one real number $p$ and two integers $b$ and $s$ ($0 &lt; p \le 10^{4}, 0 \le b,s \le 10^{6}$), the price of the offers with exactly two decimal places, the number of buy offers at this price and the number of sell offers at this price.</li>
</ul>

<p>It is guaranteed that each price in the input has at least one buy or sell offer and that no price appears more than once.</p>

### 출력

<p>If no price exists, such that at least one sale occurs, output &quot;<code>impossible</code>&quot;. Otherwise, output the price resulting in the highest turnover and that turnover itself. If multiple such prices exist, output any. Output both numbers to <em>exactly</em> two decimal places.</p>

### 힌트

<p>In the second sample case, the optimal card price is $5.26$&euro;, as it results in the highest possible turnover of $21.04$&euro;, with four sales happening. In total, there are five buyers willing to pay at least $5.26$&euro;: Three are willing to pay exactly $5.26$&euro;, one is willing to pay $6.17$&euro; and one is even willing to pay $21.04$&euro;. On the other hand, there are just four sellers willing to part with their card at $5.26$&euro;: Three at exactly this price and one would already be happy with $4.50$&euro;.</p>

<p>Note that there is an alternative solution: at a card price of $21.04$&euro;, there will be exactly one sale, resulting in the same optimal turnover.</p>