# [Silver II] Stock Prices - 3668

[문제 링크](https://www.acmicpc.net/problem/3668)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 62, 정답: 37, 맞힌 사람: 30, 정답 비율: 58.824%

### 분류

자료 구조, 우선순위 큐

### 문제 설명

<p>In this problem we deal with the calculation of stock prices. You need to know the following things about stock prices:</p>

<ul>
	<li>The ask price is the lowest price at which someone is willing to sell a share of a stock.</li>
	<li>The bid price is the highest price at which someone is willing to buy a share of a stock.</li>
	<li>The stock price is the price at which the last deal was established.</li>
</ul>

<p>Whenever the bid price is greater than or equal to the ask price, a deal is established. A buy order offering the bid price is matched with a sell order demanding the ask price, and shares are exchanged at the rate of the ask price until either the sell order or the buy order (or both) is fulfilled (i.e., the buyer wants no more stocks, or the seller wants to sell no more stocks). You will be given a list of orders (either buy or sell) and you have to calculate, after each order, the current ask price, bid price and stock price.</p>

### 입력

<p>On the first line a positive integer: the number of test cases, at most 100. After that per test case:</p>

<ul>
	<li>One line with an integer n (1 &le; n &le; 1 000): the number of orders.</li>
	<li>n lines of the form &ldquo;order type x shares at y&rdquo;, where order type is either &ldquo;buy&rdquo; or &ldquo;sell&rdquo;, x (1 &le; x &le; 1 000) is the number of shares of a stock someone wishes to buy or to sell, and y (1 &le; y &le; 1 000) is the desired price.</li>
</ul>

### 출력

<p>Per test case:</p>

<ul>
	<li>n lines, each of the form &ldquo;a<sub>i</sub> b<sub>i</sub> s<sub>i</sub>&rdquo;, where a<sub>i</sub>, b<sub>i</sub> and s<sub>i</sub> are the current ask, bid and stock prices, respectively, after the i-th order has been processed and all possible deals have taken place. Whenever a price is not defined, output &ldquo;-&rdquo; instead of the price.</li>
</ul>