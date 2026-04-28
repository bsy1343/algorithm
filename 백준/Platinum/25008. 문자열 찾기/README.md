# [Platinum II] 문자열 찾기 - 25008

[문제 링크](https://www.acmicpc.net/problem/25008)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 297, 정답: 100, 맞힌 사람: 81, 정답 비율: 31.395%

### 분류

문자열, 해싱, KMP

### 문제 설명

<p>영어 소문자로 구성된 두 문자열 $A$와 $B$에 대해서 다음의 조건이 만족될 때, 두 문자열은 &ldquo;<strong>사실상 같다</strong>&rdquo;고 한다.</p>

<ol>
	<li>$A$와 $B$의 길이가 같다.</li>
	<li>모든 가능한 정수 $i$와 $j$에 대해 $A$의 $i$번째와 $j$번째 글자가 같으면 $B$의 $i$번째와 $j$번째 글자도 같다.</li>
	<li>모든 가능한 정수 $i$와 $j$에 대해 $A$의 $i$번째와 $j$번째 글자가 다르면 $B$의 $i$번째와 $j$번째 글자도 다르다.</li>
</ol>

<p>예를 들어, $A = $<code>aba</code>와 $B = $<code>pqp</code>는 사실상 같은 문자열들이다. 하지만, $A = $<code>abca</code>와 $B =$<code>abcb</code>는 사실상 같은 문자열의 쌍이 아니다.</p>

<p>문자열 $T$와 $P$를 받아서 $T$의 연속된 부분문자열들 중 $P$와 사실상 같은 부분문자열의 개수를 계산하는 프로그램을 작성하라.</p>

<p>예를 들어, $T =$<code>abababbab</code>이고 $P =$<code>pqp</code>인 경우 $T$의 왼쪽부터 <code>aba</code>, <code>bab</code>, <code>aba</code>, <code>bab</code>, <code>bab</code>의 $5$개의 부분문자열이 $P$와 사실상 같은 것들임을 알 수 있다. 여러분은 다음 함수를 작성하여야 한다.</p>

<ul>
	<li><code>int findP( char T [], char P [], int N, int M )</code> : <code>T</code>는 길이 <code>N+1</code>인 배열(문자열)이다. <code>P</code>는 길이 <code>M+1</code>인 배열이다. <code>T</code>와 <code>P</code>에는 각각 길이 <code>N</code>과 <code>M</code>인 영어 소문자 문자열이 저장되어 있다. <code>T</code>와 <code>P</code>의 마지막 위치에는 &lsquo;<code>\0</code>&rsquo;이 저장되어 있다. <code>findP</code>는 <code>T</code>의 연속된 부분문자열들 중 <code>P</code>와 사실상 같은 부분문자열의 개수를 리턴해야 한다.</li>
</ul>

### 입력



### 출력



### 제한

<ul>
	<li>$1 &le; N &le; 1\,000\,000$, $1 &le; M &le; N$.</li>
</ul>