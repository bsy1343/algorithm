# [Platinum II] __builtout_popcount - 21863

[문제 링크](https://www.acmicpc.net/problem/21863)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 492, 정답: 82, 맞힌 사람: 30, 정답 비율: 20.408%

### 분류

비트마스킹

### 문제 설명

<p>GCC 내장 함수 중, <code>__builtin_popcount(unsigned int x)</code> 라는 함수가 존재한다. 이 함수는 <code>unsigned int</code> 형식인 <code>x</code>라는 값의 1비트가 몇 개 있는지를 구한다.</p>

<p>예를 들어,</p>

<ul>
	<li><code>__builtin_popcount(3) = 2</code>,</li>
	<li><code>__builtin_popcount(4) = 1</code>,</li>
	<li><code>__builtin_popcount(-1) = 32</code> (<code>unsigned int</code> 이므로)</li>
</ul>

<p>등의 값이 나온다.</p>

<p>65536 bit 짜리 정수에 대해서 이와 같은 기능을 하는 <code>__builtout_popcount</code> 함수를 구현해보자!&nbsp;<strong>단, bit값을 확인하는 연산은 최대 20번까지만 수행할 수 있다.</strong></p>

<p>자세한 사항은 <code>CUSTOM_BITSET::getbit</code> 의 구현내용과, <code>main</code> 에서 정답 판정을 하는 부분을 살펴보자.</p>

### 입력



### 출력



### 제한

<ul>
	<li>테스트케이스의 개수 T &le; 100</li>
	<li><code>CUSTOM_BITSET</code>&nbsp;의 bit 개수 = 65,536</li>
</ul>