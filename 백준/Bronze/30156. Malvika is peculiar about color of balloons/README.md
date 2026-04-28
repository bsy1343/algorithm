# [Bronze IV] Malvika is peculiar about color of balloons - 30156

[문제 링크](https://www.acmicpc.net/problem/30156)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1043, 정답: 850, 맞힌 사람: 812, 정답 비율: 81.855%

### 분류

구현, 그리디 알고리즘, 문자열

### 문제 설명

<p>Little Malvika is very peculiar about colors. On her birthday, her mom wanted to buy balloons for decorating the house. So she asked her about her color preferences. The sophisticated little person that Malvika is, she likes only two colors &mdash; amber and brass. Her mom bought n balloons, each of which was either amber or brass in color. You are provided this information in a string s consisting of characters &#39;a&#39; and &#39;b&#39; only, where &#39;a&#39; denotes that the balloon is amber, where &#39;b&#39; denotes it being brass colored.</p>

<p>When Malvika saw the balloons, she was furious with anger as she wanted all the balloons of the same color. In her anger, she painted some of the balloons with the opposite color (i.e., she painted some amber ones brass and vice versa) to make all balloons appear to be the same color. As she was very angry, it took her a lot of time to do this, but you can probably show her the right way of doing so, thereby teaching her a lesson to remain calm in difficult situations, by finding out the minimum number of balloons needed to be painted in order to make all of them the same color.</p>

### 입력

<p>The first line of input contains a single integer T, denoting the number of test cases.</p>

<p>The first and only line of each test case contains a string s.</p>

### 출력

<p>For each test case, output a single line containing an integer &mdash; the minimum number of flips required.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100</li>
	<li>1 &le; n &le; 100, where n denotes to the length of the string s.</li>
</ul>

### 힌트

<p>In the first example, you can change amber to brass or brass to amber. In both the cases, both the balloons will have same colors. So, you will need to paint 1 balloon. So the answer is 1.</p>

<p>In the second example, As the color of all the balloons is already the same, you don&#39;t need to paint any of them. So, the answer is 0.</p>