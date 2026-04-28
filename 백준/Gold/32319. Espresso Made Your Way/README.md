# [Gold V] Espresso Made Your Way - 32319

[문제 링크](https://www.acmicpc.net/problem/32319)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 12, 맞힌 사람: 12, 정답 비율: 60.000%

### 분류

이분 탐색, 수학

### 문제 설명

<p>You have a new job. You can honestly say that coffee is not your cup of tea. You have many customers that ask for a particular ratio of coffee to milk. You don&#39;t have the ability to make arbitrary measurements. You have two cups. Both cups are the same size. You have a machine that dispenses pure coffee, and another machine that dispenses pure milk.</p>

<p>You can completely fill one empty cup with coffee and the second empty cup with milk. You can also take these two full cups and create a mix such that the result will have exactly half of each cup, i.e., half coffee and half milk. So, you have created a mix (a cup) that is half coffee and half milk but, unfortunately, you have wasted a full cup of ingredients (the second half of coffee and the second half of milk).</p>

<p>Now that you have a cup that is half coffee and half milk, you can fill the second cup with coffee or fill the second cup with milk. Then, you can mix your two cups to create a cup with a different coffee-to-milk ratio. Note that, when mixing two cups, you use exactly half of each cup and waste exactly half of each cup.</p>

<p>By repeating the above process, you can make some coffee-to-milk ratios but some ratios are literally impossible.</p>

<p>Given the tolerance range a customer has for their coffee-to-milk ratio, determine the least amount of ingredients you will waste assuming you prepare the customer&#39;s order optimally.</p>

### 입력

<p>There is only one input line; it contains four integers: C<sub>1</sub>, M<sub>1</sub>, C<sub>2</sub>, and M<sub>2</sub> (0 &le; C<sub>1</sub>, M<sub>1</sub>, C<sub>2</sub>, M<sub>2</sub> &le; 10<sup>6</sup>) representing the coffee-to-milk ratio range the customer accepts. More specifically, the ratio can be anywhere from C<sub>1</sub> coffee parts per M<sub>1</sub> milk parts to C<sub>2</sub> coffee parts per M<sub>2</sub> milk parts. You are guaranteed that:</p>

<ul>
	<li>The two ratios will not be identical.</li>
	<li>C<sub>1</sub> + M<sub>1</sub> &gt; 0</li>
	<li>C<sub>2</sub> + M<sub>2</sub> &gt; 0</li>
	<li>C<sub>1</sub> / (C<sub>1</sub> + M<sub>1</sub>) &ne; C<sub>2</sub> / (C<sub>2</sub> + M<sub>2</sub>)</li>
</ul>

### 출력

<p>Print one integer representing the least number of cups of ingredients wasted assuming you prepare the customer&rsquo;s order optimally.</p>