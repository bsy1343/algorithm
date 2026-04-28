# [Platinum IV] Wires Puzzle - 27205

[문제 링크](https://www.acmicpc.net/problem/27205)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

그래프 이론

### 문제 설명

<p>This is interactive problem. Your program will interact with judges&#39; program using standard input and standard output.</p>

<p>Friends are planing a puzzle which has the following structure. There are $n$ similar wires put through the opaque pipe. One of the pipe ends is the left one, another is the right one. The friends see $n$ wires at each end of the pipe, the wires are labeled by distinct integers from $1$ to $n$ at each end, but a wire can have different labels at different ends of the pipe.</p>

<p>The goal of the puzzle is to make correspondence between wire ends, that is --- for each $i$ from $1$ to $n$ find the number $a_i$ such that the wire with $i$ on the right end is marked with $a_i$ on the left end.</p>

<p>To solve the puzzle it is possible to make the following requests. You can choose an integer $k$ ($1 \le k \le n$) and divide the wires at the right end to $k$ non-empty groups, connecting all wires inside the same group. After that using a special device it is possible to detect for each pair of wires at their left end, whether their right ends are connected. Therefore for the left ends of the wires it is now known which labels correspond to the wires from the same group.</p>

<p>It is required to find the correspondence between left and right ends of the wires, using exactly three such queries.</p>

<p>To better understand the actions in the problem, it is recommended to study the example description below.</p>

### 입력



### 출력



### 힌트

<p>Consider the example above.</p>

<p>There are 4 wires. </p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27205.%E2%80%85Wires%E2%80%85Puzzle/ed0c136e.png" data-original-src="https://upload.acmicpc.net/1e9e9458-1320-4d1b-95f7-80724c6480ef/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 350px; height: 103px;" /></p>

<p>The first query: there are three groups, the wires with right labels 1 and 2 are connected, the wire with right label 3 is in a group by itself, so is the wire with right label 4.</p>

<p>The judges&#39; program responds that the wires with left labels 2 and 3 are in the same group, the wire with the left label 1 is in a group by itself, and so is the wire with the left label 4.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27205.%E2%80%85Wires%E2%80%85Puzzle/6cae14f9.png" data-original-src="https://upload.acmicpc.net/f9f0b81f-5c03-4972-8eca-7582a72a3f8a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 372px; height: 104px;" /></p>

<p>Analyzing the response, the contestant&#39;s program understands that the wires with left labels 2 and 3 are in some order the wires with right labels 1 and 4, and the wires with left labels 1 and 4 are in some order the wires with right labels 3 and 4.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27205.%E2%80%85Wires%E2%80%85Puzzle/cb1fac1e.png" data-original-src="https://upload.acmicpc.net/bddc9c2f-4aee-434a-bcb0-c8b86536feb8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 372px; height: 106px;" /></p>

<p>The second query has two groups of wires, wires with right labels 1, 2 and 3 are connected, the wire with right label 4 is in a group by itself.</p>

<p>The judges&#39; program responds that the wires with left labels 2, 3 and 4 have the right ends connected.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27205.%E2%80%85Wires%E2%80%85Puzzle/5f0531e7.png" data-original-src="https://upload.acmicpc.net/59f5ff48-f63e-4bcb-b10d-32a4564d2d90/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 372px; height: 103px;" /></p>

<p>The contestant&#39;s program understands that the wire with the right label 4 is has its left label 1, therefore the wire with the right label 3 has its left label 4.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27205.%E2%80%85Wires%E2%80%85Puzzle/751ed68c.png" data-original-src="https://upload.acmicpc.net/ad442c95-a8da-4627-9c67-9a3f818dea9f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 372px; height: 102px;" /></p>

<p>The third query similarly allows to distinguish between wires with right labels 1 and 2. Now the correspondence is clear.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27205.%E2%80%85Wires%E2%80%85Puzzle/b52fd792.png" data-original-src="https://upload.acmicpc.net/1678dfe1-d810-462c-8aa4-8d41dbd9d21c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 372px; height: 226px;" /></p>