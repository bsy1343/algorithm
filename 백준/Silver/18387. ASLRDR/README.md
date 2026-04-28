# [Silver II] ASLRDR - 18387

[문제 링크](https://www.acmicpc.net/problem/18387)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 20, 맞힌 사람: 17, 정답 비율: 73.913%

### 분류

그리디 알고리즘, 문자열, 두 포인터

### 문제 설명

<p>Suppose an assembly line in a factory with N stations. In each station, workers do an activity on the product that might be the same as previous or next stations&rsquo; activity. The order of these stations is not important but they should be ordered such that the product insert to line from one side (Left or Right) and exit from other side (Right or Left) without reverse movement in line. Your job is writing a program to reorder an existing assembly line so that it passed the mentioned rule. You may reorder the assembly line in several &ldquo;station swapping&rdquo; but you only allow swap two adjacent stations.</p>

### 입력

<p>The first line of input gives n, the number of assembly lines (Test Cases).</p>

<p>For each test case, one line of input follows, containing a string of up to 100 letters or digits that are the name of stations.</p>

### 출력

<p>Output consists of one line per test case. This line will contain the least possible number of swaps, or &quot;Impossible&quot; if it is not possible to reorder the stations for passing the rule.</p>

<p>For example, assume we have 3 actions that are named 2,a and D which currently are ordered in an assembly line as &quot;2a2aD&quot;. To pass the mentioned rule it should reorder to &quot;2aDa2&quot; with 3 swaps as follows:</p>

<ul>
	<li>swap &quot;aD&quot; to yield &quot;2a2Da&quot;</li>
	<li>swap &quot;2D&quot; to yield &quot;2aD2a&quot;</li>
	<li>swap &quot;2a&quot; to yield &quot;2aDa2&quot;</li>
</ul>