# [Gold V] Other Side - 16519

[문제 링크](https://www.acmicpc.net/problem/16519)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 177, 정답: 36, 맞힌 사람: 32, 정답 비율: 24.615%

### 분류

애드 혹, 많은 조건 분기

### 문제 설명

<p>John Doe wants to transport his possessions from one bank of Lake Michigan to the other. His possessions consist of W wolves, S sheep, and C cabbages. The transportation will be carried out using a boat that can hold up to K of these items at the same time. During each step, John can take some items from one bank and transfer them to the other bank. Unfortunately, when left unsupervised, wolves will eat sheep and sheep will eat cabbages (but wolves don&rsquo;t eat cabbages). John doesn&rsquo;t want to lose his possessions, so he has to devise a scheme such that this doesn&rsquo;t happen. With John present, any combination of items is allowed (both on the bank and in the boat). This is also true during the loading process. Since John isn&rsquo;t very good at solving problems like this, he asks you to help him.</p>

### 입력

<p>Input contains a single line with four integers: W, S, C, K. The input satisfies the following constraints:</p>

<ul>
	<li>0 &le; W, S, C, K &le; 10<sup>6</sup>,</li>
	<li>1 &le; max(W, S, C).</li>
</ul>

### 출력

<p>If it&rsquo;s possible to perform the transportation without the loss of items, print YES, otherwise print NO.</p>