# [Gold I] Zamjena - 16240

[문제 링크](https://www.acmicpc.net/problem/16240)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 96, 정답: 42, 맞힌 사람: 36, 정답 비율: 43.902%

### 분류

자료 구조, 그래프 이론, 문자열, 집합과 맵, 분리 집합, 파싱

### 문제 설명

<p>Vlatko likes to play with integer arrays. He wrote two arrays of N elements on a piece of paper, each element being either a positive integer or a sequence of lowercase letters of the English alphabet representing a variable. A variable can be replaced with an arbitrary integer. It&#39;s possible that both arrays contain the same variable or the same variable occurs multiple times in an array. If that&rsquo;s the case, each occurence of the variable has to be replaced with the same integer in both arrays.</p>

<p>Vlatko wonders if it&#39;s possible to replace all variables with some integer values in such a way that the two arrays become equal. Two arrays are considered equal if the numbers on the same positions in the arrays are equal.</p>

### 입력

<p>The first line contains a positive integer N (1 &le; N &le; 50 000), the number of elements in each array.</p>

<p>The second line contains N elements of the first array.</p>

<p>The third line contains N elements of the second array.</p>

<p>Each element in both arrays can either be:</p>

<ul>
	<li>a positive integer less than 1 000 or</li>
	<li>a sequence of lowercase letters of the English alphabet (no longer than 10 characters) which represents a variable.</li>
</ul>

### 출력

<p>If it&#39;s possible to replace all variables with integer values in a way that the two arrays become equal, print &ldquo;DA&rdquo; (Croatian for yes, without the quotation marks). Otherwise print &ldquo;NE&rdquo; (Croatian for no).</p>