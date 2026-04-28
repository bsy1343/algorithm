# [Platinum I] Joining Arrays - 16274

[문제 링크](https://www.acmicpc.net/problem/16274)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 9, 맞힌 사람: 8, 정답 비율: 25.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 문자열, 접미사 배열과 LCP 배열

### 문제 설명

<p>Consider two arrays of integers A&thinsp;=&thinsp;[a<sub>1</sub>,&thinsp;a<sub>2</sub>,&thinsp;...,&thinsp;a<sub>n</sub>] and B&thinsp;=&thinsp;[b<sub>1</sub>,&thinsp;b<sub>2</sub>,&thinsp;...,&thinsp;b<sub>m</sub>]. Let us introduce their k-join as a lexicographically smallest array R of length k, that can be divided to two non-empty subsequences, first of which is a subsequence of A, and the second one is a subsequence of B.</p>

<p>Formally speaking, you need to find such array R&thinsp;=&thinsp;[r<sub>1</sub>,&thinsp;r<sub>2</sub>,&thinsp;...,&thinsp;r<sub>k</sub>], that there are two non-empty sequences of indices 1&thinsp;&le;&thinsp;i<sub>1,1</sub>&thinsp;&lt;&thinsp;i<sub>1,2</sub>&thinsp;&lt;&thinsp;...&thinsp;&lt;&thinsp;i<sub>1,t</sub>&thinsp;&le;&thinsp;n and 1&thinsp;&lt;&thinsp;j<sub>1,1</sub>&thinsp;&lt;&thinsp;j<sub>1,2</sub>&thinsp;&lt;&thinsp;...&thinsp;&lt;&thinsp;j<sub>1,k-t</sub>&thinsp;&le;&thinsp;m in the original arrays, and two sequences of indices 1&thinsp;&le;&thinsp;i<sub>2,1</sub>&thinsp;&lt;&thinsp;i<sub>2,2</sub>&thinsp;&lt;&thinsp;...&thinsp;&lt;&thinsp;i<sub>2,t</sub>&thinsp;&le;&thinsp;k and 1&thinsp;&le;&thinsp;j<sub>2,1</sub>&thinsp;&lt;&thinsp;j<sub>2,2</sub>&thinsp;&lt;&thinsp;...&thinsp;&lt;&thinsp;j<sub>2,k-t</sub>&thinsp;&le;&thinsp;k, such that:</p>

<ul>
	<li>For each 1&thinsp;&le;&thinsp;p&thinsp;&le;&thinsp;t, 1&thinsp;&le;&thinsp;q&thinsp;&le;&thinsp;k&thinsp;-&thinsp;t we have i<sub>2,p</sub>&thinsp;&ne;&thinsp;j<sub>2,q</sub>;</li>
	<li>For each 1&thinsp;&le;&thinsp;p&thinsp;&le;&thinsp;t we have a<sub>i<sub>1,p</sub></sub>&thinsp;=&thinsp;r<sub>i<sub>1,p</sub></sub>;</li>
	<li>For each 1&thinsp;&le;&thinsp;p&thinsp;&le;&thinsp;k&thinsp;-&thinsp;t we have b<sub>j<sub>1,p</sub></sub>&thinsp;=&thinsp;r<sub>j<sub>1,p</sub></sub>.</li>
</ul>

<p>For example if A&thinsp;=&thinsp;[1,&thinsp;2,&thinsp;1,&thinsp;3,&thinsp;1,&thinsp;2,&thinsp;1], B&thinsp;=&thinsp;[1,&thinsp;2,&thinsp;3,&thinsp;1], and k&thinsp;=&thinsp;9, their k-join is the array R&thinsp;=&thinsp;[1,&thinsp;1,&thinsp;1,&thinsp;1,&thinsp;2,&thinsp;1,&thinsp;2,&thinsp;3,&thinsp;1] (subsequence from the first array &mdash; [1,&thinsp;1,&thinsp;1,&thinsp;2,&thinsp;1], subsequence from the second array &mdash; [1,&thinsp;2,&thinsp;3,&thinsp;1]).</p>

<p>For two given arrays A and B, and an integer k find their k-join R.</p>

### 입력

<p>The first line of input contains n &mdash; length of array A (1&thinsp;&le;&thinsp;n&thinsp;&le;&thinsp;3000).</p>

<p>The second line contains n integers a<sub>i</sub> &mdash; array A (1&thinsp;&le;&thinsp;a<sub>i</sub>&thinsp;&le;&thinsp;3000).</p>

<p>The third line contains m &mdash; length of array B (1&thinsp;&le;&thinsp;m&thinsp;&le;&thinsp;3000).</p>

<p>The fourth line contains m integers b<sub>i</sub> &mdash; array B (1&thinsp;&le;&thinsp;b<sub>i</sub>&thinsp;&le;&thinsp;3000).</p>

<p>The last line contains integer k (2&thinsp;&le;&thinsp;k&thinsp;&le;&thinsp;n&thinsp;+&thinsp;m).</p>

### 출력

<p>Output k-join of the given arrays.</p>