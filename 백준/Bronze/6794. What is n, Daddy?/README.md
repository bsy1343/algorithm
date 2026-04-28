# [Bronze III] What is n, Daddy? - 6794

[문제 링크](https://www.acmicpc.net/problem/6794)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1497, 정답: 809, 맞힌 사람: 739, 정답 비율: 53.590%

### 분류

수학, 런타임 전의 전처리

### 문제 설명

<p>Natalie is learning to count on her fingers. When her Daddy tells her a number n (1 &le; n &le; 10), she asks &ldquo;What is n, Daddy?&rdquo;, by which she means &ldquo;How many fingers should I hold up on each hand so that the total is n?&rdquo;</p>

<p>To make matters simple, her Daddy gives her the correct finger representation according to the following rules:</p>

<ul>
	<li>the number may be represented on one or two hands;</li>
	<li>if the number is represented on two hands, the larger number is given first.</li>
</ul>

<p>For example, if Natalie asks &ldquo;What is 4, Daddy?&rdquo;, her Dad may reply:</p>

<ul>
	<li>4 is 4.</li>
	<li>4 is 3 and 1.</li>
	<li>4 is 2 and 2.</li>
</ul>

<p>Your job is to make sure that Natalie&rsquo;s Daddy gives the correct number of answers.</p>

### 입력

<p>The input will be a single integer in the range 1..10.</p>

### 출력

<p>The output is the number of ways of producing that number on two hands, subject to the rules outlined above.</p>