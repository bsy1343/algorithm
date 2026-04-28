# [Silver II] Canoes - 8094

[문제 링크](https://www.acmicpc.net/problem/8094)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 192, 정답: 107, 맞힌 사람: 91, 정답 비율: 55.828%

### 분류

그리디 알고리즘, 정렬, 두 포인터

### 문제 설명

<p>We are organizing a canoe tour. Canoes can be hired at the harbour. Canoes are all alike. A canoe can take at most two persons. The sum of weights of these persons cannot exceed the fixed maximal weight. We want to pay as little as possible so we should try to place all participants of our tour in the minimal number of canoes.</p>

<p>Write a program that:</p>

<ul>
	<li>reads the maximal weight of a canoe crew, the number of participants of the tour and the weight of each of them, from the standard input,</li>
	<li>computes the minimal number of canoes that should be hired to place all the participants of the tour according to the rules,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is one integer&nbsp;w, 80 &le; w &le; 200, which is the maximal weight of a canoe crew. In the second line there is one integer n, 1 &le; n &le; 30,000, which is the number of participants of the tour.</p>

<p>Each of the following n&nbsp;lines contains one integer from the range [5..w]. These numbers equal the weights of the participants.</p>

### 출력

<p>In the first line of the standard output there should be written one integer &mdash; the minimal number of canoes that should be hired.</p>