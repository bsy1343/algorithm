# [Gold I] Krusty’s Burger - 11178

[문제 링크](https://www.acmicpc.net/problem/11178)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 30, 정답: 15, 맞힌 사람: 10, 정답 비율: 41.667%

### 분류

수학, 다이나믹 프로그래밍, 조합론, 중간에서 만나기

### 문제 설명

<p>Your friend Krusty is running a &ldquo;build your own burger&rdquo;- restaurant. You follow these steps to build a burger:</p>

<ol>
	<li>Pick a burger size.</li>
	<li>Pick a bun from N<sub>b</sub> different buns.</li>
	<li>Pick no cheese or a cheese from N<sub>c</sub> different cheeses.</li>
	<li>Pick up to 3 toppings from N<sub>t</sub> different toppings.</li>
	<li>Pick no sauce or a sauce from N<sub>s</sub> different sauces.</li>
</ol>

<p>Burgers cost \$1 per 50 grams and you can choose any burger size, as long as you stick to a nonzero positive multiple of 50 grams. You can add additional cheeses, sauces or toppings for \$1 per extra item.</p>

<p>For example, a burger with 100 grams, on bun number 1, with 2 different cheeses, 5 toppings, and no sauce, would cost \$5: \$2 for the burger, \$1 for the extra cheese and \$2 for the extra toppings.</p>

<p>Realizing that you have a huge array of options, your friend would like you to find out how many different burgers you can build without exceeding a given budget, B. Two burgers are different if one contains a burger size, bun, cheese, topping or sauce that the other one doesn&rsquo;t contain.</p>

### 입력

<p>The first line of the input consists of a single integer, T, the number of test cases. Each of the following T cases consists of the 5 numbers B, N<sub>b</sub>, N<sub>c</sub>, N<sub>t</sub>, N<sub>s</sub> separated by spaces.</p>

<ul>
	<li>1 &le; T &le; 20</li>
	<li>1 &le; B, N<sub>b</sub>, N<sub>c</sub>, N<sub>s</sub> &le; 1000</li>
	<li>3 &le; N<sub>t</sub> &le; 1000</li>
</ul>

### 출력

<p>For each test case, output the number of different burgers that can be built within the budget. This number can be very large, so the answer should be given modulo 1,000,000,007</p>