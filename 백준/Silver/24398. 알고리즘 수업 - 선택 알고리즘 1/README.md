# [Silver V] 알고리즘 수업 - 선택 알고리즘 1 - 24398

[문제 링크](https://www.acmicpc.net/problem/24398)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 914, 정답: 216, 맞힌 사람: 140, 정답 비율: 23.973%

### 분류

구현

### 문제 설명

<p>오늘도 서준이는 선택 알고리즘 수업 조교를 하고 있다.&nbsp;아빠가 수업한&nbsp;내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.</p>

<p><i>N</i>개의 서로 다른 양의&nbsp;정수가 규칙 없이 저장된&nbsp;배열 A가 있다.&nbsp;평균 선형 시간 선택 알고리즘으로 배열 A에서 <i>Q&nbsp;</i>번째 작은 원소를 찾는 경우&nbsp;<em>K&nbsp;</em>번째 교환되는&nbsp;수를 구해서 우리 서준이를 도와주자.</p>

<p>크기가&nbsp;<em>N</em>인 배열에 대한 평균 선형 시간 선택 알고리즘&nbsp;의사 코드는&nbsp;다음과 같다.</p>

<pre>
select(A[], p, r, q) { # A[p..r]에서 q번째 작은 원소를 찾는다.
    if (p = r) then return A[p];
&nbsp;   t &lt;- partition(A, p, r);  # 분할
&nbsp;   k &lt;- t - p + 1;           # 기준원소가 전체에서 k번째 작은 원소임
&nbsp;   if (q &lt; k) then return select(A, p, t - 1, q);  # 왼쪽 그룹으로 범위를 좁힘
&nbsp;   else if (q = k) then return A[t];               # 기준원소가 찾는 원소임
    else return select(A, t + 1, r, q - k);         # 오른쪽 그룹으로 범위를 좁힘
}

partition(A[], p, r) {
    x &lt;- A[r];    # 기준원소
&nbsp;   i &lt;- p - 1;   # i는 x보다 작거나 같은 원소들의 끝 지점
&nbsp;   for j &lt;- p to r - 1  # j는 아직 정해지지 않은 원소들의 시작 지점
&nbsp;       if (A[j] &le; x) then A[++i] &lt;-&gt; A[j]; # i값 증가 후 A[i] &lt;-&gt; A[j] 교환
&nbsp;   if (i + 1 &ne; r) then A[i + 1] &lt;-&gt; A[r];  # i + 1과 r이 서로 다르면 A[i + 1]과 A[r]을 교환
&nbsp;   return i + 1;
}</pre>

### 입력

<p>첫째 줄에 배열 A의 크기&nbsp;<em>N</em>(5&nbsp;&le;&nbsp;<em>N</em>&nbsp;&le; 10,000), 찾을 원소 정보&nbsp;<em>Q</em>(1 &le;&nbsp;<em>Q</em>&nbsp;&le; <em>N</em>), 교환 횟수&nbsp;<em>K</em>(1 &le;&nbsp;<em>K</em>&nbsp;&le; 10<sup>8</sup>)가&nbsp;주어진다.</p>

<p>다음&nbsp;줄에 서로 다른 배열 A의 원소 <em>A<sub>1</sub></em>, <em>A<sub>2</sub></em>, ..., <em>A<sub>N</sub></em>이 주어진다.&nbsp;(1&nbsp;&le; <em>A<sub>i</sub></em>&nbsp;&le; 10<sup>9</sup>)</p>

### 출력

<p><em>K&nbsp;</em>번째 교환되는 두 개의 수를 작은 수부터 한 줄에 출력한다. 교환 횟수가&nbsp;<em>K&nbsp;</em>보다 작으면 -1을 출력한다.</p>