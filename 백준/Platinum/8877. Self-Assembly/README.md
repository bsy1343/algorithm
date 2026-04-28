# [Platinum III] Self-Assembly - 8877

[문제 링크](https://www.acmicpc.net/problem/8877)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 104, 정답: 39, 맞힌 사람: 34, 정답 비율: 51.515%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 플로이드–워셜

### 문제 설명

<p>Automatic Chemical Manufacturing is experimenting with a process called self-assembly. In this process, molecules with natural afﬁnity for each other are mixed together in a solution and allowed to spontaneously assemble themselves into larger structures. But there is one problem: sometimes molecules assemble themselves into a structure of unbounded size, which gums up the machinery.</p>

<p>You must write a program to decide whether a given collection of molecules can be assembled into a structure of unbounded size. You should make two simplifying assumptions: 1) the problem is restricted to two dimensions, and 2) each molecule in the collection is represented as a square. The four edges of the square represent the surfaces on which the molecule can connect to other compatible molecules.</p>

<p>In each test case, you will be given a set of molecule descriptions. Each type of molecule is described by four two-character connector labels that indicate how its edges can connect to the edges of other molecules. There are two types of connector labels:</p>

<p>A uppercase letter (A, ..., Z) followed by + or -. Two edges are compatible if their labels have the same letter but different signs. For example, A+ is compatible with A- but is not compatible with A+ or B-.<br />
Two zero digits 00. An edge with this label is not compatible with any edge (not even with another edge labeled 00).</p>

<p>Assume there is an unlimited supply of molecules of each type, which may be rotated and reﬂected. As the molecules assemble themselves into larger structures, the edges of two molecules may be adjacent to each other only if they are compatible. It is permitted for an edge, regardless of its connector label, to be connected to nothing (no adjacent molecule on that edge).</p>

<p>Figure A.1 shows an example of three molecule types and a structure of bounded size that can be assembled from them (other bounded structures are also possible with this set of molecules).</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8877.%E2%80%85Self-Assembly/74791b2c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8877.%E2%80%85Self-Assembly/74791b2c.png" data-original-src="https://www.acmicpc.net/upload/images/sasem.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:249px; width:468px" /></p>

<p>Figure A.1: Illustration of Sample Input 1.</p>

### 입력

<p>The input consists of a single test case. A test case consists of two lines. The ﬁrst contains an integer n (1 &le; n &le; 40 000) indicating the number of molecule types. The second line contains n eight-character strings, each describing a single type of molecule, separated by single spaces. Each string consists of four two-character connector labels representing the four edges of the molecule in clockwise order.</p>

### 출력

<p>Display the word unbounded if the set of molecule types can generate a structure of unbounded size. Otherwise, display the word bounded.</p>