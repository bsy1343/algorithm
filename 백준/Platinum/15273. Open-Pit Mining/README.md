# [Platinum I] Open-Pit Mining - 15273

[문제 링크](https://www.acmicpc.net/problem/15273)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 16, 맞힌 사람: 16, 정답 비율: 94.118%

### 분류

그래프 이론, 최대 유량, 최대 유량 최소 컷 정리

### 문제 설명

<p>Open-pit mining is a surface mining technique of extracting rock or minerals from the earth by their removal from an open pit or borrow. Open-pit mines are used when deposits of commercially useful minerals or rocks are found near the surface. Automatic Computer Mining (ACM) is a company that would like to maximize its profits by open-pit mining. ACM has hired you to write a program that will determine the maximum profit it can achieve given the description of a piece of land.</p>

<p>Each piece of land is modelled as a set of blocks of material. Block i has an associated value (v<sub>i</sub>), as well as a cost (c<sub>i</sub>), to dig that block from the land. Some blocks obstruct or bury other blocks. So for example if block i is obstructed by blocks j and k, then one must first dig up blocks j and k before block i can be dug up. A block can be dug up when it has no other blocks obstructing it.</p>

### 입력

<p>The first line of input is an integer N (1 &le; N &le; 200) which is the number of blocks. These blocks are numbered 1 through N.</p>

<p>Then follow N lines describing these blocks. The ith such line describes block i and starts with two integers v<sub>i</sub>, c<sub>i</sub> denoting the value and cost of the ith block (0 &le; v<sub>i</sub> , c<sub>i</sub> &le; 200)</p>

<p>Then a third integer 0 &le; m<sub>i</sub> &le; N &minus; 1 on this line describes the number of blocks that block i obstructs. Following that are m<sub>i</sub> distinct space separated integers between 1 and N (but excluding i) denoting the label(s) of the blocks that block i obstructs.</p>

<p>You may assume that it is possible to dig up every block for some digging order. The sum of values m<sub>i</sub> over all blocks i will be at most 500.</p>

### 출력

<p>Output a single integer giving the maximum profit that ACM can achieve from the given piece of land.</p>