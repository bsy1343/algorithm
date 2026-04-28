# [Gold V] 별 안에 별 안에 별 찍기 - 30678

[문제 링크](https://www.acmicpc.net/problem/30678)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 1114, 정답: 613, 맞힌 사람: 484, 정답 비율: 54.689%

### 분류

재귀

### 문제 설명

<p>규칙에 따라 별을 찍어보자.</p>

<p>먼저 $Star_0$는 별이 하나만 있는 패턴이다.</p>

<pre>
*</pre>

<p>그리고 양의 정수 $i$에 대하여 $Star_i$의 패턴은 다음과 같다. 빈칸은 공백으로 채워져야 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30678.%E2%80%85%EB%B3%84%E2%80%85%EC%95%88%EC%97%90%E2%80%85%EB%B3%84%E2%80%85%EC%95%88%EC%97%90%E2%80%85%EB%B3%84%E2%80%85%EC%B0%8D%EA%B8%B0/6cb6e59f.jpg" data-original-src="https://u.acmicpc.net/bc825e4e-830a-4e40-8110-9b269a695fc2/pattern-of-star_i.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 50%; width: 50%;" /></p>

<p>정수 $N$이 주어질 때 $Star_N$을 출력해 보도록 하자.</p>

### 입력

<p>정수 $N$이 주어진다. $(0 \leq N \leq 5)$</p>

### 출력

<p>$Star_N$을 출력한다. 모든 공백을 출력해야 함에 유의한다.</p>