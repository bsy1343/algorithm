# [Gold IV] 이진 삼진 탐색 놀이 3 - 19601

[문제 링크](https://www.acmicpc.net/problem/19601)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 266, 정답: 67, 맞힌 사람: 54, 정답 비율: 28.125%

### 분류

수학, 이분 탐색, 재귀, 삼분 탐색

### 문제 설명

<p>오늘도 서준이는 아빠와 함께&nbsp;알고리즘 놀이를 하고 있다.&nbsp;서준이는 이진 탐색, 아빠는 삼진 탐색 놀이를&nbsp;하고 있다.</p>

<p>서로 다른 정수가&nbsp;오름차순으로 정렬된 크기가 N인 배열 A가 있다. 이진 탐색,&nbsp;삼진 탐색으로&nbsp;배열 A의 i번째 원소 A<sub>i</sub>를 찾을 때,&nbsp;A<sub>i</sub>를 찾기 전에 참조해야 하는 배열 A의 원소 개수를 각각 B<sub>i</sub>&nbsp;, T<sub>i</sub> 라고 하자. 서준이는 아빠로 부터 B<sub>i</sub>&nbsp;, T<sub>i</sub>&nbsp;최대값을 공백을 사이에 두고 한줄에&nbsp;출력하는 Q개의 질의를 받았다. n과 Q가 커서 괴로워 하는 우리 서준이를 도와주자.</p>

<p>크기가 N인 배열에서 이진 탐색 알고리즘 의사 코드는&nbsp;다음과 같다.</p>

<pre>
binary_search(A[0..N-1], value, left, right) {
    mid = (left + right) / 2
    if (A[mid] == value)
        return mid
    else if (value &lt; A[mid])
        return binary_search(A, value, left, mid - 1)
    else
        return binary_search(A, value, mid + 1, right)
}</pre>

<p>크기가 N인 배열에서 삼진&nbsp;탐색 알고리즘 의사 코드는&nbsp;다음과 같다.</p>

<pre>
ternary_search(A[0..N-1], value, left, right) {
    left_third = left + (right - left) / 3
    right_third = right - (right - left) / 3
    if (A[left_third] == value) 
        return left_third
    else if (A[right_third] == value)
        return right_third
    else if (value &lt; A[left_third])
        return ternary_search(A, value, left, left_third - 1)
    else if (value &lt; A[right_third])
        return ternary_search(A, value, left_third + 1, right_third - 1)
    else
        return ternary_search(A, value, right_third + 1, right)
}</pre>

### 입력

<p>첫째 줄에 쿼리의 수 Q(1&nbsp;&le; Q&nbsp;&le; 500,000)가&nbsp;주어진다. 둘째 줄부터 Q + 1줄까지 배열 A의 크기&nbsp;N이&nbsp;주어진다.</p>

### 출력

<p>첫번째 쿼리부터 Q번째 쿼리까지 각각의 쿼리 결과를 한줄씩 출력한다.</p>

### 제한

<ul>
	<li>1&nbsp;&le; N &le; 2<sup>63</sup> &minus; 1</li>
	<li>1&nbsp;&le; Q&nbsp;&le; 500,000</li>
</ul>