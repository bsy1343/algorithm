# [Platinum III] Tour de Byteotia - 8225

[문제 링크](https://www.acmicpc.net/problem/8225)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 88, 정답: 49, 맞힌 사람: 41, 정답 비율: 58.571%

### 분류

해 구성하기, 자료 구조, 분리 집합, 그래프 이론

### 문제 설명

<p>There are n town in Byteotia. Some pairs of those are connected by bidirectional roads. The roads meet only at their endpoints, and thus do not cross; this is possible due to a system of tunnels and flyovers.</p>

<p>Soon a famous bicycle race, Tour de Byteotia, will begin. It is already known that the race&#39;s route will follow some Byteotian roads, will start and end in the same town, and will pass along any road at most once.</p>

<p>Byteasar is a famous Byteotian fan, the chief of the football team Byties fan club. Byteasar and his club pals detest all bicycle races. They want to block some roads so that the race&#39;s route cannot lead through the towns they live in. Byteasar knows in which towns the members of his club live. He wants to determine the minimum set of roads that have to be blocked in order to prevent the race from passing through any of the towns his club pals (including him) live in; to clarify: for every such town the race cannot lead through it. Your task is to help Byteasar in finding the proper set of roads.</p>

### 입력

<p>In the first line of the standard input there are three integers, n, m, and k (1 &le; n &le; 1,000,000, 0 &le; m &le; 2,000,000, 1 &le; k &le; n), separated by single spaces, that denote, respectively: the number of towns, the number of roads, and the number of towns the club members live in. The towns are numbered from 1 to n in such a way that the towns in which the club members live are numbered from 1 to k. Each of the m lines that follow holds two integers, a<sub>i</sub> and b<sub>i</sub> (1 &le; a<sub>i</sub> &lt; b<sub>i</sub> &le; n), separated by a single space, that indicate that the towns ai and bi are connected by a bidirectional road. Each pair of Byteotian towns is (directly) connected by at most one road.</p>

<p>In tests worth 40% of the total points n &le; 1,000 and m &le; 5,000 hold in addition.</p>

### 출력

<p>Your program should print out to the standard output a set of roads of minimum cardinality whose blockage would prevent the race from passing through any of the towns where the club members live in.</p>

<p>The program is to print this minimum cardinality in the first line of the output. In the following lines it is to specify the set of roads to be blocked, one road per line. For a given road, it should print the numbers of towns connected by it with the town with lower number coming first, and the numbers separated by a single space.</p>

<p>If more than one solution exists, your program should pick one arbitrarily.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8225.%E2%80%85Tour%E2%80%85de%E2%80%85Byteotia/5d03dc17.gif" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/8225/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:85px; width:212px" /></p>