# [Platinum V] Cycle String? - 17958

[문제 링크](https://www.acmicpc.net/problem/17958)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 187, 정답: 64, 맞힌 사람: 62, 정답 비율: 33.514%

### 분류

애드 혹, 해 구성하기, 많은 조건 분기

### 문제 설명

<p>Great wizard gave Alice and Bob a cycle string of length 2 &middot; n, which has no repeated substrings of length n. In a cycle string, character s<sub>i+1</sub> comes after s<sub>i</sub>. Also, s<sub>1</sub> comes after s<sub>2n</sub>.</p>

<p>Unfortunately, evil gin shuffled all the symbols of the string. Help Alice and Bob restore the original string so that the above condition is satisfied.</p>

### 입력

<p>The first line contains one string s of length 2&middot;n (2 &le; 2&middot;n &le; 1 000 000) which consists only of the lowercase Latin letters.</p>

### 출력

<p>Print &ldquo;NO&rdquo; (without quotes) to the first line if it is impossible to restore the string so that the condition is satisfied. Otherwise, in the first line print &ldquo;YES&rdquo; (without quotes).</p>

<p>In the second line print one string &mdash; the restored string.</p>

<p>If there are multiple answers, print any.</p>

### 힌트

<p>In the first example, substrings of the restored string are: &ldquo;abbab&rdquo;, &ldquo;bbabc&rdquo;, &ldquo;babcb&rdquo;, &ldquo;abcbc&rdquo;, &ldquo;bcbcc&rdquo;, &ldquo;cbccb&rdquo;, &ldquo;bccba&rdquo;, &ldquo;ccbab&rdquo;, &ldquo;cbabb&rdquo;, &ldquo;babba&rdquo;.</p>

<p>Note that the first example does not contain repetitions, however it can be rewritten as another cycle with no repetitions. Thus, the solution is not unique &mdash; the given example is also a correct solution.</p>

<p>In the second example, it is impossible to restore the string so that no repetition exists.</p>

<p>In the third example, there is no need to change anything.</p>