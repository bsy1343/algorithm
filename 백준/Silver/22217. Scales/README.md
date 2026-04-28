# [Silver II] Scales - 22217

[문제 링크](https://www.acmicpc.net/problem/22217)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 27, 맞힌 사람: 22, 정답 비율: 56.410%

### 분류

수학, 구현, 정수론, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>You are given an equal arm scales, a set of weight pieces and an object. The pieces are of weight 1,3,9,27,81,..., i.e. the weight of each piece is a power of 3, and for each integer k &ge; 0 there is exactly one piece of weight 3<sup>k</sup>. The object&rsquo;s weight is m, where m is a positive integer. Your task is to put the object on the left scale pan and to put some pieces on one or both scale pans, so that the scales is in balance.</p>

<p>Write a program that:</p>

<ul>
	<li>reads the object&rsquo;s weight m from the input,</li>
	<li>calculates which pieces should be put on the left and right scalepan,</li>
	<li>writes the results to the output.</li>
</ul>

### 입력

<p>The first line contains one integer m, 1 &le;&nbsp;m &le; 10<sup>100</sup>.</p>

### 출력

<p>The output should consist of two lines.</p>

<p>The first line should contain information about pieces put on the left scale pan. First number must be non-negative integer - number of pieces put on the left scale pan followed by weights of pieces in increasing order. Numbers must be separated by single spaces.</p>

<p>The second line must contain information about pieces put on the right scale pan in the same format as first line.</p>