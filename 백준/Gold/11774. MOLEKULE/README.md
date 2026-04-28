# [Gold IV] MOLEKULE - 11774

[문제 링크](https://www.acmicpc.net/problem/11774)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 120, 정답: 71, 맞힌 사람: 64, 정답 비율: 61.538%

### 분류

그래프 이론, 그래프 탐색, 트리, 해 구성하기, 이분 그래프

### 문제 설명

<p>Scientists in a chemical lab in Croatia have been studying the chemical bonds between different molecules. They have a special interest in a group of molecules of the chemical compound nitro hydrogen laminate.</p>

<p>The compound consists of N molecules bound together by N &minus; 1 covalent bonds and all the molecules are directly or indirectly tied together with bonds in a single structure.</p>

<p>The scientists want to modify the compound in a way that all the covalent bonds are transformed into directed covalent bonds. Because of the instability of the newly created compound, each molecule will have a large number of impulses coming out of it and travelling to other molecules using the directed bonds. An impulse can travel using the directed covalent bond only in the direction of the bond itself.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11774.%E2%80%85MOLEKULE/eae765e0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/11774.%E2%80%85MOLEKULE/eae765e0.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11774/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:161px; width:458px" /></p>

<p>The instability of the compound is defined as the largest possible number of bonds a single impulse can use to travel. The scientists want to direct the compound&rsquo;s covalent bonds in a way that the newly created compound is as stable as possible. In other words, their goal is to create a compound with the minimal longest path an impulse can take during its travel.</p>

<p>Help the scientists determine the direction of each covalent bond in the compound.</p>

### 입력

<p>The first line of input contains the integer N (2 &le; N &le; 100 000).</p>

<p>Each of the N &minus; 1 lines contains the integers a<sub>i</sub> and b<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; N) that denote that molecules a<sub>i</sub> and b<sub>i</sub> are connected with a covalent bond.</p>

### 출력

<p>Output N &minus; 1 lines, where each line must contain 1 if the covalent bond is going to be directed from a<sub>i</sub> to b<sub>i</sub>, otherwise it contains 0.</p>

<p>If there are multiple possible solutions, output any.</p>

### 힌트

<p>Clarification of the first sample: The example corresponds to the left image from the task. The longest path an impulse can take is 1. Notice that 0 1 is also a correct solution.</p>

<p>Clarification of the second sample: The example corresponds to the right image from the task.</p>