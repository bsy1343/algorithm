# [Platinum IV] 다리 - 9006

[문제 링크](https://www.acmicpc.net/problem/9006)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 1308, 정답: 320, 맞힌 사람: 194, 정답 비율: 22.020%

### 분류

수학, 정렬

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9006.%E2%80%85%EB%8B%A4%EB%A6%AC/a9c5cfac.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9006/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:237px; width:178px" /></p>

<p>도시의 북쪽에서 남쪽으로 흐르는 두 개의 강에 집이 그림처럼 각 강에 늘어서 있다. 여기에 양쪽의 각 집에 사는 사람들이 다른 곳으로 더 빨리 움직일 수 있게 하기 위해 다리를 놓을 생각이다.</p>

<p>왼쪽 강은 정확히 \(x = -1\)의 세로선이고, 오른쪽 강은 정확히 \(x=1\)의 세로선이다. 다리는 두 강의 각각의 지점을 연결하는 \(x\)-축에 평행한 선으로 표시되어 있다. 집의 위치가 세로선 위에 표시되어 있다.</p>

<p>다리의 최적 장소를 결정하기 위해&nbsp;각각의 집이 \((-1,&nbsp;a_{i})\) 혹은 \((1, b_{j})\)&nbsp;(\(i=1,\cdots,n\), \(j=1,\cdots,m\))에 위치할 때,\[\sum_{\forall i,j}d(a_{i}, b_{j}) = \sum_{\forall i, j}\left(|a_{i}-h| +&nbsp;2 +&nbsp;|h - b_{j}|\right)\]를 최소화하는 \(h\)에, 즉 (가능한)&nbsp;왼쪽 집에서 오른쪽&nbsp;집으로 가는 모든 거리의 합을 최소화하는 \(h\)에 다리를 놓는 것이 좋을 것이다. 이를 출력하는 프로그램을 작성하라.</p>

### 입력

<p>첫째 줄에 T가 주어진다. 이는&nbsp;입력이&nbsp;T개의 테스트 케이스로 구성된다는 의미이다. 각각의 테스트 케이스의 첫째 줄에&nbsp;n과 m이 주어진다.&nbsp;(1 &le; n, m &le; 10<sup>6</sup>) n은 왼쪽 강의 집 수를, m은 오른쪽 강의 집 수를 의미한다. 다음 n개의 줄에는 n개의 왼쪽 강의 집 위치인 a<sub>i</sub>가 주어지고, 그 다음 m개의 줄에는 m개의 오른쪽 강의 집 위치 b<sub>j</sub>가 주어진다. (|a<sub>i</sub>|, |b<sub>j</sub>| &le; 10<sup>7</sup>)&nbsp;이 (n+m)개의 줄에 주어지는 집의 위치는 모두 다른 정수값이다.</p>

### 출력

<p>각각의 줄에 대해 문제의 조건을 만족하는 h를 소수점 한 자리까지&nbsp;한 줄에&nbsp;출력하라. 그런 h가 여러 개 존재한다면, 가장 작은 값을 출력하면 된다.&nbsp;</p>