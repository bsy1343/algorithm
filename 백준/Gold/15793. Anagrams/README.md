# [Gold I] Anagrams - 15793

[문제 링크](https://www.acmicpc.net/problem/15793)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 40, 맞힌 사람: 35, 정답 비율: 89.744%

### 분류

그래프 이론, 그리디 알고리즘, 최대 유량, 최소 비용 최대 유량

### 문제 설명

<p>Elly has two strings of the same length A and B. Now she wants to transform A into an anagram of B by changing some of its letters.</p>

<p>Definition: We call two strings X and Y anagrams of each-other if we can re-arrange the letters in one of them to get the other.</p>

<p>The only operation the girl can make is cyclically increment one or more times some (possibly none or all) of the characters in A. Example increments are &#39;A&#39; to &#39;B&#39;, &#39;K&#39; to &#39;L&#39; or &#39;Z&#39; to &#39;A&#39;.</p>

<p>For example, she can transform &quot;ELLY&quot; to &quot;KRIS&quot; character by character by shifting &#39;E&#39; to &#39;K&#39; (6 operations), &#39;L&#39; to &#39;R&#39; (again 6 operations), the second &#39;L&#39; to &#39;I&#39; (23 operations, going from &#39;Z&#39; to &#39;A&#39; on the 15-th operation), and finally &#39;Y&#39; to &#39;S&#39; (20 operations, again cyclically going from &#39;Z&#39; to &#39;A&#39; on the 2-nd operation). The total number of operations would be 6 + 6 + 23 + 20 = 55. However, to make &quot;ELLY&quot; an anagram of &quot;KRIS&quot; it would be better to change it to &quot;IRSK&quot; with only 29 operations.</p>

<p>You are given the strings A and B. Write a program anagrams which calculates the minimal number of operations needed to transform A into some other string X, such that X is an anagram of B.</p>

### 입력

<p>On the first line of the standard input will be given the string A and on the next one &ndash; B. Both strings will contain only uppercase letters of the English alphabet (&#39;A&#39;-&#39;Z&#39;).</p>

### 출력

<p>On the standard output print one integer &ndash; the minimum number of increments.</p>

### 제한

<ul>
	<li>1 &le; |A| = |B| &le; 50 (|S| is the length of string S)</li>
</ul>