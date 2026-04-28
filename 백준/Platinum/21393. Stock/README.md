# [Platinum II] Stock - 21393

[문제 링크](https://www.acmicpc.net/problem/21393)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 12, 맞힌 사람: 7, 정답 비율: 46.667%

### 분류

수학, 자료 구조, 그리디 알고리즘, 애드 혹, 우선순위 큐

### 문제 설명

<p>After years of hard work Optiver has developed a mathematical model that allows them to predict wether or not a company will be succesful. This obviously gives them a great advantage on the stock market.</p>

<p>In the past, Optiver made a deal with a big company, which forces them to buy shares of the company according to a fixed schedule. Unfortunately, Optiver&rsquo;s model has determined that the company will go bankrupt after exactly n days, after which their shares will become worthless.</p>

<p>Still, Optiver holds a large number of sell options that allows them to sell some of the shares before the company goes bankrupt. However, there is a limit on the number of shares Optiver can sell every day, and price Optiver receives for a share may vary from day to day. Therefore, it is not immediately clear when Optiver should sell their shares to maximize their profit, so they asked you to write a program to calculcate this.</p>

### 입력

<p>On the first line an integer t (1 &le; t &le; 100): the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with an integer n (1 &le; n &le; 100 000): the number of days before the company goes bankrupt.</li>
	<li>n lines with three integers x<sub>i</sub> (0 &le; x<sub>i</sub> &le; 100), p<sub>i</sub> (0 &le; p<sub>i</sub> &le; 100) and m<sub>i</sub> (0 &le; m<sub>i</sub> &le; 10 000 000): the number of shares Optiver receives on day i, the (selling) price per share on day i, and the maximum number of shares Optiver can sell on day i, respectively.</li>
</ul>

### 출력

<p>For each test case:</p>

<ul>
	<li>One line with the maximum profit Optiver can achieve.</li>
</ul>