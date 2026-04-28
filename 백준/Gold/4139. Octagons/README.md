# [Gold III] Octagons - 4139

[문제 링크](https://www.acmicpc.net/problem/4139)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 25, 맞힌 사람: 20, 정답 비율: 68.966%

### 분류

구현, 문자열

### 문제 설명

<p>Below is a picture of an infinite hyperbolic tessellation of octagons. If we think of this as a graph of vertices (of degree three), then there exists an isomorphism of the graph which maps any vertex <em>x</em> onto any other vertex <em>y</em>. Every edge is given a label from the set <em>{a,b,c}</em> in such a way that every vertex has all three types of edges incident on it, and the labels alternate around each octagon. Part of this labeling is illustrated in the diagram.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4139.%E2%80%85Octagons/8ac2ce73.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4139.%E2%80%85Octagons/8ac2ce73.png" data-original-src="https://upload.acmicpc.net/01ef711e-3f53-4f5d-b24e-b27b399f2a7f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>So a path in this graph (starting from any vertex) can be specified by a sequence of edge labels. Your job is to write a program which, given a squence of labels such as &quot;abcbcbcabcaccabb&quot;, returns &quot;closed&quot; if the path ends on the same vertex where it starts, and returns &quot;open&quot; otherwise.</p>

### 입력

<p>The input will begin with a number <em>Z</em> &le; 200 on a line by itself. This is followed by <em>Z</em> lines, each of which is a squence of length at least 1 and at most 40 of &#39;a&#39;s &#39;b&#39;s and &#39;c&#39;s.</p>

### 출력

<p>For each input instance, the output will be the words &quot;closed&quot; or &quot;open&quot;, each on a single line.</p>