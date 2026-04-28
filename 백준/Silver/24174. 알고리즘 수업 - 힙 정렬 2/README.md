# [Silver IV] 알고리즘 수업 - 힙 정렬 2 - 24174

[문제 링크](https://www.acmicpc.net/problem/24174)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 1451, 정답: 503, 맞힌 사람: 396, 정답 비율: 36.599%

### 분류

구현, 정렬

### 문제 설명

<p>오늘도 서준이는 최소 힙 기반 힙&nbsp;정렬&nbsp;수업 조교를 하고 있다.&nbsp;아빠가 수업한&nbsp;내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.</p>

<p><em>N</em>개의 서로 다른 양의&nbsp;정수가 저장된&nbsp;배열 A가 있다. 힙&nbsp;정렬로 배열 A를 오름차순 정렬할 경우 배열 A의 원소가&nbsp;<em>K&nbsp;</em>번 교환된&nbsp;직후의 배열 A를 출력해 보자.</p>

<p>크기가&nbsp;<em>N</em>인 배열에 대한 힙&nbsp;정렬&nbsp;의사 코드는&nbsp;다음과 같다.</p>

<pre>
heap_sort(A[1..n]) { # A[1..n]을 정렬한다.
&nbsp;   build_min_heap(A, n);
&nbsp;   for i &lt;- n downto 2 {
&nbsp;       A[1] &lt;-&gt; A[i];  # 원소 교환
&nbsp;       heapify(A, 1, i - 1);
&nbsp;   }
}

build_min_heap(A[], n) {
    for i &lt;- &lfloor;n / 2&rfloor; downto 1
        heapify(A, i, n)
}

# A[k]를 루트로 하는 트리를 최소 힙 성질을 만족하도록 수정한다.
# A[k]의 두 자식을 루트로 하는 서브 트리는 최소 힙 성질을 만족하고 있다.
# n은 배열 A의 전체 크기이며 최대 인덱스를 나타낸다.
heapify(A[], k, n) {
    left &lt;- 2k; right &lt;- 2k + 1;
&nbsp;   if (right &le; n) then {
        if (A[left] &lt; A[right]) then smaller &lt;- left;
&nbsp;                               else smaller &lt;- right;
&nbsp;   }
&nbsp;   else if (left &le; n) then smaller &lt;- left;
&nbsp;   else return;

&nbsp;   # 최소 힙 성질을 만족하지 못하는 경우 재귀적으로 수정한다.
&nbsp;   if (A[smaller] &lt; A[k]) then {
        A[k] &lt;-&gt; A[smaller];
&nbsp;       heapify(A, smaller, n);
&nbsp;   }
}</pre>

### 입력

<p>첫째 줄에 배열 A의 크기&nbsp;<em>N</em>(5&nbsp;&le;&nbsp;<em>N</em>&nbsp;&le; 500,000), 교환 횟수&nbsp;<em>K</em>(1 &le;&nbsp;<em>K</em>&nbsp;&le; 10<sup>8</sup>)가&nbsp;주어진다.</p>

<p>다음&nbsp;줄에 서로 다른 배열 A의 원소 A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>N</sub>이 주어진다.&nbsp;(1&nbsp;&le; A<sub>i</sub>&nbsp;&le; 10<sup>9</sup>)</p>

### 출력

<p>배열 A에&nbsp;<em>K&nbsp;</em>번 교환이&nbsp;발생한 직후의 배열 A를 한 줄에 출력한다. 교환&nbsp;횟수가&nbsp;<em>K&nbsp;</em>보다 작으면 -1을 출력한다.</p>