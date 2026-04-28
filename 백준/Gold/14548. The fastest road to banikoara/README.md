# [Gold IV] The fastest road to banikoara - 14548

[문제 링크](https://www.acmicpc.net/problem/14548)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 77, 정답: 63, 맞힌 사람: 54, 정답 비율: 84.375%

### 분류

그래프 이론, 자료 구조, 집합과 맵, 최단 경로, 해시를 사용한 집합과 맵, 데이크스트라

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14548.%E2%80%85The%E2%80%85fastest%E2%80%85road%E2%80%85to%E2%80%85banikoara/7ed9a120.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/14548.%E2%80%85The%E2%80%85fastest%E2%80%85road%E2%80%85to%E2%80%85banikoara/7ed9a120.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14548/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:left; height:346px; width:249px" />Codjo: I am ready for the trip to Banikoara</p>

<p>Bossi: Let us go through Parakou</p>

<p>Assiba: No, the fastest road to go to Banikoara is through Djougou</p>

<p>You are responsible to write a program which, given a list of towns and distances separating these towns, gives the shortest distance to travel from a town A to a town B</p>

### 입력

<p>The first line of input contains a single integer P, (1 &le; P &le; 1000), which is the number of data sets that follow. Each data set begins with a line containing the number N of the remaining lines in the dataset (1 &le; N &le; 500), followed by a space, followed by the name of a departure town, followed by a space, followed by the name of a destination town. Each of these N lines contains a name of a departure town, followed by a space, followed by a name of a destination town, followed by the distance (in kilometers) between the two towns. The distance will be an integer and the name of town will be a string formed with characters [a-z] [A-Z] and with the sign &ldquo;-&rdquo;.</p>

### 출력

<p>For each data set, you must generate a single output line containing the name of a town A and a space, followed by the name of town B, followed by a space, followed by the shortest distance to travel between towns A and B.</p>