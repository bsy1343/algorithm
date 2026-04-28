# [Silver III] 이진 삼진 탐색 놀이 1 - 19599

[문제 링크](https://www.acmicpc.net/problem/19599)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 285, 정답: 160, 맞힌 사람: 125, 정답 비율: 55.310%

### 분류

이분 탐색, 삼분 탐색

### 문제 설명

<p>오늘도 서준이는 아빠와 함께&nbsp;알고리즘 놀이를 하고 있다.&nbsp;서준이는 이진 탐색, 아빠는 삼진 탐색 놀이를&nbsp;하고 있다.</p>

<p>서로 다른 정수가&nbsp;오름차순으로 정렬된 크기가 N인 배열 A가 있다. 이진 탐색, 삼진 탐색으로&nbsp;배열 A의 i번째 원소 A<sub>i</sub>를 찾을 때,&nbsp;A<sub>i</sub>를 찾기 전에 참조해야 하는 배열 A의 원소 개수를 각각 B<sub>i</sub>&nbsp;, T<sub>i</sub> 라고 하자. B<sub>i</sub>값이 T<sub>i</sub>값보다 작은&nbsp;배열 A의 원소의 개수,&nbsp;B<sub>i</sub>값과 T<sub>i</sub>값이 같은 배열 A의 원소의 개수,&nbsp;B<sub>i</sub>값이&nbsp;T<sub>i</sub>값보다 큰&nbsp;배열 A의 원소의 개수를 순서대로 각각 한줄씩&nbsp;출력하는 미션을 받고 괴로워 하는 우리 서준이를 도와주자.</p>

<p>크기가 N인 배열에서 이진 탐색 알고리즘 의사 코드는&nbsp;다음과 같다.</p>

<pre>
binary_search(A[0..N&minus;1], value, left, right) {
    mid = &lfloor;(left + right) / 2&rfloor;
    if (A[mid] == value)
        return mid
    else if (value &lt; A[mid])
        return binary_search(A, value, left, mid - 1)
    else
        return binary_search(A, value, mid + 1, right)
}</pre>

<p>크기가 N인 배열에서 삼진&nbsp;탐색 알고리즘 의사 코드는&nbsp;다음과 같다.</p>

<pre>
<code>ternary_search(A[0..N-1</code>], value, left, right) {
    left_third = left + &lfloor;(right &minus; left) / 3&rfloor;
    right_third = right - &lfloor;(right &minus; left) / 3&rfloor;
    if (A[left_third] == value) 
        return left_third
    else if (A[right_third] == value)
        return right_third
    else if (value &lt; A[left_third])
        return ternary_search(A, value, left, left_third &minus; 1)
    else if (value &lt; A[right_third])
        return ternary_search(A, value, left_third + 1, right_third &minus; 1)
    else
        return ternary_search(A, value, right_third + 1, right)
}</pre>

### 입력

<p>첫째 줄에 배열 A의 크기&nbsp;N(1 &le; N &le; 500,000)이 주어진다. 배열 A의 index는 [0, N&minus;1]이다.</p>

### 출력

<p>첫째 줄에&nbsp;B<sub>i</sub>값이 T<sub>i</sub>값보다 작은&nbsp;배열 A의 원소의 개수를 출력한다.</p>

<p>둘째 줄에&nbsp;B<sub>i</sub>값과 T<sub>i</sub>값이 같은 배열 A의 원소의 개수를 출력한다.</p>

<p>셋째 줄에 B<sub>i</sub>값이&nbsp;T<sub>i</sub>값보다 큰&nbsp;배열 A의 원소의 개수를 출력한다.</p>