# [Platinum II] Pizza Problems - 11207

[문제 링크](https://www.acmicpc.net/problem/11207)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 95, 정답: 12, 맞힌 사람: 10, 정답 비율: 16.949%

### 분류

구현, 시뮬레이션, 무작위화

### 문제 설명

<p>Me and my friends are ordering a big pizza to share. As you can imagine this is quite complicated, since everyone has different wishes about what should be on the pizza. For instance Gunnar wants bananas on the pizza, Emma doesn&rsquo;t want bananas but wants olives, Marc wants there to be tomatoes, and so on. Fortunately, against all odds, we managed to come up with a selection of toppings such that everyone had at least 2/3&rsquo;s of their wishes fulfilled, which we unanimously decided was good enough.</p>

<p>But then, disaster struck! We sent out Luk&aacute;&scaron; to buy the pizza, but he accidentally lost the piece of paper on which we had written down our carefully selected list of toppings. Now we&rsquo;re back at square one, and have to construct a new selection of toppings. Given how long it took us to find the original selection of toppings, we have decided to lower our standards a bit and just try to find a selection such that everyone has strictly more than 1/3 of their wishes fulfilled.</p>

<p>Can you help us with this? If you do, you&rsquo;ll get some pizza!</p>

### 입력

<p>The first line of input contains an integer 1 &le; N &le; 10 000, the number of friends in the group (including yourself). Each of the next n lines contains the list of wishes of one of the friends. This list starts with an integer 1 &le; w &le; 30, the number of wishes this friend has, followed by a space-separated list of wishes. Each wish is either &ldquo;+&lt;topping&gt;&rdquo; or &ldquo;-&lt;topping&gt;&rdquo; where &lt;topping&gt; is the name of a topping, indicating that this friend wants or does not want this topping. Each topping name appears at most once in each list.</p>

<p>Topping names are non-empty strings of up to 15 lower-case English letters &lsquo;a&rsquo;-&lsquo;z&rsquo;. There are at most 250 different toppings.</p>

### 출력

<p>Output a list of toppings (without repetitions, separated by spaces or newlines) such that each friend has strictly more than 1/3 of their wishes fulfilled. You may assume that there exists a list such that every friend has at least 2/3 of their wishes fulfilled.</p>

<p>Your list of toppings is not allowed to contain any toppings that are not mentioned in the input, nor is it allowed to contain repetitions.</p>