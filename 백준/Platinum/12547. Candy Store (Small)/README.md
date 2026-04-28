# [Platinum IV] Candy Store (Small) - 12547

[문제 링크](https://www.acmicpc.net/problem/12547)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 42, 맞힌 사람: 30, 정답 비율: 81.081%

### 분류

수학, 그리디 알고리즘, 사칙연산

### 문제 설명

<p>Owning a candy store is tough! You have to optimize all kinds of things. Lately you&#39;ve been selling a very popular kind of candy called Whizboppers. These candies become rotten very quickly, which gives them the following properties:</p>

<ul>
	<li>You must buy new Whizboppers from your supplier every morning.</li>
	<li>You must sell Whizboppers in the boxes you bought from your supplier that morning.</li>
</ul>

<p>You can order Whizboppers from your supplier in boxes that contain any integer number of grams.</p>

<p>Every day up to&nbsp;<strong>k</strong>&nbsp;people visit your store, and, starting from the first person, they will choose an integer number of cents to spend on Whizboppers: between 1 and&nbsp;<strong>C</strong>&nbsp;cents inclusive. You&#39;re going to sell Whizboppers for 1 cent per gram; so if a person wants to spend 4 cents, you will give that person exactly 4 grams of candy. You might do this by giving the person a 4-gram box, or perhaps a 2-gram box and two 1-gram boxes.</p>

<p>What is the minimum number of boxes you need to order so that, no matter what amount each person orders, you can always give all of the people the mass of Whizboppers they want?</p>

<p><strong>Note</strong>: When a person chooses how much candy to buy, you know what other people have already bought, but you don&#39;t know what future people will buy.</p>

<p>For example, if up to 2 people visit your store every day, and they spend up to 2 cents each (k=2, C=2), you could buy four 1-gram boxes from your supplier. But you can do better: if you buy two 1-gram boxes and one 2-gram box, you can satisfy your customers. Here&#39;s how:</p>

<pre>
First Person   Boxes given   Second Person   Boxes given
--------------------------------------------------------
  2 cents         1 x 2-gram         2 cents            2 x 1-gram
                                                 1 cent              1 x 1-gram
  -----------------------------------------------------
  1 cent           1 x 1-gram          2 cents            1 x 2-gram
                                                 1 cent              1 x 1-gram
</pre>

<p>Regardless of what the first person orders, you can give out boxes so that the second person can still get the right amount of candy. So for k=2, C=2, you can serve any sequence of orders with 3 boxes.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;lines follow, each of which contains two integers:&nbsp;<strong>k</strong>&nbsp;and&nbsp;<strong>C</strong>, the maximum number of people and the maximum number of cents each person may spend.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>k</strong>&nbsp;&le; 20.</li>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 3.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the minimum number of boxes you need to order every day.</p>

### 힌트

<p>In the first case, you can buy one 1-gram box and two 2-gram boxes. In the second case, you can buy two 1-gram boxes and one 2-gram box.</p>