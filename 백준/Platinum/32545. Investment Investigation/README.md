# [Platinum III] Investment Investigation - 32545

[문제 링크](https://www.acmicpc.net/problem/32545)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 15, 맞힌 사람: 11, 정답 비율: 78.571%

### 분류

값 / 좌표 압축, 구현, 세그먼트 트리, 시뮬레이션, 우선순위 큐, 자료 구조, 집합과 맵

### 문제 설명

<p>To make some extra money on the side, you have recently started running your own cryptocurrency exchange, where people can trade their Budget Amplifying Profit Coin (BAPC). It is quickly gaining popularity, however, this has also resulted in government regulators asking some questions... As part of their investigation, they have asked for a list of all transactions that have been made via your exchange. You have never bothered to keep track of this, but luckily, you still have the list of all orders that were made since the start of the exchange.</p>

<p>The exchange operates by keeping a list of outstanding buy and sell orders, each with a price and an amount. Whenever a <em>normal</em> order comes in, it is checked whether the new lowest sell price is less than or equal to the highest buy price. If this is the case, a transaction is made between the sell order with the lowest price and the buy order with the highest price, such that at least one of these orders is completely fulfilled. In case of a tie in price, older orders are fulfilled first. This is repeated until the lowest sell price is strictly larger than the highest buy price.</p>

<p>If instead a <em>Fill-or-Kill</em> (FoK) buy order comes in, there must currently be enough outstanding sell orders with a price of at most the offered price to completely fulfil this order. If there are, the order will be fulfilled in the same way as a normal order. Otherwise, the order is completely cancelled, without any transaction taking place. Note that multiple orders may be used to complete a FoK order, as long as it happens immediately.</p>

<p>FoK sell orders are processed in a similar way, but then there should be sufficient outstanding buy orders with a price of at least the asked price.</p>

<p>As an example, consider the first sample case. The six orders are handled as follows:</p>

<ol>
	<li>The first order is added to the list of outstanding orders.</li>
	<li>The second order is partially fulfilled by selling $10$ BAPC to the first order. This removes the first order from the list of outstanding orders, and adds the remainder of the second order (consisting of $10$ BAPC) to this list.</li>
	<li>The third order is added to the list of outstanding orders.</li>
	<li>The fourth order is a FoK buy order that cannot be immediately fulfilled, so it is ignored. It is not added to the list of outstanding orders.</li>
	<li>The fifth order can be immediately fulfilled by first buying $10$ BAPC from order $2$ and then buying $50$ BAPC from order $3$. The resulting list of outstanding orders only consists of the remaining $8$ BAPC of order $3$.</li>
	<li>The sixth order is added to the list of outstanding orders.</li>
</ol>

<p>Given a list of all orders in the order that they have been made, create a list of all transactions that have been performed by your exchange.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1 \leq n \leq 10^5$), the number of orders.</li>
	<li>$n$ lines, each describing an order:
	<ul>
		<li>A string $s$, either "<code>buy</code>" or "<code>sell</code>", the side of the order.</li>
		<li>A string $t$, either "<code>normal</code>" or "<code>fok</code>", the type of the order.</li>
		<li>An integer $p$ ($1 \leq p \leq 10^9$), the offered or asked price per BAPC.</li>
		<li>An integer $a$ ($1 \leq a \leq 10^9$), the amount of BAPC being asked or offered.</li>
	</ul>
	</li>
</ul>

### 출력

<p>The output consists of the number of performed transactions, and then for each transaction, in the order that they have been performed:</p>

<ul>
	<li>The index of the corresponding "<code>sell</code>" order.</li>
	<li>The index of the corresponding "<code>buy</code>" order.</li>
	<li>The amount of BAPC being traded.</li>
</ul>

<p>Here, the index of an order is its position in the input, where the first order has index $1$.</p>