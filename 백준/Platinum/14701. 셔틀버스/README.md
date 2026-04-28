# [Platinum III] 셔틀버스 - 14701

[문제 링크](https://www.acmicpc.net/problem/14701)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 603, 정답: 124, 맞힌 사람: 98, 정답 비율: 25.654%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색

### 문제 설명

<p>서울대학교 내부를 운행하는 셔틀버스에는 한쪽 벽면에 N개의 좌석이 일렬로 놓여 있다. 각 좌석은 가장 왼쪽 좌석부터 시작하여 1번부터 N번까지의 번호가 붙어 있다. 이 버스는 학교 입구에서 N명의 학생들을 태운 뒤 출발하고, 학생들은 각자 하나의 좌석을 골라 앉는다. 편의상 출발할 때 i번 좌석에 앉은 학생을 i번 학생으로 부르기로 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14701.%E2%80%85%EC%85%94%ED%8B%80%EB%B2%84%EC%8A%A4/461f2ee3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/14701.%E2%80%85%EC%85%94%ED%8B%80%EB%B2%84%EC%8A%A4/461f2ee3.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14701/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:115px; width:352px" /></p>

<p>학생들은 칸막이에 기대서 조는 것을 좋아하기 때문에 되도록 양쪽 끝자리에 앉고 싶어 한다. 그래서 바로 옆에 앉아 있던 학생이 내리거나 다른 자리로 옮겨 가서 좌석이 비었을 때 그 좌석으로 옮겨 앉는 게 양쪽 끝 자리에 더 가까워질 경우, 즉 1번 좌석과 N번 좌석 중 더 가까운 좌석까지의 거리가 줄어들 경우 그 좌석으로 옮겨 앉는다. 한 학생이 버스에서 내리는 즉시 모든 학생이 이 규칙에 따라 이동한다.</p>

<p>셔틀버스 기사 찬수는 버스에서 내리는 학생들을 보면서 지금 어떤 좌석에 어떤 학생이 앉아 있는지 궁금해 졌다. 찬수를 위해 아래의 두 가지 연산을 입력되는 순서대로 수행하는 프로그램을 작성해 주자.</p>

<ol>
	<li><code>1 x</code> : x번 학생이 버스에서 내린다. 이 학생은 버스에 타고 있던 학생임이 보장된다.</li>
	<li><code>2 x</code> : x번 좌석에 앉아 있는 학생의 번호를 출력한다. 좌석이 비어 있을 경우는 0을 출력한다</li>
</ol>

<p>찬수가 운전하는 버스는 차고지로 들어가는 버스이기 때문에 새로운 학생을 태우지는 않는다.</p>

### 입력

<p>첫 번째 줄에 셔틀버스에 있는 좌석의 수 N(1 &le; N &le; 200, 000), 처리해야 하는 연산의 수 M(1 &le; M &le; 400, 000)이 주어진다.</p>

<p>두 번째 줄부터 M개의 줄에 걸쳐 각 쿼리의 종류(1 또는 2)와 x(1 &le; x &le; N) 값이 공백을 사이에 두고 주어진다. 2번 쿼리가 하나 이상 존재함이 보장된다.</p>

### 출력

<p>각 2번 쿼리의 결과를 입력되는 순서대로 한 줄에 하나씩 출력한다.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14701.%E2%80%85%EC%85%94%ED%8B%80%EB%B2%84%EC%8A%A4/4e9c51bb.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/14701.%E2%80%85%EC%85%94%ED%8B%80%EB%B2%84%EC%8A%A4/4e9c51bb.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14701/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:110px; width:347px" /></p>

<p>1번 학생이 내리면 2번 학생과 3번 학생이 순서대로 이동한다. 4번 학생은 3번 좌석으로 옮겨 앉더라도 양 끝 좌석까지의 거리가 변하지 않기 때문에 이동하지 않는다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14701.%E2%80%85%EC%85%94%ED%8B%80%EB%B2%84%EC%8A%A4/bbbfa818.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/14701.%E2%80%85%EC%85%94%ED%8B%80%EB%B2%84%EC%8A%A4/bbbfa818.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14701/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:107px; width:347px" /></p>

<p>3번 학생이 내리면 4번 학생은 2번 좌석으로 이동하는 것이 이득이지만, 바로 옆자리가 아니므로 이동하지 않는다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14701.%E2%80%85%EC%85%94%ED%8B%80%EB%B2%84%EC%8A%A4/f8708d7b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/14701.%E2%80%85%EC%85%94%ED%8B%80%EB%B2%84%EC%8A%A4/f8708d7b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14701/4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:111px; width:345px" /></p>

<p>5번 학생이 내리면 4번 학생이 이동한다.</p>