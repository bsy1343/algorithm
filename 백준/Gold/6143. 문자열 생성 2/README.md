# [Gold II] 문자열 생성 2 - 6143

[문제 링크](https://www.acmicpc.net/problem/6143)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 757, 정답: 179, 맞힌 사람: 139, 정답 비율: 27.912%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>N개의 문자로 이루어진 문자열 S가 입력된다.</p>

<p>이 문자열의 각 문자들로 새로운 문자열 T를 만들려고한다.</p>

<p>문자열 S로 문자열 T를 만드는 규칙은 다음과 같다.</p>

<ul>
	<li>문자열 S의 가장 앞의 문자 하나를 문자열 T의 마지막에 추가한다.</li>
	<li>문자열 S의 가장 뒤의 문자 하나를 문자열 T의 마지막에 추가한다.</li>
</ul>

<p>위 규칙으로 만들어진 문자열 T들 중 사전순으로 가장 빠른 문자열을 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 번째 줄에 문자열 S의 길이 N이 주어진다. (N &lt;= 30,000)</p>

<p>이후 N개의 줄에 S를 이루는 문자들이 주어진다.</p>

### 출력

<p>만들어진 사전순으로 가장 빠른 문자열을 출력한다. 80글자마다 새줄 문자를 출력해야 한다.</p>

### 힌트

<ol>
	<li>S=&quot;ACDBCB&quot;, T=&quot;&quot;</li>
	<li>S=&quot;CDBCB&quot;, T=&quot;A&quot;</li>
	<li>S=&quot;CDBC&quot;, T=&quot;AB&quot;</li>
	<li>S=&quot;CDB&quot;, T=&quot;ABC&quot;</li>
	<li>S=&quot;CD&quot;, T=&quot;ABCB&quot;</li>
	<li>S=&quot;D&quot;, T=&quot;ABCBC&quot;</li>
	<li>S=&quot;&quot;, T=&quot;ABCBCD&quot;</li>
</ol>