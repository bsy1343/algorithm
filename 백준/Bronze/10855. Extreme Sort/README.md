# [Bronze II] Extreme Sort - 10855

[문제 링크](https://www.acmicpc.net/problem/10855)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 271, 정답: 230, 맞힌 사람: 199, 정답 비율: 84.681%

### 분류

구현

### 문제 설명

<p>John likes sorting algorithms very much. He has studied quicksort, merge sort, radix sort, and many more.</p>

<p>A long time ago he has written a lock-free parallel string sorting program. It was a combination of burstsort and multi-key quicksort. To implement burstsort you need to build a tree of buckets. For each input string you walk through the tree and insert part of the string into the right bucket. When a bucket fills up, it &quot;bursts&quot; and becomes a new subtree (with new buckets).</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/10855.%E2%80%85Extreme%E2%80%85Sort/386a31c4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10855/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:239px; width:495px" /></p>

<p style="text-align:center">Figure G.1: Burstsort data structure</p>

<p>Well, enough about the past. Today John is playing with sorting algorithms again. This time it&rsquo;s numbers. He has an idea for a new algorithm, &ldquo;extreme sort&rdquo;. It&rsquo;s extremely fast, performance levels are OVER NINETHOUSAND. Before he tells anyone any details, he wants to make sure that it works correctly.</p>

<p>Your task is to help him and verify that the so-called extreme property holds after the first phase of the algorithm. The extreme property is defined as min (x<sub>i,j</sub>) &ge; 0, where</p>

<pre>
x<sub>i,j</sub> = a<sub>j</sub> - a<sub>i</sub> (1 &le; i &lt; j &le; N)
     = 9001    (otherwise)</pre>

### 입력

<p>The first line contains a single integer N (1 &le; N &le; 1024). The second line contains N integers a<sub>1</sub> a<sub>2</sub> . . . a<sub>N</sub> (1 &le; a<sub>i</sub> &le; 1024).</p>

### 출력

<p>Print one line of output containing &ldquo;yes&rdquo; if the extreme property holds for the given input, &ldquo;no&rdquo; otherwise.</p>