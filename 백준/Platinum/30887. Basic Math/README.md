# [Platinum III] Basic Math - 30887

[문제 링크](https://www.acmicpc.net/problem/30887)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 59, 정답: 40, 맞힌 사람: 38, 정답 비율: 66.667%

### 분류

자료 구조, 집합과 맵, 값 / 좌표 압축, 이분 매칭

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30887.%E2%80%85Basic%E2%80%85Math/025a925b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30887.%E2%80%85Basic%E2%80%85Math/025a925b.png" data-original-src="https://upload.acmicpc.net/81b7ea6d-6cc4-4fba-a1ea-771e2469fea7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 351px;" /></p>

<p style="text-align: center;">Example exam by Ellen.</p>

<p>Ellen is teaching elementary math to her students and the time for the final exam has come. The exam consists of $n$ questions. In each question, the students have to add (&#39;<code>+</code>&#39;), subtract (&#39;<code>-</code>&#39;) or multiply (&#39;<code>*</code>&#39;) a pair of numbers.</p>

<p>Ellen has already chosen the $n$ pairs of numbers. All that remains is to decide for each pair which of the three possible operations the students should perform. To avoid students getting bored, Ellen wants to make sure that the $n$ correct answers to her exam are all different.</p>

<p>Please help Ellen finish constructing the exam by automating this task.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1\leq n \leq 2\,500$), the number of pairs of numbers.</li>
	<li>$n$ lines with two integers $a$ and $b$ ($\left|a\right|, \left|b\right| \leq 10^6$), a pair of numbers used.</li>
</ul>

### 출력

<p>If there is no way to construct the exam such that the $n$ correct answers are all different, output &quot;<code>impossible</code>&quot;.</p>

<p>Else, for each pair of numbers $(a,b)$ in the same order as in the input, output a valid equation. Each equation should consist of five parts: $a$, one of the three operators, $b$, an equals sign (&#39;<code>=</code>&#39;), and the result of the expression. All the $n$ expression results must be different.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>