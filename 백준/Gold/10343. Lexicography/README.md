# [Gold III] Lexicography - 10343

[문제 링크](https://www.acmicpc.net/problem/10343)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 33, 정답: 23, 맞힌 사람: 23, 정답 비율: 79.310%

### 분류

수학, 문자열, 정렬, 조합론, 재귀

### 문제 설명

<p>An anagram of a string is any string that can be formed using the same letters as the original. (We consider the original string an anagram of itself as well.) For example, the string <code>ACM</code> has the following 6 anagrams, as given in alphabetical order:</p>

<pre>
ACM
AMC
CAM
CMA
MAC
MCA</pre>

<p>As another example, the string <code>ICPC</code> has the following 12 anagrams (in alphabetical order):</p>

<pre>
CCIP
CCPI
CICP
CIPC
CPCI
CPIC
ICCP
ICPC
IPCC
PCCI
PCIC
PICC
</pre>

<p>Given a string and a rank <em>K</em>, you are to determine the <em>K</em><sup><small>th</small></sup> such anagram according to alphabetical order.</p>

### 입력

<p>Each test case will be designated on a single line containing the original word followed by the desired rank <em>K</em>. Words will use uppercase letters (i.e., <code>A</code> through <code>Z</code>) and will have length at most 16. The value of <em>K</em> will be in the range from 1 to the number of distinct anagrams of the given word. A line of the form &quot;<code># 0</code>&quot; designates the end of the input.</p>

<p><strong>Warning:</strong> The value of <em>K</em> could be almost 2<sup><small>45</small></sup> in the largest tests, so you should use type <code>long</code> in Java, or type <code>long long</code> in C++ to store <em>K</em>.</p>

### 출력

<p>For each test, display the <em>K</em><sup><small>th</small></sup> anagram of the original string.</p>