# [Platinum IV] Connections - 15285

[문제 링크](https://www.acmicpc.net/problem/15285)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 148, 정답: 62, 맞힌 사람: 55, 정답 비율: 40.441%

### 분류

그래프 이론, 그래프 탐색, 애드 혹, 해 구성하기, 깊이 우선 탐색

### 문제 설명

<p>Hard times are coming to Byteland. Quantum computing is becoming mainstream and Qubitland is going to occupy Byteland. The main problem is that Byteland does not have enough money for this war, so the King of Byteland Byteman 0x0B had decided to reform its road system to reduce expenses.</p>

<p>Byteland has n cities that are connected by m one-way roads and it is possible to get from any city to any other city using these roads. No two roads intersect outside of the cities and no other roads exist. By the way, roads are one-way because every road has a halfway barrier that may be passed in one direction only. These barriers are intended to force enemies to waste their time if they choose the wrong way.</p>

<p>The idea of the upcoming road reform is to abandon some roads so that exactly 2n roads remain. Advisers of the King think that it should be enough to keep the ability to get from any city to any other city. (Maybe even less is enough? They do not know for sure.) The problem is how to choose roads to abandon. Everyone in Byteland knows that you are the only one who can solve this problem.</p>

### 입력

<p>Input consists of several test cases. The first line of the input contains the number of tests cases.</p>

<p>The first line of each test case contains n and m &mdash; the number of cities and the number of roads correspondingly (n &ge; 4, m &gt; 2n). Each of the next m lines contains two numbers xi and yi denoting a road from city x<sub>i</sub> to city y<sub>i</sub> (1 &le; x<sub>i</sub>, y<sub>i</sub> &le; n, x<sub>i</sub> &ne; y<sub>i</sub>). It is guaranteed that it is possible to get from any city to any other city using existing roads only. For each pair (x, y) of cities there is at most one road going from city x to city y and at most one road going from city y to city x. The solution is guaranteed to exist. The sum of m over all test cases in a single input does not exceed 100 000.</p>

### 출력

<p>For each test case output m &minus; 2n lines. Each line describes a road that should be abandoned. Print the road in the same format as in the input: the number of the source city and the number of the destination city. The order of roads in the output does not matter, but each road from the input may appear in the output at most once and each road in the output must have been in the input. It still must be possible to get from any city to any other city using the remaining roads.</p>

### 힌트

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15285.%E2%80%85Connections/86a8b49d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15285/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:171px; width:181px" /></p>