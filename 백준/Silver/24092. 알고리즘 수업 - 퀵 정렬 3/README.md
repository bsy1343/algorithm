# [Silver I] 알고리즘 수업 - 퀵 정렬 3 - 24092

[문제 링크](https://www.acmicpc.net/problem/24092)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 1656, 정답: 281, 맞힌 사람: 197, 정답 비율: 19.089%

### 분류

구현, 정렬, 애드 혹

### 문제 설명

<p>오늘도 서준이는 퀵&nbsp;정렬&nbsp;수업 조교를 하고 있다.&nbsp;아빠가 수업한&nbsp;내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.</p>

<p><em>N</em>개의 서로 다른 양의&nbsp;정수가 저장된&nbsp;배열 A가 있다. 퀵&nbsp;정렬로 배열 A를 오름차순 정렬할 경우 정렬 과정에서 배열 A가 배열 B와 같은 경우가 발생하는지 확인해 보자. 초기 상태 배열 A도 정렬 과정에서 발생 가능한 경우로 생각하자.</p>

<p>크기가&nbsp;<em>N</em>인 배열에 대한 퀵&nbsp;정렬&nbsp;의사 코드는&nbsp;다음과 같다.</p>

<pre>
quick_sort(A[p..r]) { # A[p..r]을 오름차순 정렬한다.
    if (p &lt; r) then {
        q &lt;- partition(A, p, r);  # 분할
&nbsp;       quick_sort(A, p, q - 1);  # 왼쪽 부분 배열 정렬
&nbsp;       quick_sort(A, q + 1, r);  # 오른쪽 부분 배열 정렬
&nbsp;   }
}

partition(A[], p, r) {
    x &lt;- A[r];    # 기준원소
&nbsp;   i &lt;- p - 1;   # i는 x보다 작거나 작은 원소들의 끝지점
&nbsp;   for j &lt;- p to r - 1  # j는 아직 정해지지 않은 원소들의 시작 지점
&nbsp;       if (A[j] &le; x) then A[++i] &lt;-&gt; A[j]; # i값 증가 후 A[i] &lt;-&gt; A[j] 교환
&nbsp;   if (i + 1 != r) then A[i + 1] &lt;-&gt; A[r]; # i + 1과 r이 서로 다르면 A[i + 1]과 A[r]을 교환
&nbsp;   return i + 1;
}</pre>

### 입력

<p>첫째 줄에 배열 A, B의 크기&nbsp;<em>N</em>(5&nbsp;&le;&nbsp;<em>N</em>&nbsp;&le; 10,000)이 주어진다.</p>

<p>다음&nbsp;줄에 서로 다른 배열 A의 원소 A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>이 주어진다.&nbsp;(1&nbsp;&le; A<sub>i</sub>&nbsp;&le; 10<sup>9</sup>)</p>

<p>다음&nbsp;줄에 배열 B의 원소 B<sub>1</sub>, B<sub>2</sub>, ..., B<sub>N</sub>이 주어진다.&nbsp;(1&nbsp;&le; B<sub>i</sub>&nbsp;&le; 10<sup>9</sup>)</p>

### 출력

<p>퀵 정렬로 배열 A를 오름차순 정렬하는 과정에서&nbsp;배열 A가 배열 B와 같은 경우가 발생하면 1, 아니면 0을 출력한다.</p>