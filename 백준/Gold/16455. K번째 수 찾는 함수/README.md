# [Gold I] K번째 수 찾는 함수 - 16455

[문제 링크](https://www.acmicpc.net/problem/16455)

### 성능 요약

시간 제한: 0.2 초  (하단 참고), 메모리 제한: 512 MB

### 통계

제출: 4789, 정답: 545, 맞힌 사람: 229, 정답 비율: 11.416%

### 분류

무작위화

### 문제 설명

<p>크기가 <em>N</em>인 수열 <em>A</em><sub>1</sub>, <em>A</em><sub>2</sub>, ..., <em>A<sub>N</sub></em>이 주어진다. <em>A</em>를 오름차순 정렬했을 때, 앞에서부터 <em>K</em>번째 있는 수를 리턴하는 함수를 작성하시오.</p>

<p>작성해야 하는 함수는 다음과 같다. <em>N</em>은 <code>n</code>, <em>A</em>는 <code>a</code>, <em>K</em>는 <code>k</code>로 주어진다.</p>

<ul>
	<li>C, C11, C (Clang), C11 (Clang): <code>int kth(int *a, int n, int k);</code></li>
	<li>C++, C++11, C++14, C++17, C++ (Clang), C++11 (Clang), C++14 (Clang), C++17 (Clang): <code>int kth(std::vector&lt;int&gt; &amp;a, int k);</code></li>
	<li>Java, Java (OpenJDK): <code>int kth(int[] a, int k);</code> (클래스 이름: Test)</li>
	<li>PyPy2, PyPy3: <code>def kth(a: list, k : int) -&gt; int</code></li>
	<li>Go: <code>kth(a []int, k int) int</code></li>
</ul>

### 입력



### 출력



### 제한

<ul>
	<li>1 &le; <em>N</em> &le; 5,000,000</li>
	<li>1 &le; <em>K</em> &le; <em>N</em></li>
	<li>-10<sup>9</sup> &le; <em>A<sub>i</sub></em> &le; 10<sup>9</sup></li>
</ul>