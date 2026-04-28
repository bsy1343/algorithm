# [Gold III] Trouble Sort - 27745

[문제 링크](https://www.acmicpc.net/problem/27745)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 30, 맞힌 사람: 30, 정답 비율: 73.171%

### 분류

애드 혹, 정렬

### 문제 설명

<p>Deep in Code Jam&#39;s secret algorithm labs, we devote countless hours to wrestling with one of the most complex problems of our time: efficiently sorting a list of integers into non-decreasing order. We have taken a careful look at the classic <a href="https://en.wikipedia.org/wiki/Bubble_sort">bubble sort</a> algorithm, and we are pleased to announce a new variant.</p>

<p>The basic operation of the standard bubble sort algorithm is to examine a pair of adjacent numbers, and reverse that pair if the left number is larger than the right number. But our algorithm examines a group of <i>three</i> adjacent numbers, and if the leftmost number is larger than the rightmost number, it reverses that entire group. Because our algorithm is a &quot;triplet bubble sort&quot;, we have named it Trouble Sort for short.</p>

<pre>
  TroubleSort(L): // L is a 0-indexed list of integers
    let done := false
    while not done:
      done = true
      for i := 0; i &lt; len(L)-2; i++:
        if L[i] &gt; L[i+2]:
          done = false
          reverse the sublist from L[i] to L[i+2], inclusive
</pre>

<p>For example, for L = 5 6 6 4 3, Trouble Sort would proceed as follows:</p>

<ul>
	<li>First pass:
	<ul>
		<li>inspect 5 6 6, do nothing: 5 6 6 4 3</li>
		<li>inspect 6 6 4, see that 6 &gt; 4, reverse the triplet: 5 4 6 6 3</li>
		<li>inspect 6 6 3, see that 6 &gt; 3, reverse the triplet: 5 4 3 6 6</li>
	</ul>
	</li>
	<li>Second pass:
	<ul>
		<li>inspect 5 4 3, see that 5 &gt; 3, reverse the triplet: 3 4 5 6 6</li>
		<li>inspect 4 5 6, do nothing: 3 4 5 6 6</li>
		<li>inspect 5 6 6, do nothing: 3 4 5 6 6</li>
	</ul>
	</li>
	<li>Then the third pass inspects the three triplets and does nothing, so the algorithm terminates.</li>
</ul>

<p>We were looking forward to presenting Trouble Sort at the Special Interest Group in Sorting conference in Hawaii, but one of our interns has just pointed out a problem: it is possible that Trouble Sort does not correctly sort the list! Consider the list 8 9 7, for example.</p>

<p>We need your help with some further research. Given a list of <b>N</b> integers, determine whether Trouble Sort will successfully sort the list into non-decreasing order. If it will not, find the index (counting starting from 0) of the first sorting error after the algorithm has finished: that is, the first value that is larger than the value that comes directly after it when the algorithm is done.</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each test case consists of two lines: one line with an integer <b>N</b>, the number of values in the list, and then another line with <b>N</b> integers <b>V<sub>i</sub></b>, the list of values.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1) and <code>y</code> is <code>OK</code> if Trouble Sort correctly sorts the list, or the index (counting starting from 0) of the first sorting error, as described above.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
	<li>0 &le; <b>V<sub>i</sub></b> &le; 10<sup>9</sup>, for all i.</li>
</ul>

### 힌트

<p>Sample Case #1 is similar to the first one described in the problem statement. Trouble Sort correctly sorts this list, so the answer is <code>OK</code>.</p>

<p>Sample Case #2 is the second one described in the problem statement. Trouble Sort does not correctly sort this list, since it terminates with the list 7 9 8. The 9 is the first value in the list that is larger than the next value, so the index of the first sorting error is 1.</p>