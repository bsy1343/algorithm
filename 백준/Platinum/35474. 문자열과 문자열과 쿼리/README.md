# [Platinum IV] 문자열과 문자열과 쿼리 - 35474

[문제 링크](https://www.acmicpc.net/problem/35474)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 10, 맞힌 사람: 10, 정답 비율: 58.824%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>비어 있는 두 문자열 $A$, $B$가 있다. 아래의 세 가지 종류의 쿼리를 순서대로 처리하는 프로그램을 작성하여라.</p>

<ul>
<li><span style="color:#e74c3c;"><code>1 c x</code></span>: 문자열 $A$의 맨 뒤에 문자 $c$를 $x$번 이어 붙인다.</li>
<li><span style="color:#e74c3c;"><code>2 c x</code></span>: 문자열 $B$의 맨 뒤에 문자 $c$를 $x$번 이어 붙인다.</li>
<li><span style="color:#e74c3c;"><code>3</code></span>: 현재 문자열 $A$와 $B$의 <strong>최장 공통 <span style="color:#c0392b;">연속</span> 부분문자열(Longest Common <span style="color:#c0392b;">Substring</span>)</strong>의 길이를 출력한다.</li>
</ul>

<p>모든 쿼리를 처리하면서, <span style="color:#e74c3c;"><code>3</code></span>번 쿼리가 주어질 때마다 해당 시점의 답을 출력하여라.</p>

### 입력

<p>첫째 줄에 쿼리의 개수 $Q$가 주어진다. $(1\le Q\le 5\,000)$</p>

<p>다음 $Q$개의 줄에 걸쳐 쿼리가 한 줄에 하나씩 주어진다. 각 쿼리는 다음 세 가지 형식 중 하나이다. $c$는 알파벳 소문자이며 $x$는 양의 정수이다. $(1\le x\le 100\, 000)$</p>

<ul>
<li><span style="color:#e74c3c;"><code>1 c x</code></span></li>
<li><span style="color:#e74c3c;"><code>2 c x</code></span></li>
<li><span style="color:#e74c3c;"><code>3</code></span></li>
</ul>

<p><span style="color:#e74c3c;"><code>3</code></span>번 쿼리가 최소 한 번 이상 주어짐이 보장된다.</p>

### 출력

<p><span style="color:#e74c3c;"><code>3</code></span>번 쿼리가 주어질 때마다 현재 문자열 $A$와 $B$의 최장 공통 연속 부분문자열의 길이를 한 줄에 하나씩 출력한다.</p>

### 힌트

<p>어떤 문자열의 연속 부분문자열(substring)이란, 문자열에서 연속한 구간을 선택하여 얻는 문자열을 의미한다. 예를 들어 문자열 <span style="color:#e74c3c;"><code>abcde</code></span>의 연속 부분문자열에는 <span style="color:#e74c3c;"><code>a</code></span>, <span style="color:#e74c3c;"><code>bc</code></span>, <span style="color:#e74c3c;"><code>cde</code></span>, <span style="color:#e74c3c;"><code>abcde</code></span> 등이 있으며, <span style="color:#e74c3c;"><code>ace</code></span>는 연속 부분문자열이 아니다.</p>

<p>두 문자열의 최장 공통 연속 부분문자열이란, 두 문자열의 공통된 연속 부분문자열 중 길이가 가장 긴 것을 의미한다. 예를 들어 $A=$ <span style="color:#e74c3c;"><code>aaabb</code></span>, $B=$ <span style="color:#e74c3c;"><code>caaab</code></span> 라면 두 문자열의 최장 공통 연속 부분문자열은 <span style="color:#e74c3c;"><code>aaab</code></span>이며, 그 길이는 $4$이다.</p>