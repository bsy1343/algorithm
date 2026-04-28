# [Silver V] Peter and the Textbook - 12803

[문제 링크](https://www.acmicpc.net/problem/12803)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 95, 정답: 65, 맞힌 사람: 57, 정답 비율: 78.082%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Peter was cleaning his room today and found his old English Literature textbook. He doesn&#39;t like the subject, so he decided to break it down, tearing pages from it one after another.</p>

<p>The textbook has&nbsp;<em>n</em>&nbsp;pages, numbered from 1 to&nbsp;<em>n</em>. The book is bound in such way that the page number&nbsp;<em>i</em>&nbsp;is actually on the same sheet as the page number&nbsp;<em>n</em>&thinsp;-&thinsp;<em>i</em>&thinsp;+&thinsp;1. So if Peter tears away one of the pages, the other page on the same sheet also gets removed. Peter tears pages one after another, and sometimes wants to know: what is the&nbsp;<em>p</em>-th page among those still in the textbook. Help him to answer such questions.</p>

### 입력

<p>Input data contains several test cases. The first line contains the number of test cases&nbsp;<em>t</em>&nbsp;(1&thinsp;&le;&thinsp;<em>t</em>&thinsp;&le;&thinsp;1000).</p>

<p>Each of the following&nbsp;<em>t</em>&nbsp;test cases is specified as follows. The first line of the test case contains two integers&nbsp;<em>n</em>,&nbsp;<em>q</em>&nbsp;(2&thinsp;&le;&thinsp;<em>n</em>&thinsp;&le;&thinsp;100,&nbsp;<em>n</em>&nbsp;is even; 1&thinsp;&le;&thinsp;<em>q</em>&thinsp;&le;&thinsp;100)&nbsp;&mdash; the number of pages in the textbook and the number of queries. The following&nbsp;<em>q</em>&nbsp;lines contain queries:</p>

<ul>
	<li>- i&nbsp;&mdash; Peter tears away page number&nbsp;<em>i</em>&nbsp;(the page on the same sheet is also removed);</li>
	<li>? p&nbsp;&mdash; Peter wants to know what is the number of the&nbsp;<em>p</em>-th among the still remaining pages.</li>
</ul>

<p>It is guaranteed that for the removal query the page is still in the textbook, and for the page number query the textbook contains at least&nbsp;<em>p</em>&nbsp;pages.</p>

### 출력

<p>For each query output the number of the corresponding page.</p>