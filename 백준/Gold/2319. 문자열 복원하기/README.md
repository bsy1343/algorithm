# [Gold I] 문자열 복원하기 - 2319

[문제 링크](https://www.acmicpc.net/problem/2319)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 118, 정답: 28, 맞힌 사람: 27, 정답 비율: 31.034%

### 분류

다이나믹 프로그래밍, 집합과 맵

### 문제 설명

<p>어떤 문자열 S의 길이가 k인 부분문자열의 집합을 T(S, k)라 표현하자. 예를 들어 S = &quot;ABABA&quot;, k = 2일 때, T(S, k) = {&quot;AB&quot;, &quot;BA&quot;}가 된다. {&quot;AB&quot;, &quot;BA&quot;, &quot;AB&quot;, &quot;BA&quot;}가 아닌 이유는 집합은 같은 원소(중복된 원소)를 허용하지 않기 때문이다.</p>

<p>N 종류의 문자로 이루어진 길이가 k인 문자열들의 집합 X가 주어졌을 때, T(S, k)가 X의 부분집합이 되도록 하는 S의 개수를 구하는 프로그램을 작성하시오. 단 S의 길이는 L이어야 한다.</p>

<p>예를 들어 X = {&quot;ABB&quot;, &quot;BCA&quot;, &quot;BCD&quot;, &quot;CAB&quot;, &quot;CDD&quot;, &quot;DDA&quot;}인 경우에는 &quot;BCABB&quot;, &quot;BCDDA&quot;의 두 가지 경우가 있다.</p>

### 입력

<p>첫째 줄에 N(1 &le; N &le; 26), L(1 &le; L &le; 100), M(1 &le; M &le; 600)이 주어진다. M은 집합 X의 크기이다. 다음 줄에는 X를 이루는 문자열들이 주어진다. 각 문자열들의 길이는 같으며, 10 이하이다. 입력으로는 대문자만 주어진다.</p>

### 출력

<p>첫째 줄에 S의 개수를 출력한다. 이 값은 2<sup>31</sup>-1보다 작거나 같다.</p>