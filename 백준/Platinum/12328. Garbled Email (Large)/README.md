# [Platinum III] Garbled Email (Large) - 12328

[문제 링크](https://www.acmicpc.net/problem/12328)

### 성능 요약

시간 제한: 60 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 문자열, 트리, 해싱, 트라이

### 문제 설명

<p>Gagan just got an email from her friend Jorge. The email contains important information, but unfortunately it was corrupted when it was sent: all of the spaces are missing, and after the removal of the spaces, some of the letters have been changed to other letters! All Gagan has now is a string <b>S</b> of lower-case characters.</p>

<p>You know that the email was originally made out of words from the dictionary described below. You also know the letters were changed after the spaces were removed, and that the difference between the indices of any two letter changes is not less than 5. So for example, the string &quot;code jam&quot; could have become &quot;codejam&quot;, &quot;dodejbm&quot;, &quot;zodejan&quot; or &quot;cidejab&quot;, but not &quot;kodezam&quot; (because the distance between the indices of the &quot;k&quot; change and the &quot;z&quot; change is only 4).</p>

<p>What is the minimum number of letters that could have been changed?</p>

<p>The dictionary contains <b>W</b> words of at least 1 and at most 10 lower-case characters and is given at the start of the input file. It is not a dictionary from any natural language, though it does contain some English words. The dictionary is the same for all test cases in a single input file. The dictionary is given in lexicographically increasing order and does not contain duplicate words.</p>

### 입력

<p>The first line of the input gives the number of words in the dictionary, <b>W</b>. Each of the next <b>W</b> lines contains a string of lower-case characters a-z representing a word in the dictionary. The next line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each test case consists of a single line containing a string <b>S</b>, consisting of lower-case characters a-z.</p>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the minimum number of letters that could have been changed in order to make <b>S</b>.</p>

### 제한

<ul>
	<li><b>W</b> = 521196.</li>
	<li>Each word in the dictionary contains at least 1 and at most 10 lower-case characters.</li>
	<li>The dictionary is sorted in lexicographically increasing order.</li>
	<li>The dictionary does not contain duplicate words.</li>
	<li>The total number of characters in the dictionary is 3323296.</li>
	<li><b>S</b> is valid: it is possible to make it using the method described above.</li>
	<li>1 &le; <b>T</b> &le; 4.</li>
	<li>1 &le; length of <b>S</b> &le; 4000.</li>
	<li style="display: block; width: 0px; height: 0px; padding: 0px; border: 0px; margin: 0px; position: absolute; top: 0px; left: -9999px; opacity: 0; overflow: hidden;"> </li>
</ul>

### 힌트

<p>&quot;code&quot; and &quot;jam&quot; both appear in the dictionary. Although &quot;cooperation&quot; is an English word, it doesn&#39;t appear in the dictionary; &quot;aabea&quot; does.</p>

<p>Note that to make the sample case visible in the problem statement, the size of the dictionary in the sample case does not satisfy the limits.</p>