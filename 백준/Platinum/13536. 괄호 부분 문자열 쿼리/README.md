# [Platinum II] 괄호 부분 문자열 쿼리 - 13536

[문제 링크](https://www.acmicpc.net/problem/13536)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 177, 정답: 113, 맞힌 사람: 92, 정답 비율: 67.153%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>괄호 문자열은 다음과 같이 정의된다.</p>

<ol>
	<li>빈 문자열은 괄호 문자열이다.</li>
	<li>S가 괄호 문자열일 때, (S)도 괄호 문자열이다.</li>
	<li>S와 T가 괄호 문자열이라면, ST도 괄호 문자열이다.</li>
	<li>모든 괄호 문자열은 위의 3개 규칙으로만 만들 수 있다.</li>
</ol>

<p>&#39;(&#39;와 &#39;)&#39;로 이루어진 문자열 S = s<sub>1</sub>s<sub>2</sub>...s<sub>N</sub>과 M개의 쿼리가 주어진다. 각각의 쿼리는 l<sub>i</sub>와 r<sub>i</sub>(1 &le; l<sub>i</sub> &le; r<sub>i</sub> &le; n)로 이루어져 있다. 각각의 쿼리에 대해서 다음을 구해야 한다.</p>

<ul>
	<li>S의 부분 문자열 s<sub>l<sub>i</sub></sub>, s<sub>l<sub>i+1</sub></sub>, ..., s<sub>r<sub>i</sub></sub>의 부분 수열&nbsp;중에서 괄호 문자열이면서 가장 긴 것의 길이를 출력한다.</li>
</ul>

<p>문자열&nbsp;S = s<sub>1</sub>s<sub>2</sub>...s<sub>N</sub>의 길이가 |x|인 부분 수열이란, 1 &le; k<sub>1</sub> &lt; k<sub>2</sub> &lt; ..., K<sub>|x|</sub> &le; N을 만족하는 문자열 x = s<sub>k<sub>1</sub></sub>s<sub>k<sub>2</sub></sub>...s<sub>k<sub>|x|</sub></sub>를 의미한다.</p>

### 입력

<p>첫째 줄에 문자열 S가 주어진다. (1 &le; N &le; 1,000,000)</p>

<p>둘째 줄에는 쿼리의 개수 M이 주어진다. (1 &le; M &le; 100,000)</p>

<p>셋째 줄부터 M개의 줄에 쿼리 l<sub>i</sub>와 r<sub>i</sub>가 주어진다.</p>

### 출력

<p>각각의 쿼리마다 정답을 출력한다.</p>