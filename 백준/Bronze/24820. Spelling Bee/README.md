# [Bronze II] Spelling Bee - 24820

[문제 링크](https://www.acmicpc.net/problem/24820)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 241, 정답: 160, 맞힌 사람: 125, 정답 비율: 64.103%

### 분류

구현, 문자열

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/24820.%E2%80%85Spelling%E2%80%85Bee/f461557d.png" data-original-src="https://upload.acmicpc.net/553e5927-ccad-4e0c-bef4-30ce08ad6779/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 272px; float: right;" />The New York Times publishes a daily puzzle called the &quot;Spelling Bee.&quot; In this puzzle, $7$ letters are shown in a hexagonal arrangement of $6$ letters around a center letter. &nbsp;The task is to come up with as many words as possible that&nbsp;</p>

<ul>
	<li>contain only letters that are displayed in the hexagon,</li>
	<li>are at least of length $4$, and</li>
	<li>contain the center letter.</li>
</ul>

<p>A letter may be used more than once, and not all letters need to be used.</p>

<p>After playing for a while, you get stuck, but then you remind yourself that the Linux distribution on your computer comes with a machine-readable file of $102\,305$ dictionary words in <code>/usr/share/dict/words</code>!</p>

<p>You decide that even if you can&#39;t excel at the Spelling Bee you can still excel at programming, so you decide to write a program that finds all solutions to a Spelling Bee puzzle from your dictionary.</p>

### 입력

<p>The input consists of a single test case, which starts with a line with $7$ distinct lowercase English letters. The first of these letters is the center letter. &nbsp;The next line contains an integer $n$ ($1 \le n \le 102\,305$), the size of the dictionary. This line is followed by $n$ lines, each containing a dictionary word of $l$ lowercase English letters ($1 \le l \le 24$).</p>

### 출력

<p>Output the word list matching the Spelling Bee puzzle in the order in which they appear in the dictionary. &nbsp;You are guaranteed that at least one dictionary entry will match.</p>