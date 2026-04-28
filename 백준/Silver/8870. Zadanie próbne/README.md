# [Silver I] Zadanie próbne - 8870

[문제 링크](https://www.acmicpc.net/problem/8870)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 106, 정답: 50, 맞힌 사람: 39, 정답 비율: 61.905%

### 분류

런타임 전의 전처리

### 문제 설명

<pre>
int ret = 0;
for(int s = 1; s&lt;=n; s++) {
  for(int k = s; k&lt;=n; k++) {
    for(int i = k; i&lt;=n; i++) {
      ret = (ret+s*k/i)%2010;
    }
  }
}</pre>

### 입력

<p>W pierwszej i jedynej linii wejścia znajduje się wartość zmiennej&nbsp;<strong>n</strong>&nbsp;(1&lt;=<strong>n</strong>&lt;=2010).</p>

### 출력

<p>Tw&oacute;j program powinien wypisać pojedyncza liczbę - wartość zmiennej ret po wykonaniu pętli.</p>